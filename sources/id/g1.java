package id;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public interface g1 extends rc.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    fd.b getChildren();

    g1 getParent();

    p0 invokeOnCompletion(ad.l lVar);

    p0 invokeOnCompletion(boolean z10, boolean z11, ad.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(rc.c cVar);

    boolean start();
}
