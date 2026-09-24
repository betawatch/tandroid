package ki;

import android.net.Uri;
import e9.a1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.g60;
import org.telegram.ui.Components.i81;
import org.telegram.ui.jk;
import org.telegram.ui.pe;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ d0(r0 r0Var, long j3, int i10) {
        this.a = i10;
        this.b = r0Var;
        this.c = j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        b2.d0 d0Var;
        ?? r32;
        char c10;
        b2.f0 f0Var;
        File file;
        jk jkVar;
        i81 i81Var;
        switch (this.a) {
            case 0:
                r0 r0Var = this.b;
                long j10 = this.c;
                if (r0Var.V == 6) {
                    r0Var.D = j10;
                    r0Var.J = 0L;
                    r0Var.F = 0L;
                    r0Var.G = j10;
                    r0Var.u(2);
                    r0Var.k.B(r0Var.P, r0Var.D * 1000, r0Var.o);
                    break;
                }
                break;
            default:
                r0 r0Var2 = this.b;
                long j11 = this.c;
                if (r0Var2.V == 4) {
                    r0Var2.J = j11;
                    long min = Math.min(r0Var2.n, j11);
                    r0Var2.D = min;
                    r0Var2.F = 0L;
                    r0Var2.G = min;
                    r0Var2.b.setSurfaceTextureListener(null);
                    r0Var2.b.setTransform(r0Var2.g);
                    i2.f0 a2 = new i2.p(r0Var2.a).a();
                    r0Var2.R = a2;
                    a2.v1(r0Var2.b);
                    i2.f0 f0Var2 = r0Var2.R;
                    Uri fromFile = Uri.fromFile(r0Var2.Q);
                    b2.y yVar = new b2.y();
                    b2.b0 b0Var = new b2.b0();
                    List list = Collections.EMPTY_LIST;
                    a1 a1Var = a1.e;
                    b2.d0 d0Var2 = new b2.d0();
                    b2.g0 g0Var = b2.g0.d;
                    e2.d.g(b0Var.b == null || b0Var.a != null);
                    if (fromFile != null) {
                        j3 = 0;
                        d0Var = d0Var2;
                        r32 = 0;
                        c10 = 2;
                        f0Var = new b2.f0(fromFile, null, b0Var.a != null ? new b2.c0(b0Var) : null, null, list, null, a1Var, -9223372036854775807L);
                    } else {
                        j3 = 0;
                        d0Var = d0Var2;
                        r32 = 0;
                        c10 = 2;
                        f0Var = null;
                    }
                    b2.k0 k0Var = new b2.k0("", new b2.a0(yVar), f0Var, new b2.e0(d0Var), b2.n0.K, g0Var);
                    f0Var2.getClass();
                    f0Var2.I0(e9.i0.z(k0Var));
                    r0Var2.R.j(r32);
                    r0Var2.R.U(1.0f);
                    r0Var2.R.n0(r0Var2.U);
                    r0Var2.R.b();
                    r0Var2.R.W0(5, r0Var2.F);
                    r0Var2.l.b("preview player prepared: durationMs=" + r0Var2.D + ", trim=" + r0Var2.F + ".." + r0Var2.G);
                    r0Var2.u(5);
                    l.d dVar = r0Var2.c;
                    long j12 = r0Var2.D;
                    long j13 = r0Var2.F;
                    long j14 = r0Var2.G;
                    ((b60) dVar.a).w.setProgress(((float) j12) / 60000.0f);
                    b60 b60Var = (b60) dVar.a;
                    b60Var.e0 = r32;
                    b60Var.I.setAlpha(0.0f);
                    r0 r0Var3 = ((b60) dVar.a).M;
                    if (r0Var3 == null) {
                        file = null;
                    } else {
                        r0.s();
                        file = r0Var3.Q;
                    }
                    if (file != null) {
                        b60 b60Var2 = (b60) dVar.a;
                        b60Var2.R = b60Var2.o(file, j12, null);
                        b60 b60Var3 = (b60) dVar.a;
                        VideoEditedInfo videoEditedInfo = b60Var3.R;
                        videoEditedInfo.startTime = j13 > j3 ? j13 : -1L;
                        videoEditedInfo.endTime = j14 < j12 ? j14 : -1L;
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(b60Var3.h);
                        int i10 = NotificationCenter.audioDidSent;
                        Integer valueOf = Integer.valueOf(((b60) dVar.a).n);
                        VideoEditedInfo videoEditedInfo2 = ((b60) dVar.a).R;
                        String absolutePath = file.getAbsolutePath();
                        ArrayList arrayList = new ArrayList();
                        Object[] objArr = new Object[4];
                        objArr[0] = valueOf;
                        objArr[1] = videoEditedInfo2;
                        objArr[c10] = absolutePath;
                        objArr[3] = arrayList;
                        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, objArr);
                        float max = Math.max(1L, j12);
                        float f7 = j13 / max;
                        float f10 = j14 / max;
                        g60 g60Var = ((b60) dVar.a).b;
                        if (g60Var != null && (jkVar = ((pe) g60Var).b.Y) != null && (i81Var = jkVar.f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            i81Var.b = max2;
                            i81Var.c = Math.max(max2, Math.min(1.0f, f10));
                            i81Var.invalidate();
                        }
                    }
                    r0Var2.p();
                    break;
                }
                break;
        }
    }
}
