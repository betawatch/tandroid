package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mj extends ql0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public kj f;
    public int h;
    public final /* synthetic */ qj n;

    public mj(qj qjVar, Context context) {
        this.n = qjVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 0;
    }

    public final Object E(int i10) {
        int i11 = i10 - 1;
        if (i11 < 0 || i11 >= this.d.size()) {
            return null;
        }
        return this.d.get(i11);
    }

    @Override // f2.o0
    public final int h() {
        return this.d.size() + 2;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == h() - 1 ? 2 : 0;
    }

    @Override // f2.o0
    public final void l() {
        super.l();
        this.n.N();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        TLRPC.User user;
        if (l1Var.f == 0) {
            pj pjVar = (pj) l1Var.a;
            boolean z4 = i10 != h() + (-2);
            Object E = E(i10);
            if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                user = contact.user;
                if (user == null) {
                    pjVar.setCurrentId(contact.contact_id);
                    pjVar.a(null, (CharSequence) this.e.get(i10 - 1), new hj(contact, 1), z4);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                pjVar.a(user, (CharSequence) this.e.get(i10 - 1), new ij(1, user), z4);
            }
            boolean containsKey = this.n.w.containsKey(fj.a(E));
            kp kpVar = pjVar.d;
            if (kpVar.getVisibility() != 0) {
                kpVar.setVisibility(0);
            }
            kpVar.a(containsKey, false);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View pjVar;
        Context context = this.c;
        if (i10 == 0) {
            pjVar = new pj(context, this.n.a);
        } else if (i10 != 1) {
            pjVar = new View(context);
            pjVar.setTag(-33024);
        } else {
            pjVar = new View(context);
            pjVar.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
            pjVar.setTag(-33024);
        }
        return new dl0(pjVar);
    }
}
