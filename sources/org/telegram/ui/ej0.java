package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ej0 implements r9, org.telegram.ui.Components.ai {
    public final /* synthetic */ ek0 a;

    public /* synthetic */ ej0(ek0 ek0Var) {
        this.a = ek0Var;
    }

    @Override // org.telegram.ui.Components.ai
    public void F0() {
        org.telegram.messenger.g0.v1(this.a.fragmentView.findFocus());
    }

    @Override // org.telegram.ui.Components.ai
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
        ek0 ek0Var = this.a;
        if (!isEmpty) {
            ek0Var.Y[0].setText(zrVar.b);
        }
        if (!TextUtils.isEmpty(zrVar.d)) {
            ek0Var.Y[1].setText(zrVar.d);
        }
        if (!TextUtils.isEmpty(zrVar.c)) {
            ek0Var.Y[2].setText(zrVar.c);
        }
        int i7 = zrVar.n;
        if (i7 != 0) {
            if (i7 == 1) {
                ek0Var.x = "male";
                ek0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747508, null));
            } else if (i7 == 2) {
                ek0Var.x = "female";
                ek0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747569, null));
            }
        }
        if (!TextUtils.isEmpty(zrVar.m)) {
            String str = zrVar.m;
            ek0Var.s = str;
            String str2 = (String) ek0Var.Y0.get(str);
            if (str2 != null) {
                ek0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(zrVar.l)) {
            String str3 = zrVar.l;
            ek0Var.w = str3;
            String str4 = (String) ek0Var.Y0.get(str3);
            if (str4 != null) {
                ek0Var.Y[6].setText(str4);
            }
        }
        int i10 = zrVar.k;
        if (i10 <= 0 || zrVar.j <= 0 || zrVar.i <= 0) {
            return;
        }
        ek0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(zrVar.j), Integer.valueOf(zrVar.i)));
    }

    @Override // org.telegram.ui.Components.ai
    public void c0(org.telegram.ui.Components.pg pgVar) {
        pgVar.run();
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ boolean h1(String str, j9 j9Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        org.telegram.ui.Components.ci ciVar;
        ek0 ek0Var = this.a;
        if (ek0Var.getParentActivity() == null || (ciVar = ek0Var.R0) == null) {
            return;
        }
        if (i7 != 8 && i7 != 7) {
            ciVar.L(i7);
            ek0Var.J1(i7);
            return;
        }
        if (i7 != 8) {
            ciVar.a(true);
        }
        HashMap<Object, Object> selectedPhotos = ek0Var.R0.d2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = ek0Var.R0.d2.getSelectedPhotosOrder();
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
        ek0Var.K1(arrayList);
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void M(String str) {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void M0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void Y0(TLRPC.User user) {
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void t0() {
    }

    @Override // org.telegram.ui.Components.ai
    public /* synthetic */ void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }
}
