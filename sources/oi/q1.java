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
public final class q1 implements si {
    public final /* synthetic */ ui a;
    public final /* synthetic */ b2 b;

    public q1(b2 b2Var, ui uiVar) {
        this.b = b2Var;
        this.a = uiVar;
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Components.si
    public final void f0(gh ghVar) {
        ls.f(this.b.getCurrentAccount()).d(ghVar);
    }

    @Override // org.telegram.ui.Components.si
    public final boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.si
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ui uiVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar.e2;
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
                if (!(obj instanceof ff)) {
                    i12++;
                } else if (aVar != null) {
                    b2Var.Q.X1(aVar, (ff) obj);
                } else {
                    b2Var.Q.i2((ff) obj);
                }
            }
        }
        b2Var.Q.j4 = null;
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
