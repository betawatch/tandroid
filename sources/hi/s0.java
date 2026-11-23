package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class s0 implements gs {
    public final int a;
    public final File b;
    public gj c;
    public final q0 d;
    public final r0 e;
    public final p0 f;

    public s0(int i7, c7 c7Var, File file, q0 q0Var, r0 r0Var, p0 p0Var) {
        this.a = i7;
        this.b = file;
        this.d = q0Var;
        this.e = r0Var;
        this.f = p0Var;
        if (this.c != null) {
            return;
        }
        ls.f(i7).b(this, ls.a2);
        ls.f(i7).b(this, ls.b2);
        ls.f(i7).b(this, ls.c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.c = new gj(i7, tL_message, null, false, false);
        c7Var.s(new ai.h0(this, 23));
    }

    public final void a(boolean z10) {
        if (this.c == null) {
            return;
        }
        int i7 = this.a;
        ls.f(i7).n(this, ls.a2);
        ls.f(i7).n(this, ls.b2);
        ls.f(i7).n(this, ls.c2);
        if (z10) {
            MediaController.B().i(this.c);
        }
        this.c = null;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.a2) {
            return;
        }
        if (i7 != ls.b2) {
            if (i7 == ls.c2 && ((gj) objArr[0]) == this.c) {
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
        if (((gj) objArr[0]) == this.c) {
            ((Long) objArr[2]).getClass();
            long longValue = ((Long) objArr[3]).longValue();
            Float f10 = (Float) objArr[4];
            f10.getClass();
            this.e.a(f10);
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
