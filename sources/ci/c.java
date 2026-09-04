package ci;

import android.graphics.RectF;
import android.view.WindowManager;
import bi.oa;
import di.bc;
import di.ka;
import di.o8;
import di.oc;
import di.pc;
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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
    public final void B(hh hhVar) {
        hhVar.run();
    }

    @Override // org.telegram.ui.Components.ti
    public final boolean D0() {
        return true;
    }

    @Override // org.telegram.ui.Components.ti
    public final void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        oc ocVar;
        y yVar = this.c;
        long j11 = yVar.d;
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
            o8 l4 = o8.l((MediaController.PhotoEntry) next);
            l4.J0 = j11;
            String str = this.b;
            l4.K0 = str;
            l4.A();
            pc E = pc.E(yVar.a.getParentActivity(), yVar.b);
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
                    if (windowManager != null && (ocVar = E.n) != null && ocVar.getParent() == null) {
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
                    bc bcVar = E.h0;
                    int i14 = E.J;
                    bcVar.setBackgroundColor((i14 == 1 || i14 == 0) ? 0 : -14737633);
                    E.r.setTranslationX(0.0f);
                    E.r.setTranslationY(0.0f);
                    E.r.b(0.0f);
                    E.r.setScaleX(1.0f);
                    E.r.setScaleY(1.0f);
                    E.K = 0.0f;
                    AndroidUtilities.lockOrientation(E.b, 1);
                    o8 o8Var = E.K1;
                    if (o8Var != null) {
                        E.c1.setText(o8Var.C0);
                    }
                    E.K(1, false);
                    E.l0(-1, false, false);
                    E.b1.b(false, false);
                    E.b1.b(true, true);
                    E.g(1.0f, true, new ka(E, 6));
                    E.e();
                }
            }
            AndroidUtilities.runOnUIThread(new oa(viVar, 6), 400L);
        }
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void x() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void K(Object obj) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void X(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
