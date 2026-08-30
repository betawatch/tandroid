package ld;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
