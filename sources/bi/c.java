package bi;

import android.graphics.RectF;
import android.view.WindowManager;
import androidx.fragment.app.a0;
import ci.ha;
import ci.kc;
import ci.l8;
import ci.lc;
import ci.xb;
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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class c implements wi {
    public final /* synthetic */ yi a;
    public final /* synthetic */ String b;
    public final /* synthetic */ z c;

    public c(z zVar, yi yiVar, String str) {
        this.c = zVar;
        this.a = yiVar;
        this.b = str;
    }

    @Override // org.telegram.ui.Components.wi
    public final void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        kc kcVar;
        z zVar = this.c;
        long j11 = zVar.d;
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
            l8 l4 = l8.l((MediaController.PhotoEntry) next);
            l4.J0 = j11;
            String str = this.b;
            l4.K0 = str;
            l4.A();
            lc D = lc.D(zVar.a.getParentActivity(), zVar.b);
            RectF rectF = D.H;
            WindowManager.LayoutParams layoutParams = D.h;
            int i13 = D.c;
            WindowManager windowManager = D.f;
            if (!D.d) {
                if (MessagesController.getInstance(i13).isFrozen()) {
                    org.telegram.ui.b.b(i13);
                } else {
                    D.v0 = j11;
                    D.w0 = str;
                    D.u0 = false;
                    D.e = false;
                    D.B2 = false;
                    if (windowManager != null && (kcVar = D.n) != null && kcVar.getParent() == null) {
                        AndroidUtilities.setPreferredMaxRefreshRate(windowManager, D.n, layoutParams);
                        windowManager.addView(D.n, layoutParams);
                        D.f0();
                    }
                    D.K1 = l4;
                    l4.J0 = j11;
                    l4.K0 = str;
                    D.O1 = l4.K ? 1 : 0;
                    D.s0.g = false;
                    D.J = 0;
                    rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                    D.G = AndroidUtilities.dp(8.0f);
                    D.r.c();
                    xb xbVar = D.h0;
                    int i14 = D.J;
                    xbVar.setBackgroundColor((i14 == 1 || i14 == 0) ? 0 : -14737633);
                    D.r.setTranslationX(0.0f);
                    D.r.setTranslationY(0.0f);
                    D.r.b(0.0f);
                    D.r.setScaleX(1.0f);
                    D.r.setScaleY(1.0f);
                    D.K = 0.0f;
                    AndroidUtilities.lockOrientation(D.b, 1);
                    l8 l8Var = D.K1;
                    if (l8Var != null) {
                        D.c1.setText(l8Var.C0);
                    }
                    D.J(1, false);
                    D.k0(-1, false, false);
                    D.b1.b(false, false);
                    D.b1.b(true, true);
                    D.f(1.0f, true, new ha(D, 6));
                    D.d();
                }
            }
            AndroidUtilities.runOnUIThread(new a0(yiVar, 2), 400L);
        }
    }

    @Override // org.telegram.ui.Components.wi
    public final boolean Y1() {
        return true;
    }

    @Override // org.telegram.ui.Components.wi
    public final void f0(jh jhVar) {
        jhVar.run();
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ boolean i0() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void a1(Object obj) {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void p1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void B0() {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void P0() {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
