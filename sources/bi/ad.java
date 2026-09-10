package bi;

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
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class ad extends r7 {
    public final /* synthetic */ ce A2;
    public boolean z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(ce ceVar, Context context, boolean z10, File file, boolean z11, boolean z12, be beVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, r9 r9Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ia iaVar, zh.b bVar, d8 d8Var, nd ndVar) {
        super(context, z10, file, z11, z12, beVar, activity, i10, bitmap, bitmap2, i11, arrayList, r9Var, i12, i13, cropState, iaVar, bVar, d8Var, ndVar);
        this.A2 = ceVar;
    }

    @Override // pg.h
    public final void A() {
        ce ceVar = this.A2;
        ceVar.v1.O0(false);
        ceVar.c1.clearAnimation();
        ViewPropertyAnimator duration = ceVar.c1.animate().alpha(0.0f).setDuration(180L);
        wr wrVar = wr.g;
        duration.setInterpolator(wrVar).start();
        if (ceVar.g0 != 2) {
            ceVar.Y0.clearAnimation();
            ceVar.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(wrVar).start();
        }
        V0(p(), false);
    }

    public final void V0(boolean z10, boolean z11) {
        ce ceVar = this.A2;
        if (!z10) {
            ceVar.p1.a(false, z11);
            ceVar.p1.clearAnimation();
            ceVar.p1.animate().alpha(0.0f).withEndAction(new wc(this, 1)).setDuration(180L).setInterpolator(wr.g).setStartDelay(z11 ? 500L : 0L).start();
        } else {
            ceVar.p1.setVisibility(0);
            ceVar.p1.setAlpha(0.0f);
            ceVar.p1.clearAnimation();
            ceVar.p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(wr.g).start();
        }
    }

    @Override // pg.h
    public final void f(boolean z10) {
        ce ceVar = this.A2;
        ceVar.o1.b(ceVar.c1.getText());
        ceVar.o1.a(false, z10 && this.z2, null);
    }

    @Override // bi.r7
    public final boolean f0(s sVar) {
        ce ceVar = this.A2;
        Activity activity = ceVar.b;
        if (activity == null) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
            ceVar.y2 = sVar;
            return false;
        }
        if (i10 < 23 || activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
        ceVar.y2 = sVar;
        return false;
    }

    @Override // pg.h
    public final void g(boolean z10) {
        pg.j jVar;
        if (!p()) {
            z10 = false;
        }
        ce ceVar = this.A2;
        ceVar.c1.clearAnimation();
        ViewPropertyAnimator duration = ceVar.c1.animate().alpha(ceVar.g0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        wr wrVar = wr.g;
        duration.setInterpolator(wrVar).start();
        ceVar.Y0.clearAnimation();
        ViewPropertyAnimator animate = ceVar.Y0.animate();
        int i10 = ceVar.g0;
        animate.alpha((i10 == -1 || i10 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(wrVar).start();
        V0(false, z10);
        if (z10 && (jVar = this.J0) != null) {
            C0(jVar);
        }
        T0();
        this.l2 = true;
        this.z2 = false;
    }

    @Override // pg.h
    public final void i() {
        this.z2 = false;
        V0(p(), false);
        this.A2.o1.a(false, false, null);
    }

    @Override // pg.h
    public final void j() {
        this.z2 = true;
        this.A2.v1.O0(false);
        V0(false, false);
    }

    @Override // pg.h
    public final void m(boolean z10) {
        this.A2.p1.a(z10, false);
    }

    @Override // bi.r7
    public final void r0() {
        ce ceVar = this.A2;
        ceVar.c1.f.d();
        ceVar.l0(0, false, true);
        pg.j jVar = this.J0;
        if (!(jVar instanceof pg.v2) || this.K0) {
            return;
        }
        pg.v2 v2Var = (pg.v2) jVar;
        this.K0 = true;
        v2Var.q();
        View focusedView = v2Var.getFocusedView();
        focusedView.requestFocus();
        AndroidUtilities.showKeyboard(focusedView);
    }

    @Override // pg.h
    public final void v() {
        this.A2.v1.O0(false);
    }

    @Override // pg.h
    public final void y(boolean z10) {
        ce ceVar = this.A2;
        ceVar.o1.a(true, z10, ceVar.i0);
    }

    @Override // bi.r7
    public final void z0(boolean z10) {
        ce ceVar = this.A2;
        nd ndVar = ceVar.X0;
        if (ndVar != null) {
            ndVar.x(6, z10);
            s7 s7Var = ceVar.j1;
            if (s7Var != null) {
                ((pg0) s7Var.c).a(ceVar.X0.k(), true);
            }
        }
        qd qdVar = ceVar.c1;
        if (qdVar != null) {
            qdVar.e0 = z10;
            qdVar.L.b(z10);
        }
    }
}
