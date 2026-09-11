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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class n implements ti {
    public final /* synthetic */ vi a;
    public final /* synthetic */ r b;

    public n(r rVar, vi viVar) {
        this.b = rVar;
        this.a = viVar;
    }

    @Override // org.telegram.ui.Components.ti
    public final void B(hh hhVar) {
        NotificationCenter.getInstance(this.b.n).doOnIdle(hhVar);
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean D0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        vi viVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.j0;
        v3 v3Var = this.b.r;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            a aVar = v3Var.b4;
            v3Var.b4 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (!(obj instanceof MediaController.PhotoEntry)) {
                    i13++;
                } else if (aVar != null) {
                    v3Var.S1(aVar, (MediaController.PhotoEntry) obj);
                } else {
                    v3Var.e2((MediaController.PhotoEntry) obj);
                }
            }
        }
        v3Var.b4 = null;
        viVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ti
    public final boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final void H() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void x() {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void K(Object obj) {
    }

    @Override // org.telegram.ui.Components.ti
    public final void X(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
