package n7;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class t extends d0 {
    public static final Object b = new Object();
    public Object a;

    public t(Object obj) {
        this.a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.a;
        Object obj2 = b;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.a = obj2;
        return obj;
    }
}
