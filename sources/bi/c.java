package bi;

import android.graphics.RectF;
import android.view.WindowManager;
import androidx.fragment.app.a0;
import ci.ac;
import ci.ka;
import ci.nc;
import ci.o8;
import ci.oc;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class c implements ti {
    public final /* synthetic */ vi a;
    public final /* synthetic */ String b;
    public final /* synthetic */ z c;

    public c(z zVar, vi viVar, String str) {
        this.c = zVar;
        this.a = viVar;
        this.b = str;
    }

    @Override // org.telegram.ui.Components.ti
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        nc ncVar;
        z zVar = this.c;
        long j11 = zVar.d;
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
            oc E = oc.E(zVar.a.getParentActivity(), zVar.b);
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
                    if (windowManager != null && (ncVar = E.n) != null && ncVar.getParent() == null) {
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
                    ac acVar = E.h0;
                    int i14 = E.J;
                    acVar.setBackgroundColor((i14 == 1 || i14 == 0) ? 0 : -14737633);
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
            AndroidUtilities.runOnUIThread(new a0(viVar, 2), 400L);
        }
    }

    @Override // org.telegram.ui.Components.ti
    public final boolean S1() {
        return true;
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean c0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final void x0(gh ghVar) {
        ghVar.run();
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void K0() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
