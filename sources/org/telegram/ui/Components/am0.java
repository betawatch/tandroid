package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class am0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gm0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ am0(gm0 gm0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.b = gm0Var;
        this.c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.d;
        String str = this.c;
        gm0 gm0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = gm0Var.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    String B = org.telegram.messenger.b8.B(((org.telegram.messenger.jj) arrayList2.get(i12)).F0());
                    if (B != null && B.toLowerCase().contains(str)) {
                        org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(i11, ((org.telegram.messenger.jj) arrayList2.get(i12)).k, false, false);
                        jjVar.x0 = ((org.telegram.messenger.jj) arrayList2.get(i12)).x0;
                        jjVar.J5(gm0Var.K, true);
                        arrayList3.add(jjVar);
                    }
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    String B2 = org.telegram.messenger.b8.B(((org.telegram.messenger.jj) arrayList.get(i13)).F0());
                    if (B2 != null && B2.toLowerCase().contains(str)) {
                        org.telegram.messenger.jj jjVar2 = new org.telegram.messenger.jj(i11, ((org.telegram.messenger.jj) arrayList.get(i13)).k, false, false);
                        jjVar2.x0 = ((org.telegram.messenger.jj) arrayList.get(i13)).x0;
                        jjVar2.J5(gm0Var.K, true);
                        arrayList4.add(jjVar2);
                    }
                }
                org.telegram.messenger.i0.g3(new am0(gm0Var, str, arrayList3, arrayList4));
                break;
            default:
                dw0 dw0Var = gm0Var.a;
                if (str.equals(gm0Var.L)) {
                    if (gm0Var.r == 0) {
                        gm0Var.N.b(0);
                    }
                    gm0Var.e(arrayList2, arrayList, true);
                    if (gm0Var.r == 0) {
                        dw0Var.e(false, true);
                        p80 p80Var = dw0Var.e;
                        dw0Var.d.setText(org.telegram.messenger.cd.L0(2131745817, null));
                        p80Var.setVisibility(0);
                        p80Var.setText(org.telegram.messenger.cd.L0(2131745824, null));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ am0(gm0 gm0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.b = gm0Var;
        this.d = arrayList;
        this.c = str;
        this.e = arrayList2;
    }
}
