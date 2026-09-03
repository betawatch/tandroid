package ld;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
