package jh;

import android.graphics.RectF;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import kh.a8;
import kh.ib;
import kh.v9;
import kh.vb;
import kh.wb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.wg;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class c implements ii {
    public final /* synthetic */ ki a;
    public final /* synthetic */ String b;
    public final /* synthetic */ u c;

    public c(u uVar, ki kiVar, String str) {
        this.c = uVar;
        this.a = kiVar;
        this.b = str;
    }

    @Override // org.telegram.ui.Components.ii
    public final void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        vb vbVar;
        u uVar = this.c;
        long j12 = uVar.d;
        ki kiVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f0;
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
            a8 l10 = a8.l((MediaController.PhotoEntry) next);
            l10.J0 = j12;
            String str = this.b;
            l10.K0 = str;
            l10.A();
            wb E = wb.E(uVar.a.getParentActivity(), uVar.b);
            RectF rectF = E.D;
            WindowManager.LayoutParams layoutParams = E.h;
            int i12 = E.c;
            WindowManager windowManager = E.f;
            if (!E.d) {
                if (MessagesController.getInstance(i12).isFrozen()) {
                    org.telegram.ui.b.b(i12);
                } else {
                    E.r0 = j12;
                    E.s0 = str;
                    E.q0 = false;
                    E.e = false;
                    E.x2 = false;
                    if (windowManager != null && (vbVar = E.n) != null && vbVar.getParent() == null) {
                        AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.n, layoutParams);
                        windowManager.addView(E.n, layoutParams);
                        E.g0();
                    }
                    E.G1 = l10;
                    l10.J0 = j12;
                    l10.K0 = str;
                    E.K1 = l10.K ? 1 : 0;
                    E.o0.g = false;
                    E.F = 0;
                    rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                    E.C = AndroidUtilities.dp(8.0f);
                    E.r.c();
                    ib ibVar = E.d0;
                    int i13 = E.F;
                    ibVar.setBackgroundColor((i13 == 1 || i13 == 0) ? 0 : -14737633);
                    E.r.setTranslationX(0.0f);
                    E.r.setTranslationY(0.0f);
                    E.r.b(0.0f);
                    E.r.setScaleX(1.0f);
                    E.r.setScaleY(1.0f);
                    E.G = 0.0f;
                    AndroidUtilities.lockOrientation(E.b, 1);
                    a8 a8Var = E.G1;
                    if (a8Var != null) {
                        E.Y0.setText(a8Var.C0);
                    }
                    E.K(1, false);
                    E.l0(-1, false, false);
                    E.X0.b(false, false);
                    E.X0.b(true, true);
                    E.g(1.0f, true, new v9(E, 6));
                    E.e();
                }
            }
            AndroidUtilities.runOnUIThread(new ih.g(kiVar, 23), 400L);
        }
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final void t(wg wgVar) {
        wgVar.run();
    }

    @Override // org.telegram.ui.Components.ii
    public final boolean t0() {
        return true;
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void A(Object obj) {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void E(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }
}
