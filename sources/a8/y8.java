package a8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
