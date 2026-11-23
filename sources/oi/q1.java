package oi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ef;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class q1 implements ri {
    public final /* synthetic */ ti a;
    public final /* synthetic */ b2 b;

    public q1(b2 b2Var, ti tiVar) {
        this.b = b2Var;
        this.a = tiVar;
    }

    @Override // org.telegram.ui.Components.ri
    public final void S(fh fhVar) {
        ks.f(this.b.getCurrentAccount()).d(fhVar);
    }

    @Override // org.telegram.ui.Components.ri
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ti tiVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.e2;
        b2 b2Var = this.b;
        if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            t3 t3Var = b2Var.Q;
            a aVar = t3Var.j4;
            t3Var.j4 = null;
            int i12 = 0;
            while (true) {
                if (i12 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                if (!(obj instanceof ef)) {
                    i12++;
                } else if (aVar != null) {
                    b2Var.Q.X1(aVar, (ef) obj);
                } else {
                    b2Var.Q.i2((ef) obj);
                }
            }
        }
        b2Var.Q.j4 = null;
        tiVar.a(true);
    }

    @Override // org.telegram.ui.Components.ri
    public final void B0() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void l0() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void O0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ri
    public final void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
