package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qf0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class ya extends g6 {
    public boolean v2;
    public final /* synthetic */ wb w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(wb wbVar, Context context, boolean z10, File file, boolean z11, boolean z12, vb vbVar, Activity activity, int i9, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, a8 a8Var, int i11, int i12, MediaController.CropState cropState, org.telegram.ui.Components.ba baVar, ih.b bVar, q6 q6Var, kb kbVar) {
        super(context, z10, file, z11, z12, vbVar, activity, i9, bitmap, bitmap2, i10, arrayList, a8Var, i11, i12, cropState, baVar, bVar, q6Var, kbVar);
        this.w2 = wbVar;
    }

    @Override // yf.h
    public final void B(boolean z10) {
        wb wbVar = this.w2;
        wbVar.k1.a(true, z10, wbVar.e0);
    }

    @Override // yf.h
    public final void C() {
        wb wbVar = this.w2;
        wbVar.r1.O0(false);
        wbVar.Y0.clearAnimation();
        ViewPropertyAnimator duration = wbVar.Y0.animate().alpha(0.0f).setDuration(180L);
        gr grVar = gr.g;
        duration.setInterpolator(grVar).start();
        if (wbVar.c0 != 2) {
            wbVar.U0.clearAnimation();
            wbVar.U0.animate().alpha(0.0f).setDuration(180L).setInterpolator(grVar).start();
        }
        V0(r(), false);
    }

    public final void V0(boolean z10, boolean z11) {
        wb wbVar = this.w2;
        if (!z10) {
            wbVar.l1.a(false, z11);
            wbVar.l1.clearAnimation();
            wbVar.l1.animate().alpha(0.0f).withEndAction(new f1(this, 15)).setDuration(180L).setInterpolator(gr.g).setStartDelay(z11 ? 500L : 0L).start();
        } else {
            wbVar.l1.setVisibility(0);
            wbVar.l1.setAlpha(0.0f);
            wbVar.l1.clearAnimation();
            wbVar.l1.animate().alpha(1.0f).setDuration(180L).setInterpolator(gr.g).start();
        }
    }

    @Override // kh.g6
    public final boolean f0(bg.c2 c2Var) {
        wb wbVar = this.w2;
        Activity activity = wbVar.b;
        if (activity == null) {
            return true;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
            wbVar.u2 = c2Var;
            return false;
        }
        if (i9 < 23 || activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
        wbVar.u2 = c2Var;
        return false;
    }

    @Override // yf.h
    public final void g(boolean z10) {
        wb wbVar = this.w2;
        wbVar.k1.b(wbVar.Y0.getText());
        wbVar.k1.a(false, z10 && this.v2, null);
    }

    @Override // yf.h
    public final void h(boolean z10) {
        yf.j jVar;
        if (!r()) {
            z10 = false;
        }
        wb wbVar = this.w2;
        wbVar.Y0.clearAnimation();
        ViewPropertyAnimator duration = wbVar.Y0.animate().alpha(wbVar.c0 == -1 ? 1.0f : 0.0f).setDuration(180L);
        gr grVar = gr.g;
        duration.setInterpolator(grVar).start();
        wbVar.U0.clearAnimation();
        ViewPropertyAnimator animate = wbVar.U0.animate();
        int i9 = wbVar.c0;
        animate.alpha((i9 == -1 || i9 == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(grVar).start();
        V0(false, z10);
        if (z10 && (jVar = this.F0) != null) {
            C0(jVar);
        }
        T0();
        this.h2 = true;
        this.v2 = false;
    }

    @Override // yf.h
    public final void j() {
        this.v2 = false;
        V0(r(), false);
        this.w2.k1.a(false, false, null);
    }

    @Override // yf.h
    public final void l() {
        this.v2 = true;
        this.w2.r1.O0(false);
        V0(false, false);
    }

    @Override // yf.h
    public final void o(boolean z10) {
        this.w2.l1.a(z10, false);
    }

    @Override // kh.g6
    public final void r0() {
        wb wbVar = this.w2;
        wbVar.Y0.f.d();
        wbVar.l0(0, false, true);
        yf.j jVar = this.F0;
        if (!(jVar instanceof yf.v2) || this.G0) {
            return;
        }
        yf.v2 v2Var = (yf.v2) jVar;
        this.G0 = true;
        v2Var.q();
        View focusedView = v2Var.getFocusedView();
        focusedView.requestFocus();
        AndroidUtilities.showKeyboard(focusedView);
    }

    @Override // yf.h
    public final void y() {
        this.w2.r1.O0(false);
    }

    @Override // kh.g6
    public final void z0(boolean z10) {
        wb wbVar = this.w2;
        kb kbVar = wbVar.T0;
        if (kbVar != null) {
            kbVar.x(6, z10);
            h6 h6Var = wbVar.f1;
            if (h6Var != null) {
                ((qf0) h6Var.c).a(wbVar.T0.k(), true);
            }
        }
        mb mbVar = wbVar.Y0;
        if (mbVar != null) {
            mbVar.a0 = z10;
            mbVar.H.b(z10);
        }
    }
}
