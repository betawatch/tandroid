package cd;

import g7.u7;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class d implements Iterable {
    public final int a;
    public final int b;
    public final int c;

    public d(int i9, int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i11 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = i9;
        this.b = u7.a(i9, i10, i11);
        this.c = i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.a, this.b, this.c);
    }
}
