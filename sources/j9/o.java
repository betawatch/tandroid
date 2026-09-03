package j9;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.s3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
            s3 s3Var = (s3) mVar.c;
            ((g) s3Var.a).g((String) s3Var.c, map, mVar.a);
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z4;
        String str;
        switch (this.a) {
            case 0:
                s3 s3Var = (s3) this.b;
                synchronized (((AtomicMarkableReference) s3Var.h)) {
                    try {
                        z4 = false;
                        if (((AtomicMarkableReference) s3Var.h).isMarked()) {
                            str = (String) ((AtomicMarkableReference) s3Var.h).getReference();
                            ((AtomicMarkableReference) s3Var.h).set(str, false);
                            z4 = true;
                        } else {
                            str = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z4) {
                    ((g) s3Var.a).i((String) s3Var.c, str);
                }
                return null;
            case 1:
                return a();
            default:
                return new o2.f((JsReplyProxyBoundaryInterface) this.b);
        }
    }
}
