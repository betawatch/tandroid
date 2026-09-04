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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class r1 implements ti {
    public final /* synthetic */ vi a;
    public final /* synthetic */ c2 b;

    public r1(c2 c2Var, vi viVar) {
        this.b = c2Var;
        this.a = viVar;
    }

    @Override // org.telegram.ui.Components.ti
    public final void B(hh hhVar) {
        NotificationCenter.getInstance(this.b.getCurrentAccount()).doOnIdle(hhVar);
    }

    @Override // org.telegram.ui.Components.ti
    public final /* synthetic */ boolean D0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ti
    public final void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        vi viVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.j0;
        c2 c2Var = this.b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            v3 v3Var = c2Var.P;
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
                    c2Var.P.S1(aVar, (MediaController.PhotoEntry) obj);
                } else {
                    c2Var.P.e2((MediaController.PhotoEntry) obj);
                }
            }
        }
        c2Var.P.b4 = null;
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
