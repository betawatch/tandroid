package fi;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class q0 implements ls {
    public final int a;
    public final File b;
    public ij c;
    public final o0 d;
    public final p0 e;
    public final n0 f;

    public q0(int i7, e7 e7Var, File file, o0 o0Var, p0 p0Var, n0 n0Var) {
        this.a = i7;
        this.b = file;
        this.d = o0Var;
        this.e = p0Var;
        this.f = n0Var;
        if (this.c != null) {
            return;
        }
        qs.f(i7).b(this, qs.a2);
        qs.f(i7).b(this, qs.b2);
        qs.f(i7).b(this, qs.c2);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.c = new ij(i7, tL_message, null, false, false);
        e7Var.s(new ai.i(this, 18));
    }

    public final void a(boolean z9) {
        if (this.c == null) {
            return;
        }
        int i7 = this.a;
        qs.f(i7).n(this, qs.a2);
        qs.f(i7).n(this, qs.b2);
        qs.f(i7).n(this, qs.c2);
        if (z9) {
            MediaController.B().i(this.c);
        }
        this.c = null;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.a2) {
            return;
        }
        if (i7 != qs.b2) {
            if (i7 == qs.c2 && ((ij) objArr[0]) == this.c) {
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
        if (((ij) objArr[0]) == this.c) {
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
