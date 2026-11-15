package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class uh implements tj {
    public final /* synthetic */ ki a;

    public uh(ki kiVar) {
        this.a = kiVar;
    }

    @Override // org.telegram.ui.Components.tj
    public final void A() {
        ki kiVar = this.a;
        tj tjVar = kiVar.S1;
        if (tjVar != null) {
            tjVar.A();
            return;
        }
        Object obj = kiVar.a2;
        if (obj instanceof tj) {
            ((tj) obj).A();
            return;
        }
        if (obj instanceof org.telegram.ui.ek0) {
            org.telegram.ui.ek0 ek0Var = (org.telegram.ui.ek0) obj;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                ek0Var.startActivityForResult(intent, 21);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.tj
    public final void T() {
        this.a.p1(true);
    }

    @Override // org.telegram.ui.Components.tj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        ki kiVar = this.a;
        tj tjVar = kiVar.S1;
        if (tjVar != null) {
            tjVar.n(arrayList, str, arrayList2, arrayList3, z10, i7, j3, z11, j10);
            return;
        }
        Object obj = kiVar.a2;
        if (obj instanceof tj) {
            ((tj) obj).n(arrayList, str, arrayList2, arrayList3, z10, i7, j3, z11, j10);
            return;
        }
        if (obj instanceof org.telegram.ui.ek0) {
            org.telegram.ui.ek0 ek0Var = (org.telegram.ui.ek0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.dz dzVar = new org.telegram.messenger.dz();
                dzVar.c = (String) arrayList.get(i10);
                arrayList4.add(dzVar);
            }
            ek0Var.K1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.tj
    public final void p(ArrayList arrayList, boolean z10, int i7, long j3) {
        ki kiVar = this.a;
        tj tjVar = kiVar.S1;
        if (tjVar != null) {
            tjVar.p(arrayList, z10, i7, j3);
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
        if (e2Var instanceof org.telegram.ui.an) {
            ((org.telegram.ui.an) e2Var).p(arrayList, z10, i7, j3);
        } else if (e2Var instanceof org.telegram.ui.ek0) {
            ((org.telegram.ui.ek0) e2Var).K1(arrayList);
        }
    }
}
