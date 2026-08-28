package androidx.mediarouter.app;

import android.view.animation.Animation;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                ((v) this.b).j(true);
                break;
            case 1:
                break;
            default:
                p0 p0Var = ((n0) this.b).w;
                p0Var.K = false;
                p0Var.o();
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i9 = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                v vVar = (v) this.b;
                OverlayListView overlayListView = vVar.Q;
                ArrayList arrayList = overlayListView.a;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    q0 q0Var = (q0) obj;
                    if (!q0Var.j) {
                        q0Var.i = overlayListView.getDrawingTime();
                        q0Var.j = true;
                    }
                }
                vVar.Q.postDelayed(vVar.A0, vVar.t0);
                break;
            default:
                ((n0) this.b).w.K = true;
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

    private final void e(Animation animation) {
    }
}
