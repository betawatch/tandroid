package ce;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public interface g1 extends ld.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    zd.b getChildren();

    g1 getParent();

    p0 invokeOnCompletion(ud.l lVar);

    p0 invokeOnCompletion(boolean z10, boolean z11, ud.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(ld.c cVar);

    boolean start();
}
