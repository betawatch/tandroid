package gi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.re;
import org.telegram.ui.Components.je0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x9 extends m5 {
    public boolean j2;
    public final /* synthetic */ va k2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(va vaVar, Context context, boolean z10, File file, boolean z11, boolean z12, ua uaVar, Activity activity, int i3, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, f7 f7Var, int i11, int i12, re reVar, org.telegram.ui.Components.x9 x9Var, ei.b bVar, x5 x5Var, ja jaVar) {
        super(context, z10, file, z11, z12, uaVar, activity, i3, bitmap, bitmap2, i10, arrayList, f7Var, i11, i12, reVar, x9Var, bVar, x5Var, jaVar);
        this.k2 = vaVar;
    }

    @Override // ug.h
    public final void A(boolean z10) {
        va vaVar = this.k2;
        vaVar.p1.a(true, z10, vaVar.j0);
    }

    @Override // ug.h
    public final void B() {
        va vaVar = this.k2;
        vaVar.w1.L0(false);
        vaVar.d1.clearAnimation();
        ViewPropertyAnimator duration = vaVar.d1.animate().alpha(0.0f).setDuration(180L);
        xq xqVar = xq.g;
        duration.setInterpolator(xqVar).start();
        if (vaVar.h0 != 2) {
            vaVar.Z0.clearAnimation();
            vaVar.Z0.animate().alpha(0.0f).setDuration(180L).setInterpolator(xqVar).start();
        }
        S0(q(), false);
    }

    public final void S0(boolean z10, boolean z11) {
        va vaVar = this.k2;
        if (!z10) {
            vaVar.q1.a(false, z11);
            vaVar.q1.clearAnimation();
            vaVar.q1.animate().alpha(0.0f).withEndAction(new f6(this, 6)).setDuration(180L).setInterpolator(xq.g).setStartDelay(z11 ? 500L : 0L).start();
        } else {
            vaVar.q1.setVisibility(0);
            vaVar.q1.setAlpha(0.0f);
            vaVar.q1.clearAnimation();
            vaVar.q1.animate().alpha(1.0f).setDuration(180L).setInterpolator(xq.g).start();
        }
    }

    @Override // ug.h
    public final void d(boolean z10) {
        va vaVar = this.k2;
        vaVar.p1.b(vaVar.d1.getText());
        vaVar.p1.a(false, z10 && this.j2, null);
    }

    @Override // ug.h
    public final void e(boolean z10) {
        ug.j jVar;
        if (!q()) {
            z10 = false;
        }
        va vaVar = this.k2;
        vaVar.d1.clearAnimation();
        ViewPropertyAnimator duration = vaVar.d1.animate().alpha(vaVar.h0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        xq xqVar = xq.g;
        duration.setInterpolator(xqVar).start();
        vaVar.Z0.clearAnimation();
        ViewPropertyAnimator animate = vaVar.Z0.animate();
        int i3 = vaVar.h0;
        animate.alpha((i3 == -1 || i3 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(xqVar).start();
        S0(false, z10);
        if (z10 && (jVar = this.t0) != null) {
            z0(jVar);
        }
        Q0();
        this.V1 = true;
        this.j2 = false;
    }

    @Override // ug.h
    public final void g() {
        this.j2 = false;
        S0(q(), false);
        this.k2.p1.a(false, false, null);
    }

    @Override // ug.h
    public final void h() {
        this.j2 = true;
        this.k2.w1.L0(false);
        S0(false, false);
    }

    @Override // ug.h
    public final void l(boolean z10) {
        this.k2.q1.a(z10, false);
    }

    @Override // gi.m5
    public final void o0() {
        va vaVar = this.k2;
        vaVar.d1.f.d();
        vaVar.k0(0, false, true);
        ug.j jVar = this.t0;
        if (!(jVar instanceof ug.l2) || this.u0) {
            return;
        }
        ug.l2 l2Var = (ug.l2) jVar;
        this.u0 = true;
        l2Var.q();
        View focusedView = l2Var.getFocusedView();
        focusedView.requestFocus();
        org.telegram.messenger.g0.K3(focusedView);
    }

    @Override // gi.m5
    public final void w0(boolean z10) {
        va vaVar = this.k2;
        ja jaVar = vaVar.Y0;
        if (jaVar != null) {
            jaVar.x(6, z10);
            n5 n5Var = vaVar.k1;
            if (n5Var != null) {
                ((je0) n5Var.c).a(vaVar.Y0.k(), true);
            }
        }
        la laVar = vaVar.d1;
        if (laVar != null) {
            laVar.e0 = z10;
            laVar.M.b(z10);
        }
    }

    @Override // ug.h
    public final void x() {
        this.k2.w1.L0(false);
    }
}
