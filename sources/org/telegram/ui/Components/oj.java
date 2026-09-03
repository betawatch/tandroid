package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class oj extends rl0 {
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

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 0;
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
        this.n.N();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        TLRPC.User user;
        if (m1Var.f == 0) {
            rj rjVar = (rj) m1Var.a;
            boolean z4 = i10 != h() + (-2);
            Object E = E(i10);
            if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                user = contact.user;
                if (user == null) {
                    rjVar.setCurrentId(contact.contact_id);
                    rjVar.a(null, (CharSequence) this.e.get(i10 - 1), new jj(contact, 1), z4);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                rjVar.a(user, (CharSequence) this.e.get(i10 - 1), new kj(1, user), z4);
            }
            boolean containsKey = this.n.w.containsKey(hj.a(E));
            np npVar = rjVar.d;
            if (npVar.getVisibility() != 0) {
                npVar.setVisibility(0);
            }
            npVar.a(containsKey, false);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
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
        return new el0(rjVar);
    }
}
