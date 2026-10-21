package di;

import android.graphics.RectF;
import android.view.WindowManager;
import ei.a8;
import ei.hb;
import ei.t9;
import ei.ub;
import ei.vb;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class c implements ri {
    public final /* synthetic */ ti a;
    public final /* synthetic */ String b;
    public final /* synthetic */ v c;

    public c(v vVar, ti tiVar, String str) {
        this.c = vVar;
        this.a = tiVar;
        this.b = str;
    }

    @Override // org.telegram.ui.Components.ri
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ub ubVar;
        v vVar = this.c;
        long j12 = vVar.d;
        ti tiVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.j0;
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
            a8 l4 = a8.l((MediaController.PhotoEntry) next);
            l4.J0 = j12;
            String str = this.b;
            l4.K0 = str;
            l4.A();
            vb D = vb.D(vVar.a.getParentActivity(), vVar.b);
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
                    if (windowManager != null && (ubVar = D.n) != null && ubVar.getParent() == null) {
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
                    hb hbVar = D.h0;
                    int i14 = D.J;
                    hbVar.setBackgroundColor((i14 == 1 || i14 == 0) ? 0 : -14737633);
                    D.r.setTranslationX(0.0f);
                    D.r.setTranslationY(0.0f);
                    D.r.b(0.0f);
                    D.r.setScaleX(1.0f);
                    D.r.setScaleY(1.0f);
                    D.K = 0.0f;
                    AndroidUtilities.lockOrientation(D.b, 1);
                    a8 a8Var = D.K1;
                    if (a8Var != null) {
                        D.c1.setText(a8Var.C0);
                    }
                    D.J(1, false);
                    D.k0(-1, false, false);
                    D.b1.b(false, false);
                    D.b1.b(true, true);
                    D.f(1.0f, true, new t9(D, 6));
                    D.d();
                }
            }
            AndroidUtilities.runOnUIThread(new com.google.firebase.messaging.s(tiVar, 2), 400L);
        }
    }

    @Override // org.telegram.ui.Components.ri
    public final boolean p0() {
        return true;
    }

    @Override // org.telegram.ui.Components.ri
    public final void u(gh ghVar) {
        ghVar.run();
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void E() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void O(Object obj) {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void X(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
