package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class vj extends vl0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public uj f;
    public int h;
    public final /* synthetic */ zj n;

    public vj(zj zjVar, Context context) {
        this.n = zjVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
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
            yj yjVar = (yj) c1Var.a;
            boolean z10 = i10 != h() + (-2);
            Object E = E(i10);
            if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                user = contact.user;
                if (user == null) {
                    yjVar.setCurrentId(contact.contact_id);
                    yjVar.a(null, (CharSequence) this.e.get(i10 - 1), new rj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                yjVar.a(user, (CharSequence) this.e.get(i10 - 1), new sj(1, user), z10);
            }
            boolean containsKey = this.n.w.containsKey(pj.a(E));
            op opVar = yjVar.d;
            if (opVar.getVisibility() != 0) {
                opVar.setVisibility(0);
            }
            opVar.a(containsKey, false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View yjVar;
        Context context = this.c;
        if (i10 == 0) {
            yjVar = new yj(context, this.n.a);
        } else if (i10 != 1) {
            yjVar = new View(context);
            yjVar.setTag(-33024);
        } else {
            yjVar = new View(context);
            yjVar.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
            yjVar.setTag(-33024);
        }
        return new gl0(yjVar);
    }
}
