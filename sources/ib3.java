// default package

import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ib3 {
    public final ma6 a;
    public final e7a b;
    public final int[] c;
    public final int d;
    public final a83 e;
    public final long f;
    public final te8 g;
    public final gb3[] h;
    public t74 i;
    public t63 j;
    public int k;
    public ji0 l;
    public boolean m;

    public ib3(m41 m41Var, ma6 ma6Var, t63 t63Var, e7a e7aVar, int i, int[] iArr, t74 t74Var, int i2, a83 a83Var, long j, boolean z, y79 y79Var, te8 te8Var) {
        ka9 ka9Var;
        gb3[] gb3VarArr;
        s84 er4Var;
        go4 go4Var;
        n41 n41Var;
        this.a = ma6Var;
        this.j = t63Var;
        this.b = e7aVar;
        this.c = iArr;
        this.i = t74Var;
        this.d = i2;
        this.e = a83Var;
        this.k = i;
        this.f = j;
        te8 te8Var2 = te8Var;
        this.g = te8Var2;
        long d = t63Var.d(i);
        ArrayList a = a();
        this.h = new gb3[t74Var.length()];
        int i3 = 0;
        int i4 = 0;
        while (i4 < this.h.length) {
            ka9 ka9Var2 = (ka9) a.get(t74Var.k(i4));
            wh0 G = e7aVar.G(ka9Var2.b);
            gb3[] gb3VarArr2 = this.h;
            wh0 wh0Var = G == null ? (wh0) ka9Var2.b.get(i3) : G;
            go4 go4Var2 = ka9Var2.a;
            String str = go4Var2.s;
            if (!wf7.l(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    ka9Var = ka9Var2;
                    go4Var = go4Var2;
                    gb3VarArr = gb3VarArr2;
                    er4Var = new tl6((fgf) m41Var.c, !m41Var.b ? 3 : 1);
                } else if (Objects.equals(str, "image/jpeg")) {
                    er4Var = new uf5(1, (byte) 1);
                } else if (Objects.equals(str, "image/png")) {
                    er4Var = new ym0((byte) 1);
                } else {
                    int i5 = z ? 4 : 0;
                    ka9Var = ka9Var2;
                    gb3VarArr = gb3VarArr2;
                    er4Var = new er4((fgf) m41Var.c, (m41Var.b ? i5 : i5 | 32) | er4.g(3), null, y79Var, te8Var2);
                    go4Var = go4Var2;
                }
                n41Var = new n41(er4Var, i2, go4Var);
                n41 n41Var2 = n41Var;
                long j2 = d;
                int i6 = i4;
                gb3VarArr[i6] = new gb3(j2, ka9Var, wh0Var, n41Var2, 0L, ka9Var.b());
                i4 = i6 + 1;
                te8Var2 = te8Var;
                d = j2;
                i3 = 0;
            } else if (m41Var.b) {
                er4Var = new qcb(((fgf) m41Var.c).v(go4Var2), go4Var2);
            } else {
                n41Var = null;
                ka9Var = ka9Var2;
                gb3VarArr = gb3VarArr2;
                n41 n41Var22 = n41Var;
                long j22 = d;
                int i62 = i4;
                gb3VarArr[i62] = new gb3(j22, ka9Var, wh0Var, n41Var22, 0L, ka9Var.b());
                i4 = i62 + 1;
                te8Var2 = te8Var;
                d = j22;
                i3 = 0;
            }
            ka9Var = ka9Var2;
            go4Var = go4Var2;
            gb3VarArr = gb3VarArr2;
            n41Var = new n41(er4Var, i2, go4Var);
            n41 n41Var222 = n41Var;
            long j222 = d;
            int i622 = i4;
            gb3VarArr[i622] = new gb3(j222, ka9Var, wh0Var, n41Var222, 0L, ka9Var.b());
            i4 = i622 + 1;
            te8Var2 = te8Var;
            d = j222;
            i3 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.j.b(this.k).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((ea) list.get(i)).c);
        }
        return arrayList;
    }

    public final gb3 b(int i) {
        gb3[] gb3VarArr = this.h;
        gb3 gb3Var = gb3VarArr[i];
        wh0 G = this.b.G(gb3Var.b.b);
        if (G == null || G.equals(gb3Var.c)) {
            return gb3Var;
        }
        gb3 gb3Var2 = new gb3(gb3Var.e, gb3Var.b, G, gb3Var.a, gb3Var.f, gb3Var.d);
        gb3VarArr[i] = gb3Var2;
        return gb3Var2;
    }
}
