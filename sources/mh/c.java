package mh;

import android.graphics.RectF;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import lh.m5;
import nh.fb;
import nh.g9;
import nh.gb;
import nh.o7;
import nh.ta;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.zg;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class c implements li {
    public final /* synthetic */ ni a;
    public final /* synthetic */ String b;
    public final /* synthetic */ v c;

    public c(v vVar, ni niVar, String str) {
        this.c = vVar;
        this.a = niVar;
        this.b = str;
    }

    @Override // org.telegram.ui.Components.li
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        fb fbVar;
        v vVar = this.c;
        long j12 = vVar.d;
        ni niVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar.f0;
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
            o7 l10 = o7.l((MediaController.PhotoEntry) next);
            l10.J0 = j12;
            String str = this.b;
            l10.K0 = str;
            l10.A();
            gb E = gb.E(vVar.a.getParentActivity(), vVar.b);
            RectF rectF = E.D;
            WindowManager.LayoutParams layoutParams = E.h;
            int i13 = E.c;
            WindowManager windowManager = E.f;
            if (!E.d) {
                if (MessagesController.getInstance(i13).isFrozen()) {
                    org.telegram.ui.c.b(i13);
                } else {
                    E.r0 = j12;
                    E.s0 = str;
                    E.q0 = false;
                    E.e = false;
                    E.x2 = false;
                    if (windowManager != null && (fbVar = E.n) != null && fbVar.getParent() == null) {
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
                    ta taVar = E.d0;
                    int i14 = E.F;
                    taVar.setBackgroundColor((i14 == 1 || i14 == 0) ? 0 : -14737633);
                    E.r.setTranslationX(0.0f);
                    E.r.setTranslationY(0.0f);
                    E.r.b(0.0f);
                    E.r.setScaleX(1.0f);
                    E.r.setScaleY(1.0f);
                    E.G = 0.0f;
                    AndroidUtilities.lockOrientation(E.b, 1);
                    o7 o7Var = E.G1;
                    if (o7Var != null) {
                        E.Y0.setText(o7Var.C0);
                    }
                    E.K(1, false);
                    E.l0(-1, false, false);
                    E.X0.b(false, false);
                    E.X0.b(true, true);
                    E.g(1.0f, true, new g9(E, 6));
                    E.e();
                }
            }
            AndroidUtilities.runOnUIThread(new m5(niVar, 14), 400L);
        }
    }

    @Override // org.telegram.ui.Components.li
    public final boolean T1() {
        return true;
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // org.telegram.ui.Components.li
    public final void x0(zg zgVar) {
        zgVar.run();
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void L0() {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
