package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fj0 implements s9, org.telegram.ui.Components.ri {
    public final /* synthetic */ fk0 a;

    public /* synthetic */ fj0(fk0 fk0Var) {
        this.a = fk0Var;
    }

    @Override // org.telegram.ui.Components.ri
    public void B0() {
        org.telegram.messenger.g0.v1(this.a.fragmentView.findFocus());
    }

    @Override // org.telegram.ui.s9
    public void E0(org.telegram.messenger.ur urVar) {
        boolean isEmpty = TextUtils.isEmpty(urVar.b);
        fk0 fk0Var = this.a;
        if (!isEmpty) {
            fk0Var.Z[0].setText(urVar.b);
        }
        if (!TextUtils.isEmpty(urVar.d)) {
            fk0Var.Z[1].setText(urVar.d);
        }
        if (!TextUtils.isEmpty(urVar.c)) {
            fk0Var.Z[2].setText(urVar.c);
        }
        int i7 = urVar.n;
        if (i7 != 0) {
            if (i7 == 1) {
                fk0Var.x = "male";
                fk0Var.Z[4].setText(org.telegram.messenger.gd.N0(2131747314, null));
            } else if (i7 == 2) {
                fk0Var.x = "female";
                fk0Var.Z[4].setText(org.telegram.messenger.gd.N0(2131747375, null));
            }
        }
        if (!TextUtils.isEmpty(urVar.m)) {
            String str = urVar.m;
            fk0Var.s = str;
            String str2 = (String) fk0Var.Z0.get(str);
            if (str2 != null) {
                fk0Var.Z[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(urVar.l)) {
            String str3 = urVar.l;
            fk0Var.w = str3;
            String str4 = (String) fk0Var.Z0.get(str3);
            if (str4 != null) {
                fk0Var.Z[6].setText(str4);
            }
        }
        int i10 = urVar.k;
        if (i10 <= 0 || urVar.j <= 0 || urVar.i <= 0) {
            return;
        }
        fk0Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(urVar.j), Integer.valueOf(urVar.i)));
    }

    @Override // org.telegram.ui.Components.ri
    public void S(org.telegram.ui.Components.fh fhVar) {
        fhVar.run();
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ String w0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ri
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.ti tiVar;
        fk0 fk0Var = this.a;
        if (fk0Var.getParentActivity() == null || (tiVar = fk0Var.S0) == null) {
            return;
        }
        if (i7 != 8 && i7 != 7) {
            tiVar.M(i7);
            fk0Var.J1(i7);
            return;
        }
        if (i7 != 8) {
            tiVar.a(true);
        }
        HashMap<Object, Object> selectedPhotos = fk0Var.S0.e2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = fk0Var.S0.e2.getSelectedPhotosOrder();
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
        fk0Var.K1(arrayList);
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void H(String str) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void O0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void h1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void l0() {
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Components.ri
    public /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
