// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public interface ev5 extends kx2 {
    xg2 attachChild(ah2 ah2Var);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    f8a getChildren();

    ep3 invokeOnCompletion(ur4 ur4Var);

    ep3 invokeOnCompletion(boolean z, boolean z2, ur4 ur4Var);

    boolean isActive();

    boolean isCancelled();

    Object join(zw2 zw2Var);

    boolean start();
}
