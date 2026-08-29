package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class oj extends il0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public mj f;
    public int h;
    public final /* synthetic */ sj n;

    public oj(sj sjVar, Context context) {
        this.n = sjVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f == 0;
    }

    public final Object E(int i10) {
        int i11 = i10 - 1;
        if (i11 < 0 || i11 >= this.d.size()) {
            return null;
        }
        return this.d.get(i11);
    }

    @Override // f2.p0
    public final int h() {
        return this.d.size() + 2;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == h() - 1 ? 2 : 0;
    }

    @Override // f2.p0
    public final void l() {
        super.l();
        this.n.M();
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        TLRPC.User user;
        if (n1Var.f == 0) {
            rj rjVar = (rj) n1Var.a;
            boolean z10 = i10 != h() + (-2);
            Object E = E(i10);
            if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                user = contact.user;
                if (user == null) {
                    rjVar.setCurrentId(contact.contact_id);
                    rjVar.a(null, (CharSequence) this.e.get(i10 - 1), new jj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                rjVar.a(user, (CharSequence) this.e.get(i10 - 1), new kj(1, user), z10);
            }
            boolean containsKey = this.n.w.containsKey(hj.a(E));
            hp hpVar = rjVar.d;
            if (hpVar.getVisibility() != 0) {
                hpVar.setVisibility(0);
            }
            hpVar.a(containsKey, false);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View rjVar;
        Context context = this.c;
        if (i10 == 0) {
            rjVar = new rj(context, this.n.a);
        } else if (i10 != 1) {
            rjVar = new View(context);
            rjVar.setTag(-33024);
        } else {
            rjVar = new View(context);
            rjVar.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
            rjVar.setTag(-33024);
        }
        return new vk0(rjVar);
    }
}
