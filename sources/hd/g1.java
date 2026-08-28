package hd;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public interface g1 extends qc.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    ed.b getChildren();

    g1 getParent();

    p0 invokeOnCompletion(zc.l lVar);

    p0 invokeOnCompletion(boolean z10, boolean z11, zc.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(qc.c cVar);

    boolean start();
}
