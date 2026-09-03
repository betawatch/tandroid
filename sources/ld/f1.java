package ld;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public interface f1 extends uc.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    id.b getChildren();

    f1 getParent();

    o0 invokeOnCompletion(dd.l lVar);

    o0 invokeOnCompletion(boolean z4, boolean z10, dd.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(uc.c cVar);

    boolean start();
}
