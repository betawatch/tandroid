package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class i {
    public static final d m = new d(1);
    public static final d n = new d(2);
    public static final d o = new d(3);
    public static final d p = new d(4);
    public static final d q = new d(5);
    public static final d r = new d(6);
    public static final d s = new d(7);
    public static final d t = new d(0);
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final j e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;

    public i(ib.a aVar) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = null;
        this.e = new e(aVar, 0);
        this.j = 1.0f;
    }

    public final void a(g gVar) {
        ArrayList arrayList = this.k;
        if (arrayList.contains(gVar)) {
            return;
        }
        arrayList.add(gVar);
    }

    public final void b(h hVar) {
        if (this.f) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList arrayList = this.l;
        if (arrayList.contains(hVar)) {
            return;
        }
        arrayList.add(hVar);
    }

    public final void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f) {
            d(true);
        }
    }

    public final void d(boolean z10) {
        ArrayList arrayList;
        int i10 = 0;
        this.f = false;
        ThreadLocal threadLocal = c.f;
        if (threadLocal.get() == null) {
            threadLocal.set(new c());
        }
        c cVar = (c) threadLocal.get();
        cVar.a.remove(this);
        ArrayList arrayList2 = cVar.b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            cVar.e = true;
        }
        this.i = 0L;
        this.c = false;
        while (true) {
            arrayList = this.k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, z10, this.b, this.a);
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void e(float f9) {
        ArrayList arrayList;
        this.e.b(this.d, f9);
        int i10 = 0;
        while (true) {
            arrayList = this.l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((h) arrayList.get(i10)).a(this, this.b, this.a);
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public i(Object obj, j jVar) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = obj;
        this.e = jVar;
        if (jVar != q && jVar != r && jVar != s) {
            if (jVar == t) {
                this.j = 0.00390625f;
                return;
            } else if (jVar != o && jVar != p) {
                this.j = 1.0f;
                return;
            } else {
                this.j = 0.00390625f;
                return;
            }
        }
        this.j = 0.1f;
    }
}
