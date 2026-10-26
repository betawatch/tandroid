package c5;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.r3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        r3 r3Var = (r3) this.b;
        synchronized (((AtomicMarkableReference) r3Var.h)) {
            try {
                z10 = false;
                if (((AtomicMarkableReference) r3Var.h).isMarked()) {
                    str = (String) ((AtomicMarkableReference) r3Var.h).getReference();
                    ((AtomicMarkableReference) r3Var.h).set(str, false);
                    z10 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            ((z9.f) r3Var.a).i((String) r3Var.c, str);
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
                            map = ((z9.d) ((AtomicMarkableReference) bVar.b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) bVar.b;
                            atomicMarkableReference.set((z9.d) atomicMarkableReference.getReference(), false);
                        } else {
                            map = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (map != null) {
                    r3 r3Var = (r3) bVar.d;
                    ((z9.f) r3Var.a).g((String) r3Var.c, map, bVar.a);
                }
                return null;
        }
    }
}
