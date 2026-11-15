package oi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ff;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.vg;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class l implements ii {
    public final /* synthetic */ ki a;
    public final /* synthetic */ o b;

    public l(o oVar, ki kiVar) {
        this.b = oVar;
        this.a = kiVar;
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final void d0(vg vgVar) {
        ns.f(this.b.n).d(vgVar);
    }

    @Override // org.telegram.ui.Components.ii
    public final boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ki kiVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.e2;
        q3 q3Var = this.b.r;
        if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            a aVar = q3Var.j4;
            q3Var.j4 = null;
            int i12 = 0;
            while (true) {
                if (i12 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                if (!(obj instanceof ff)) {
                    i12++;
                } else if (aVar != null) {
                    q3Var.X1(aVar, (ff) obj);
                } else {
                    q3Var.i2((ff) obj);
                }
            }
        }
        q3Var.j4 = null;
        kiVar.a(true);
    }

    @Override // org.telegram.ui.Components.ii
    public final void K0() {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ii
    public final void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
