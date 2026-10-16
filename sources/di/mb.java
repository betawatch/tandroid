package di;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.gh0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class mb extends o6 {
    public final /* synthetic */ kc A2;
    public boolean z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(kc kcVar, Context context, boolean z10, File file, boolean z11, boolean z12, jc jcVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, k8 k8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.la laVar, bi.b bVar, z6 z6Var, yb ybVar) {
        super(context, z10, file, z11, z12, jcVar, activity, i10, bitmap, bitmap2, i11, arrayList, k8Var, i12, i13, cropState, laVar, bVar, z6Var, ybVar);
        this.A2 = kcVar;
    }

    @Override // rg.h
    public final void B(boolean z10) {
        kc kcVar = this.A2;
        kcVar.o1.a(true, z10, kcVar.i0);
    }

    @Override // rg.h
    public final void C() {
        kc kcVar = this.A2;
        kcVar.v1.N0(false);
        kcVar.c1.clearAnimation();
        ViewPropertyAnimator duration = kcVar.c1.animate().alpha(0.0f).setDuration(180L);
        es esVar = es.g;
        duration.setInterpolator(esVar).start();
        if (kcVar.g0 != 2) {
            kcVar.Y0.clearAnimation();
            kcVar.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(esVar).start();
        }
        U0(q(), false);
    }

    public final void U0(boolean z10, boolean z11) {
        kc kcVar = this.A2;
        if (!z10) {
            kcVar.p1.a(false, z11);
            kcVar.p1.clearAnimation();
            kcVar.p1.animate().alpha(0.0f).withEndAction(new x8(this, 4)).setDuration(180L).setInterpolator(es.g).setStartDelay(z11 ? 500L : 0L).start();
        } else {
            kcVar.p1.setVisibility(0);
            kcVar.p1.setAlpha(0.0f);
            kcVar.p1.clearAnimation();
            kcVar.p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(es.g).start();
        }
    }

    @Override // rg.h
    public final void f(boolean z10) {
        kc kcVar = this.A2;
        kcVar.o1.b(kcVar.c1.getText());
        kcVar.o1.a(false, z10 && this.z2, null);
    }

    @Override // rg.h
    public final void g(boolean z10) {
        rg.j jVar;
        if (!q()) {
            z10 = false;
        }
        kc kcVar = this.A2;
        kcVar.c1.clearAnimation();
        ViewPropertyAnimator duration = kcVar.c1.animate().alpha(kcVar.g0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        es esVar = es.g;
        duration.setInterpolator(esVar).start();
        kcVar.Y0.clearAnimation();
        ViewPropertyAnimator animate = kcVar.Y0.animate();
        int i10 = kcVar.g0;
        animate.alpha((i10 == -1 || i10 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(esVar).start();
        U0(false, z10);
        if (z10 && (jVar = this.J0) != null) {
            B0(jVar);
        }
        S0();
        this.l2 = true;
        this.z2 = false;
    }

    @Override // rg.h
    public final void j() {
        this.z2 = false;
        U0(q(), false);
        this.A2.o1.a(false, false, null);
    }

    @Override // rg.h
    public final void k() {
        this.z2 = true;
        this.A2.v1.N0(false);
        U0(false, false);
    }

    @Override // rg.h
    public final void m(boolean z10) {
        this.A2.p1.a(z10, false);
    }

    @Override // di.o6
    public final void q0() {
        kc kcVar = this.A2;
        kcVar.c1.f.d();
        kcVar.k0(0, false, true);
        rg.j jVar = this.J0;
        if (!(jVar instanceof rg.x2) || this.K0) {
            return;
        }
        rg.x2 x2Var = (rg.x2) jVar;
        this.K0 = true;
        x2Var.q();
        View focusedView = x2Var.getFocusedView();
        focusedView.requestFocus();
        AndroidUtilities.showKeyboard(focusedView);
    }

    @Override // rg.h
    public final void y() {
        this.A2.v1.N0(false);
    }

    @Override // di.o6
    public final void y0(boolean z10) {
        kc kcVar = this.A2;
        yb ybVar = kcVar.X0;
        if (ybVar != null) {
            ybVar.x(6, z10);
            p6 p6Var = kcVar.j1;
            if (p6Var != null) {
                ((gh0) p6Var.c).a(kcVar.X0.k(), true);
            }
        }
        ac acVar = kcVar.c1;
        if (acVar != null) {
            acVar.e0 = z10;
            acVar.L.b(z10);
        }
    }
}
