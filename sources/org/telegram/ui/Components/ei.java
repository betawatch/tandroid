package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ei implements ck {
    public final /* synthetic */ ui a;

    public ei(ui uiVar) {
        this.a = uiVar;
    }

    @Override // org.telegram.ui.Components.ck
    public final void A() {
        ui uiVar = this.a;
        ck ckVar = uiVar.S1;
        if (ckVar != null) {
            ckVar.A();
            return;
        }
        Object obj = uiVar.a2;
        if (obj instanceof ck) {
            ((ck) obj).A();
            return;
        }
        if (obj instanceof org.telegram.ui.hk0) {
            org.telegram.ui.hk0 hk0Var = (org.telegram.ui.hk0) obj;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                hk0Var.startActivityForResult(intent, 21);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ck
    public final void T() {
        this.a.q1(true);
    }

    @Override // org.telegram.ui.Components.ck
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        ui uiVar = this.a;
        ck ckVar = uiVar.S1;
        if (ckVar != null) {
            ckVar.n(arrayList, str, arrayList2, arrayList3, z10, i7, j3, z11, j10);
            return;
        }
        Object obj = uiVar.a2;
        if (obj instanceof ck) {
            ((ck) obj).n(arrayList, str, arrayList2, arrayList3, z10, i7, j3, z11, j10);
            return;
        }
        if (obj instanceof org.telegram.ui.hk0) {
            org.telegram.ui.hk0 hk0Var = (org.telegram.ui.hk0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.yy yyVar = new org.telegram.messenger.yy();
                yyVar.c = (String) arrayList.get(i10);
                arrayList4.add(yyVar);
            }
            hk0Var.K1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.ck
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
        ui uiVar = this.a;
        ck ckVar = uiVar.S1;
        if (ckVar != null) {
            ckVar.p(arrayList, z10, i7, j3);
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            ((org.telegram.ui.bn) g2Var).p(arrayList, z10, i7, j3);
        } else if (g2Var instanceof org.telegram.ui.hk0) {
            ((org.telegram.ui.hk0) g2Var).K1(arrayList);
        }
    }
}
