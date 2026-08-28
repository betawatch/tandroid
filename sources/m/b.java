package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarOverlayLayout b;

    public /* synthetic */ b(ActionBarOverlayLayout actionBarOverlayLayout, int i9) {
        this.a = i9;
        this.b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.I = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.J);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.I = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.J);
                break;
        }
    }
}
