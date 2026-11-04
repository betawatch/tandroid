package mi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.hs;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.zh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class r1 implements zh {
    public final /* synthetic */ bi a;
    public final /* synthetic */ c2 b;

    public r1(c2 c2Var, bi biVar) {
        this.b = c2Var;
        this.a = biVar;
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ boolean L1() {
        return false;
    }

    @Override // org.telegram.ui.Components.zh
    public final void Y(ng ngVar) {
        hs.f(this.b.getCurrentAccount()).d(ngVar);
    }

    @Override // org.telegram.ui.Components.zh
    public final boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.zh
    public final void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        bi biVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.b2;
        c2 c2Var = this.b;
        if (i3 == 7 || i3 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            t3 t3Var = c2Var.Q;
            a aVar = t3Var.j4;
            t3Var.j4 = null;
            int i12 = 0;
            while (true) {
                if (i12 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                if (!(obj instanceof ye)) {
                    i12++;
                } else if (aVar != null) {
                    c2Var.Q.X1(aVar, (ye) obj);
                } else {
                    c2Var.Q.i2((ye) obj);
                }
            }
        }
        c2Var.Q.j4 = null;
        biVar.a(true);
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ void r0() {
    }

    @Override // org.telegram.ui.Components.zh
    public final void v0() {
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ void I0(Object obj) {
    }

    @Override // org.telegram.ui.Components.zh
    public final void a1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }
}
