package b5;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.q3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
            ((x9.f) q3Var.a).i((String) q3Var.c, str);
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
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.b;
                ((AtomicReference) mVar.c).set(null);
                synchronized (mVar) {
                    try {
                        if (((AtomicMarkableReference) mVar.b).isMarked()) {
                            map = ((x9.d) ((AtomicMarkableReference) mVar.b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) mVar.b;
                            atomicMarkableReference.set((x9.d) atomicMarkableReference.getReference(), false);
                        } else {
                            map = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (map != null) {
                    q3 q3Var = (q3) mVar.d;
                    ((x9.f) q3Var.a).g((String) q3Var.c, map, mVar.a);
                }
                return null;
        }
    }
}
