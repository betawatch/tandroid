package g9;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.t3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final Object a() {
        boolean z10;
        String str;
        t3 t3Var = (t3) this.b;
        synchronized (((AtomicMarkableReference) t3Var.h)) {
            try {
                z10 = false;
                if (((AtomicMarkableReference) t3Var.h).isMarked()) {
                    str = (String) ((AtomicMarkableReference) t3Var.h).getReference();
                    ((AtomicMarkableReference) t3Var.h).set(str, false);
                    z10 = true;
                } else {
                    str = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            ((g) t3Var.a).i((String) t3Var.c, str);
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Map map;
        switch (this.a) {
            case 0:
                return a();
            default:
                com.google.firebase.messaging.l lVar = (com.google.firebase.messaging.l) this.b;
                ((AtomicReference) lVar.c).set(null);
                synchronized (lVar) {
                    try {
                        if (((AtomicMarkableReference) lVar.b).isMarked()) {
                            map = ((d) ((AtomicMarkableReference) lVar.b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) lVar.b;
                            atomicMarkableReference.set((d) atomicMarkableReference.getReference(), false);
                        } else {
                            map = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (map != null) {
                    t3 t3Var = (t3) lVar.d;
                    ((g) t3Var.a).g((String) t3Var.c, map, lVar.a);
                }
                return null;
        }
    }
}
