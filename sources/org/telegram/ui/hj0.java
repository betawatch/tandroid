package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class hj0 implements s9, org.telegram.ui.Components.si {
    public final /* synthetic */ hk0 a;

    public /* synthetic */ hj0(hk0 hk0Var) {
        this.a = hk0Var;
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ String J0() {
        return null;
    }

    @Override // org.telegram.ui.Components.si
    public void K0() {
        org.telegram.messenger.g0.v1(this.a.fragmentView.findFocus());
    }

    @Override // org.telegram.ui.s9
    public void S0(org.telegram.messenger.vr vrVar) {
        boolean isEmpty = TextUtils.isEmpty(vrVar.b);
        hk0 hk0Var = this.a;
        if (!isEmpty) {
            hk0Var.Z[0].setText(vrVar.b);
        }
        if (!TextUtils.isEmpty(vrVar.d)) {
            hk0Var.Z[1].setText(vrVar.d);
        }
        if (!TextUtils.isEmpty(vrVar.c)) {
            hk0Var.Z[2].setText(vrVar.c);
        }
        int i7 = vrVar.n;
        if (i7 != 0) {
            if (i7 == 1) {
                hk0Var.x = "male";
                hk0Var.Z[4].setText(org.telegram.messenger.hd.N0(2131747314, null));
            } else if (i7 == 2) {
                hk0Var.x = "female";
                hk0Var.Z[4].setText(org.telegram.messenger.hd.N0(2131747375, null));
            }
        }
        if (!TextUtils.isEmpty(vrVar.m)) {
            String str = vrVar.m;
            hk0Var.s = str;
            String str2 = (String) hk0Var.Z0.get(str);
            if (str2 != null) {
                hk0Var.Z[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(vrVar.l)) {
            String str3 = vrVar.l;
            hk0Var.w = str3;
            String str4 = (String) hk0Var.Z0.get(str3);
            if (str4 != null) {
                hk0Var.Z[6].setText(str4);
            }
        }
        int i10 = vrVar.k;
        if (i10 <= 0 || vrVar.j <= 0 || vrVar.i <= 0) {
            return;
        }
        hk0Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(vrVar.j), Integer.valueOf(vrVar.i)));
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ boolean c1(String str, k9 k9Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.si
    public void f0(org.telegram.ui.Components.gh ghVar) {
        ghVar.run();
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.si
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.ui uiVar;
        hk0 hk0Var = this.a;
        if (hk0Var.getParentActivity() == null || (uiVar = hk0Var.S0) == null) {
            return;
        }
        if (i7 != 8 && i7 != 7) {
            uiVar.M(i7);
            hk0Var.J1(i7);
            return;
        }
        if (i7 != 8) {
            uiVar.a(true);
        }
        HashMap<Object, Object> selectedPhotos = hk0Var.S0.e2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = hk0Var.S0.e2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) selectedPhotos.get(selectedPhotosOrder.get(i12));
            org.telegram.messenger.zy zyVar = new org.telegram.messenger.zy();
            String str = ffVar.h;
            if (str != null) {
                zyVar.c = str;
            } else {
                zyVar.c = ffVar.I;
            }
            arrayList.add(zyVar);
            ffVar.e();
        }
        hk0Var.K1(arrayList);
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void J(String str) {
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.si
    public /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
