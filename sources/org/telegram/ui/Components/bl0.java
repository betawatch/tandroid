package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bl0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ hl0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ bl0(hl0 hl0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.b = hl0Var;
        this.c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.d;
        String str = this.c;
        hl0 hl0Var = this.b;
        switch (i3) {
            case 0:
                int i10 = hl0Var.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    String B = org.telegram.messenger.w7.B(((org.telegram.messenger.zi) arrayList2.get(i11)).F0());
                    if (B != null && B.toLowerCase().contains(str)) {
                        org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(i10, ((org.telegram.messenger.zi) arrayList2.get(i11)).k, false, false);
                        ziVar.x0 = ((org.telegram.messenger.zi) arrayList2.get(i11)).x0;
                        ziVar.L5(hl0Var.L, true);
                        arrayList3.add(ziVar);
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    String B2 = org.telegram.messenger.w7.B(((org.telegram.messenger.zi) arrayList.get(i12)).F0());
                    if (B2 != null && B2.toLowerCase().contains(str)) {
                        org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(i10, ((org.telegram.messenger.zi) arrayList.get(i12)).k, false, false);
                        ziVar2.x0 = ((org.telegram.messenger.zi) arrayList.get(i12)).x0;
                        ziVar2.L5(hl0Var.L, true);
                        arrayList4.add(ziVar2);
                    }
                }
                org.telegram.messenger.g0.h3(new bl0(hl0Var, str, arrayList3, arrayList4));
                break;
            default:
                zu0 zu0Var = hl0Var.a;
                if (str.equals(hl0Var.M)) {
                    if (hl0Var.r == 0) {
                        hl0Var.O.b(0);
                    }
                    hl0Var.e(arrayList2, arrayList, true);
                    if (hl0Var.r == 0) {
                        zu0Var.e(false, true);
                        s70 s70Var = zu0Var.e;
                        zu0Var.d.setText(org.telegram.messenger.bd.M0(2131745810, null));
                        s70Var.setVisibility(0);
                        s70Var.setText(org.telegram.messenger.bd.M0(2131745817, null));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ bl0(hl0 hl0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.b = hl0Var;
        this.d = arrayList;
        this.c = str;
        this.e = arrayList2;
    }
}
