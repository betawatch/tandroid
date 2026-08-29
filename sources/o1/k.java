package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import l3.g0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k extends i {
    public l u;
    public float v;

    public k(ib.a aVar) {
        super(aVar);
        this.u = null;
        this.v = Float.MAX_VALUE;
    }

    public final void f() {
        l lVar = this.u;
        if (lVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d = (float) lVar.i;
        if (d > this.g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d < this.h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.j * 0.75f);
        lVar.d = abs;
        lVar.e = abs * 62.5d;
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
        float f9 = this.b;
        if (f9 > this.g || f9 < this.h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal threadLocal = c.f;
        if (threadLocal.get() == null) {
            threadLocal.set(new c());
        }
        c cVar = (c) threadLocal.get();
        ArrayList arrayList = cVar.b;
        if (arrayList.size() == 0) {
            if (cVar.d == null) {
                cVar.d = new g0(cVar.c);
            }
            g0 g0Var = cVar.d;
            ((Choreographer) g0Var.c).postFrameCallback((b) g0Var.d);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public k(Object obj, j jVar) {
        super(obj, jVar);
        this.u = null;
        this.v = Float.MAX_VALUE;
    }

    public k(Object obj, j jVar, float f9) {
        super(obj, jVar);
        this.u = null;
        this.v = Float.MAX_VALUE;
        this.u = new l(f9);
    }
}
