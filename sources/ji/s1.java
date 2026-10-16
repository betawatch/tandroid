package ji;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.hh;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class s1 implements ti {
    public final /* synthetic */ vi a;
    public final /* synthetic */ d2 b;

    public s1(d2 d2Var, vi viVar) {
        this.b = d2Var;
        this.a = viVar;
    }

    @Override // org.telegram.ui.Components.ti
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        vi viVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.j0;
        d2 d2Var = this.b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            x3 x3Var = d2Var.P;
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
                    d2Var.P.U1(aVar, (MediaController.PhotoEntry) obj);
                } else {
                    d2Var.P.g2((MediaController.PhotoEntry) obj);
                }
            }
        }
        d2Var.P.Z3 = null;
        viVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean r0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final void v(hh hhVar) {
        NotificationCenter.getInstance(this.b.getCurrentAccount()).doOnIdle(hhVar);
    }

    @Override // org.telegram.ui.Components.ti
    public final boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void J(Object obj) {
    }

    @Override // org.telegram.ui.Components.ti
    public final void U(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ti
    public final void F() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void z() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void s0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
