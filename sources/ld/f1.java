package ld;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
