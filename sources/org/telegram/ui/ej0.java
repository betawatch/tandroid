package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ej0 implements s9, org.telegram.ui.Components.ii {
    public final /* synthetic */ ek0 a;

    public /* synthetic */ ej0(ek0 ek0Var) {
        this.a = ek0Var;
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ String J0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ii
    public void K0() {
        org.telegram.messenger.g0.v1(this.a.fragmentView.findFocus());
    }

    @Override // org.telegram.ui.s9
    public void S0(org.telegram.messenger.wr wrVar) {
        boolean isEmpty = TextUtils.isEmpty(wrVar.b);
        ek0 ek0Var = this.a;
        if (!isEmpty) {
            ek0Var.Z[0].setText(wrVar.b);
        }
        if (!TextUtils.isEmpty(wrVar.d)) {
            ek0Var.Z[1].setText(wrVar.d);
        }
        if (!TextUtils.isEmpty(wrVar.c)) {
            ek0Var.Z[2].setText(wrVar.c);
        }
        int i7 = wrVar.n;
        if (i7 != 0) {
            if (i7 == 1) {
                ek0Var.x = "male";
                ek0Var.Z[4].setText(org.telegram.messenger.hd.M0(2131747508, null));
            } else if (i7 == 2) {
                ek0Var.x = "female";
                ek0Var.Z[4].setText(org.telegram.messenger.hd.M0(2131747569, null));
            }
        }
        if (!TextUtils.isEmpty(wrVar.m)) {
            String str = wrVar.m;
            ek0Var.s = str;
            String str2 = (String) ek0Var.Z0.get(str);
            if (str2 != null) {
                ek0Var.Z[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(wrVar.l)) {
            String str3 = wrVar.l;
            ek0Var.w = str3;
            String str4 = (String) ek0Var.Z0.get(str3);
            if (str4 != null) {
                ek0Var.Z[6].setText(str4);
            }
        }
        int i10 = wrVar.k;
        if (i10 <= 0 || wrVar.j <= 0 || wrVar.i <= 0) {
            return;
        }
        ek0Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(wrVar.j), Integer.valueOf(wrVar.i)));
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public void d0(org.telegram.ui.Components.vg vgVar) {
        vgVar.run();
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ boolean d1(String str, j9 j9Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.ki kiVar;
        ek0 ek0Var = this.a;
        if (ek0Var.getParentActivity() == null || (kiVar = ek0Var.S0) == null) {
            return;
        }
        if (i7 != 8 && i7 != 7) {
            kiVar.M(i7);
            ek0Var.J1(i7);
            return;
        }
        if (i7 != 8) {
            kiVar.a(true);
        }
        HashMap<Object, Object> selectedPhotos = ek0Var.S0.e2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = ek0Var.S0.e2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) selectedPhotos.get(selectedPhotosOrder.get(i12));
            org.telegram.messenger.dz dzVar = new org.telegram.messenger.dz();
            String str = ffVar.h;
            if (str != null) {
                dzVar.c = str;
            } else {
                dzVar.c = ffVar.I;
            }
            arrayList.add(dzVar);
            ffVar.e();
        }
        ek0Var.K1(arrayList);
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void M(String str) {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.ii
    public /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
