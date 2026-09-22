package ii;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class s1 implements ti {
    public final /* synthetic */ vi a;
    public final /* synthetic */ d2 b;

    public s1(d2 d2Var, vi viVar) {
        this.b = d2Var;
        this.a = viVar;
    }

    @Override // org.telegram.ui.Components.ti
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        vi viVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.j0;
        d2 d2Var = this.b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            w3 w3Var = d2Var.P;
            a aVar = w3Var.b4;
            w3Var.b4 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (!(obj instanceof MediaController.PhotoEntry)) {
                    i13++;
                } else if (aVar != null) {
                    d2Var.P.T1(aVar, (MediaController.PhotoEntry) obj);
                } else {
                    d2Var.P.f2((MediaController.PhotoEntry) obj);
                }
            }
        }
        d2Var.P.b4 = null;
        viVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean S1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final boolean c0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final void x0(fh fhVar) {
        NotificationCenter.getInstance(this.b.getCurrentAccount()).doOnIdle(fhVar);
    }

    @Override // org.telegram.ui.Components.ti
    public final void K0() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ti
    public final void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
