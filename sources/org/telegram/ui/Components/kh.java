package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kh implements lj {
    public final /* synthetic */ bi a;

    public kh(bi biVar) {
        this.a = biVar;
    }

    @Override // org.telegram.ui.Components.lj
    public final void A() {
        bi biVar = this.a;
        lj ljVar = biVar.P1;
        if (ljVar != null) {
            ljVar.A();
            return;
        }
        Object obj = biVar.X1;
        if (obj instanceof lj) {
            ((lj) obj).A();
            return;
        }
        if (obj instanceof org.telegram.ui.yj0) {
            org.telegram.ui.yj0 yj0Var = (org.telegram.ui.yj0) obj;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                yj0Var.startActivityForResult(intent, 21);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.lj
    public final void S() {
        this.a.p1(true);
    }

    @Override // org.telegram.ui.Components.lj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i3, long j10, boolean z11, long j11) {
        bi biVar = this.a;
        lj ljVar = biVar.P1;
        if (ljVar != null) {
            ljVar.n(arrayList, str, arrayList2, arrayList3, z10, i3, j10, z11, j11);
            return;
        }
        Object obj = biVar.X1;
        if (obj instanceof lj) {
            ((lj) obj).n(arrayList, str, arrayList2, arrayList3, z10, i3, j10, z11, j11);
            return;
        }
        if (obj instanceof org.telegram.ui.yj0) {
            org.telegram.ui.yj0 yj0Var = (org.telegram.ui.yj0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.xy xyVar = new org.telegram.messenger.xy();
                xyVar.c = (String) arrayList.get(i10);
                arrayList4.add(xyVar);
            }
            yj0Var.K1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.lj
    public final void p(ArrayList arrayList, boolean z10, int i3, long j10) {
        bi biVar = this.a;
        lj ljVar = biVar.P1;
        if (ljVar != null) {
            ljVar.p(arrayList, z10, i3, j10);
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            ((org.telegram.ui.wm) d2Var).p(arrayList, z10, i3, j10);
        } else if (d2Var instanceof org.telegram.ui.yj0) {
            ((org.telegram.ui.yj0) d2Var).K1(arrayList);
        }
    }
}
