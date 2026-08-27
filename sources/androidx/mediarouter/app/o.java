package androidx.mediarouter.app;

import android.view.animation.Animation;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((u) this.b).j(true);
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
        int i10 = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                u uVar = (u) this.b;
                OverlayListView overlayListView = uVar.Q;
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
                uVar.Q.postDelayed(uVar.A0, uVar.t0);
                break;
            case 1:
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
