package o8;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e0 extends x0 {
    public boolean a;
    public final /* synthetic */ Object b;

    public e0(Object obj) {
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.b;
    }
}
