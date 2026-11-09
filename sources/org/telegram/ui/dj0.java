package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class dj0 implements r9, org.telegram.ui.Components.bi {
    public final /* synthetic */ dk0 a;

    public /* synthetic */ dj0(dk0 dk0Var) {
        this.a = dk0Var;
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
        dk0 dk0Var = this.a;
        if (!isEmpty) {
            dk0Var.Y[0].setText(zrVar.b);
        }
        if (!TextUtils.isEmpty(zrVar.d)) {
            dk0Var.Y[1].setText(zrVar.d);
        }
        if (!TextUtils.isEmpty(zrVar.c)) {
            dk0Var.Y[2].setText(zrVar.c);
        }
        int i7 = zrVar.n;
        if (i7 != 0) {
            if (i7 == 1) {
                dk0Var.x = "male";
                dk0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747508, null));
            } else if (i7 == 2) {
                dk0Var.x = "female";
                dk0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747569, null));
            }
        }
        if (!TextUtils.isEmpty(zrVar.m)) {
            String str = zrVar.m;
            dk0Var.s = str;
            String str2 = (String) dk0Var.Y0.get(str);
            if (str2 != null) {
                dk0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(zrVar.l)) {
            String str3 = zrVar.l;
            dk0Var.w = str3;
            String str4 = (String) dk0Var.Y0.get(str3);
            if (str4 != null) {
                dk0Var.Y[6].setText(str4);
            }
        }
        int i10 = zrVar.k;
        if (i10 <= 0 || zrVar.j <= 0 || zrVar.i <= 0) {
            return;
        }
        dk0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(zrVar.j), Integer.valueOf(zrVar.i)));
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
        dk0 dk0Var = this.a;
        if (dk0Var.getParentActivity() == null || (diVar = dk0Var.R0) == null) {
            return;
        }
        if (i7 != 8 && i7 != 7) {
            diVar.L(i7);
            dk0Var.J1(i7);
            return;
        }
        if (i7 != 8) {
            diVar.a(true);
        }
        HashMap<Object, Object> selectedPhotos = dk0Var.R0.a2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = dk0Var.R0.a2.getSelectedPhotosOrder();
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
        dk0Var.K1(arrayList);
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
