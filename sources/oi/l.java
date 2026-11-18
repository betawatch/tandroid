package oi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ef;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.si;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class l implements qi {
    public final /* synthetic */ si a;
    public final /* synthetic */ o b;

    public l(o oVar, si siVar) {
        this.b = oVar;
        this.a = siVar;
    }

    @Override // org.telegram.ui.Components.qi
    public final /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Components.qi
    public final void f0(eh ehVar) {
        ks.f(this.b.n).d(ehVar);
    }

    @Override // org.telegram.ui.Components.qi
    public final boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.qi
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        si siVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar.e2;
        s3 s3Var = this.b.r;
        if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            a aVar = s3Var.j4;
            s3Var.j4 = null;
            int i12 = 0;
            while (true) {
                if (i12 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                if (!(obj instanceof ef)) {
                    i12++;
                } else if (aVar != null) {
                    s3Var.X1(aVar, (ef) obj);
                } else {
                    s3Var.i2((ef) obj);
                }
            }
        }
        s3Var.j4 = null;
        siVar.a(true);
    }

    @Override // org.telegram.ui.Components.qi
    public final void K0() {
    }

    @Override // org.telegram.ui.Components.qi
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.qi
    public final /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Components.qi
    public final void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.qi
    public final /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
