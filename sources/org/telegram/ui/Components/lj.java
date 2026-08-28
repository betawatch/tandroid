package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lj extends vk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public jj f;
    public int h;
    public final /* synthetic */ pj n;

    public lj(pj pjVar, Context context) {
        this.n = pjVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 0;
    }

    public final Object E(int i9) {
        int i10 = i9 - 1;
        if (i10 < 0 || i10 >= this.d.size()) {
            return null;
        }
        return this.d.get(i10);
    }

    @Override // f2.r0
    public final int h() {
        return this.d.size() + 2;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 1;
        }
        return i9 == h() - 1 ? 2 : 0;
    }

    @Override // f2.r0
    public final void l() {
        super.l();
        this.n.M();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.User user;
        if (q1Var.f == 0) {
            oj ojVar = (oj) q1Var.a;
            boolean z10 = i9 != h() + (-2);
            Object E = E(i9);
            if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                user = contact.user;
                if (user == null) {
                    ojVar.setCurrentId(contact.contact_id);
                    ojVar.a(null, (CharSequence) this.e.get(i9 - 1), new gj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                ojVar.a(user, (CharSequence) this.e.get(i9 - 1), new hj(1, user), z10);
            }
            boolean containsKey = this.n.w.containsKey(ej.a(E));
            dp dpVar = ojVar.d;
            if (dpVar.getVisibility() != 0) {
                dpVar.setVisibility(0);
            }
            dpVar.a(containsKey, false);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View ojVar;
        Context context = this.c;
        if (i9 == 0) {
            ojVar = new oj(context, this.n.a);
        } else if (i9 != 1) {
            ojVar = new View(context);
            ojVar.setTag(-33024);
        } else {
            ojVar = new View(context);
            ojVar.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
            ojVar.setTag(-33024);
        }
        return new ik0(ojVar);
    }
}
