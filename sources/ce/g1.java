package ce;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
