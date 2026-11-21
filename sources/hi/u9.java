package hi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.we;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.we0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class u9 extends k5 {
    public boolean j2;
    public final /* synthetic */ sa k2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(sa saVar, Context context, boolean z10, File file, boolean z11, boolean z12, ra raVar, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, c7 c7Var, int i11, int i12, we weVar, org.telegram.ui.Components.ca caVar, fi.b bVar, u5 u5Var, ga gaVar) {
        super(context, z10, file, z11, z12, raVar, activity, i7, bitmap, bitmap2, i10, arrayList, c7Var, i11, i12, weVar, caVar, bVar, u5Var, gaVar);
        this.k2 = saVar;
    }

    @Override // tg.h
    public final void B(boolean z10) {
        sa saVar = this.k2;
        saVar.p1.a(true, z10, saVar.j0);
    }

    @Override // tg.h
    public final void C() {
        sa saVar = this.k2;
        saVar.w1.L0(false);
        saVar.d1.clearAnimation();
        ViewPropertyAnimator duration = saVar.d1.animate().alpha(0.0f).setDuration(180L);
        nr nrVar = nr.g;
        duration.setInterpolator(nrVar).start();
        if (saVar.h0 != 2) {
            saVar.Z0.clearAnimation();
            saVar.Z0.animate().alpha(0.0f).setDuration(180L).setInterpolator(nrVar).start();
        }
        S0(p(), false);
    }

    public final void S0(boolean z10, boolean z11) {
        sa saVar = this.k2;
        if (!z10) {
            saVar.q1.a(false, z11);
            saVar.q1.clearAnimation();
            saVar.q1.animate().alpha(0.0f).withEndAction(new l(this, 19)).setDuration(180L).setInterpolator(nr.g).setStartDelay(z11 ? 500L : 0L).start();
        } else {
            saVar.q1.setVisibility(0);
            saVar.q1.setAlpha(0.0f);
            saVar.q1.clearAnimation();
            saVar.q1.animate().alpha(1.0f).setDuration(180L).setInterpolator(nr.g).start();
        }
    }

    @Override // tg.h
    public final void d(boolean z10) {
        sa saVar = this.k2;
        saVar.p1.b(saVar.d1.getText());
        saVar.p1.a(false, z10 && this.j2, null);
    }

    @Override // tg.h
    public final void e(boolean z10) {
        tg.j jVar;
        if (!p()) {
            z10 = false;
        }
        sa saVar = this.k2;
        saVar.d1.clearAnimation();
        ViewPropertyAnimator duration = saVar.d1.animate().alpha(saVar.h0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        nr nrVar = nr.g;
        duration.setInterpolator(nrVar).start();
        saVar.Z0.clearAnimation();
        ViewPropertyAnimator animate = saVar.Z0.animate();
        int i7 = saVar.h0;
        animate.alpha((i7 == -1 || i7 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(nrVar).start();
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

    @Override // hi.k5
    public final void o0() {
        sa saVar = this.k2;
        saVar.d1.f.d();
        saVar.k0(0, false, true);
        tg.j jVar = this.t0;
        if (!(jVar instanceof tg.n2) || this.u0) {
            return;
        }
        tg.n2 n2Var = (tg.n2) jVar;
        this.u0 = true;
        n2Var.q();
        View focusedView = n2Var.getFocusedView();
        focusedView.requestFocus();
        org.telegram.messenger.g0.I3(focusedView);
    }

    @Override // hi.k5
    public final void w0(boolean z10) {
        sa saVar = this.k2;
        ga gaVar = saVar.Y0;
        if (gaVar != null) {
            gaVar.x(6, z10);
            l5 l5Var = saVar.k1;
            if (l5Var != null) {
                ((we0) l5Var.c).a(saVar.Y0.k(), true);
            }
        }
        ia iaVar = saVar.d1;
        if (iaVar != null) {
            iaVar.e0 = z10;
            iaVar.M.b(z10);
        }
    }

    @Override // tg.h
    public final void y() {
        this.k2.w1.L0(false);
    }
}
