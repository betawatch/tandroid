package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class po extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public oo f;
    public final /* synthetic */ qo h;

    public po(qo qoVar, Context context) {
        this.h = qoVar;
        this.c = context;
    }

    public static void E(po poVar, ArrayList arrayList, ArrayList arrayList2) {
        qo qoVar = poVar.h;
        if (qoVar.O) {
            poVar.d = arrayList;
            poVar.e = arrayList2;
            if (qoVar.b.getAdapter() == qoVar.e) {
                qoVar.d.c();
            }
            super.f();
        }
    }

    @Override // u4.h0
    public final void A(u4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f != 1;
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
            org.telegram.messenger.p5 p5Var = Utilities.g;
            oo ooVar = new oo(this, str, 0);
            this.f = ooVar;
            p5Var.e(ooVar, 300L);
        }
    }

    @Override // u4.h0
    public final int b() {
        return this.d.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        return 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i3);
        String K = org.telegram.messenger.t3.K(chat, false);
        CharSequence charSequence = (CharSequence) this.e.get(i3);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(K)) {
            if (charSequence.toString().startsWith("@" + K)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) d1Var.a;
        a5Var.setTag(Integer.valueOf(i3));
        a5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.c, 6, 2, false, null);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, a5Var, null);
        return new org.telegram.ui.Components.bj0(a5Var);
    }
}
