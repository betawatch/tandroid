package li;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class q1 implements ri {
    public final /* synthetic */ ti a;
    public final /* synthetic */ b2 b;

    public q1(b2 b2Var, ti tiVar) {
        this.b = b2Var;
        this.a = tiVar;
    }

    @Override // org.telegram.ui.Components.ri
    public final void A(gh ghVar) {
        NotificationCenter.getInstance(this.b.getCurrentAccount()).doOnIdle(ghVar);
    }

    @Override // org.telegram.ui.Components.ri
    public final boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public final void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ti tiVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.j0;
        b2 b2Var = this.b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            v3 v3Var = b2Var.P;
            a aVar = v3Var.j4;
            v3Var.j4 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (!(obj instanceof MediaController.PhotoEntry)) {
                    i13++;
                } else if (aVar != null) {
                    b2Var.P.Z1(aVar, (MediaController.PhotoEntry) obj);
                } else {
                    b2Var.P.l2((MediaController.PhotoEntry) obj);
                }
            }
        }
        b2Var.P.j4 = null;
        tiVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ boolean x0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void T(Object obj) {
    }

    @Override // org.telegram.ui.Components.ri
    public final void Y(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.ri
    public final void R() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
