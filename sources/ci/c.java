package ci;

import android.graphics.RectF;
import android.view.WindowManager;
import bi.la;
import di.ga;
import di.jc;
import di.k8;
import di.kc;
import di.wb;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class c implements ti {
    public final /* synthetic */ vi a;
    public final /* synthetic */ String b;
    public final /* synthetic */ y c;

    public c(y yVar, vi viVar, String str) {
        this.c = yVar;
        this.a = viVar;
        this.b = str;
    }

    @Override // org.telegram.ui.Components.ti
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        jc jcVar;
        y yVar = this.c;
        long j12 = yVar.d;
        vi viVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.j0;
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
            k8 l4 = k8.l((MediaController.PhotoEntry) next);
            l4.J0 = j12;
            String str = this.b;
            l4.K0 = str;
            l4.A();
            kc D = kc.D(yVar.a.getParentActivity(), yVar.b);
            RectF rectF = D.H;
            WindowManager.LayoutParams layoutParams = D.h;
            int i13 = D.c;
            WindowManager windowManager = D.f;
            if (!D.d) {
                if (MessagesController.getInstance(i13).isFrozen()) {
                    org.telegram.ui.b.b(i13);
                } else {
                    D.v0 = j12;
                    D.w0 = str;
                    D.u0 = false;
                    D.e = false;
                    D.B2 = false;
                    if (windowManager != null && (jcVar = D.n) != null && jcVar.getParent() == null) {
                        AndroidUtilities.setPreferredMaxRefreshRate(windowManager, D.n, layoutParams);
                        windowManager.addView(D.n, layoutParams);
                        D.f0();
                    }
                    D.K1 = l4;
                    l4.J0 = j12;
                    l4.K0 = str;
                    D.O1 = l4.K ? 1 : 0;
                    D.s0.g = false;
                    D.J = 0;
                    rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                    D.G = AndroidUtilities.dp(8.0f);
                    D.r.c();
                    wb wbVar = D.h0;
                    int i14 = D.J;
                    wbVar.setBackgroundColor((i14 == 1 || i14 == 0) ? 0 : -14737633);
                    D.r.setTranslationX(0.0f);
                    D.r.setTranslationY(0.0f);
                    D.r.b(0.0f);
                    D.r.setScaleX(1.0f);
                    D.r.setScaleY(1.0f);
                    D.K = 0.0f;
                    AndroidUtilities.lockOrientation(D.b, 1);
                    k8 k8Var = D.K1;
                    if (k8Var != null) {
                        D.c1.setText(k8Var.C0);
                    }
                    D.J(1, false);
                    D.k0(-1, false, false);
                    D.b1.b(false, false);
                    D.b1.b(true, true);
                    D.f(1.0f, true, new ga(D, 6));
                    D.d();
                }
            }
            AndroidUtilities.runOnUIThread(new la(viVar, 9), 400L);
        }
    }

    @Override // org.telegram.ui.Components.ti
    public final boolean r0() {
        return true;
    }

    @Override // org.telegram.ui.Components.ti
    public final void v(hh hhVar) {
        hhVar.run();
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void J(Object obj) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void U(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void F() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void z() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void s0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
