package j9;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.r3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final Object a() {
        Map map;
        cb.m mVar = (cb.m) this.b;
        ((AtomicReference) mVar.d).set(null);
        synchronized (mVar) {
            try {
                if (((AtomicMarkableReference) mVar.b).isMarked()) {
                    map = ((d) ((AtomicMarkableReference) mVar.b).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) mVar.b;
                    atomicMarkableReference.set((d) atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (map != null) {
            r3 r3Var = (r3) mVar.c;
            ((g) r3Var.a).g((String) r3Var.c, map, mVar.a);
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z4;
        String str;
        switch (this.a) {
            case 0:
                r3 r3Var = (r3) this.b;
                synchronized (((AtomicMarkableReference) r3Var.h)) {
                    try {
                        z4 = false;
                        if (((AtomicMarkableReference) r3Var.h).isMarked()) {
                            str = (String) ((AtomicMarkableReference) r3Var.h).getReference();
                            ((AtomicMarkableReference) r3Var.h).set(str, false);
                            z4 = true;
                        } else {
                            str = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z4) {
                    ((g) r3Var.a).i((String) r3Var.c, str);
                }
                return null;
            case 1:
                return a();
            default:
                return new o2.f((JsReplyProxyBoundaryInterface) this.b);
        }
    }
}
