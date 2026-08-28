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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gp extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public fp f;
    public final /* synthetic */ hp h;

    public gp(hp hpVar, Context context) {
        this.h = hpVar;
        this.c = context;
    }

    public static void E(gp gpVar, ArrayList arrayList, ArrayList arrayList2) {
        hp hpVar = gpVar.h;
        if (hpVar.J) {
            gpVar.d = arrayList;
            gpVar.e = arrayList2;
            if (hpVar.b.getAdapter() == hpVar.e) {
                hpVar.d.c();
            }
            super.l();
        }
    }

    @Override // f2.r0
    public final void A(f2.q1 q1Var) {
        View view = q1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f != 1;
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
            fp fpVar = new fp(this, str, 0);
            this.f = fpVar;
            dispatchQueue.postRunnable(fpVar, 300L);
        }
    }

    @Override // f2.r0
    public final int h() {
        return this.d.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.Chat chat = (TLRPC.Chat) this.d.get(i9);
        String publicUsername = ChatObject.getPublicUsername(chat);
        CharSequence charSequence = (CharSequence) this.e.get(i9);
        CharSequence charSequence2 = null;
        if (charSequence != null && !TextUtils.isEmpty(publicUsername)) {
            if (charSequence.toString().startsWith("@" + publicUsername)) {
                charSequence2 = charSequence;
                charSequence = null;
            }
        }
        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) q1Var.a;
        b5Var.setTag(Integer.valueOf(i9));
        b5Var.b(chat, charSequence, charSequence2, false);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.b5 b5Var = new org.telegram.ui.Cells.b5(6, 2, this.c, null, false);
        b5Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        return new org.telegram.ui.Components.ik0(b5Var);
    }
}
