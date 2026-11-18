package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ql0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ kl0(ql0 ql0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.b = ql0Var;
        this.c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.d;
        String str = this.c;
        ql0 ql0Var = this.b;
        switch (i7) {
            case 0:
                int i10 = ql0Var.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    String B = org.telegram.messenger.w7.B(((org.telegram.messenger.fj) arrayList2.get(i11)).F0());
                    if (B != null && B.toLowerCase().contains(str)) {
                        org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(i10, ((org.telegram.messenger.fj) arrayList2.get(i11)).k, false, false);
                        fjVar.z0 = ((org.telegram.messenger.fj) arrayList2.get(i11)).z0;
                        fjVar.K5(ql0Var.L, true);
                        arrayList3.add(fjVar);
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    String B2 = org.telegram.messenger.w7.B(((org.telegram.messenger.fj) arrayList.get(i12)).F0());
                    if (B2 != null && B2.toLowerCase().contains(str)) {
                        org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(i10, ((org.telegram.messenger.fj) arrayList.get(i12)).k, false, false);
                        fjVar2.z0 = ((org.telegram.messenger.fj) arrayList.get(i12)).z0;
                        fjVar2.K5(ql0Var.L, true);
                        arrayList4.add(fjVar2);
                    }
                }
                org.telegram.messenger.g0.g3(new kl0(ql0Var, str, arrayList3, arrayList4));
                break;
            default:
                kv0 kv0Var = ql0Var.a;
                if (str.equals(ql0Var.M)) {
                    if (ql0Var.r == 0) {
                        ql0Var.O.b(0);
                    }
                    ql0Var.e(arrayList2, arrayList, true);
                    if (ql0Var.r == 0) {
                        kv0Var.e(false, true);
                        k80 k80Var = kv0Var.e;
                        kv0Var.d.setText(org.telegram.messenger.gd.M0(2131745605, null));
                        k80Var.setVisibility(0);
                        k80Var.setText(org.telegram.messenger.gd.M0(2131745612, null));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ kl0(ql0 ql0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.b = ql0Var;
        this.d = arrayList;
        this.c = str;
        this.e = arrayList2;
    }
}
