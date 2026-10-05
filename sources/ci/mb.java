package ci;

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
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.tr;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class mb extends q6 {
    public final /* synthetic */ kc A2;
    public boolean z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(kc kcVar, Context context, boolean z10, File file, boolean z11, boolean z12, jc jcVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, k8 k8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ka kaVar, ai.d dVar, a7 a7Var, yb ybVar) {
        super(context, z10, file, z11, z12, jcVar, activity, i10, bitmap, bitmap2, i11, arrayList, k8Var, i12, i13, cropState, kaVar, dVar, a7Var, ybVar);
        this.A2 = kcVar;
    }

    @Override // qg.h
    public final void B(boolean z10) {
        kc kcVar = this.A2;
        kcVar.o1.a(true, z10, kcVar.i0);
    }

    @Override // qg.h
    public final void C() {
        kc kcVar = this.A2;
        kcVar.v1.O0(false);
        kcVar.c1.clearAnimation();
        ViewPropertyAnimator duration = kcVar.c1.animate().alpha(0.0f).setDuration(180L);
        tr trVar = tr.g;
        duration.setInterpolator(trVar).start();
        if (kcVar.g0 != 2) {
            kcVar.Y0.clearAnimation();
            kcVar.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(trVar).start();
        }
        V0(q(), false);
    }

    public final void V0(boolean z10, boolean z11) {
        kc kcVar = this.A2;
        if (!z10) {
            kcVar.p1.a(false, z11);
            kcVar.p1.clearAnimation();
            kcVar.p1.animate().alpha(0.0f).withEndAction(new androidx.fragment.app.a0(this, 25)).setDuration(180L).setInterpolator(tr.g).setStartDelay(z11 ? 500L : 0L).start();
        } else {
            kcVar.p1.setVisibility(0);
            kcVar.p1.setAlpha(0.0f);
            kcVar.p1.clearAnimation();
            kcVar.p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(tr.g).start();
        }
    }

    @Override // ci.q6
    public final boolean f0(ai.o8 o8Var) {
        kc kcVar = this.A2;
        Activity activity = kcVar.b;
        if (activity == null) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
            kcVar.y2 = o8Var;
            return false;
        }
        if (i10 < 23 || activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
        kcVar.y2 = o8Var;
        return false;
    }

    @Override // qg.h
    public final void g(boolean z10) {
        kc kcVar = this.A2;
        kcVar.o1.b(kcVar.c1.getText());
        kcVar.o1.a(false, z10 && this.z2, null);
    }

    @Override // qg.h
    public final void h(boolean z10) {
        qg.j jVar;
        if (!q()) {
            z10 = false;
        }
        kc kcVar = this.A2;
        kcVar.c1.clearAnimation();
        ViewPropertyAnimator duration = kcVar.c1.animate().alpha(kcVar.g0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        tr trVar = tr.g;
        duration.setInterpolator(trVar).start();
        kcVar.Y0.clearAnimation();
        ViewPropertyAnimator animate = kcVar.Y0.animate();
        int i10 = kcVar.g0;
        animate.alpha((i10 == -1 || i10 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(trVar).start();
        V0(false, z10);
        if (z10 && (jVar = this.J0) != null) {
            C0(jVar);
        }
        T0();
        this.l2 = true;
        this.z2 = false;
    }

    @Override // qg.h
    public final void i() {
        this.z2 = false;
        V0(q(), false);
        this.A2.o1.a(false, false, null);
    }

    @Override // qg.h
    public final void j() {
        this.z2 = true;
        this.A2.v1.O0(false);
        V0(false, false);
    }

    @Override // qg.h
    public final void l(boolean z10) {
        this.A2.p1.a(z10, false);
    }

    @Override // ci.q6
    public final void r0() {
        kc kcVar = this.A2;
        kcVar.c1.f.d();
        kcVar.l0(0, false, true);
        qg.j jVar = this.J0;
        if (!(jVar instanceof qg.v2) || this.K0) {
            return;
        }
        qg.v2 v2Var = (qg.v2) jVar;
        this.K0 = true;
        v2Var.q();
        View focusedView = v2Var.getFocusedView();
        focusedView.requestFocus();
        AndroidUtilities.showKeyboard(focusedView);
    }

    @Override // qg.h
    public final void x() {
        this.A2.v1.O0(false);
    }

    @Override // ci.q6
    public final void z0(boolean z10) {
        kc kcVar = this.A2;
        yb ybVar = kcVar.X0;
        if (ybVar != null) {
            ybVar.x(6, z10);
            r6 r6Var = kcVar.j1;
            if (r6Var != null) {
                ((sg0) r6Var.c).a(kcVar.X0.k(), true);
            }
        }
        ac acVar = kcVar.c1;
        if (acVar != null) {
            acVar.e0 = z10;
            acVar.L.b(z10);
        }
    }
}
