package b5;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.s3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
        s3 s3Var = (s3) this.b;
        synchronized (((AtomicMarkableReference) s3Var.h)) {
            try {
                z10 = false;
                if (((AtomicMarkableReference) s3Var.h).isMarked()) {
                    str = (String) ((AtomicMarkableReference) s3Var.h).getReference();
                    ((AtomicMarkableReference) s3Var.h).set(str, false);
                    z10 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            ((y9.f) s3Var.a).i((String) s3Var.c, str);
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
                    s3 s3Var = (s3) bVar.d;
                    ((y9.f) s3Var.a).g((String) s3Var.c, map, bVar.a);
                }
                return null;
        }
    }
}
