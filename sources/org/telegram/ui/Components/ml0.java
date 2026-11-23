package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ sl0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ ml0(sl0 sl0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.b = sl0Var;
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
        sl0 sl0Var = this.b;
        switch (i7) {
            case 0:
                int i10 = sl0Var.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    String B = org.telegram.messenger.w7.B(((org.telegram.messenger.gj) arrayList2.get(i11)).F0());
                    if (B != null && B.toLowerCase().contains(str)) {
                        org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(i10, ((org.telegram.messenger.gj) arrayList2.get(i11)).k, false, false);
                        gjVar.z0 = ((org.telegram.messenger.gj) arrayList2.get(i11)).z0;
                        gjVar.K5(sl0Var.L, true);
                        arrayList3.add(gjVar);
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    String B2 = org.telegram.messenger.w7.B(((org.telegram.messenger.gj) arrayList.get(i12)).F0());
                    if (B2 != null && B2.toLowerCase().contains(str)) {
                        org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(i10, ((org.telegram.messenger.gj) arrayList.get(i12)).k, false, false);
                        gjVar2.z0 = ((org.telegram.messenger.gj) arrayList.get(i12)).z0;
                        gjVar2.K5(sl0Var.L, true);
                        arrayList4.add(gjVar2);
                    }
                }
                org.telegram.messenger.g0.g3(new ml0(sl0Var, str, arrayList3, arrayList4));
                break;
            default:
                nv0 nv0Var = sl0Var.a;
                if (str.equals(sl0Var.M)) {
                    if (sl0Var.r == 0) {
                        sl0Var.O.b(0);
                    }
                    sl0Var.e(arrayList2, arrayList, true);
                    if (sl0Var.r == 0) {
                        nv0Var.e(false, true);
                        m80 m80Var = nv0Var.e;
                        nv0Var.d.setText(org.telegram.messenger.hd.N0(2131745604, null));
                        m80Var.setVisibility(0);
                        m80Var.setText(org.telegram.messenger.hd.N0(2131745611, null));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ml0(sl0 sl0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.b = sl0Var;
        this.d = arrayList;
        this.c = str;
        this.e = arrayList2;
    }
}
