package ai;

import android.graphics.RectF;
import android.view.WindowManager;
import bi.be;
import bi.ce;
import bi.kd;
import bi.r9;
import bi.tb;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.yi;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class f implements wi {
    public final /* synthetic */ yi a;
    public final /* synthetic */ String b;
    public final /* synthetic */ g0 c;

    public f(g0 g0Var, yi yiVar, String str) {
        this.c = g0Var;
        this.a = yiVar;
        this.b = str;
    }

    @Override // org.telegram.ui.Components.wi
    public final void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        be beVar;
        g0 g0Var = this.c;
        long j11 = g0Var.d;
        yi yiVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.j0;
        if (chatAttachAlertPhotoLayout.getSelectedPhotos().isEmpty()) {
            return;
        }
        HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
        chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
        if (selectedPhotos.size() != 1) {
            return;
        }
        Object next = selectedPhotos.values().iterator().next();
        if (next instanceof MediaController.PhotoEntry) {
            r9 l4 = r9.l((MediaController.PhotoEntry) next);
            l4.J0 = j11;
            String str = this.b;
            l4.K0 = str;
            l4.A();
            ce E = ce.E(g0Var.a.getParentActivity(), g0Var.b);
            RectF rectF = E.H;
            WindowManager.LayoutParams layoutParams = E.h;
            int i13 = E.c;
            WindowManager windowManager = E.f;
            if (!E.d) {
                if (MessagesController.getInstance(i13).isFrozen()) {
                    org.telegram.ui.b.b(i13);
                } else {
                    E.v0 = j11;
                    E.w0 = str;
                    E.u0 = false;
                    E.e = false;
                    E.B2 = false;
                    if (windowManager != null && (beVar = E.n) != null && beVar.getParent() == null) {
                        AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.n, layoutParams);
                        windowManager.addView(E.n, layoutParams);
                        E.g0();
                    }
                    E.K1 = l4;
                    l4.J0 = j11;
                    l4.K0 = str;
                    E.O1 = l4.K ? 1 : 0;
                    E.s0.g = false;
                    E.J = 0;
                    rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                    E.G = AndroidUtilities.dp(8.0f);
                    E.r.c();
                    kd kdVar = E.h0;
                    int i14 = E.J;
                    kdVar.setBackgroundColor((i14 == 1 || i14 == 0) ? 0 : -14737633);
                    E.r.setTranslationX(0.0f);
                    E.r.setTranslationY(0.0f);
                    E.r.b(0.0f);
                    E.r.setScaleX(1.0f);
                    E.r.setScaleY(1.0f);
                    E.K = 0.0f;
                    AndroidUtilities.lockOrientation(E.b, 1);
                    r9 r9Var = E.K1;
                    if (r9Var != null) {
                        E.c1.setText(r9Var.C0);
                    }
                    E.K(1, false);
                    E.l0(-1, false, false);
                    E.b1.b(false, false);
                    E.b1.b(true, true);
                    E.g(1.0f, true, new tb(E, 6));
                    E.e();
                }
            }
            AndroidUtilities.runOnUIThread(new a3.d(yiVar, 2), 400L);
        }
    }

    @Override // org.telegram.ui.Components.wi
    public final boolean R1() {
        return true;
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public final void y0(jh jhVar) {
        jhVar.run();
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void i1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
