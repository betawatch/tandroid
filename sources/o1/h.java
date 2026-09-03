package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class h {
    public static final c m = new c(1);
    public static final c n = new c(2);
    public static final c o = new c(3);
    public static final c p = new c(4);
    public static final c q = new c(5);
    public static final c r = new c(6);
    public static final c s = new c(7);
    public static final c t = new c(0);
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final i e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;

    public h(kb.a aVar) {
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
        this.e = new d(aVar, 0);
        this.j = 1.0f;
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

    public final void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f) {
            d(true);
        }
    }

    public final void d(boolean z4) {
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
                ((f) arrayList.get(i10)).a(this, z4, this.b, this.a);
            }
            i10++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void e(float f10) {
        ArrayList arrayList;
        this.e.b(this.d, f10);
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

    public h(Object obj, i iVar) {
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
        this.e = iVar;
        if (iVar != q && iVar != r && iVar != s) {
            if (iVar == t) {
                this.j = 0.00390625f;
                return;
            } else if (iVar != o && iVar != p) {
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
