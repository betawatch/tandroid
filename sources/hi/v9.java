package hi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.we;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.ue0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class v9 extends l5 {
    public boolean j2;
    public final /* synthetic */ ta k2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(ta taVar, Context context, boolean z10, File file, boolean z11, boolean z12, sa saVar, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, d7 d7Var, int i11, int i12, we weVar, org.telegram.ui.Components.ca caVar, fi.b bVar, v5 v5Var, ha haVar) {
        super(context, z10, file, z11, z12, saVar, activity, i7, bitmap, bitmap2, i10, arrayList, d7Var, i11, i12, weVar, caVar, bVar, v5Var, haVar);
        this.k2 = taVar;
    }

    @Override // tg.h
    public final void B(boolean z10) {
        ta taVar = this.k2;
        taVar.p1.a(true, z10, taVar.j0);
    }

    @Override // tg.h
    public final void C() {
        ta taVar = this.k2;
        taVar.w1.L0(false);
        taVar.d1.clearAnimation();
        ViewPropertyAnimator duration = taVar.d1.animate().alpha(0.0f).setDuration(180L);
        lr lrVar = lr.g;
        duration.setInterpolator(lrVar).start();
        if (taVar.h0 != 2) {
            taVar.Z0.clearAnimation();
            taVar.Z0.animate().alpha(0.0f).setDuration(180L).setInterpolator(lrVar).start();
        }
        S0(p(), false);
    }

    public final void S0(boolean z10, boolean z11) {
        ta taVar = this.k2;
        if (!z10) {
            taVar.q1.a(false, z11);
            taVar.q1.clearAnimation();
            taVar.q1.animate().alpha(0.0f).withEndAction(new k(this, 19)).setDuration(180L).setInterpolator(lr.g).setStartDelay(z11 ? 500L : 0L).start();
        } else {
            taVar.q1.setVisibility(0);
            taVar.q1.setAlpha(0.0f);
            taVar.q1.clearAnimation();
            taVar.q1.animate().alpha(1.0f).setDuration(180L).setInterpolator(lr.g).start();
        }
    }

    @Override // tg.h
    public final void d(boolean z10) {
        ta taVar = this.k2;
        taVar.p1.b(taVar.d1.getText());
        taVar.p1.a(false, z10 && this.j2, null);
    }

    @Override // tg.h
    public final void e(boolean z10) {
        tg.j jVar;
        if (!p()) {
            z10 = false;
        }
        ta taVar = this.k2;
        taVar.d1.clearAnimation();
        ViewPropertyAnimator duration = taVar.d1.animate().alpha(taVar.h0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        lr lrVar = lr.g;
        duration.setInterpolator(lrVar).start();
        taVar.Z0.clearAnimation();
        ViewPropertyAnimator animate = taVar.Z0.animate();
        int i7 = taVar.h0;
        animate.alpha((i7 == -1 || i7 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(lrVar).start();
        S0(false, z10);
        if (z10 && (jVar = this.t0) != null) {
            z0(jVar);
        }
        Q0();
        this.V1 = true;
        this.j2 = false;
    }

    @Override // tg.h
    public final void g() {
        this.j2 = false;
        S0(p(), false);
        this.k2.p1.a(false, false, null);
    }

    @Override // tg.h
    public final void h() {
        this.j2 = true;
        this.k2.w1.L0(false);
        S0(false, false);
    }

    @Override // tg.h
    public final void j(boolean z10) {
        this.k2.q1.a(z10, false);
    }

    @Override // hi.l5
    public final void o0() {
        ta taVar = this.k2;
        taVar.d1.f.d();
        taVar.k0(0, false, true);
        tg.j jVar = this.t0;
        if (!(jVar instanceof tg.m2) || this.u0) {
            return;
        }
        tg.m2 m2Var = (tg.m2) jVar;
        this.u0 = true;
        m2Var.q();
        View focusedView = m2Var.getFocusedView();
        focusedView.requestFocus();
        org.telegram.messenger.g0.I3(focusedView);
    }

    @Override // hi.l5
    public final void w0(boolean z10) {
        ta taVar = this.k2;
        ha haVar = taVar.Y0;
        if (haVar != null) {
            haVar.x(6, z10);
            m5 m5Var = taVar.k1;
            if (m5Var != null) {
                ((ue0) m5Var.c).a(taVar.Y0.k(), true);
            }
        }
        ja jaVar = taVar.d1;
        if (jaVar != null) {
            jaVar.e0 = z10;
            jaVar.M.b(z10);
        }
    }

    @Override // tg.h
    public final void y() {
        this.k2.w1.L0(false);
    }
}
