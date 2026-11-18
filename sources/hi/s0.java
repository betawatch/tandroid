package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class s0 implements fs {
    public final int a;
    public final File b;
    public fj c;
    public final q0 d;
    public final r0 e;
    public final p0 f;

    public s0(int i7, d7 d7Var, File file, q0 q0Var, r0 r0Var, p0 p0Var) {
        this.a = i7;
        this.b = file;
        this.d = q0Var;
        this.e = r0Var;
        this.f = p0Var;
        if (this.c != null) {
            return;
        }
        ks.f(i7).b(this, ks.a2);
        ks.f(i7).b(this, ks.b2);
        ks.f(i7).b(this, ks.c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.c = new fj(i7, tL_message, null, false, false);
        d7Var.s(new ai.g0(this, 23));
    }

    public final void a(boolean z10) {
        if (this.c == null) {
            return;
        }
        int i7 = this.a;
        ks.f(i7).n(this, ks.a2);
        ks.f(i7).n(this, ks.b2);
        ks.f(i7).n(this, ks.c2);
        if (z10) {
            MediaController.B().i(this.c);
        }
        this.c = null;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.a2) {
            return;
        }
        if (i7 != ks.b2) {
            if (i7 == ks.c2 && ((fj) objArr[0]) == this.c) {
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
        if (((fj) objArr[0]) == this.c) {
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
