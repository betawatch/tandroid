// default package

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class c8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ActionBarOverlayLayout b;

    public /* synthetic */ c8(ActionBarOverlayLayout actionBarOverlayLayout, byte b) {
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
