package ki;

import android.net.Uri;
import e9.a1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.z50;
import org.telegram.ui.lk;
import org.telegram.ui.qe;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ a0(o0 o0Var, long j3, int i10) {
        this.a = i10;
        this.b = o0Var;
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
        lk lkVar;
        j81 j81Var;
        switch (this.a) {
            case 0:
                o0 o0Var = this.b;
                long j10 = this.c;
                if (o0Var.U == 6) {
                    o0Var.D = j10;
                    o0Var.F = 0L;
                    o0Var.G = j10;
                    o0Var.u(2);
                    o0Var.k.y(o0Var.O, o0Var.D * 1000, o0Var.o);
                    break;
                }
                break;
            default:
                o0 o0Var2 = this.b;
                long j11 = this.c;
                if (o0Var2.U == 4) {
                    long min = Math.min(o0Var2.n, j11);
                    o0Var2.D = min;
                    o0Var2.F = 0L;
                    o0Var2.G = min;
                    o0Var2.b.setSurfaceTextureListener(null);
                    o0Var2.b.setTransform(o0Var2.g);
                    i2.e0 a2 = new i2.p(o0Var2.a).a();
                    o0Var2.Q = a2;
                    a2.v1(o0Var2.b);
                    i2.e0 e0Var = o0Var2.Q;
                    Uri fromFile = Uri.fromFile(o0Var2.P);
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
                    e0Var.getClass();
                    e0Var.I0(e9.i0.z(k0Var));
                    o0Var2.Q.j(r32);
                    o0Var2.Q.U(1.0f);
                    o0Var2.Q.n0(o0Var2.T);
                    o0Var2.Q.b();
                    o0Var2.Q.W0(5, o0Var2.F);
                    o0Var2.l.b("preview player prepared: durationMs=" + o0Var2.D + ", trim=" + o0Var2.F + ".." + o0Var2.G);
                    o0Var2.u(5);
                    l.d dVar = o0Var2.c;
                    long j12 = o0Var2.D;
                    long j13 = o0Var2.F;
                    long j14 = o0Var2.G;
                    ((z50) dVar.a).s.setProgress(((float) j12) / 60000.0f);
                    z50 z50Var = (z50) dVar.a;
                    z50Var.c0 = r32;
                    z50Var.G.setAlpha(0.0f);
                    o0 o0Var3 = ((z50) dVar.a).K;
                    if (o0Var3 == null) {
                        file = null;
                    } else {
                        o0.s();
                        file = o0Var3.P;
                    }
                    if (file != null) {
                        z50 z50Var2 = (z50) dVar.a;
                        z50Var2.P = z50Var2.n(file, j12, null);
                        z50 z50Var3 = (z50) dVar.a;
                        VideoEditedInfo videoEditedInfo = z50Var3.P;
                        videoEditedInfo.startTime = j13 > j3 ? j13 : -1L;
                        videoEditedInfo.endTime = j14 < j12 ? j14 : -1L;
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(z50Var3.e);
                        int i10 = NotificationCenter.audioDidSent;
                        Integer valueOf = Integer.valueOf(((z50) dVar.a).f);
                        VideoEditedInfo videoEditedInfo2 = ((z50) dVar.a).P;
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
                        d60 d60Var = ((z50) dVar.a).b;
                        if (d60Var != null && (lkVar = ((qe) d60Var).b.Y) != null && (j81Var = lkVar.f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            j81Var.b = max2;
                            j81Var.c = Math.max(max2, Math.min(1.0f, f10));
                            j81Var.invalidate();
                        }
                    }
                    o0Var2.p();
                    break;
                }
                break;
        }
    }
}
