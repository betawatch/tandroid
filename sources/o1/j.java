package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j extends h {
    public k u;
    public float v;

    public j(gb.a aVar) {
        super(aVar);
        this.u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void f() {
        k kVar = this.u;
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
        float f10 = this.b;
        if (f10 > this.g || f10 < this.h) {
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
                bVar.d = new j4.c(bVar.c);
            }
            j4.c cVar = bVar.d;
            ((Choreographer) cVar.c).postFrameCallback((a) cVar.d);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public j(Object obj, i iVar) {
        super(obj, iVar);
        this.u = null;
        this.v = Float.MAX_VALUE;
    }

    public j(Object obj, i iVar, float f10) {
        super(obj, iVar);
        this.u = null;
        this.v = Float.MAX_VALUE;
        this.u = new k(f10);
    }
}
