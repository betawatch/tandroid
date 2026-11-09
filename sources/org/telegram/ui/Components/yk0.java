package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yk0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ el0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ yk0(el0 el0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.b = el0Var;
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
        el0 el0Var = this.b;
        switch (i7) {
            case 0:
                int i10 = el0Var.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    String B = org.telegram.messenger.w7.B(((org.telegram.messenger.ij) arrayList2.get(i11)).F0());
                    if (B != null && B.toLowerCase().contains(str)) {
                        org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(i10, ((org.telegram.messenger.ij) arrayList2.get(i11)).k, false, false);
                        ijVar.x0 = ((org.telegram.messenger.ij) arrayList2.get(i11)).x0;
                        ijVar.K5(el0Var.K, true);
                        arrayList3.add(ijVar);
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    String B2 = org.telegram.messenger.w7.B(((org.telegram.messenger.ij) arrayList.get(i12)).F0());
                    if (B2 != null && B2.toLowerCase().contains(str)) {
                        org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(i10, ((org.telegram.messenger.ij) arrayList.get(i12)).k, false, false);
                        ijVar2.x0 = ((org.telegram.messenger.ij) arrayList.get(i12)).x0;
                        ijVar2.K5(el0Var.K, true);
                        arrayList4.add(ijVar2);
                    }
                }
                org.telegram.messenger.g0.h3(new yk0(el0Var, str, arrayList3, arrayList4));
                break;
            default:
                cv0 cv0Var = el0Var.a;
                if (str.equals(el0Var.L)) {
                    if (el0Var.r == 0) {
                        el0Var.N.b(0);
                    }
                    el0Var.e(arrayList2, arrayList, true);
                    if (el0Var.r == 0) {
                        cv0Var.e(false, true);
                        x70 x70Var = cv0Var.e;
                        cv0Var.d.setText(org.telegram.messenger.id.M0(2131745800, null));
                        x70Var.setVisibility(0);
                        x70Var.setText(org.telegram.messenger.id.M0(2131745807, null));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ yk0(el0 el0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.b = el0Var;
        this.d = arrayList;
        this.c = str;
        this.e = arrayList2;
    }
}
