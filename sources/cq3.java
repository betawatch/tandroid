// default package

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class cq3 implements fn7 {
    public final int a;
    public final File b;
    public r47 c;
    public final aq3 d;
    public final bq3 e;
    public final zp3 f;

    public cq3(int i, c8b c8bVar, File file, aq3 aq3Var, bq3 bq3Var, zp3 zp3Var) {
        this.a = i;
        this.b = file;
        this.d = aq3Var;
        this.e = bq3Var;
        this.f = zp3Var;
        if (this.c != null) {
            return;
        }
        jn7.f(i).a(this, jn7.a2);
        jn7.f(i).a(this, jn7.b2);
        jn7.f(i).a(this, jn7.c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.c = new r47(i, tL_message, null, false, false);
        c8bVar.s(new zj3(this, (byte) 4));
    }

    public final void a(boolean z) {
        if (this.c == null) {
            return;
        }
        int i = this.a;
        jn7.f(i).n(this, jn7.a2);
        jn7.f(i).n(this, jn7.b2);
        jn7.f(i).n(this, jn7.c2);
        if (z) {
            MediaController.z().d(this.c);
        }
        this.c = null;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.a2) {
            return;
        }
        if (i != jn7.b2) {
            if (i == jn7.c2 && ((r47) objArr[0]) == this.c) {
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
        if (((r47) objArr[0]) == this.c) {
            ((Long) objArr[2]).getClass();
            long longValue = ((Long) objArr[3]).longValue();
            Float f = (Float) objArr[4];
            f.getClass();
            this.e.a(f);
            if (longValue > 0) {
                this.d.run();
                VideoEncodingService videoEncodingService = VideoEncodingService.e;
                if (videoEncodingService != null) {
                    videoEncodingService.stopSelf();
                }
                a(false);
            }
        }
    }
}
