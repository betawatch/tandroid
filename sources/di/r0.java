package di;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class r0 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final File b;
    public MessageObject c;
    public final p0 d;
    public final q0 e;
    public final o0 f;

    public r0(int i10, o8 o8Var, File file, p0 p0Var, q0 q0Var, o0 o0Var) {
        this.a = i10;
        this.b = file;
        this.d = p0Var;
        this.e = q0Var;
        this.f = o0Var;
        if (this.c != null) {
            return;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.c = new MessageObject(i10, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        o8Var.s(new bi.o1(this, 7));
    }

    public final void a(boolean z10) {
        if (this.c == null) {
            return;
        }
        int i10 = this.a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        if (z10) {
            MediaController.getInstance().cancelVideoConvert(this.c);
        }
        this.c = null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            return;
        }
        if (i10 != NotificationCenter.fileNewChunkAvailable) {
            if (i10 == NotificationCenter.filePreparingFailed && ((MessageObject) objArr[0]) == this.c) {
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
            Float f7 = (Float) objArr[4];
            f7.getClass();
            this.e.run(f7);
            if (longValue > 0) {
                this.d.run();
                VideoEncodingService.stop();
                a(false);
            }
        }
    }
}
