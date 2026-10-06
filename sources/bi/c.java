package bi;

import android.graphics.RectF;
import android.view.WindowManager;
import androidx.fragment.app.a0;
import ci.ga;
import ci.jc;
import ci.k8;
import ci.kc;
import ci.wb;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xi;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class c implements vi {
    public final /* synthetic */ xi a;
    public final /* synthetic */ String b;
    public final /* synthetic */ z c;

    public c(z zVar, xi xiVar, String str) {
        this.c = zVar;
        this.a = xiVar;
        this.b = str;
    }

    @Override // org.telegram.ui.Components.vi
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        jc jcVar;
        z zVar = this.c;
        long j11 = zVar.d;
        xi xiVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xiVar.j0;
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
            l4.J0 = j11;
            String str = this.b;
            l4.K0 = str;
            l4.A();
            kc E = kc.E(zVar.a.getParentActivity(), zVar.b);
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
                    if (windowManager != null && (jcVar = E.n) != null && jcVar.getParent() == null) {
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
                    wb wbVar = E.h0;
                    int i14 = E.J;
                    wbVar.setBackgroundColor((i14 == 1 || i14 == 0) ? 0 : -14737633);
                    E.r.setTranslationX(0.0f);
                    E.r.setTranslationY(0.0f);
                    E.r.b(0.0f);
                    E.r.setScaleX(1.0f);
                    E.r.setScaleY(1.0f);
                    E.K = 0.0f;
                    AndroidUtilities.lockOrientation(E.b, 1);
                    k8 k8Var = E.K1;
                    if (k8Var != null) {
                        E.c1.setText(k8Var.C0);
                    }
                    E.K(1, false);
                    E.l0(-1, false, false);
                    E.b1.b(false, false);
                    E.b1.b(true, true);
                    E.g(1.0f, true, new ga(E, 6));
                    E.e();
                }
            }
            AndroidUtilities.runOnUIThread(new a0(xiVar, 2), 400L);
        }
    }

    @Override // org.telegram.ui.Components.vi
    public final boolean S1() {
        return true;
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // org.telegram.ui.Components.vi
    public final void x0(ih ihVar) {
        ihVar.run();
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
