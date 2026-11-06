package androidx.mediarouter.app;

import android.view.animation.Animation;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class j implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ j(t tVar, int i7) {
        this.a = i7;
        this.b = tVar;
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
        int i7 = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                break;
            default:
                t tVar = this.b;
                OverlayListView overlayListView = tVar.U;
                ArrayList arrayList = overlayListView.a;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    o0 o0Var = (o0) obj;
                    if (!o0Var.j) {
                        o0Var.i = overlayListView.getDrawingTime();
                        o0Var.j = true;
                    }
                }
                tVar.U.postDelayed(tVar.E0, tVar.x0);
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
