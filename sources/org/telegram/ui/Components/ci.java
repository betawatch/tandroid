package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ci implements ak {
    public final /* synthetic */ si a;

    public ci(si siVar) {
        this.a = siVar;
    }

    @Override // org.telegram.ui.Components.ak
    public final void A() {
        si siVar = this.a;
        ak akVar = siVar.S1;
        if (akVar != null) {
            akVar.A();
            return;
        }
        Object obj = siVar.a2;
        if (obj instanceof ak) {
            ((ak) obj).A();
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

    @Override // org.telegram.ui.Components.ak
    public final void T() {
        this.a.q1(true);
    }

    @Override // org.telegram.ui.Components.ak
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        si siVar = this.a;
        ak akVar = siVar.S1;
        if (akVar != null) {
            akVar.n(arrayList, str, arrayList2, arrayList3, z10, i7, j3, z11, j10);
            return;
        }
        Object obj = siVar.a2;
        if (obj instanceof ak) {
            ((ak) obj).n(arrayList, str, arrayList2, arrayList3, z10, i7, j3, z11, j10);
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

    @Override // org.telegram.ui.Components.ak
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
        si siVar = this.a;
        ak akVar = siVar.S1;
        if (akVar != null) {
            akVar.p(arrayList, z10, i7, j3);
            return;
        }
        org.telegram.ui.ActionBar.h2 h2Var = siVar.a2;
        if (h2Var instanceof org.telegram.ui.bn) {
            ((org.telegram.ui.bn) h2Var).p(arrayList, z10, i7, j3);
        } else if (h2Var instanceof org.telegram.ui.hk0) {
            ((org.telegram.ui.hk0) h2Var).K1(arrayList);
        }
    }
}
