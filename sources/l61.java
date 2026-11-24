// default package

import android.util.SparseArray;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class l61 {
    public long a;
    public int b;
    public long c;
    public final SparseArray d = new SparseArray();

    public l61(long j) {
        this.a = j;
    }

    public final void a(u61 u61Var, int i) {
        SparseArray sparseArray = this.d;
        m61 m61Var = (m61) sparseArray.get(i, null);
        if (m61Var == null) {
            m61Var = new m61();
            sparseArray.put(i, m61Var);
        }
        long j = u61Var.c;
        m61Var.a += j;
        this.c += j;
        this.b++;
        m61Var.b.add(u61Var);
    }

    public final void b(u61 u61Var) {
        m61 m61Var = (m61) this.d.get(u61Var.d, null);
        if (m61Var == null || !m61Var.b.remove(u61Var)) {
            return;
        }
        long j = m61Var.a;
        long j2 = u61Var.c;
        m61Var.a = j - j2;
        this.c -= j2;
        this.b--;
    }
}
