package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class cl0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ il0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ cl0(il0 il0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.b = il0Var;
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
        il0 il0Var = this.b;
        switch (i7) {
            case 0:
                int i10 = il0Var.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    String B = org.telegram.messenger.w7.B(((org.telegram.messenger.gj) arrayList2.get(i11)).F0());
                    if (B != null && B.toLowerCase().contains(str)) {
                        org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(i10, ((org.telegram.messenger.gj) arrayList2.get(i11)).k, false, false);
                        gjVar.z0 = ((org.telegram.messenger.gj) arrayList2.get(i11)).z0;
                        gjVar.K5(il0Var.L, true);
                        arrayList3.add(gjVar);
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    String B2 = org.telegram.messenger.w7.B(((org.telegram.messenger.gj) arrayList.get(i12)).F0());
                    if (B2 != null && B2.toLowerCase().contains(str)) {
                        org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(i10, ((org.telegram.messenger.gj) arrayList.get(i12)).k, false, false);
                        gjVar2.z0 = ((org.telegram.messenger.gj) arrayList.get(i12)).z0;
                        gjVar2.K5(il0Var.L, true);
                        arrayList4.add(gjVar2);
                    }
                }
                org.telegram.messenger.g0.h3(new cl0(il0Var, str, arrayList3, arrayList4));
                break;
            default:
                cv0 cv0Var = il0Var.a;
                if (str.equals(il0Var.M)) {
                    if (il0Var.r == 0) {
                        il0Var.O.b(0);
                    }
                    il0Var.e(arrayList2, arrayList, true);
                    if (il0Var.r == 0) {
                        cv0Var.e(false, true);
                        z70 z70Var = cv0Var.e;
                        cv0Var.d.setText(org.telegram.messenger.hd.M0(2131745800, null));
                        z70Var.setVisibility(0);
                        z70Var.setText(org.telegram.messenger.hd.M0(2131745807, null));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ cl0(il0 il0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.b = il0Var;
        this.d = arrayList;
        this.c = str;
        this.e = arrayList2;
    }
}
