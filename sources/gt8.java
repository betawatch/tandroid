// default package

import android.view.Choreographer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class gt8 {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new gr4(runnable, (byte) 2));
    }
}
