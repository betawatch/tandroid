package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ik0 implements t9, org.telegram.ui.Components.ai {
    public final /* synthetic */ jl0 a;

    public /* synthetic */ ik0(jl0 jl0Var) {
        this.a = jl0Var;
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
        jl0 jl0Var = this.a;
        if (jl0Var.getParentActivity() == null || (biVar = jl0Var.R0) == null) {
            return;
        }
        if (i10 != 8 && i10 != 7) {
            biVar.M(i10);
            jl0Var.J1(i10);
            return;
        }
        if (i10 != 8) {
            biVar.a(true);
        }
        HashMap<Object, Object> selectedPhotos = jl0Var.R0.a2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = jl0Var.R0.a2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < selectedPhotosOrder.size(); i13++) {
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) selectedPhotos.get(selectedPhotosOrder.get(i13));
            org.telegram.messenger.qz qzVar = new org.telegram.messenger.qz();
            String str = ffVar.h;
            if (str != null) {
                qzVar.c = str;
            } else {
                qzVar.c = ffVar.I;
            }
            arrayList.add(qzVar);
            ffVar.e();
        }
        jl0Var.K1(arrayList);
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ String P0() {
        return null;
    }

    @Override // org.telegram.ui.t9
    public void X0(org.telegram.messenger.js jsVar) {
        boolean isEmpty = TextUtils.isEmpty(jsVar.b);
        jl0 jl0Var = this.a;
        if (!isEmpty) {
            jl0Var.Y[0].setText(jsVar.b);
        }
        if (!TextUtils.isEmpty(jsVar.d)) {
            jl0Var.Y[1].setText(jsVar.d);
        }
        if (!TextUtils.isEmpty(jsVar.c)) {
            jl0Var.Y[2].setText(jsVar.c);
        }
        int i10 = jsVar.n;
        if (i10 != 0) {
            if (i10 == 1) {
                jl0Var.x = "male";
                jl0Var.Y[4].setText(org.telegram.messenger.dd.L0(2131747524, null));
            } else if (i10 == 2) {
                jl0Var.x = "female";
                jl0Var.Y[4].setText(org.telegram.messenger.dd.L0(2131747585, null));
            }
        }
        if (!TextUtils.isEmpty(jsVar.m)) {
            String str = jsVar.m;
            jl0Var.s = str;
            String str2 = (String) jl0Var.Y0.get(str);
            if (str2 != null) {
                jl0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(jsVar.l)) {
            String str3 = jsVar.l;
            jl0Var.w = str3;
            String str4 = (String) jl0Var.Y0.get(str3);
            if (str4 != null) {
                jl0Var.Y[6].setText(str4);
            }
        }
        int i11 = jsVar.k;
        if (i11 <= 0 || jsVar.j <= 0 || jsVar.i <= 0) {
            return;
        }
        jl0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(jsVar.j), Integer.valueOf(jsVar.i)));
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
