package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j {
    public static final c o = new c(1);
    public static final c p = new c(2);
    public static final c q = new c(3);
    public static final c r = new c(4);
    public static final c s = new c(5);
    public static final c t = new c(6);
    public static final c u = new c(7);
    public static final c v = new c(0);
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final h e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;
    public k m;
    public float n;

    public j(Object obj, h hVar) {
        this(obj, hVar, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
    }

    public final void a(f fVar) {
        ArrayList arrayList = this.k;
        if (arrayList.contains(fVar)) {
            return;
        }
        arrayList.add(fVar);
    }

    public final void b(g gVar) {
        if (this.f) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList arrayList = this.l;
        if (arrayList.contains(gVar)) {
            return;
        }
        arrayList.add(gVar);
    }

    public final void c(float f7) {
        if (this.f) {
            this.n = f7;
            return;
        }
        if (this.m == null) {
            this.m = new k(f7);
        }
        this.m.i = f7;
        h();
    }

    public final void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f) {
            e(true);
        }
    }

    public final void e(boolean z10) {
        ArrayList arrayList;
        int i10 = 0;
        this.f = false;
        ThreadLocal threadLocal = b.f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        bVar.a.remove(this);
        ArrayList arrayList2 = bVar.b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            bVar.e = true;
        }
        this.i = 0L;
        this.c = false;
        while (true) {
            arrayList = this.k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((f) arrayList.get(i10)).a(this, z10, this.b, this.a);
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void f(float f7) {
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.j = f7;
    }

    public final void g(float f7) {
        ArrayList arrayList;
        this.e.b(this.d, f7);
        int i10 = 0;
        while (true) {
            arrayList = this.l;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g) arrayList.get(i10)).a(this, this.b, this.a);
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void h() {
        k kVar = this.m;
        if (kVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d = (float) kVar.i;
        if (d > this.g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d < this.h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.j * 0.75f);
        kVar.d = abs;
        kVar.e = abs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z10 = this.f;
        if (z10 || z10) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.a(this.d);
        }
        float f7 = this.b;
        if (f7 > this.g || f7 < this.h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal threadLocal = b.f;
        if (threadLocal.get() == null) {
            threadLocal.set(new b());
        }
        b bVar = (b) threadLocal.get();
        ArrayList arrayList = bVar.b;
        if (arrayList.size() == 0) {
            if (bVar.d == null) {
                bVar.d = new li.k(bVar.c);
            }
            li.k kVar2 = bVar.d;
            ((Choreographer) kVar2.c).postFrameCallback((a) kVar2.d);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public j(Object obj, h hVar, float f7) {
        this(obj, hVar, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.m = new k(f7);
    }

    public j(i iVar) {
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
        this.e = new d(iVar, 0);
        this.j = 1.0f;
        this.m = null;
        this.n = Float.MAX_VALUE;
    }

    public j(Object obj, h hVar, int i10) {
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
        this.e = hVar;
        if (hVar != s && hVar != t && hVar != u) {
            if (hVar == v) {
                this.j = 0.00390625f;
                return;
            } else if (hVar != q && hVar != r) {
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
