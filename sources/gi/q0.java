package gi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q0 implements cs {
    public final int a;
    public final File b;
    public zi c;
    public final o0 d;
    public final p0 e;
    public final n0 f;

    public q0(int i3, f7 f7Var, File file, o0 o0Var, p0 p0Var, n0 n0Var) {
        this.a = i3;
        this.b = file;
        this.d = o0Var;
        this.e = p0Var;
        this.f = n0Var;
        if (this.c != null) {
            return;
        }
        hs.f(i3).b(this, hs.a2);
        hs.f(i3).b(this, hs.b2);
        hs.f(i3).b(this, hs.c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.c = new zi(i3, tL_message, null, false, false);
        f7Var.s(new ai.v2(this, 21));
    }

    public final void a(boolean z10) {
        if (this.c == null) {
            return;
        }
        int i3 = this.a;
        hs.f(i3).n(this, hs.a2);
        hs.f(i3).n(this, hs.b2);
        hs.f(i3).n(this, hs.c2);
        if (z10) {
            MediaController.B().i(this.c);
        }
        this.c = null;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.a2) {
            return;
        }
        if (i3 != hs.b2) {
            if (i3 == hs.c2 && ((zi) objArr[0]) == this.c) {
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
        if (((zi) objArr[0]) == this.c) {
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
