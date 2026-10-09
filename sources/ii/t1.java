package ii;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.yi;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class t1 implements wi {
    public final /* synthetic */ yi a;
    public final /* synthetic */ e2 b;

    public t1(e2 e2Var, yi yiVar) {
        this.b = e2Var;
        this.a = yiVar;
    }

    @Override // org.telegram.ui.Components.wi
    public final void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        yi yiVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.j0;
        e2 e2Var = this.b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            x3 x3Var = e2Var.P;
            a aVar = x3Var.Z3;
            x3Var.Z3 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (!(obj instanceof MediaController.PhotoEntry)) {
                    i13++;
                } else if (aVar != null) {
                    e2Var.P.U1(aVar, (MediaController.PhotoEntry) obj);
                } else {
                    e2Var.P.g2((MediaController.PhotoEntry) obj);
                }
            }
        }
        e2Var.P.Z3 = null;
        yiVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ boolean Y1() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public final void f0(jh jhVar) {
        NotificationCenter.getInstance(this.b.getCurrentAccount()).doOnIdle(jhVar);
    }

    @Override // org.telegram.ui.Components.wi
    public final boolean i0() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void a1(Object obj) {
    }

    @Override // org.telegram.ui.Components.wi
    public final void p1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void B0() {
    }

    @Override // org.telegram.ui.Components.wi
    public final void P0() {
    }

    @Override // org.telegram.ui.Components.wi
    public final /* synthetic */ void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
