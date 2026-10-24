package be;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
