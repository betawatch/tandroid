package androidx.mediarouter.app;

import android.view.animation.Animation;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ j(t tVar, int i10) {
        this.a = i10;
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
        int i10 = this.a;
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
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    p0 p0Var = (p0) obj;
                    if (!p0Var.j) {
                        p0Var.i = overlayListView.getDrawingTime();
                        p0Var.j = true;
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
