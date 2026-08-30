package oh;

import android.graphics.RectF;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import nh.n5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.wg;
import ph.ca;
import ph.da;
import ph.h8;
import ph.p9;
import ph.u6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class c implements ji {
    public final /* synthetic */ li a;
    public final /* synthetic */ String b;
    public final /* synthetic */ v c;

    public c(v vVar, li liVar, String str) {
        this.c = vVar;
        this.a = liVar;
        this.b = str;
    }

    @Override // org.telegram.ui.Components.ji
    public final void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        ca caVar;
        v vVar = this.c;
        long j12 = vVar.d;
        li liVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.g0;
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
            u6 l10 = u6.l((MediaController.PhotoEntry) next);
            l10.J0 = j12;
            String str = this.b;
            l10.K0 = str;
            l10.A();
            da E = da.E(vVar.a.getParentActivity(), vVar.b);
            RectF rectF = E.E;
            WindowManager.LayoutParams layoutParams = E.h;
            int i13 = E.c;
            WindowManager windowManager = E.f;
            if (!E.d) {
                if (MessagesController.getInstance(i13).isFrozen()) {
                    org.telegram.ui.c.b(i13);
                } else {
                    E.s0 = j12;
                    E.t0 = str;
                    E.r0 = false;
                    E.e = false;
                    E.y2 = false;
                    if (windowManager != null && (caVar = E.n) != null && caVar.getParent() == null) {
                        AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.n, layoutParams);
                        windowManager.addView(E.n, layoutParams);
                        E.g0();
                    }
                    E.H1 = l10;
                    l10.J0 = j12;
                    l10.K0 = str;
                    E.L1 = l10.K ? 1 : 0;
                    E.p0.g = false;
                    E.G = 0;
                    rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                    E.D = AndroidUtilities.dp(8.0f);
                    E.r.c();
                    p9 p9Var = E.e0;
                    int i14 = E.G;
                    p9Var.setBackgroundColor((i14 == 1 || i14 == 0) ? 0 : -14737633);
                    E.r.setTranslationX(0.0f);
                    E.r.setTranslationY(0.0f);
                    E.r.b(0.0f);
                    E.r.setScaleX(1.0f);
                    E.r.setScaleY(1.0f);
                    E.H = 0.0f;
                    AndroidUtilities.lockOrientation(E.b, 1);
                    u6 u6Var = E.H1;
                    if (u6Var != null) {
                        E.Z0.setText(u6Var.C0);
                    }
                    E.K(1, false);
                    E.l0(-1, false, false);
                    E.Y0.b(false, false);
                    E.Y0.b(true, true);
                    E.g(1.0f, true, new h8(E, 6));
                    E.e();
                }
            }
            AndroidUtilities.runOnUIThread(new n5(liVar, 16), 400L);
        }
    }

    @Override // org.telegram.ui.Components.ji
    public final boolean V() {
        return true;
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ji
    public final void x(wg wgVar) {
        wgVar.run();
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void C() {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void D(Object obj) {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void G(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
