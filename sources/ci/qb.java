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
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class qb extends r6 {
    public final /* synthetic */ oc A2;
    public boolean z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(oc ocVar, Context context, boolean z10, File file, boolean z11, boolean z12, nc ncVar, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, o8 o8Var, int i12, int i13, MediaController.CropState cropState, org.telegram.ui.Components.ha haVar, ai.d dVar, c7 c7Var, cc ccVar) {
        super(context, z10, file, z11, z12, ncVar, activity, i10, bitmap, bitmap2, i11, arrayList, o8Var, i12, i13, cropState, haVar, dVar, c7Var, ccVar);
        this.A2 = ocVar;
    }

    @Override // qg.h
    public final void A(boolean z10) {
        oc ocVar = this.A2;
        ocVar.o1.a(true, z10, ocVar.i0);
    }

    @Override // qg.h
    public final void B() {
        oc ocVar = this.A2;
        ocVar.v1.O0(false);
        ocVar.c1.clearAnimation();
        ViewPropertyAnimator duration = ocVar.c1.animate().alpha(0.0f).setDuration(180L);
        qr qrVar = qr.g;
        duration.setInterpolator(qrVar).start();
        if (ocVar.g0 != 2) {
            ocVar.Y0.clearAnimation();
            ocVar.Y0.animate().alpha(0.0f).setDuration(180L).setInterpolator(qrVar).start();
        }
        V0(q(), false);
    }

    public final void V0(boolean z10, boolean z11) {
        oc ocVar = this.A2;
        if (!z10) {
            ocVar.p1.a(false, z11);
            ocVar.p1.clearAnimation();
            ocVar.p1.animate().alpha(0.0f).withEndAction(new androidx.fragment.app.a0(this, 25)).setDuration(180L).setInterpolator(qr.g).setStartDelay(z11 ? 500L : 0L).start();
        } else {
            ocVar.p1.setVisibility(0);
            ocVar.p1.setAlpha(0.0f);
            ocVar.p1.clearAnimation();
            ocVar.p1.animate().alpha(1.0f).setDuration(180L).setInterpolator(qr.g).start();
        }
    }

    @Override // ci.r6
    public final boolean f0(ai.n8 n8Var) {
        oc ocVar = this.A2;
        Activity activity = ocVar.b;
        if (activity == null) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
            ocVar.y2 = n8Var;
            return false;
        }
        if (i10 < 23 || activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
        ocVar.y2 = n8Var;
        return false;
    }

    @Override // qg.h
    public final void h(boolean z10) {
        oc ocVar = this.A2;
        ocVar.o1.b(ocVar.c1.getText());
        ocVar.o1.a(false, z10 && this.z2, null);
    }

    @Override // qg.h
    public final void i(boolean z10) {
        qg.j jVar;
        if (!q()) {
            z10 = false;
        }
        oc ocVar = this.A2;
        ocVar.c1.clearAnimation();
        ViewPropertyAnimator duration = ocVar.c1.animate().alpha(ocVar.g0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        qr qrVar = qr.g;
        duration.setInterpolator(qrVar).start();
        ocVar.Y0.clearAnimation();
        ViewPropertyAnimator animate = ocVar.Y0.animate();
        int i10 = ocVar.g0;
        animate.alpha((i10 == -1 || i10 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(qrVar).start();
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

    @Override // ci.r6
    public final void r0() {
        oc ocVar = this.A2;
        ocVar.c1.f.d();
        ocVar.l0(0, false, true);
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

    @Override // ci.r6
    public final void z0(boolean z10) {
        oc ocVar = this.A2;
        cc ccVar = ocVar.X0;
        if (ccVar != null) {
            ccVar.x(6, z10);
            s6 s6Var = ocVar.j1;
            if (s6Var != null) {
                ((fg0) s6Var.c).a(ocVar.X0.k(), true);
            }
        }
        ec ecVar = ocVar.c1;
        if (ecVar != null) {
            ecVar.e0 = z10;
            ecVar.L.b(z10);
        }
    }
}
