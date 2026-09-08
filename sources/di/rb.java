package di;

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
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class rb extends q6 {
    public final /* synthetic */ pc A2;
    public boolean z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(pc pcVar, Context context, boolean z10, File file, boolean z11, boolean z12, oc ocVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, o8 o8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ja jaVar, bi.b bVar, c7 c7Var, dc dcVar) {
        super(context, z10, file, z11, z12, ocVar, activity, i10, bitmap, bitmap2, i11, arrayList, o8Var, i12, i13, cropState, jaVar, bVar, c7Var, dcVar);
        this.A2 = pcVar;
    }

    @Override // rg.i
    public final void B(boolean z10) {
        pc pcVar = this.A2;
        pcVar.o1.a(true, z10, pcVar.i0);
    }

    @Override // rg.i
    public final void C() {
        pc pcVar = this.A2;
        pcVar.v1.O0(false);
        pcVar.c1.clearAnimation();
        ViewPropertyAnimator duration = pcVar.c1.animate().alpha(0.0f).setDuration(180L);
        pr prVar = pr.g;
        duration.setInterpolator(prVar).start();
        if (pcVar.g0 != 2) {
            pcVar.Y0.clearAnimation();
            pcVar.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(prVar).start();
        }
        V0(q(), false);
    }

    public final void V0(boolean z10, boolean z11) {
        pc pcVar = this.A2;
        if (!z10) {
            pcVar.p1.a(false, z11);
            pcVar.p1.clearAnimation();
            pcVar.p1.animate().alpha(0.0f).withEndAction(new nb(this, 1)).setDuration(180L).setInterpolator(pr.g).setStartDelay(z11 ? 500L : 0L).start();
        } else {
            pcVar.p1.setVisibility(0);
            pcVar.p1.setAlpha(0.0f);
            pcVar.p1.clearAnimation();
            pcVar.p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(pr.g).start();
        }
    }

    @Override // rg.i
    public final void f(boolean z10) {
        pc pcVar = this.A2;
        pcVar.o1.b(pcVar.c1.getText());
        pcVar.o1.a(false, z10 && this.z2, null);
    }

    @Override // di.q6
    public final boolean f0(ah.g gVar) {
        pc pcVar = this.A2;
        Activity activity = pcVar.b;
        if (activity == null) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
            pcVar.y2 = gVar;
            return false;
        }
        if (i10 < 23 || activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
        pcVar.y2 = gVar;
        return false;
    }

    @Override // rg.i
    public final void g(boolean z10) {
        rg.k kVar;
        if (!q()) {
            z10 = false;
        }
        pc pcVar = this.A2;
        pcVar.c1.clearAnimation();
        ViewPropertyAnimator duration = pcVar.c1.animate().alpha(pcVar.g0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        pr prVar = pr.g;
        duration.setInterpolator(prVar).start();
        pcVar.Y0.clearAnimation();
        ViewPropertyAnimator animate = pcVar.Y0.animate();
        int i10 = pcVar.g0;
        animate.alpha((i10 == -1 || i10 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(prVar).start();
        V0(false, z10);
        if (z10 && (kVar = this.J0) != null) {
            C0(kVar);
        }
        T0();
        this.l2 = true;
        this.z2 = false;
    }

    @Override // rg.i
    public final void j() {
        this.z2 = false;
        V0(q(), false);
        this.A2.o1.a(false, false, null);
    }

    @Override // rg.i
    public final void k() {
        this.z2 = true;
        this.A2.v1.O0(false);
        V0(false, false);
    }

    @Override // rg.i
    public final void m(boolean z10) {
        this.A2.p1.a(z10, false);
    }

    @Override // di.q6
    public final void r0() {
        pc pcVar = this.A2;
        pcVar.c1.f.d();
        pcVar.l0(0, false, true);
        rg.k kVar = this.J0;
        if (!(kVar instanceof rg.x2) || this.K0) {
            return;
        }
        rg.x2 x2Var = (rg.x2) kVar;
        this.K0 = true;
        x2Var.q();
        View focusedView = x2Var.getFocusedView();
        focusedView.requestFocus();
        AndroidUtilities.showKeyboard(focusedView);
    }

    @Override // rg.i
    public final void y() {
        this.A2.v1.O0(false);
    }

    @Override // di.q6
    public final void z0(boolean z10) {
        pc pcVar = this.A2;
        dc dcVar = pcVar.X0;
        if (dcVar != null) {
            dcVar.x(6, z10);
            r6 r6Var = pcVar.j1;
            if (r6Var != null) {
                ((fg0) r6Var.c).a(pcVar.X0.k(), true);
            }
        }
        fc fcVar = pcVar.c1;
        if (fcVar != null) {
            fcVar.e0 = z10;
            fcVar.L.b(z10);
        }
    }
}
