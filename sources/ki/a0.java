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
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.x50;
import org.telegram.ui.mk;
import org.telegram.ui.qe;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ a0(q0 q0Var, long j3, int i10) {
        this.a = i10;
        this.b = q0Var;
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
        mk mkVar;
        l81 l81Var;
        switch (this.a) {
            case 0:
                q0 q0Var = this.b;
                long j10 = this.c;
                if (q0Var.U == 6) {
                    q0Var.D = j10;
                    q0Var.F = 0L;
                    q0Var.G = j10;
                    q0Var.u(2);
                    q0Var.k.D(q0Var.O, q0Var.D * 1000, q0Var.o);
                    break;
                }
                break;
            default:
                q0 q0Var2 = this.b;
                long j11 = this.c;
                if (q0Var2.U == 4) {
                    long min = Math.min(q0Var2.n, j11);
                    q0Var2.D = min;
                    q0Var2.F = 0L;
                    q0Var2.G = min;
                    q0Var2.b.setSurfaceTextureListener(null);
                    q0Var2.b.setTransform(q0Var2.g);
                    i2.e0 a2 = new i2.p(q0Var2.a).a();
                    q0Var2.Q = a2;
                    a2.v1(q0Var2.b);
                    i2.e0 e0Var = q0Var2.Q;
                    Uri fromFile = Uri.fromFile(q0Var2.P);
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
                    q0Var2.Q.j(r32);
                    q0Var2.Q.U(1.0f);
                    q0Var2.Q.n0(q0Var2.T);
                    q0Var2.Q.b();
                    q0Var2.Q.W0(5, q0Var2.F);
                    q0Var2.l.b("preview player prepared: durationMs=" + q0Var2.D + ", trim=" + q0Var2.F + ".." + q0Var2.G);
                    q0Var2.u(5);
                    x50 x50Var = q0Var2.c;
                    long j12 = q0Var2.D;
                    long j13 = q0Var2.F;
                    long j14 = q0Var2.G;
                    x50Var.a.w.setProgress(((float) j12) / 60000.0f);
                    b60 b60Var = x50Var.a;
                    b60Var.e0 = r32;
                    b60Var.I.setAlpha(0.0f);
                    q0 q0Var3 = x50Var.a.M;
                    if (q0Var3 == null) {
                        file = null;
                    } else {
                        q0.s();
                        file = q0Var3.P;
                    }
                    if (file != null) {
                        b60 b60Var2 = x50Var.a;
                        b60Var2.R = b60Var2.o(file, j12, null);
                        b60 b60Var3 = x50Var.a;
                        VideoEditedInfo videoEditedInfo = b60Var3.R;
                        videoEditedInfo.startTime = j13 > j3 ? j13 : -1L;
                        videoEditedInfo.endTime = j14 < j12 ? j14 : -1L;
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(b60Var3.h);
                        int i10 = NotificationCenter.audioDidSent;
                        Integer valueOf = Integer.valueOf(x50Var.a.n);
                        VideoEditedInfo videoEditedInfo2 = x50Var.a.R;
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
                        g60 g60Var = x50Var.a.b;
                        if (g60Var != null && (mkVar = ((qe) g60Var).b.Y) != null && (l81Var = mkVar.f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            l81Var.b = max2;
                            l81Var.c = Math.max(max2, Math.min(1.0f, f10));
                            l81Var.invalidate();
                        }
                    }
                    q0Var2.p();
                    break;
                }
                break;
        }
    }
}
