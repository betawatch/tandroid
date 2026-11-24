// default package

import android.view.animation.Animation;
import androidx.mediarouter.app.OverlayListView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mu6 implements Animation.AnimationListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wu6 b;

    public /* synthetic */ mu6(wu6 wu6Var, byte b) {
        this.a = b;
        this.b = wu6Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                this.b.j(true);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        byte b = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                break;
            default:
                wu6 wu6Var = this.b;
                OverlayListView overlayListView = wu6Var.V;
                ArrayList arrayList = overlayListView.a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    it7 it7Var = (it7) obj;
                    if (!it7Var.j) {
                        it7Var.i = overlayListView.getDrawingTime();
                        it7Var.j = true;
                    }
                }
                wu6Var.V.postDelayed(wu6Var.F0, wu6Var.y0);
                break;
        }
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
