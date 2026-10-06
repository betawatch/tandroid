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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class n implements vi {
    public final /* synthetic */ xi a;
    public final /* synthetic */ r b;

    public n(r rVar, xi xiVar) {
        this.b = rVar;
        this.a = xiVar;
    }

    @Override // org.telegram.ui.Components.vi
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        xi xiVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xiVar.j0;
        x3 x3Var = this.b.r;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
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
                    x3Var.U1(aVar, (MediaController.PhotoEntry) obj);
                } else {
                    x3Var.g2((MediaController.PhotoEntry) obj);
                }
            }
        }
        x3Var.i4 = null;
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
        NotificationCenter.getInstance(this.b.n).doOnIdle(ihVar);
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
