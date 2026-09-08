package androidx.mediarouter.app;

import android.view.animation.Animation;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                ((u) this.b).j(true);
                break;
            case 1:
                break;
            default:
                o0 o0Var = ((m0) this.b).w;
                o0Var.O = false;
                o0Var.o();
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
                u uVar = (u) this.b;
                OverlayListView overlayListView = uVar.U;
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
                uVar.U.postDelayed(uVar.E0, uVar.x0);
                break;
            default:
                ((m0) this.b).w.O = true;
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
