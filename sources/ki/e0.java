package ki;

import android.net.Uri;
import e9.a1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.a91;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.x60;
import org.telegram.ui.ok;
import org.telegram.ui.re;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ e0(t0 t0Var, long j3, int i10) {
        this.a = i10;
        this.b = t0Var;
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
        ok okVar;
        a91 a91Var;
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                long j10 = this.c;
                if (t0Var.W == 6) {
                    t0Var.E = j10;
                    t0Var.K = 0L;
                    t0Var.G = 0L;
                    t0Var.H = j10;
                    t0Var.v(2);
                    t0Var.l.L(t0Var.Q, t0Var.E * 1000, t0Var.p);
                    break;
                }
                break;
            default:
                t0 t0Var2 = this.b;
                long j11 = this.c;
                if (t0Var2.W == 4) {
                    t0Var2.K = j11;
                    long min = Math.min(t0Var2.o, j11);
                    t0Var2.E = min;
                    t0Var2.G = 0L;
                    t0Var2.H = min;
                    t0Var2.b.setSurfaceTextureListener(null);
                    t0Var2.b.setTransform(t0Var2.h);
                    i2.f0 a2 = new i2.p(t0Var2.a).a();
                    t0Var2.S = a2;
                    a2.x1(t0Var2.b);
                    i2.f0 f0Var2 = t0Var2.S;
                    Uri fromFile = Uri.fromFile(t0Var2.R);
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
                    t0Var2.S.j(r32);
                    t0Var2.S.U(1.0f);
                    t0Var2.S.n0(t0Var2.V);
                    t0Var2.S.b();
                    t0Var2.S.W0(5, t0Var2.G);
                    t0Var2.m.b("preview player prepared: durationMs=" + t0Var2.E + ", trim=" + t0Var2.G + ".." + t0Var2.H);
                    t0Var2.v(5);
                    m2.t tVar = t0Var2.d;
                    long j12 = t0Var2.E;
                    long j13 = t0Var2.G;
                    long j14 = t0Var2.H;
                    ((s60) tVar.b).w.setProgress(((float) j12) / 60000.0f);
                    s60 s60Var = (s60) tVar.b;
                    s60Var.h0 = r32;
                    s60Var.I.setAlpha(0.0f);
                    t0 t0Var3 = ((s60) tVar.b).P;
                    if (t0Var3 == null) {
                        file = null;
                    } else {
                        t0.t();
                        file = t0Var3.R;
                    }
                    if (file != null) {
                        s60 s60Var2 = (s60) tVar.b;
                        s60Var2.U = s60Var2.q(file, j12, null);
                        s60 s60Var3 = (s60) tVar.b;
                        VideoEditedInfo videoEditedInfo = s60Var3.U;
                        char c11 = r32;
                        videoEditedInfo.startTime = j13 > j3 ? j13 : -1L;
                        videoEditedInfo.endTime = j14 < j12 ? j14 : -1L;
                        NotificationCenter notificationCenter = NotificationCenter.getInstance(s60Var3.h);
                        int i10 = NotificationCenter.audioDidSent;
                        Integer valueOf = Integer.valueOf(((s60) tVar.b).n);
                        VideoEditedInfo videoEditedInfo2 = ((s60) tVar.b).U;
                        String absolutePath = file.getAbsolutePath();
                        ArrayList arrayList = new ArrayList();
                        Object[] objArr = new Object[4];
                        objArr[c11] = valueOf;
                        objArr[1] = videoEditedInfo2;
                        objArr[c10] = absolutePath;
                        objArr[3] = arrayList;
                        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, objArr);
                        float max = Math.max(1L, j12);
                        float f7 = j13 / max;
                        float f10 = j14 / max;
                        x60 x60Var = ((s60) tVar.b).b;
                        if (x60Var != null && (okVar = ((re) x60Var).b.Y) != null && (a91Var = okVar.f1) != null) {
                            float max2 = Math.max(0.0f, Math.min(1.0f, f7));
                            a91Var.b = max2;
                            a91Var.c = Math.max(max2, Math.min(1.0f, f10));
                            a91Var.invalidate();
                        }
                    }
                    t0Var2.q();
                    break;
                }
                break;
        }
    }
}
