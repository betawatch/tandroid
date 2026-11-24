// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public interface bt5 extends qw2 {
    fg2 attachChild(ig2 ig2Var);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    n4a getChildren();

    no3 invokeOnCompletion(qp4 qp4Var);

    no3 invokeOnCompletion(boolean z, boolean z2, qp4 qp4Var);

    boolean isActive();

    boolean isCancelled();

    Object join(fw2 fw2Var);

    boolean start();
}
