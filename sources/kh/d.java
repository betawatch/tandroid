package kh;

import android.graphics.RectF;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import lh.fb;
import lh.rb;
import lh.s9;
import lh.sb;
import lh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.sg;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class d implements ei {
    public final /* synthetic */ gi a;
    public final /* synthetic */ String b;
    public final /* synthetic */ v c;

    public d(v vVar, gi giVar, String str) {
        this.c = vVar;
        this.a = giVar;
        this.b = str;
    }

    @Override // org.telegram.ui.Components.ei
    public final boolean N0() {
        return true;
    }

    @Override // org.telegram.ui.Components.ei
    public final void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        rb rbVar;
        v vVar = this.c;
        long j12 = vVar.d;
        gi giVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar.f0;
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
            z7 l10 = z7.l((MediaController.PhotoEntry) next);
            l10.J0 = j12;
            String str = this.b;
            l10.K0 = str;
            l10.A();
            sb E = sb.E(vVar.a.getParentActivity(), vVar.b);
            RectF rectF = E.D;
            WindowManager.LayoutParams layoutParams = E.h;
            int i13 = E.c;
            WindowManager windowManager = E.f;
            if (!E.d) {
                if (MessagesController.getInstance(i13).isFrozen()) {
                    org.telegram.ui.b.b(i13);
                } else {
                    E.r0 = j12;
                    E.s0 = str;
                    E.q0 = false;
                    E.e = false;
                    E.x2 = false;
                    if (windowManager != null && (rbVar = E.n) != null && rbVar.getParent() == null) {
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
                    fb fbVar = E.d0;
                    int i14 = E.F;
                    fbVar.setBackgroundColor((i14 == 1 || i14 == 0) ? 0 : -14737633);
                    E.r.setTranslationX(0.0f);
                    E.r.setTranslationY(0.0f);
                    E.r.b(0.0f);
                    E.r.setScaleX(1.0f);
                    E.r.setScaleY(1.0f);
                    E.G = 0.0f;
                    AndroidUtilities.lockOrientation(E.b, 1);
                    z7 z7Var = E.G1;
                    if (z7Var != null) {
                        E.Y0.setText(z7Var.C0);
                    }
                    E.K(1, false);
                    E.l0(-1, false, false);
                    E.X0.b(false, false);
                    E.X0.b(true, true);
                    E.g(1.0f, true, new s9(E, 6));
                    E.e();
                }
            }
            AndroidUtilities.runOnUIThread(new c(giVar, 0), 400L);
        }
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ boolean s() {
        return false;
    }

    @Override // org.telegram.ui.Components.ei
    public final void y(sg sgVar) {
        sgVar.run();
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ void F() {
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ void I(Object obj) {
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ void g0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ei
    public final /* synthetic */ void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
