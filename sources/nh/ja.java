package nh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class ja extends t5 {
    public boolean v2;
    public final /* synthetic */ gb w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(gb gbVar, Context context, boolean z10, File file, boolean z11, boolean z12, fb fbVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, o7 o7Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ga gaVar, lh.b bVar, e6 e6Var, va vaVar) {
        super(context, z10, file, z11, z12, fbVar, activity, i10, bitmap, bitmap2, i11, arrayList, o7Var, i12, i13, cropState, gaVar, bVar, e6Var, vaVar);
        this.w2 = gbVar;
    }

    @Override // bg.i
    public final void B(boolean z10) {
        gb gbVar = this.w2;
        gbVar.k1.a(true, z10, gbVar.e0);
    }

    @Override // bg.i
    public final void C() {
        gb gbVar = this.w2;
        gbVar.r1.O0(false);
        gbVar.Y0.clearAnimation();
        ViewPropertyAnimator duration = gbVar.Y0.animate().alpha(0.0f).setDuration(180L);
        jr jrVar = jr.g;
        duration.setInterpolator(jrVar).start();
        if (gbVar.c0 != 2) {
            gbVar.U0.clearAnimation();
            gbVar.U0.animate().alpha(0.0f).setDuration(180L).setInterpolator(jrVar).start();
        }
        V0(p(), false);
    }

    public final void V0(boolean z10, boolean z11) {
        gb gbVar = this.w2;
        if (!z10) {
            gbVar.l1.a(false, z11);
            gbVar.l1.clearAnimation();
            gbVar.l1.animate().alpha(0.0f).withEndAction(new m6(this, 6)).setDuration(180L).setInterpolator(jr.g).setStartDelay(z11 ? 500L : 0L).start();
        } else {
            gbVar.l1.setVisibility(0);
            gbVar.l1.setAlpha(0.0f);
            gbVar.l1.clearAnimation();
            gbVar.l1.animate().alpha(1.0f).setDuration(180L).setInterpolator(jr.g).start();
        }
    }

    @Override // nh.t5
    public final boolean f0(bg.f fVar) {
        gb gbVar = this.w2;
        Activity activity = gbVar.b;
        if (activity == null) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
            gbVar.u2 = fVar;
            return false;
        }
        if (i10 < 23 || activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
        gbVar.u2 = fVar;
        return false;
    }

    @Override // bg.i
    public final void g(boolean z10) {
        gb gbVar = this.w2;
        gbVar.k1.b(gbVar.Y0.getText());
        gbVar.k1.a(false, z10 && this.v2, null);
    }

    @Override // bg.i
    public final void h(boolean z10) {
        bg.k kVar;
        if (!p()) {
            z10 = false;
        }
        gb gbVar = this.w2;
        gbVar.Y0.clearAnimation();
        ViewPropertyAnimator duration = gbVar.Y0.animate().alpha(gbVar.c0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        jr jrVar = jr.g;
        duration.setInterpolator(jrVar).start();
        gbVar.U0.clearAnimation();
        ViewPropertyAnimator animate = gbVar.U0.animate();
        int i10 = gbVar.c0;
        animate.alpha((i10 == -1 || i10 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(jrVar).start();
        V0(false, z10);
        if (z10 && (kVar = this.F0) != null) {
            C0(kVar);
        }
        T0();
        this.h2 = true;
        this.v2 = false;
    }

    @Override // bg.i
    public final void j() {
        this.v2 = false;
        V0(p(), false);
        this.w2.k1.a(false, false, null);
    }

    @Override // bg.i
    public final void k() {
        this.v2 = true;
        this.w2.r1.O0(false);
        V0(false, false);
    }

    @Override // bg.i
    public final void m(boolean z10) {
        this.w2.l1.a(z10, false);
    }

    @Override // nh.t5
    public final void r0() {
        gb gbVar = this.w2;
        gbVar.Y0.f.d();
        gbVar.l0(0, false, true);
        bg.k kVar = this.F0;
        if (!(kVar instanceof bg.f4) || this.G0) {
            return;
        }
        bg.f4 f4Var = (bg.f4) kVar;
        this.G0 = true;
        f4Var.q();
        View focusedView = f4Var.getFocusedView();
        focusedView.requestFocus();
        AndroidUtilities.showKeyboard(focusedView);
    }

    @Override // bg.i
    public final void x() {
        this.w2.r1.O0(false);
    }

    @Override // nh.t5
    public final void z0(boolean z10) {
        gb gbVar = this.w2;
        va vaVar = gbVar.T0;
        if (vaVar != null) {
            vaVar.x(6, z10);
            cg.i0 i0Var = gbVar.f1;
            if (i0Var != null) {
                ((cg0) i0Var.c).a(gbVar.T0.k(), true);
            }
        }
        wa waVar = gbVar.Y0;
        if (waVar != null) {
            waVar.a0 = z10;
            waVar.H.b(z10);
        }
    }
}
