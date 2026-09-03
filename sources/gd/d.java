package gd;

import java.util.Iterator;
import k7.t8;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class d implements Iterable {
    public final int a;
    public final int b;
    public final int c;

    public d(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = i10;
        this.b = t8.a(i10, i11, i12);
        this.c = i12;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.a, this.b, this.c);
    }
}
