package b5;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.q3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final Object a() {
        boolean z10;
        String str;
        q3 q3Var = (q3) this.b;
        synchronized (((AtomicMarkableReference) q3Var.h)) {
            try {
                z10 = false;
                if (((AtomicMarkableReference) q3Var.h).isMarked()) {
                    str = (String) ((AtomicMarkableReference) q3Var.h).getReference();
                    ((AtomicMarkableReference) q3Var.h).set(str, false);
                    z10 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            ((y9.f) q3Var.a).i((String) q3Var.c, str);
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Map map;
        switch (this.a) {
            case 0:
                return new h((JsReplyProxyBoundaryInterface) this.b);
            case 1:
                return a();
            default:
                c2.b bVar = (c2.b) this.b;
                ((AtomicReference) bVar.c).set(null);
                synchronized (bVar) {
                    try {
                        if (((AtomicMarkableReference) bVar.b).isMarked()) {
                            map = ((y9.d) ((AtomicMarkableReference) bVar.b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) bVar.b;
                            atomicMarkableReference.set((y9.d) atomicMarkableReference.getReference(), false);
                        } else {
                            map = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (map != null) {
                    q3 q3Var = (q3) bVar.d;
                    ((y9.f) q3Var.a).g((String) q3Var.c, map, bVar.a);
                }
                return null;
        }
    }
}
