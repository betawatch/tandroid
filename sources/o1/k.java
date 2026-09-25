package o1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class k extends h {
    public l u;
    public float v;

    public k(j jVar) {
        super(jVar);
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
                bVar.d = new la.h(bVar.c);
            }
            la.h hVar = bVar.d;
            ((Choreographer) hVar.c).postFrameCallback((a) hVar.d);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public k(Object obj, i iVar) {
        super(obj, iVar);
        this.u = null;
        this.v = Float.MAX_VALUE;
    }

    public k(Object obj, i iVar, float f7) {
        super(obj, iVar);
        this.u = null;
        this.v = Float.MAX_VALUE;
        this.u = new l(f7);
    }
}
