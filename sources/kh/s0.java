package kh;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class s0 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final File b;
    public MessageObject c;
    public final q0 d;
    public final r0 e;
    public final p0 f;

    public s0(int i9, a8 a8Var, File file, q0 q0Var, r0 r0Var, p0 p0Var) {
        this.a = i9;
        this.b = file;
        this.d = q0Var;
        this.e = r0Var;
        this.f = p0Var;
        if (this.c != null) {
            return;
        }
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.filePreparingFailed);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.c = new MessageObject(i9, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        a8Var.s(new bg.i(this, 24));
    }

    public final void a(boolean z10) {
        if (this.c == null) {
            return;
        }
        int i9 = this.a;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.filePreparingFailed);
        if (z10) {
            MediaController.getInstance().cancelVideoConvert(this.c);
        }
        this.c = null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.filePreparingStarted) {
            return;
        }
        if (i9 != NotificationCenter.fileNewChunkAvailable) {
            if (i9 == NotificationCenter.filePreparingFailed && ((MessageObject) objArr[0]) == this.c) {
                a(false);
                try {
                    File file = this.b;
                    if (file != null) {
                        file.delete();
                    }
                } catch (Exception unused) {
                }
                this.f.run();
                return;
            }
            return;
        }
        if (((MessageObject) objArr[0]) == this.c) {
            ((Long) objArr[2]).getClass();
            long longValue = ((Long) objArr[3]).longValue();
            Float f10 = (Float) objArr[4];
            f10.getClass();
            this.e.run(f10);
            if (longValue > 0) {
                this.d.run();
                VideoEncodingService.stop();
                a(false);
            }
        }
    }
}
