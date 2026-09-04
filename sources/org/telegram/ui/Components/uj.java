package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class uj extends kl0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public tj f;
    public int h;
    public final /* synthetic */ yj n;

    public uj(yj yjVar, Context context) {
        this.n = yjVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    public final Object E(int i10) {
        int i11 = i10 - 1;
        if (i11 < 0 || i11 >= this.d.size()) {
            return null;
        }
        return this.d.get(i11);
    }

    @Override // s4.h0
    public final int h() {
        return this.d.size() + 2;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == h() - 1 ? 2 : 0;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        this.n.N();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.User user;
        if (c1Var.f == 0) {
            xj xjVar = (xj) c1Var.a;
            boolean z10 = i10 != h() + (-2);
            Object E = E(i10);
            if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                user = contact.user;
                if (user == null) {
                    xjVar.setCurrentId(contact.contact_id);
                    xjVar.a(null, (CharSequence) this.e.get(i10 - 1), new qj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                xjVar.a(user, (CharSequence) this.e.get(i10 - 1), new rj(1, user), z10);
            }
            boolean containsKey = this.n.w.containsKey(oj.a(E));
            mp mpVar = xjVar.d;
            if (mpVar.getVisibility() != 0) {
                mpVar.setVisibility(0);
            }
            mpVar.a(containsKey, false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View xjVar;
        Context context = this.c;
        if (i10 == 0) {
            xjVar = new xj(context, this.n.a);
        } else if (i10 != 1) {
            xjVar = new View(context);
            xjVar.setTag(-33024);
        } else {
            xjVar = new View(context);
            xjVar.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
            xjVar.setTag(-33024);
        }
        return new vk0(xjVar);
    }
}
