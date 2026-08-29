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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jp extends org.telegram.ui.Components.il0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public ip f;
    public final /* synthetic */ kp h;

    public jp(kp kpVar, Context context) {
        this.h = kpVar;
        this.c = context;
    }

    public static void E(jp jpVar, ArrayList arrayList, ArrayList arrayList2) {
        kp kpVar = jpVar.h;
        if (kpVar.J) {
            jpVar.d = arrayList;
            jpVar.e = arrayList2;
            if (kpVar.b.getAdapter() == kpVar.e) {
                kpVar.d.c();
            }
            super.l();
        }
    }

    @Override // f2.p0
    public final void A(f2.n1 n1Var) {
        View view = n1Var.a;
        if (view instanceof org.telegram.ui.Cells.z4) {
            ((org.telegram.ui.Cells.z4) view).a();
        }
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f != 1;
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
            ip ipVar = new ip(this, str, 0);
            this.f = ipVar;
            dispatchQueue.postRunnable(ipVar, 300L);
        }
    }

    @Override // f2.p0
    public final int h() {
        return this.d.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
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
        org.telegram.ui.Cells.z4 z4Var = (org.telegram.ui.Cells.z4) n1Var.a;
        z4Var.setTag(Integer.valueOf(i10));
        z4Var.b(chat, charSequence, charSequence2, false);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z4 z4Var = new org.telegram.ui.Cells.z4(6, 2, this.c, null, false);
        z4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        return new org.telegram.ui.Components.vk0(z4Var);
    }
}
