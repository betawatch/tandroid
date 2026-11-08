package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class bj0 implements r9, org.telegram.ui.Components.bi {
    public final /* synthetic */ bk0 a;

    public /* synthetic */ bj0(bk0 bk0Var) {
        this.a = bk0Var;
    }

    @Override // org.telegram.ui.Components.bi
    public void F0() {
        org.telegram.messenger.g0.v1(this.a.fragmentView.findFocus());
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ boolean G1() {
        return false;
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ String R0() {
        return null;
    }

    @Override // org.telegram.ui.r9
    public void V0(org.telegram.messenger.zr zrVar) {
        boolean isEmpty = TextUtils.isEmpty(zrVar.b);
        bk0 bk0Var = this.a;
        if (!isEmpty) {
            bk0Var.Y[0].setText(zrVar.b);
        }
        if (!TextUtils.isEmpty(zrVar.d)) {
            bk0Var.Y[1].setText(zrVar.d);
        }
        if (!TextUtils.isEmpty(zrVar.c)) {
            bk0Var.Y[2].setText(zrVar.c);
        }
        int i7 = zrVar.n;
        if (i7 != 0) {
            if (i7 == 1) {
                bk0Var.x = "male";
                bk0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747509, null));
            } else if (i7 == 2) {
                bk0Var.x = "female";
                bk0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747570, null));
            }
        }
        if (!TextUtils.isEmpty(zrVar.m)) {
            String str = zrVar.m;
            bk0Var.s = str;
            String str2 = (String) bk0Var.Y0.get(str);
            if (str2 != null) {
                bk0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(zrVar.l)) {
            String str3 = zrVar.l;
            bk0Var.w = str3;
            String str4 = (String) bk0Var.Y0.get(str3);
            if (str4 != null) {
                bk0Var.Y[6].setText(str4);
            }
        }
        int i10 = zrVar.k;
        if (i10 <= 0 || zrVar.j <= 0 || zrVar.i <= 0) {
            return;
        }
        bk0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(zrVar.j), Integer.valueOf(zrVar.i)));
    }

    @Override // org.telegram.ui.Components.bi
    public void c0(org.telegram.ui.Components.qg qgVar) {
        qgVar.run();
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ boolean h1(String str, j9 j9Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.bi
    public void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        org.telegram.ui.Components.di diVar;
        bk0 bk0Var = this.a;
        if (bk0Var.getParentActivity() == null || (diVar = bk0Var.R0) == null) {
            return;
        }
        if (i7 != 8 && i7 != 7) {
            diVar.L(i7);
            bk0Var.J1(i7);
            return;
        }
        if (i7 != 8) {
            diVar.a(true);
        }
        HashMap<Object, Object> selectedPhotos = bk0Var.R0.a2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = bk0Var.R0.a2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) selectedPhotos.get(selectedPhotosOrder.get(i12));
            org.telegram.messenger.fz fzVar = new org.telegram.messenger.fz();
            String str = gfVar.h;
            if (str != null) {
                fzVar.c = str;
            } else {
                fzVar.c = gfVar.I;
            }
            arrayList.add(fzVar);
            gfVar.e();
        }
        bk0Var.K1(arrayList);
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void M(String str) {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void M0(Object obj) {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void Y0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void t0() {
    }

    @Override // org.telegram.ui.Components.bi
    public /* synthetic */ void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }
}
