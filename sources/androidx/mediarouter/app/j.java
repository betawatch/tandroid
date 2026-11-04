package androidx.mediarouter.app;

import android.view.animation.Animation;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ j(t tVar, int i3) {
        this.a = i3;
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
        int i3 = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                break;
            default:
                t tVar = this.b;
                OverlayListView overlayListView = tVar.V;
                ArrayList arrayList = overlayListView.a;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    p0 p0Var = (p0) obj;
                    if (!p0Var.j) {
                        p0Var.i = overlayListView.getDrawingTime();
                        p0Var.j = true;
                    }
                }
                tVar.V.postDelayed(tVar.F0, tVar.y0);
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
