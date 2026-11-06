package li;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.gf;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.qg;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class q1 implements bi {
    public final /* synthetic */ di a;
    public final /* synthetic */ b2 b;

    public q1(b2 b2Var, di diVar) {
        this.b = b2Var;
        this.a = diVar;
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ boolean G1() {
        return false;
    }

    @Override // org.telegram.ui.Components.bi
    public final void c0(qg qgVar) {
        qs.f(this.b.getCurrentAccount()).d(qgVar);
    }

    @Override // org.telegram.ui.Components.bi
    public final boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Components.bi
    public final void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        di diVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar.a2;
        b2 b2Var = this.b;
        if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            t3 t3Var = b2Var.P;
            a aVar = t3Var.i4;
            t3Var.i4 = null;
            int i12 = 0;
            while (true) {
                if (i12 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                if (!(obj instanceof gf)) {
                    i12++;
                } else if (aVar != null) {
                    b2Var.P.X1(aVar, (gf) obj);
                } else {
                    b2Var.P.i2((gf) obj);
                }
            }
        }
        b2Var.P.i4 = null;
        diVar.a(true);
    }

    @Override // org.telegram.ui.Components.bi
    public final void F0() {
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ void t0() {
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ void M0(Object obj) {
    }

    @Override // org.telegram.ui.Components.bi
    public final void Y0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.bi
    public final /* synthetic */ void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }
}
