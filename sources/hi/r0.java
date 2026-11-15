package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.gj;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r0 implements is {
    public final int a;
    public final File b;
    public gj c;
    public final p0 d;
    public final q0 e;
    public final o0 f;

    public r0(int i7, d7 d7Var, File file, p0 p0Var, q0 q0Var, o0 o0Var) {
        this.a = i7;
        this.b = file;
        this.d = p0Var;
        this.e = q0Var;
        this.f = o0Var;
        if (this.c != null) {
            return;
        }
        ns.f(i7).b(this, ns.a2);
        ns.f(i7).b(this, ns.b2);
        ns.f(i7).b(this, ns.c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.c = new gj(i7, tL_message, null, false, false);
        d7Var.s(new ai.g0(this, 22));
    }

    public final void a(boolean z10) {
        if (this.c == null) {
            return;
        }
        int i7 = this.a;
        ns.f(i7).n(this, ns.a2);
        ns.f(i7).n(this, ns.b2);
        ns.f(i7).n(this, ns.c2);
        if (z10) {
            MediaController.B().i(this.c);
        }
        this.c = null;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.a2) {
            return;
        }
        if (i7 != ns.b2) {
            if (i7 == ns.c2 && ((gj) objArr[0]) == this.c) {
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
