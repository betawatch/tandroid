package be;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public interface g1 extends kd.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    yd.b getChildren();

    g1 getParent();

    p0 invokeOnCompletion(td.l lVar);

    p0 invokeOnCompletion(boolean z10, boolean z11, td.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(kd.c cVar);

    boolean start();
}
