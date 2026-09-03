package androidx.mediarouter.app;

import android.view.animation.Animation;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class l implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i10) {
        this.a = i10;
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
                p0Var.L = false;
                p0Var.o();
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
            case 1:
                v vVar = (v) this.b;
                OverlayListView overlayListView = vVar.R;
                ArrayList arrayList = overlayListView.a;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    q0 q0Var = (q0) obj;
                    if (!q0Var.j) {
                        q0Var.i = overlayListView.getDrawingTime();
                        q0Var.j = true;
                    }
                }
                vVar.R.postDelayed(vVar.B0, vVar.u0);
                break;
            default:
                ((n0) this.b).w.L = true;
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
