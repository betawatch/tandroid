// default package

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class e59 implements Iterable {
    public final boolean a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public final Semaphore f;
    public e59 h;
    public d59 n;

    public e59(int i, boolean z) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = z ? new Semaphore(1) : null;
        this.a = true;
        this.b = new ArrayList();
    }

    public final boolean add(Object obj) {
        synchronized (this.b) {
            boolean z = false;
            if (indexOf(obj) != -1) {
                return false;
            }
            if (!this.e) {
                this.b.add(new WeakReference(obj));
                return true;
            }
            ArrayList arrayList = this.d;
            boolean z2 = false;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Reference reference = (Reference) arrayList.get(size);
                Object obj2 = reference != null ? reference.get() : null;
                if (obj2 == null) {
                    arrayList.remove(size);
                } else if (obj2 == obj) {
                    z2 = true;
                }
            }
            if (!z2) {
                arrayList.add(new WeakReference(obj));
                z = true;
            }
            lse.a(this.c, obj);
            return z;
        }
    }

    public final void clear() {
        synchronized (this.b) {
            boolean z = this.e;
            ArrayList arrayList = this.b;
            if (z) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Reference reference = (Reference) obj;
                    if (!this.c.contains(reference)) {
                        this.c.add(reference);
                    }
                    lse.a(this.d, reference.get());
                }
            } else {
                arrayList.clear();
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        ArrayList arrayList = this.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((Reference) arrayList.get(size)).get() == obj) {
                return size;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        synchronized (this.b) {
            boolean z = this.e;
            ArrayList arrayList = this.b;
            if (z) {
                return arrayList.isEmpty() && this.d.isEmpty();
            }
            if (arrayList != null) {
                for (int size = arrayList.size() - 2; size >= 0; size--) {
                    if (((Reference) arrayList.get(size)).get() == null) {
                        arrayList.remove(size);
                    }
                }
            }
            return this.b.isEmpty();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        d59 d59Var;
        Semaphore semaphore = this.f;
        if (semaphore != null) {
            semaphore.acquireUninterruptibly();
        }
        synchronized (this.b) {
            if (!this.a) {
                if (this.b.isEmpty()) {
                    return Collections.emptyIterator();
                }
                return new d59(this);
            }
            if (this.e) {
                throw new IllegalStateException();
            }
            this.e = true;
            d59 d59Var2 = this.n;
            if (d59Var2 == null) {
                d59Var = new d59(this);
                this.n = d59Var;
            } else {
                d59Var2.a = this.b.size();
                d59Var = this.n;
                d59Var.b = null;
            }
            return d59Var;
        }
    }

    public final boolean remove(Object obj) {
        synchronized (this.b) {
            int indexOf = indexOf(obj);
            if (indexOf == -1) {
                return false;
            }
            boolean z = this.e;
            ArrayList arrayList = this.b;
            if (z) {
                Reference reference = (Reference) arrayList.get(indexOf);
                if (!this.c.contains(reference)) {
                    this.c.add(reference);
                }
                lse.a(this.d, reference.get());
            } else {
                arrayList.remove(indexOf);
            }
            return true;
        }
    }

    public e59() {
        this(0, false);
    }
}
