package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pp extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public op f;
    public final /* synthetic */ qp h;

    public pp(qp qpVar, Context context) {
        this.h = qpVar;
        this.c = context;
    }

    public static void E(pp ppVar, ArrayList arrayList, ArrayList arrayList2) {
        qp qpVar = ppVar.h;
        if (qpVar.N) {
            ppVar.d = arrayList;
            ppVar.e = arrayList2;
            if (qpVar.b.getAdapter() == qpVar.e) {
                qpVar.d.c();
            }
            super.f();
        }
    }

    @Override // s4.g0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f != 1;
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.f();
        } else {
            org.telegram.messenger.r5 r5Var = Utilities.g;
            op opVar = new op(this, str, 0);
            this.f = opVar;
            r5Var.d(opVar, 300L);
        }
    }

    @Override // s4.g0
    public final int b() {
        return this.d.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        return 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i10);
        String K = org.telegram.messenger.w3.K(chat, false);
        CharSequence charSequence = (CharSequence) this.e.get(i10);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(K)) {
            if (charSequence.toString().startsWith("@" + K)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) c1Var.a;
        e5Var.setTag(Integer.valueOf(i10));
        e5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.e5 e5Var = new org.telegram.ui.Cells.e5(6, 2, this.c, null, false);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, e5Var, null);
        return new org.telegram.ui.Components.ck0(e5Var);
    }
}
