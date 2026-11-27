// default package

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class le3 {
    public final byte a;
    public String b;
    public final ArrayList c;
    public final boolean[] d;
    public boolean[] e;
    public boolean f;
    public final int g;
    public int h;
    public int i;
    public final /* synthetic */ me3 j;

    /* JADX WARN: Multi-variable type inference failed */
    public le3(me3 me3Var, int i, ArrayList arrayList) {
        this.j = me3Var;
        this.a = i;
        int size = arrayList.size();
        this.g = size;
        this.i = 0;
        if (size > 0) {
            this.c = arrayList;
            this.d = new boolean[size];
            this.f = true;
            i();
        }
    }

    public final boolean a() {
        boolean[] zArr;
        for (int i = 0; i < this.g; i++) {
            if (!this.d[i] || ((zArr = this.e) != null && !zArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final void b(scc sccVar) {
        for (int i = 0; i < this.g; i++) {
            boolean[] zArr = this.e;
            if (zArr == null || zArr[i]) {
                sccVar.c(i, (TLObject) this.c.get(i));
            }
        }
    }

    public final void c(scc sccVar) {
        boolean[] zArr;
        for (int i = 0; i < this.g; i++) {
            if (this.d[i] && ((zArr = this.e) == null || zArr[i])) {
                sccVar.c(i, (TLObject) this.c.get(i));
            }
        }
    }

    public final boolean d() {
        return (this.e != null ? this.h : this.g) > 1;
    }

    public final boolean e() {
        return (this.e != null ? this.h : this.g) > 0;
    }

    public final void f() {
        boolean[] zArr;
        boolean[] zArr2;
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = this.g;
            zArr = this.d;
            if (i >= i2) {
                break;
            }
            if (!zArr[i] || ((zArr2 = this.e) != null && !zArr2[i])) {
                i++;
            }
        }
        z = true;
        Arrays.fill(zArr, !z);
        h();
        this.j.S1.O(true);
    }

    public final void g(int i) {
        boolean[] zArr = this.e;
        if (zArr == null || zArr[i]) {
            boolean[] zArr2 = this.d;
            boolean z = zArr2[i];
            zArr2[i] = !z;
            int i2 = this.i;
            if (z) {
                this.i = i2 - 1;
            } else {
                this.i = i2 + 1;
            }
            this.j.S1.O(true);
        }
    }

    public final void h() {
        this.i = 0;
        this.h = 0;
        for (int i = 0; i < this.g; i++) {
            boolean[] zArr = this.e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i]) {
                    this.i++;
                }
            } else if (zArr[i]) {
                this.h++;
                if (zArr2[i]) {
                    this.i++;
                }
            }
        }
    }

    public final void i() {
        TLObject tLObject;
        int i = this.g;
        if (i != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                boolean[] zArr = this.e;
                if (zArr == null || zArr[i2]) {
                    tLObject = (TLObject) this.c.get(i2);
                    break;
                }
            }
            tLObject = null;
            String l = tLObject instanceof TLRPC.User ? lbc.l((TLRPC.User) tLObject) : lv2.o(tLObject);
            byte b = this.a;
            if (b == 0) {
                this.b = ob6.M0(2131751467, null);
                return;
            }
            if (b == 1) {
                this.b = d() ? ob6.M0(2131751547, null) : ob6.a0(null, null, 2131751552, l);
                return;
            }
            if (b == 3) {
                this.b = d() ? ob6.M0(2131751542, null) : ob6.a0(null, null, 2131751543, l);
            } else if (b == 2) {
                if (this.j.b2) {
                    this.b = d() ? ob6.M0(2131751465, null) : ob6.a0(null, null, 2131751466, l);
                } else {
                    this.b = d() ? ob6.M0(2131751532, null) : ob6.a0(null, null, 2131751533, l);
                }
            }
        }
    }
}
