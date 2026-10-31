package bi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ef;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.mg;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class y1 implements ai {
    public final /* synthetic */ bi a;
    public final /* synthetic */ k2 b;

    public y1(k2 k2Var, bi biVar) {
        this.b = k2Var;
        this.a = biVar;
    }

    @Override // org.telegram.ui.Components.ai
    public final void C(mg mgVar) {
        zs.f(this.b.getCurrentAccount()).d(mgVar);
    }

    @Override // org.telegram.ui.Components.ai
    public final boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public final void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        bi biVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.a2;
        k2 k2Var = this.b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            d4 d4Var = k2Var.P;
            a aVar = d4Var.i4;
            d4Var.i4 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (!(obj instanceof ef)) {
                    i13++;
                } else if (aVar != null) {
                    k2Var.P.W1(aVar, (ef) obj);
                } else {
                    k2Var.P.i2((ef) obj);
                }
            }
        }
        k2Var.P.i4 = null;
        biVar.a(true);
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ boolean a1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.ai
    public final void j0() {
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void n0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ai
    public final void v0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
