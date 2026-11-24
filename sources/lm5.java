// default package

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class lm5 extends mm5 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ mm5 e;

    public lm5(mm5 mm5Var, int i, int i2) {
        this.e = mm5Var;
        this.c = i;
        this.d = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        gre.j(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // mm5, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // gm5
    public final Object[] j() {
        return this.e.j();
    }

    @Override // gm5
    public final int k() {
        return this.e.l() + this.c + this.d;
    }

    @Override // gm5
    public final int l() {
        return this.e.l() + this.c;
    }

    @Override // mm5, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // gm5
    public final boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // mm5, java.util.List
    /* renamed from: x */
    public final mm5 subList(int i, int i2) {
        gre.n(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // mm5, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
