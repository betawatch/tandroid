package hi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.we;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ve0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class pa extends v5 {
    public boolean n2;
    public final /* synthetic */ nb o2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(nb nbVar, Context context, boolean z10, File file, boolean z11, boolean z12, mb mbVar, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, x7 x7Var, int i11, int i12, we weVar, org.telegram.ui.Components.ba baVar, fi.b bVar, e6 e6Var, bb bbVar) {
        super(context, z10, file, z11, z12, mbVar, activity, i7, bitmap, bitmap2, i10, arrayList, x7Var, i11, i12, weVar, baVar, bVar, e6Var, bbVar);
        this.o2 = nbVar;
    }

    @Override // tg.l
    public final void B(boolean z10) {
        nb nbVar = this.o2;
        nbVar.p1.a(true, z10, nbVar.j0);
    }

    @Override // tg.l
    public final void C() {
        nb nbVar = this.o2;
        nbVar.w1.O0(false);
        nbVar.d1.clearAnimation();
        ViewPropertyAnimator duration = nbVar.d1.animate().alpha(0.0f).setDuration(180L);
        kr krVar = kr.g;
        duration.setInterpolator(krVar).start();
        if (nbVar.h0 != 2) {
            nbVar.Z0.clearAnimation();
            nbVar.Z0.animate().alpha(0.0f).setDuration(180L).setInterpolator(krVar).start();
        }
        V0(p(), false);
    }

    public final void V0(boolean z10, boolean z11) {
        nb nbVar = this.o2;
        if (!z10) {
            nbVar.q1.a(false, z11);
            nbVar.q1.clearAnimation();
            nbVar.q1.animate().alpha(0.0f).withEndAction(new m4(this, 1)).setDuration(180L).setInterpolator(kr.g).setStartDelay(z11 ? 500L : 0L).start();
        } else {
            nbVar.q1.setVisibility(0);
            nbVar.q1.setAlpha(0.0f);
            nbVar.q1.clearAnimation();
            nbVar.q1.animate().alpha(1.0f).setDuration(180L).setInterpolator(kr.g).start();
        }
    }

    @Override // tg.l
    public final void d(boolean z10) {
        nb nbVar = this.o2;
        nbVar.p1.b(nbVar.d1.getText());
        nbVar.p1.a(false, z10 && this.n2, null);
    }

    @Override // tg.l
    public final void e(boolean z10) {
        tg.n nVar;
        if (!p()) {
            z10 = false;
        }
        nb nbVar = this.o2;
        nbVar.d1.clearAnimation();
        ViewPropertyAnimator duration = nbVar.d1.animate().alpha(nbVar.h0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        kr krVar = kr.g;
        duration.setInterpolator(krVar).start();
        nbVar.Z0.clearAnimation();
        ViewPropertyAnimator animate = nbVar.Z0.animate();
        int i7 = nbVar.h0;
        animate.alpha((i7 == -1 || i7 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(krVar).start();
        V0(false, z10);
        if (z10 && (nVar = this.t0) != null) {
            B0(nVar);
        }
        T0();
        this.Z1 = true;
        this.n2 = false;
    }

    @Override // tg.l
    public final void g() {
        this.n2 = false;
        V0(p(), false);
        this.o2.p1.a(false, false, null);
    }

    @Override // tg.l
    public final void h() {
        this.n2 = true;
        this.o2.w1.O0(false);
        V0(false, false);
    }

    @Override // tg.l
    public final void j(boolean z10) {
        this.o2.q1.a(z10, false);
    }

    @Override // hi.v5
    public final void q0() {
        nb nbVar = this.o2;
        nbVar.d1.f.d();
        nbVar.k0(0, false, true);
        tg.n nVar = this.t0;
        if (!(nVar instanceof tg.q2) || this.u0) {
            return;
        }
        tg.q2 q2Var = (tg.q2) nVar;
        if (q2Var instanceof tg.d) {
            tg.d dVar = (tg.d) q2Var;
            dVar.z();
            if (dVar.E0 == null) {
                return;
            }
        }
        this.u0 = true;
        q2Var.q();
        View focusedView = q2Var.getFocusedView();
        focusedView.requestFocus();
        org.telegram.messenger.g0.I3(focusedView);
    }

    @Override // tg.l
    public final void y() {
        this.o2.w1.O0(false);
    }

    @Override // hi.v5
    public final void y0(boolean z10) {
        nb nbVar = this.o2;
        bb bbVar = nbVar.Y0;
        if (bbVar != null) {
            bbVar.x(6, z10);
            w5 w5Var = nbVar.k1;
            if (w5Var != null) {
                ((ve0) w5Var.c).a(nbVar.Y0.k(), true);
            }
        }
        db dbVar = nbVar.d1;
        if (dbVar != null) {
            dbVar.e0 = z10;
            dbVar.M.b(z10);
        }
    }
}
