package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class hj0 implements s9, org.telegram.ui.Components.qi {
    public final /* synthetic */ hk0 a;

    public /* synthetic */ hj0(hk0 hk0Var) {
        this.a = hk0Var;
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ String J0() {
        return null;
    }

    @Override // org.telegram.ui.Components.qi
    public void K0() {
        org.telegram.messenger.g0.v1(this.a.fragmentView.findFocus());
    }

    @Override // org.telegram.ui.s9
    public void S0(org.telegram.messenger.ur urVar) {
        boolean isEmpty = TextUtils.isEmpty(urVar.b);
        hk0 hk0Var = this.a;
        if (!isEmpty) {
            hk0Var.Z[0].setText(urVar.b);
        }
        if (!TextUtils.isEmpty(urVar.d)) {
            hk0Var.Z[1].setText(urVar.d);
        }
        if (!TextUtils.isEmpty(urVar.c)) {
            hk0Var.Z[2].setText(urVar.c);
        }
        int i7 = urVar.n;
        if (i7 != 0) {
            if (i7 == 1) {
                hk0Var.x = "male";
                hk0Var.Z[4].setText(org.telegram.messenger.gd.M0(2131747315, null));
            } else if (i7 == 2) {
                hk0Var.x = "female";
                hk0Var.Z[4].setText(org.telegram.messenger.gd.M0(2131747376, null));
            }
        }
        if (!TextUtils.isEmpty(urVar.m)) {
            String str = urVar.m;
            hk0Var.s = str;
            String str2 = (String) hk0Var.Z0.get(str);
            if (str2 != null) {
                hk0Var.Z[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(urVar.l)) {
            String str3 = urVar.l;
            hk0Var.w = str3;
            String str4 = (String) hk0Var.Z0.get(str3);
            if (str4 != null) {
                hk0Var.Z[6].setText(str4);
            }
        }
        int i10 = urVar.k;
        if (i10 <= 0 || urVar.j <= 0 || urVar.i <= 0) {
            return;
        }
        hk0Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(urVar.j), Integer.valueOf(urVar.i)));
    }

    @Override // org.telegram.ui.Components.qi
    public /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ boolean c1(String str, j9 j9Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.qi
    public void f0(org.telegram.ui.Components.eh ehVar) {
        ehVar.run();
    }

    @Override // org.telegram.ui.Components.qi
    public /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Components.qi
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.si siVar;
        hk0 hk0Var = this.a;
        if (hk0Var.getParentActivity() == null || (siVar = hk0Var.S0) == null) {
            return;
        }
        if (i7 != 8 && i7 != 7) {
            siVar.M(i7);
            hk0Var.J1(i7);
            return;
        }
        if (i7 != 8) {
            siVar.a(true);
        }
        HashMap<Object, Object> selectedPhotos = hk0Var.S0.e2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = hk0Var.S0.e2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) selectedPhotos.get(selectedPhotosOrder.get(i12));
            org.telegram.messenger.yy yyVar = new org.telegram.messenger.yy();
            String str = efVar.h;
            if (str != null) {
                yyVar.c = str;
            } else {
                yyVar.c = efVar.I;
            }
            arrayList.add(yyVar);
            efVar.e();
        }
        hk0Var.K1(arrayList);
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void J(String str) {
    }

    @Override // org.telegram.ui.Components.qi
    public /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Components.qi
    public /* synthetic */ void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Components.qi
    public /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.qi
    public /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
