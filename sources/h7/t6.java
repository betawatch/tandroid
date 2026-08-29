package h7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class t6 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.play_billing.f4 f4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(f4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(f4Var) != obj && atomicReferenceFieldUpdater.get(f4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
