package j7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class z5 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.cast.e4 e4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(e4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(e4Var) != obj && atomicReferenceFieldUpdater.get(e4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
