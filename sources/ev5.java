// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
