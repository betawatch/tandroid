package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class nh implements mj {
    public final /* synthetic */ di a;

    public nh(di diVar) {
        this.a = diVar;
    }

    @Override // org.telegram.ui.Components.mj
    public final void A() {
        di diVar = this.a;
        mj mjVar = diVar.O1;
        if (mjVar != null) {
            mjVar.A();
            return;
        }
        Object obj = diVar.W1;
        if (obj instanceof mj) {
            ((mj) obj).A();
            return;
        }
        if (obj instanceof org.telegram.ui.dk0) {
            org.telegram.ui.dk0 dk0Var = (org.telegram.ui.dk0) obj;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                dk0Var.startActivityForResult(intent, 21);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.mj
    public final void S() {
        this.a.p1(true);
    }

    @Override // org.telegram.ui.Components.mj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z9, int i7, long j3, boolean z10, long j10) {
        di diVar = this.a;
        mj mjVar = diVar.O1;
        if (mjVar != null) {
            mjVar.n(arrayList, str, arrayList2, arrayList3, z9, i7, j3, z10, j10);
            return;
        }
        Object obj = diVar.W1;
        if (obj instanceof mj) {
            ((mj) obj).n(arrayList, str, arrayList2, arrayList3, z9, i7, j3, z10, j10);
            return;
        }
        if (obj instanceof org.telegram.ui.dk0) {
            org.telegram.ui.dk0 dk0Var = (org.telegram.ui.dk0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.fz fzVar = new org.telegram.messenger.fz();
                fzVar.c = (String) arrayList.get(i10);
                arrayList4.add(fzVar);
            }
            dk0Var.K1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.mj
    public final void p(ArrayList arrayList, boolean z9, int i7, long j3) {
        di diVar = this.a;
        mj mjVar = diVar.O1;
        if (mjVar != null) {
            mjVar.p(arrayList, z9, i7, j3);
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        if (f2Var instanceof org.telegram.ui.cn) {
            ((org.telegram.ui.cn) f2Var).p(arrayList, z9, i7, j3);
        } else if (f2Var instanceof org.telegram.ui.dk0) {
            ((org.telegram.ui.dk0) f2Var).K1(arrayList);
        }
    }
}
