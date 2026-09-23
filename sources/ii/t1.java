package ii;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.wi;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class t1 implements ui {
    public final /* synthetic */ wi a;
    public final /* synthetic */ e2 b;

    public t1(e2 e2Var, wi wiVar) {
        this.b = e2Var;
        this.a = wiVar;
    }

    @Override // org.telegram.ui.Components.ui
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        wi wiVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wiVar.j0;
        e2 e2Var = this.b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            x3 x3Var = e2Var.P;
            a aVar = x3Var.b4;
            x3Var.b4 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (!(obj instanceof MediaController.PhotoEntry)) {
                    i13++;
                } else if (aVar != null) {
                    e2Var.P.T1(aVar, (MediaController.PhotoEntry) obj);
                } else {
                    e2Var.P.f2((MediaController.PhotoEntry) obj);
                }
            }
        }
        e2Var.P.b4 = null;
        wiVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ boolean S1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ui
    public final boolean c0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ui
    public final void x0(gh ghVar) {
        NotificationCenter.getInstance(this.b.getCurrentAccount()).doOnIdle(ghVar);
    }

    @Override // org.telegram.ui.Components.ui
    public final void K0() {
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ui
    public final void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.ui
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
