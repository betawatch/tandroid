package a8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class y8 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.cast.c4 c4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(c4Var) != obj && atomicReferenceFieldUpdater.get(c4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
