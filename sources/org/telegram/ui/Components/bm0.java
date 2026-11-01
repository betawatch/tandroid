package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bm0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ hm0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ bm0(hm0 hm0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.b = hm0Var;
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
        hm0 hm0Var = this.b;
        switch (i10) {
            case 0:
                int i11 = hm0Var.d;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    String B = org.telegram.messenger.b8.B(((org.telegram.messenger.kj) arrayList2.get(i12)).F0());
                    if (B != null && B.toLowerCase().contains(str)) {
                        org.telegram.messenger.kj kjVar = new org.telegram.messenger.kj(i11, ((org.telegram.messenger.kj) arrayList2.get(i12)).k, false, false);
                        kjVar.x0 = ((org.telegram.messenger.kj) arrayList2.get(i12)).x0;
                        kjVar.J5(hm0Var.K, true);
                        arrayList3.add(kjVar);
                    }
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    String B2 = org.telegram.messenger.b8.B(((org.telegram.messenger.kj) arrayList.get(i13)).F0());
                    if (B2 != null && B2.toLowerCase().contains(str)) {
                        org.telegram.messenger.kj kjVar2 = new org.telegram.messenger.kj(i11, ((org.telegram.messenger.kj) arrayList.get(i13)).k, false, false);
                        kjVar2.x0 = ((org.telegram.messenger.kj) arrayList.get(i13)).x0;
                        kjVar2.J5(hm0Var.K, true);
                        arrayList4.add(kjVar2);
                    }
                }
                org.telegram.messenger.i0.g3(new bm0(hm0Var, str, arrayList3, arrayList4));
                break;
            default:
                ew0 ew0Var = hm0Var.a;
                if (str.equals(hm0Var.L)) {
                    if (hm0Var.r == 0) {
                        hm0Var.N.b(0);
                    }
                    hm0Var.e(arrayList2, arrayList, true);
                    if (hm0Var.r == 0) {
                        ew0Var.e(false, true);
                        p80 p80Var = ew0Var.e;
                        ew0Var.d.setText(org.telegram.messenger.dd.L0(2131745817, null));
                        p80Var.setVisibility(0);
                        p80Var.setText(org.telegram.messenger.dd.L0(2131745824, null));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ bm0(hm0 hm0Var, ArrayList arrayList, String str, ArrayList arrayList2) {
        this.b = hm0Var;
        this.d = arrayList;
        this.c = str;
        this.e = arrayList2;
    }
}
