package a8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
