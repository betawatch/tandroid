package bi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class v0 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final File b;
    public MessageObject c;
    public final t0 d;
    public final u0 e;
    public final s0 f;

    public v0(int i10, r9 r9Var, File file, t0 t0Var, u0 u0Var, s0 s0Var) {
        this.a = i10;
        this.b = file;
        this.d = t0Var;
        this.e = u0Var;
        this.f = s0Var;
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
        r9Var.s(new ai.b(this, 3));
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
