// default package

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class n62 implements l12 {
    public final /* synthetic */ e a;
    public final /* synthetic */ pcc b;
    public final /* synthetic */ f41 c;

    public n62(f41 f41Var, pcc pccVar, e eVar) {
        this.a = eVar;
        this.b = pccVar;
        this.c = f41Var;
    }

    @Override // l12
    public final boolean E0() {
        return false;
    }

    @Override // l12
    public final void O0(vq0 vq0Var) {
        jn7.f(this.a.getCurrentAccount()).d(vq0Var);
    }

    @Override // l12
    public final boolean o() {
        return false;
    }

    @Override // l12
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        f41 f41Var = this.c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = f41Var.d2;
        pcc pccVar = this.b;
        if (i == 15) {
            e eVar = this.a;
            jj.d0(eVar.getContext(), eVar.getResourceProvider(), null, null, new m62(pccVar, (byte) 0), null);
        } else if (i == 7 || i == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotosOrder.size() > 0) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(0));
                q7a q7aVar = new q7a();
                if (obj instanceof no6) {
                    no6 no6Var = (no6) obj;
                    String str = no6Var.h;
                    if (str != null) {
                        q7aVar.c = str;
                    } else {
                        q7aVar.c = no6Var.I;
                    }
                    q7aVar.e = no6Var.c;
                    q7aVar.f = no6Var.g;
                    q7aVar.k = no6Var.s;
                    q7aVar.p = no6Var.d();
                    q7aVar.z = no6Var.m;
                    q7aVar.q = true;
                    q7aVar.o = no6Var.b;
                    CharSequence charSequence = no6Var.a;
                    q7aVar.d = charSequence != null ? charSequence.toString() : null;
                    q7aVar.i = no6Var.n;
                    q7aVar.j = no6Var.r;
                    q7aVar.h = no6Var.x;
                    q7aVar.v = no6Var.S;
                    q7aVar.y = no6Var;
                } else if (obj instanceof ro6) {
                    ro6 ro6Var = (ro6) obj;
                    String str2 = ro6Var.h;
                    if (str2 != null) {
                        q7aVar.c = str2;
                    } else {
                        q7aVar.l = ro6Var;
                    }
                    q7aVar.e = ro6Var.c;
                    q7aVar.f = ro6Var.g;
                    q7aVar.k = ro6Var.s;
                    CharSequence charSequence2 = ro6Var.I;
                    q7aVar.d = charSequence2 != null ? charSequence2.toString() : null;
                    q7aVar.i = ro6Var.n;
                    q7aVar.j = ro6Var.r;
                    q7aVar.h = ro6Var.x;
                    TLRPC.BotInlineResult botInlineResult = ro6Var.N;
                    if (botInlineResult != null && ro6Var.H) {
                        q7aVar.m = botInlineResult;
                        q7aVar.n = ro6Var.O;
                    }
                    System.currentTimeMillis();
                }
                pccVar.a(new dh8(q7aVar));
            }
        }
        f41Var.a(true);
    }

    @Override // l12
    public final void R() {
    }

    @Override // l12
    public final void V() {
    }

    @Override // l12
    public final void e0(Object obj) {
    }

    @Override // l12
    public final void i0(TLRPC.User user) {
    }

    @Override // l12
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
