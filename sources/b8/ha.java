package b8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class ha {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.cast.d4 d4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(d4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(d4Var) != obj && atomicReferenceFieldUpdater.get(d4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
