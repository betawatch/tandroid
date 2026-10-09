package ci;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class nb extends q6 {
    public final /* synthetic */ lc A2;
    public boolean z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(lc lcVar, Context context, boolean z10, File file, boolean z11, boolean z12, kc kcVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, l8 l8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ma maVar, ai.d dVar, a7 a7Var, zb zbVar) {
        super(context, z10, file, z11, z12, kcVar, activity, i10, bitmap, bitmap2, i11, arrayList, l8Var, i12, i13, cropState, maVar, dVar, a7Var, zbVar);
        this.A2 = lcVar;
    }

    @Override // qg.h
    public final void A(boolean z10) {
        lc lcVar = this.A2;
        lcVar.o1.a(true, z10, lcVar.i0);
    }

    @Override // qg.h
    public final void B() {
        lc lcVar = this.A2;
        lcVar.v1.N0(false);
        lcVar.c1.clearAnimation();
        ViewPropertyAnimator duration = lcVar.c1.animate().alpha(0.0f).setDuration(180L);
        hs hsVar = hs.g;
        duration.setInterpolator(hsVar).start();
        if (lcVar.g0 != 2) {
            lcVar.Y0.clearAnimation();
            lcVar.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(hsVar).start();
        }
        U0(q(), false);
    }

    public final void U0(boolean z10, boolean z11) {
        lc lcVar = this.A2;
        if (!z10) {
            lcVar.p1.a(false, z11);
            lcVar.p1.clearAnimation();
            lcVar.p1.animate().alpha(0.0f).withEndAction(new androidx.fragment.app.a0(this, 25)).setDuration(180L).setInterpolator(hs.g).setStartDelay(z11 ? 500L : 0L).start();
        } else {
            lcVar.p1.setVisibility(0);
            lcVar.p1.setAlpha(0.0f);
            lcVar.p1.clearAnimation();
            lcVar.p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(hs.g).start();
        }
    }

    @Override // qg.h
    public final void h(boolean z10) {
        lc lcVar = this.A2;
        lcVar.o1.b(lcVar.c1.getText());
        lcVar.o1.a(false, z10 && this.z2, null);
    }

    @Override // qg.h
    public final void i(boolean z10) {
        qg.j jVar;
        if (!q()) {
            z10 = false;
        }
        lc lcVar = this.A2;
        lcVar.c1.clearAnimation();
        ViewPropertyAnimator duration = lcVar.c1.animate().alpha(lcVar.g0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        hs hsVar = hs.g;
        duration.setInterpolator(hsVar).start();
        lcVar.Y0.clearAnimation();
        ViewPropertyAnimator animate = lcVar.Y0.animate();
        int i10 = lcVar.g0;
        animate.alpha((i10 == -1 || i10 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(hsVar).start();
        U0(false, z10);
        if (z10 && (jVar = this.J0) != null) {
            B0(jVar);
        }
        S0();
        this.l2 = true;
        this.z2 = false;
    }

    @Override // qg.h
    public final void k() {
        this.z2 = false;
        U0(q(), false);
        this.A2.o1.a(false, false, null);
    }

    @Override // qg.h
    public final void l() {
        this.z2 = true;
        this.A2.v1.N0(false);
        U0(false, false);
    }

    @Override // qg.h
    public final void n(boolean z10) {
        this.A2.p1.a(z10, false);
    }

    @Override // ci.q6
    public final void q0() {
        lc lcVar = this.A2;
        lcVar.c1.f.d();
        lcVar.k0(0, false, true);
        qg.j jVar = this.J0;
        if (!(jVar instanceof qg.w2) || this.K0) {
            return;
        }
        qg.w2 w2Var = (qg.w2) jVar;
        this.K0 = true;
        w2Var.q();
        View focusedView = w2Var.getFocusedView();
        focusedView.requestFocus();
        AndroidUtilities.showKeyboard(focusedView);
    }

    @Override // qg.h
    public final void w() {
        this.A2.v1.N0(false);
    }

    @Override // ci.q6
    public final void y0(boolean z10) {
        lc lcVar = this.A2;
        zb zbVar = lcVar.X0;
        if (zbVar != null) {
            zbVar.x(6, z10);
            r6 r6Var = lcVar.j1;
            if (r6Var != null) {
                ((hh0) r6Var.c).a(lcVar.X0.k(), true);
            }
        }
        bc bcVar = lcVar.c1;
        if (bcVar != null) {
            bcVar.e0 = z10;
            bcVar.L.b(z10);
        }
    }
}
