package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kk0 implements t9, org.telegram.ui.Components.ai {
    public final /* synthetic */ ll0 a;

    public /* synthetic */ kk0(ll0 ll0Var) {
        this.a = ll0Var;
    }

    @Override // org.telegram.ui.Components.ai
    public void C(org.telegram.ui.Components.mg mgVar) {
        mgVar.run();
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ boolean D() {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        org.telegram.ui.Components.bi biVar;
        ll0 ll0Var = this.a;
        if (ll0Var.getParentActivity() == null || (biVar = ll0Var.R0) == null) {
            return;
        }
        if (i10 != 8 && i10 != 7) {
            biVar.N(i10);
            ll0Var.I1(i10);
            return;
        }
        if (i10 != 8) {
            biVar.a(true);
        }
        HashMap<Object, Object> selectedPhotos = ll0Var.R0.a2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = ll0Var.R0.a2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < selectedPhotosOrder.size(); i13++) {
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) selectedPhotos.get(selectedPhotosOrder.get(i13));
            org.telegram.messenger.pz pzVar = new org.telegram.messenger.pz();
            String str = efVar.h;
            if (str != null) {
                pzVar.c = str;
            } else {
                pzVar.c = efVar.I;
            }
            arrayList.add(pzVar);
            efVar.e();
        }
        ll0Var.J1(arrayList);
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ String P0() {
        return null;
    }

    @Override // org.telegram.ui.t9
    public void X0(org.telegram.messenger.is isVar) {
        boolean isEmpty = TextUtils.isEmpty(isVar.b);
        ll0 ll0Var = this.a;
        if (!isEmpty) {
            ll0Var.Y[0].setText(isVar.b);
        }
        if (!TextUtils.isEmpty(isVar.d)) {
            ll0Var.Y[1].setText(isVar.d);
        }
        if (!TextUtils.isEmpty(isVar.c)) {
            ll0Var.Y[2].setText(isVar.c);
        }
        int i10 = isVar.n;
        if (i10 != 0) {
            if (i10 == 1) {
                ll0Var.x = "male";
                ll0Var.Y[4].setText(org.telegram.messenger.cd.L0(2131747524, null));
            } else if (i10 == 2) {
                ll0Var.x = "female";
                ll0Var.Y[4].setText(org.telegram.messenger.cd.L0(2131747585, null));
            }
        }
        if (!TextUtils.isEmpty(isVar.m)) {
            String str = isVar.m;
            ll0Var.s = str;
            String str2 = (String) ll0Var.Y0.get(str);
            if (str2 != null) {
                ll0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(isVar.l)) {
            String str3 = isVar.l;
            ll0Var.w = str3;
            String str4 = (String) ll0Var.Y0.get(str3);
            if (str4 != null) {
                ll0Var.Y[6].setText(str4);
            }
        }
        int i11 = isVar.k;
        if (i11 <= 0 || isVar.j <= 0 || isVar.i <= 0) {
            return;
        }
        ll0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(isVar.j), Integer.valueOf(isVar.i)));
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ boolean a1() {
        return false;
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ boolean i1(String str, k9 k9Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public void j0() {
        org.telegram.messenger.i0.v1(this.a.fragmentView.findFocus());
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ void L(String str) {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void n0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void v0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
