package fi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class x9 extends o5 {
    public boolean i2;
    public final /* synthetic */ va j2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(va vaVar, Context context, boolean z9, File file, boolean z10, boolean z11, ua uaVar, Activity activity, int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, e7 e7Var, int i11, int i12, ye yeVar, org.telegram.ui.Components.y9 y9Var, di.b bVar, x5 x5Var, ja jaVar) {
        super(context, z9, file, z10, z11, uaVar, activity, i7, bitmap, bitmap2, i10, arrayList, e7Var, i11, i12, yeVar, y9Var, bVar, x5Var, jaVar);
        this.j2 = vaVar;
    }

    @Override // tg.h
    public final void B(boolean z9) {
        va vaVar = this.j2;
        vaVar.o1.a(true, z9, vaVar.i0);
    }

    @Override // tg.h
    public final void C() {
        va vaVar = this.j2;
        vaVar.v1.L0(false);
        vaVar.c1.clearAnimation();
        ViewPropertyAnimator duration = vaVar.c1.animate().alpha(0.0f).setDuration(180L);
        xq xqVar = xq.g;
        duration.setInterpolator(xqVar).start();
        if (vaVar.g0 != 2) {
            vaVar.Y0.clearAnimation();
            vaVar.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(xqVar).start();
        }
        S0(p(), false);
    }

    public final void S0(boolean z9, boolean z10) {
        va vaVar = this.j2;
        if (!z9) {
            vaVar.p1.a(false, z10);
            vaVar.p1.clearAnimation();
            vaVar.p1.animate().alpha(0.0f).withEndAction(new h9(this, 2)).setDuration(180L).setInterpolator(xq.g).setStartDelay(z10 ? 500L : 0L).start();
        } else {
            vaVar.p1.setVisibility(0);
            vaVar.p1.setAlpha(0.0f);
            vaVar.p1.clearAnimation();
            vaVar.p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(xq.g).start();
        }
    }

    @Override // tg.h
    public final void d(boolean z9) {
        va vaVar = this.j2;
        vaVar.o1.b(vaVar.c1.getText());
        vaVar.o1.a(false, z9 && this.i2, null);
    }

    @Override // tg.h
    public final void e(boolean z9) {
        tg.j jVar;
        if (!p()) {
            z9 = false;
        }
        va vaVar = this.j2;
        vaVar.c1.clearAnimation();
        ViewPropertyAnimator duration = vaVar.c1.animate().alpha(vaVar.g0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        xq xqVar = xq.g;
        duration.setInterpolator(xqVar).start();
        vaVar.Y0.clearAnimation();
        ViewPropertyAnimator animate = vaVar.Y0.animate();
        int i7 = vaVar.g0;
        animate.alpha((i7 == -1 || i7 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(xqVar).start();
        S0(false, z9);
        if (z9 && (jVar = this.s0) != null) {
            z0(jVar);
        }
        Q0();
        this.U1 = true;
        this.i2 = false;
    }

    @Override // tg.h
    public final void g() {
        this.i2 = false;
        S0(p(), false);
        this.j2.o1.a(false, false, null);
    }

    @Override // tg.h
    public final void h() {
        this.i2 = true;
        this.j2.v1.L0(false);
        S0(false, false);
    }

    @Override // tg.h
    public final void j(boolean z9) {
        this.j2.p1.a(z9, false);
    }

    @Override // fi.o5
    public final void o0() {
        va vaVar = this.j2;
        vaVar.c1.f.d();
        vaVar.k0(0, false, true);
        tg.j jVar = this.s0;
        if (!(jVar instanceof tg.k2) || this.t0) {
            return;
        }
        tg.k2 k2Var = (tg.k2) jVar;
        this.t0 = true;
        k2Var.q();
        View focusedView = k2Var.getFocusedView();
        focusedView.requestFocus();
        org.telegram.messenger.g0.K3(focusedView);
    }

    @Override // fi.o5
    public final void w0(boolean z9) {
        va vaVar = this.j2;
        ja jaVar = vaVar.X0;
        if (jaVar != null) {
            jaVar.x(6, z9);
            p5 p5Var = vaVar.j1;
            if (p5Var != null) {
                ((he0) p5Var.c).a(vaVar.X0.k(), true);
            }
        }
        la laVar = vaVar.c1;
        if (laVar != null) {
            laVar.d0 = z9;
            laVar.L.b(z9);
        }
    }

    @Override // tg.h
    public final void y() {
        this.j2.v1.L0(false);
    }
}
