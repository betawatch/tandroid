package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class xj extends ul0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public wj f;
    public int h;
    public final /* synthetic */ bk n;

    public xj(bk bkVar, Context context) {
        this.n = bkVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
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
            ak akVar = (ak) c1Var.a;
            boolean z10 = i10 != h() + (-2);
            Object E = E(i10);
            if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                user = contact.user;
                if (user == null) {
                    akVar.setCurrentId(contact.contact_id);
                    akVar.a(null, (CharSequence) this.e.get(i10 - 1), new tj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                akVar.a(user, (CharSequence) this.e.get(i10 - 1), new uj(1, user), z10);
            }
            boolean containsKey = this.n.w.containsKey(rj.a(E));
            tp tpVar = akVar.d;
            if (tpVar.getVisibility() != 0) {
                tpVar.setVisibility(0);
            }
            tpVar.a(containsKey, false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View akVar;
        Context context = this.c;
        if (i10 == 0) {
            akVar = new ak(context, this.n.a);
        } else if (i10 != 1) {
            akVar = new View(context);
            akVar.setTag(-33024);
        } else {
            akVar = new View(context);
            akVar.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
            akVar.setTag(-33024);
        }
        return new fl0(akVar);
    }
}
