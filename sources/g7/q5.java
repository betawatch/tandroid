package g7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class q5 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.cast.e4 e4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(e4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(e4Var) != obj && atomicReferenceFieldUpdater.get(e4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
