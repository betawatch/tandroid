// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
