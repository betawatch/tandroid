package ii;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xi;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class t1 implements vi {
    public final /* synthetic */ xi a;
    public final /* synthetic */ e2 b;

    public t1(e2 e2Var, xi xiVar) {
        this.b = e2Var;
        this.a = xiVar;
    }

    @Override // org.telegram.ui.Components.vi
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        xi xiVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xiVar.j0;
        e2 e2Var = this.b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            x3 x3Var = e2Var.P;
            a aVar = x3Var.i4;
            x3Var.i4 = null;
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
        e2Var.P.i4 = null;
        xiVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ boolean S1() {
        return false;
    }

    @Override // org.telegram.ui.Components.vi
    public final boolean a0() {
        return false;
    }

    @Override // org.telegram.ui.Components.vi
    public final void x0(ih ihVar) {
        NotificationCenter.getInstance(this.b.getCurrentAccount()).doOnIdle(ihVar);
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.vi
    public final void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.vi
    public final void K0() {
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.vi
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
