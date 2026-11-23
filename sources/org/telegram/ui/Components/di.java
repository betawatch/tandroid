package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class di implements bk {
    public final /* synthetic */ ti a;

    public di(ti tiVar) {
        this.a = tiVar;
    }

    @Override // org.telegram.ui.Components.bk
    public final void A() {
        ti tiVar = this.a;
        bk bkVar = tiVar.S1;
        if (bkVar != null) {
            bkVar.A();
            return;
        }
        Object obj = tiVar.a2;
        if (obj instanceof bk) {
            ((bk) obj).A();
            return;
        }
        if (obj instanceof org.telegram.ui.fk0) {
            org.telegram.ui.fk0 fk0Var = (org.telegram.ui.fk0) obj;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                fk0Var.startActivityForResult(intent, 21);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.bk
    public final void T() {
        this.a.q1(true);
    }

    @Override // org.telegram.ui.Components.bk
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        ti tiVar = this.a;
        bk bkVar = tiVar.S1;
        if (bkVar != null) {
            bkVar.n(arrayList, str, arrayList2, arrayList3, z10, i7, j3, z11, j10);
            return;
        }
        Object obj = tiVar.a2;
        if (obj instanceof bk) {
            ((bk) obj).n(arrayList, str, arrayList2, arrayList3, z10, i7, j3, z11, j10);
            return;
        }
        if (obj instanceof org.telegram.ui.fk0) {
            org.telegram.ui.fk0 fk0Var = (org.telegram.ui.fk0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.yy yyVar = new org.telegram.messenger.yy();
                yyVar.c = (String) arrayList.get(i10);
                arrayList4.add(yyVar);
            }
            fk0Var.K1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.bk
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
        ti tiVar = this.a;
        bk bkVar = tiVar.S1;
        if (bkVar != null) {
            bkVar.p(arrayList, z10, i7, j3);
            return;
        }
        org.telegram.ui.ActionBar.g2 g2Var = tiVar.a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            ((org.telegram.ui.bn) g2Var).p(arrayList, z10, i7, j3);
        } else if (g2Var instanceof org.telegram.ui.fk0) {
            ((org.telegram.ui.fk0) g2Var).K1(arrayList);
        }
    }
}
