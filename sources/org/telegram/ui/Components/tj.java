package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class tj extends im0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public sj f;
    public int h;
    public final /* synthetic */ xj n;

    public tj(xj xjVar, Context context) {
        this.n = xjVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 0;
    }

    public final Object E(int i10) {
        int i11 = i10 - 1;
        if (i11 < 0 || i11 >= this.d.size()) {
            return null;
        }
        return this.d.get(i11);
    }

    @Override // s4.g0
    public final int h() {
        return this.d.size() + 2;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == h() - 1 ? 2 : 0;
    }

    @Override // s4.g0
    public final void l() {
        super.l();
        this.n.Q();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        TLRPC.User user;
        if (b1Var.f == 0) {
            wj wjVar = (wj) b1Var.a;
            boolean z10 = i10 != h() + (-2);
            Object E = E(i10);
            if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                user = contact.user;
                if (user == null) {
                    wjVar.setCurrentId(contact.contact_id);
                    wjVar.a(null, (CharSequence) this.e.get(i10 - 1), new pj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                wjVar.a(user, (CharSequence) this.e.get(i10 - 1), new qj(1, user), z10);
            }
            boolean containsKey = this.n.w.containsKey(nj.a(E));
            xp xpVar = wjVar.d;
            if (xpVar.getVisibility() != 0) {
                xpVar.setVisibility(0);
            }
            xpVar.a(containsKey, false);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View wjVar;
        Context context = this.c;
        if (i10 == 0) {
            wjVar = new wj(context, this.n.a);
        } else if (i10 != 1) {
            wjVar = new View(context);
            wjVar.setTag(-33024);
        } else {
            wjVar = new View(context);
            wjVar.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
            wjVar.setTag(-33024);
        }
        return new tl0(wjVar);
    }
}
