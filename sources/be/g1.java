package be;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
