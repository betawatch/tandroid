// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public interface av5 extends ay2 {
    th2 attachChild(wh2 wh2Var);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    p6a getChildren();

    xp3 invokeOnCompletion(rr4 rr4Var);

    xp3 invokeOnCompletion(boolean z, boolean z2, rr4 rr4Var);

    boolean isActive();

    boolean isCancelled();

    Object join(px2 px2Var);

    boolean start();
}
