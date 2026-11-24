// default package

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fn9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ un9 b;
    public final /* synthetic */ long c;

    public /* synthetic */ fn9(un9 un9Var, long j, byte b) {
        this.a = b;
        this.b = un9Var;
        this.c = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    @Override // java.lang.Runnable
    public final void run() {
        long j;
        vs6 vs6Var;
        ?? r3;
        char c;
        xs6 xs6Var;
        File file;
        ms1 ms1Var;
        tec tecVar;
        switch (this.a) {
            case 0:
                un9 un9Var = this.b;
                long j2 = this.c;
                if (un9Var.a0 == 6) {
                    un9Var.I = j2;
                    un9Var.O = 0L;
                    un9Var.K = 0L;
                    un9Var.L = j2;
                    un9Var.x(2);
                    un9Var.l.V(un9Var.U, un9Var.I * 1000, un9Var.r);
                    break;
                }
                break;
            default:
                un9 un9Var2 = this.b;
                long j3 = this.c;
                if (un9Var2.a0 == 4) {
                    un9Var2.O = j3;
                    long min = Math.min(un9Var2.q, j3);
                    un9Var2.I = min;
                    un9Var2.K = 0L;
                    un9Var2.L = min;
                    un9Var2.b.setSurfaceTextureListener(null);
                    un9Var2.b.setTransform(un9Var2.h);
                    h74 a = new v64(un9Var2.a).a();
                    un9Var2.W = a;
                    a.s1(un9Var2.b);
                    h74 h74Var = un9Var2.W;
                    Uri fromFile = Uri.fromFile(un9Var2.V);
                    qs6 qs6Var = new qs6();
                    ts6 ts6Var = new ts6();
                    List list = Collections.EMPTY_LIST;
                    ko5 ko5Var = mo5.b;
                    y79 y79Var = y79.e;
                    vs6 vs6Var2 = new vs6();
                    ys6 ys6Var = ys6.d;
                    jte.p(ts6Var.b == null || ts6Var.a != null);
                    if (fromFile != null) {
                        j = 0;
                        vs6Var = vs6Var2;
                        r3 = 0;
                        c = 2;
                        xs6Var = new xs6(fromFile, null, ts6Var.a != null ? new us6(ts6Var) : null, null, list, null, y79Var, -9223372036854775807L);
                    } else {
                        j = 0;
                        vs6Var = vs6Var2;
                        r3 = 0;
                        c = 2;
                        xs6Var = null;
                    }
                    h74Var.q0(new bt6("", new ss6(qs6Var), xs6Var, new ws6(vs6Var), jt6.M, ys6Var));
                    un9Var2.W.n0(r3);
                    un9Var2.W.R(1.0f);
                    un9Var2.W.y(un9Var2.Z);
                    un9Var2.W.a();
                    un9Var2.W.k1(un9Var2.K);
                    un9Var2.m.b("preview player prepared: durationMs=" + un9Var2.I + ", trim=" + un9Var2.K + ".." + un9Var2.L);
                    un9Var2.x(5);
                    lj4 lj4Var = un9Var2.d;
                    long j4 = un9Var2.I;
                    long j5 = un9Var2.K;
                    long j6 = un9Var2.L;
                    ((q) lj4Var.a).x.setProgress(((float) j4) / 60000.0f);
                    q qVar = (q) lj4Var.a;
                    qVar.l0 = r3;
                    qVar.J.setAlpha(0.0f);
                    q qVar2 = (q) lj4Var.a;
                    if (qVar2.W == null) {
                        un9 un9Var3 = qVar2.Q;
                        if (un9Var3 == null) {
                            file = null;
                        } else {
                            un9.v();
                            file = un9Var3.V;
                        }
                        if (file != null) {
                            q qVar3 = (q) lj4Var.a;
                            qVar3.V = qVar3.i(file, j4, null);
                            q qVar4 = (q) lj4Var.a;
                            rcc rccVar = qVar4.V;
                            char c2 = r3;
                            File file2 = file;
                            rccVar.a = j5 > j ? j5 : -1L;
                            rccVar.b = j6 < j4 ? j6 : -1L;
                            nm7 f = nm7.f(qVar4.h);
                            Integer valueOf = Integer.valueOf(((q) lj4Var.a).n);
                            rcc rccVar2 = ((q) lj4Var.a).V;
                            String absolutePath = file2.getAbsolutePath();
                            ArrayList arrayList = new ArrayList();
                            Object[] objArr = new Object[4];
                            objArr[c2] = valueOf;
                            objArr[1] = rccVar2;
                            objArr[c] = absolutePath;
                            objArr[3] = arrayList;
                            f.k(nm7.s2, objArr);
                            float max = Math.max(1L, j4);
                            float f2 = j5 / max;
                            float f3 = j6 / max;
                            yq5 yq5Var = ((q) lj4Var.a).b;
                            if (yq5Var != null && (ms1Var = ((gm1) yq5Var).b.a0) != null && (tecVar = ms1Var.g1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f2));
                                tecVar.b = max2;
                                tecVar.c = Math.max(max2, Math.min(1.0f, f3));
                                tecVar.invalidate();
                            }
                        }
                    }
                    un9Var2.r();
                    break;
                }
                break;
        }
    }
}
