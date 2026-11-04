package a3;

import g2.n0;
import java.util.Arrays;
import w2.z0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e {
    public int c;
    public int d;
    public final boolean a = true;
    public final int b = 65536;
    public int e = 0;
    public a[] f = new a[100];

    public final synchronized a a() {
        a aVar;
        try {
            int i3 = this.d + 1;
            this.d = i3;
            int i10 = this.e;
            if (i10 > 0) {
                a[] aVarArr = this.f;
                int i11 = i10 - 1;
                this.e = i11;
                aVar = aVarArr[i11];
                aVar.getClass();
                this.f[this.e] = null;
            } else {
                a aVar2 = new a(new byte[this.b], 0);
                a[] aVarArr2 = this.f;
                if (i3 > aVarArr2.length) {
                    this.f = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
                aVar = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final synchronized void b(a aVar) {
        a[] aVarArr = this.f;
        int i3 = this.e;
        this.e = i3 + 1;
        aVarArr[i3] = aVar;
        this.d--;
    }

    public final synchronized void c(z0 z0Var) {
        while (z0Var != null) {
            a[] aVarArr = this.f;
            int i3 = this.e;
            this.e = i3 + 1;
            a aVar = (a) z0Var.c;
            aVar.getClass();
            aVarArr[i3] = aVar;
            this.d--;
            z0Var = (z0) z0Var.d;
            if (z0Var == null || ((a) z0Var.c) == null) {
                z0Var = null;
            }
        }
    }

    public final synchronized void d(int i3) {
        boolean z10 = i3 < this.c;
        this.c = i3;
        if (z10) {
            e();
        }
    }

    public final synchronized void e() {
        int max = Math.max(0, n0.g(this.c, this.b) - this.d);
        int i3 = this.e;
        if (max >= i3) {
            return;
        }
        Arrays.fill(this.f, max, i3, (Object) null);
        this.e = max;
    }
}
