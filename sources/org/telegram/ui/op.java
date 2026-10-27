package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class op extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public np f;
    public final /* synthetic */ pp h;

    public op(pp ppVar, Context context) {
        this.h = ppVar;
        this.c = context;
    }

    public static void E(op opVar, ArrayList arrayList, ArrayList arrayList2) {
        pp ppVar = opVar.h;
        if (ppVar.N) {
            opVar.d = arrayList;
            opVar.e = arrayList2;
            if (ppVar.b.getAdapter() == ppVar.e) {
                ppVar.d.c();
            }
            super.l();
        }
    }

    @Override // s4.h0
    public final void A(s4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.f5) {
            ((org.telegram.ui.Cells.f5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f != 1;
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.clear();
            this.e.clear();
            super.l();
        } else {
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            np npVar = new np(this, str, 0);
            this.f = npVar;
            dispatchQueue2.postRunnable(npVar, 300L);
        }
    }

    @Override // s4.h0
    public final int h() {
        return this.d.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i10);
        String publicUsername = ChatObject.getPublicUsername(chat);
        CharSequence charSequence = (CharSequence) this.e.get(i10);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
            if (charSequence.toString().startsWith("@" + publicUsername)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) e1Var.a;
        f5Var.setTag(Integer.valueOf(i10));
        f5Var.c(chat, charSequence, charSequence2, false);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.f5 f5Var = new org.telegram.ui.Cells.f5(6, 2, this.c, null, false);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, f5Var, null);
        return new org.telegram.ui.Components.wl0(f5Var);
    }
}
