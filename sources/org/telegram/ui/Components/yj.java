package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class yj extends pm0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public xj f;
    public int h;
    public final /* synthetic */ ck n;

    public yj(ck ckVar, Context context) {
        this.n = ckVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return d1Var.f == 0;
    }

    public final Object E(int i10) {
        int i11 = i10 - 1;
        if (i11 < 0 || i11 >= this.d.size()) {
            return null;
        }
        return this.d.get(i11);
    }

    @Override // s4.i0
    public final int h() {
        return this.d.size() + 2;
    }

    @Override // s4.i0
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == h() - 1 ? 2 : 0;
    }

    @Override // s4.i0
    public final void l() {
        super.l();
        this.n.Q();
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        TLRPC.User user;
        if (d1Var.f == 0) {
            bk bkVar = (bk) d1Var.a;
            boolean z10 = i10 != h() + (-2);
            Object E = E(i10);
            if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                user = contact.user;
                if (user == null) {
                    bkVar.setCurrentId(contact.contact_id);
                    bkVar.a(null, (CharSequence) this.e.get(i10 - 1), new uj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                bkVar.a(user, (CharSequence) this.e.get(i10 - 1), new vj(1, user), z10);
            }
            boolean containsKey = this.n.w.containsKey(sj.a(E));
            dq dqVar = bkVar.d;
            if (dqVar.getVisibility() != 0) {
                dqVar.setVisibility(0);
            }
            dqVar.a(containsKey, false);
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View bkVar;
        Context context = this.c;
        if (i10 == 0) {
            bkVar = new bk(context, this.n.a);
        } else if (i10 != 1) {
            bkVar = new View(context);
            bkVar.setTag(-33024);
        } else {
            bkVar = new View(context);
            bkVar.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
            bkVar.setTag(-33024);
        }
        return new am0(bkVar);
    }
}
