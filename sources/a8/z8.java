package a8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class z8 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.cast.c4 c4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(c4Var) != obj && atomicReferenceFieldUpdater.get(c4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
