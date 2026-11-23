package oi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ff;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class l implements si {
    public final /* synthetic */ ui a;
    public final /* synthetic */ o b;

    public l(o oVar, ui uiVar) {
        this.b = oVar;
        this.a = uiVar;
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Components.si
    public final void f0(gh ghVar) {
        ls.f(this.b.n).d(ghVar);
    }

    @Override // org.telegram.ui.Components.si
    public final boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.si
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ui uiVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar.e2;
        t3 t3Var = this.b.r;
        if (i7 == 7 || i7 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            a aVar = t3Var.j4;
            t3Var.j4 = null;
            int i12 = 0;
            while (true) {
                if (i12 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                if (!(obj instanceof ff)) {
                    i12++;
                } else if (aVar != null) {
                    t3Var.X1(aVar, (ff) obj);
                } else {
                    t3Var.i2((ff) obj);
                }
            }
        }
        t3Var.j4 = null;
        uiVar.a(true);
    }

    @Override // org.telegram.ui.Components.si
    public final void K0() {
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Components.si
    public final void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
