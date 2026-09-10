package hi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.yi;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class u1 implements wi {
    public final /* synthetic */ yi a;
    public final /* synthetic */ g2 b;

    public u1(g2 g2Var, yi yiVar) {
        this.b = g2Var;
        this.a = yiVar;
    }

    @Override // org.telegram.ui.Components.wi
    public final void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        yi yiVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.j0;
        g2 g2Var = this.b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            z3 z3Var = g2Var.P;
            a aVar = z3Var.b4;
            z3Var.b4 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (!(obj instanceof MediaController.PhotoEntry)) {
                    i13++;
                } else if (aVar != null) {
                    g2Var.P.S1(aVar, (MediaController.PhotoEntry) obj);
                } else {
                    g2Var.P.e2((MediaController.PhotoEntry) obj);
                }
            }
        }
        g2Var.P.b4 = null;
        yiVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ boolean R1() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public final boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public final void y0(jh jhVar) {
        NotificationCenter.getInstance(this.b.getCurrentAccount()).doOnIdle(jhVar);
    }

    @Override // org.telegram.ui.Components.wi
    public final void K0() {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.wi
    public final void i1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
