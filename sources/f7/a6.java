package f7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a6 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.play_billing.l0 l0Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(l0Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(l0Var) != obj && atomicReferenceFieldUpdater.get(l0Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
