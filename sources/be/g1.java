package be;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
