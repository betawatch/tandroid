package ae;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public interface h1 extends jd.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    xd.b getChildren();

    h1 getParent();

    q0 invokeOnCompletion(sd.l lVar);

    q0 invokeOnCompletion(boolean z10, boolean z11, sd.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(jd.c cVar);

    boolean start();
}
