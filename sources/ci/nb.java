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
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class nb extends q6 {
    public final /* synthetic */ lc A2;
    public boolean z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(lc lcVar, Context context, boolean z10, File file, boolean z11, boolean z12, kc kcVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, l8 l8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ja jaVar, ai.d dVar, a7 a7Var, zb zbVar) {
        super(context, z10, file, z11, z12, kcVar, activity, i10, bitmap, bitmap2, i11, arrayList, l8Var, i12, i13, cropState, jaVar, dVar, a7Var, zbVar);
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
        lcVar.v1.O0(false);
        lcVar.c1.clearAnimation();
        ViewPropertyAnimator duration = lcVar.c1.animate().alpha(0.0f).setDuration(180L);
        rr rrVar = rr.g;
        duration.setInterpolator(rrVar).start();
        if (lcVar.g0 != 2) {
            lcVar.Y0.clearAnimation();
            lcVar.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(rrVar).start();
        }
        V0(q(), false);
    }

    public final void V0(boolean z10, boolean z11) {
        lc lcVar = this.A2;
        if (!z10) {
            lcVar.p1.a(false, z11);
            lcVar.p1.clearAnimation();
            lcVar.p1.animate().alpha(0.0f).withEndAction(new androidx.fragment.app.a0(this, 25)).setDuration(180L).setInterpolator(rr.g).setStartDelay(z11 ? 500L : 0L).start();
        } else {
            lcVar.p1.setVisibility(0);
            lcVar.p1.setAlpha(0.0f);
            lcVar.p1.clearAnimation();
            lcVar.p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(rr.g).start();
        }
    }

    @Override // ci.q6
    public final boolean f0(ai.o8 o8Var) {
        lc lcVar = this.A2;
        Activity activity = lcVar.b;
        if (activity == null) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
            lcVar.y2 = o8Var;
            return false;
        }
        if (i10 < 23 || activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
        lcVar.y2 = o8Var;
        return false;
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
        rr rrVar = rr.g;
        duration.setInterpolator(rrVar).start();
        lcVar.Y0.clearAnimation();
        ViewPropertyAnimator animate = lcVar.Y0.animate();
        int i10 = lcVar.g0;
        animate.alpha((i10 == -1 || i10 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(rrVar).start();
        V0(false, z10);
        if (z10 && (jVar = this.J0) != null) {
            C0(jVar);
        }
        T0();
        this.l2 = true;
        this.z2 = false;
    }

    @Override // qg.h
    public final void k() {
        this.z2 = false;
        V0(q(), false);
        this.A2.o1.a(false, false, null);
    }

    @Override // qg.h
    public final void l() {
        this.z2 = true;
        this.A2.v1.O0(false);
        V0(false, false);
    }

    @Override // qg.h
    public final void n(boolean z10) {
        this.A2.p1.a(z10, false);
    }

    @Override // ci.q6
    public final void r0() {
        lc lcVar = this.A2;
        lcVar.c1.f.d();
        lcVar.l0(0, false, true);
        qg.j jVar = this.J0;
        if (!(jVar instanceof qg.x2) || this.K0) {
            return;
        }
        qg.x2 x2Var = (qg.x2) jVar;
        this.K0 = true;
        x2Var.q();
        View focusedView = x2Var.getFocusedView();
        focusedView.requestFocus();
        AndroidUtilities.showKeyboard(focusedView);
    }

    @Override // qg.h
    public final void w() {
        this.A2.v1.O0(false);
    }

    @Override // ci.q6
    public final void z0(boolean z10) {
        lc lcVar = this.A2;
        zb zbVar = lcVar.X0;
        if (zbVar != null) {
            zbVar.x(6, z10);
            r6 r6Var = lcVar.j1;
            if (r6Var != null) {
                ((fg0) r6Var.c).a(lcVar.X0.k(), true);
            }
        }
        bc bcVar = lcVar.c1;
        if (bcVar != null) {
            bcVar.e0 = z10;
            bcVar.L.b(z10);
        }
    }
}
