package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ip extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public hp f;
    public final /* synthetic */ jp h;

    public ip(jp jpVar, Context context) {
        this.h = jpVar;
        this.c = context;
    }

    public static void E(ip ipVar, ArrayList arrayList, ArrayList arrayList2) {
        jp jpVar = ipVar.h;
        if (jpVar.J) {
            ipVar.d = arrayList;
            ipVar.e = arrayList2;
            if (jpVar.b.getAdapter() == jpVar.e) {
                jpVar.d.c();
            }
            super.l();
        }
    }

    @Override // f2.q0
    public final void A(f2.o1 o1Var) {
        View view = o1Var.a;
        if (view instanceof org.telegram.ui.Cells.y4) {
            ((org.telegram.ui.Cells.y4) view).a();
        }
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f != 1;
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
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            hp hpVar = new hp(this, str, 0);
            this.f = hpVar;
            dispatchQueue.postRunnable(hpVar, 300L);
        }
    }

    @Override // f2.q0
    public final int h() {
        return this.d.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
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
        org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) o1Var.a;
        y4Var.setTag(Integer.valueOf(i10));
        y4Var.b(chat, charSequence, charSequence2, false);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(6, 2, this.c, null, false);
        y4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        return new org.telegram.ui.Components.lk0(y4Var);
    }
}
