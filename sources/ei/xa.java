package ei;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class xa extends f6 {
    public final /* synthetic */ vb A2;
    public boolean z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(vb vbVar, Context context, boolean z10, File file, boolean z11, boolean z12, ub ubVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, a8 a8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ja jaVar, ci.b bVar, q6 q6Var, jb jbVar) {
        super(context, z10, file, z11, z12, ubVar, activity, i10, bitmap, bitmap2, i11, arrayList, a8Var, i12, i13, cropState, jaVar, bVar, q6Var, jbVar);
        this.A2 = vbVar;
    }

    @Override // rg.h
    public final void B(boolean z10) {
        vb vbVar = this.A2;
        vbVar.o1.a(true, z10, vbVar.i0);
    }

    @Override // rg.h
    public final void C() {
        vb vbVar = this.A2;
        vbVar.v1.N0(false);
        vbVar.c1.clearAnimation();
        ViewPropertyAnimator duration = vbVar.c1.animate().alpha(0.0f).setDuration(180L);
        bs bsVar = bs.g;
        duration.setInterpolator(bsVar).start();
        if (vbVar.g0 != 2) {
            vbVar.Y0.clearAnimation();
            vbVar.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(bsVar).start();
        }
        U0(q(), false);
    }

    public final void U0(boolean z10, boolean z11) {
        vb vbVar = this.A2;
        if (!z10) {
            vbVar.p1.a(false, z11);
            vbVar.p1.clearAnimation();
            vbVar.p1.animate().alpha(0.0f).withEndAction(new com.google.firebase.messaging.s(this, 25)).setDuration(180L).setInterpolator(bs.g).setStartDelay(z11 ? 500L : 0L).start();
        } else {
            vbVar.p1.setVisibility(0);
            vbVar.p1.setAlpha(0.0f);
            vbVar.p1.clearAnimation();
            vbVar.p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(bs.g).start();
        }
    }

    @Override // rg.h
    public final void f(boolean z10) {
        vb vbVar = this.A2;
        vbVar.o1.b(vbVar.c1.getText());
        vbVar.o1.a(false, z10 && this.z2, null);
    }

    @Override // rg.h
    public final void g(boolean z10) {
        rg.j jVar;
        if (!q()) {
            z10 = false;
        }
        vb vbVar = this.A2;
        vbVar.c1.clearAnimation();
        ViewPropertyAnimator duration = vbVar.c1.animate().alpha(vbVar.g0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        bs bsVar = bs.g;
        duration.setInterpolator(bsVar).start();
        vbVar.Y0.clearAnimation();
        ViewPropertyAnimator animate = vbVar.Y0.animate();
        int i10 = vbVar.g0;
        animate.alpha((i10 == -1 || i10 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(bsVar).start();
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

    @Override // ei.f6
    public final void q0() {
        vb vbVar = this.A2;
        vbVar.c1.f.d();
        vbVar.k0(0, false, true);
        rg.j jVar = this.J0;
        if (!(jVar instanceof rg.u2) || this.K0) {
            return;
        }
        rg.u2 u2Var = (rg.u2) jVar;
        this.K0 = true;
        u2Var.q();
        View focusedView = u2Var.getFocusedView();
        focusedView.requestFocus();
        AndroidUtilities.showKeyboard(focusedView);
    }

    @Override // rg.h
    public final void y() {
        this.A2.v1.N0(false);
    }

    @Override // ei.f6
    public final void y0(boolean z10) {
        vb vbVar = this.A2;
        jb jbVar = vbVar.X0;
        if (jbVar != null) {
            jbVar.x(6, z10);
            g6 g6Var = vbVar.j1;
            if (g6Var != null) {
                ((ah0) g6Var.c).a(vbVar.X0.k(), true);
            }
        }
        lb lbVar = vbVar.c1;
        if (lbVar != null) {
            lbVar.e0 = z10;
            lbVar.L.b(z10);
        }
    }
}
