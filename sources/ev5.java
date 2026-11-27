// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
