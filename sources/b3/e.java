package b3;

import h2.m0;
import java.util.Arrays;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
            int i7 = this.d + 1;
            this.d = i7;
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
                if (i7 > aVarArr2.length) {
                    this.f = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
                aVar = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final synchronized void b(a4.c cVar) {
        while (cVar != null) {
            a[] aVarArr = this.f;
            int i7 = this.e;
            this.e = i7 + 1;
            a aVar = (a) cVar.c;
            aVar.getClass();
            aVarArr[i7] = aVar;
            this.d--;
            cVar = (a4.c) cVar.d;
            if (cVar == null || ((a) cVar.c) == null) {
                cVar = null;
            }
        }
    }

    public final synchronized void c(a aVar) {
        a[] aVarArr = this.f;
        int i7 = this.e;
        this.e = i7 + 1;
        aVarArr[i7] = aVar;
        this.d--;
    }

    public final synchronized void d(int i7) {
        boolean z9 = i7 < this.c;
        this.c = i7;
        if (z9) {
            e();
        }
    }

    public final synchronized void e() {
        int max = Math.max(0, m0.g(this.c, this.b) - this.d);
        int i7 = this.e;
        if (max >= i7) {
            return;
        }
        Arrays.fill(this.f, max, i7, (Object) null);
        this.e = max;
    }
}
