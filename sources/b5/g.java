package b5;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.p3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        p3 p3Var = (p3) this.b;
        synchronized (((AtomicMarkableReference) p3Var.h)) {
            try {
                z10 = false;
                if (((AtomicMarkableReference) p3Var.h).isMarked()) {
                    str = (String) ((AtomicMarkableReference) p3Var.h).getReference();
                    ((AtomicMarkableReference) p3Var.h).set(str, false);
                    z10 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            ((y9.f) p3Var.a).i((String) p3Var.c, str);
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
                ac.a aVar = (ac.a) this.b;
                ((AtomicReference) aVar.c).set(null);
                synchronized (aVar) {
                    try {
                        if (((AtomicMarkableReference) aVar.b).isMarked()) {
                            map = ((y9.d) ((AtomicMarkableReference) aVar.b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) aVar.b;
                            atomicMarkableReference.set((y9.d) atomicMarkableReference.getReference(), false);
                        } else {
                            map = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (map != null) {
                    p3 p3Var = (p3) aVar.d;
                    ((y9.f) p3Var.a).g((String) p3Var.c, map, aVar.a);
                }
                return null;
        }
    }
}
