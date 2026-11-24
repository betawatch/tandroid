// default package

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ActionBarOverlayLayout b;

    public /* synthetic */ b8(ActionBarOverlayLayout actionBarOverlayLayout, byte b) {
        this.a = b;
        this.b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        switch (b) {
            case 0:
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.N = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.O);
                break;
            default:
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.N = actionBarOverlayLayout.d.animate().translationY(-actionBarOverlayLayout.d.getHeight()).setListener(actionBarOverlayLayout.O);
                break;
        }
    }
}
