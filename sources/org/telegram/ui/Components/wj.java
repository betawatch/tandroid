package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class wj extends xl0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public vj f;
    public int h;
    public final /* synthetic */ ak n;

    public wj(ak akVar, Context context) {
        this.n = akVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.xl0
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
            zj zjVar = (zj) c1Var.a;
            boolean z10 = i10 != h() + (-2);
            Object E = E(i10);
            if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                user = contact.user;
                if (user == null) {
                    zjVar.setCurrentId(contact.contact_id);
                    zjVar.a(null, (CharSequence) this.e.get(i10 - 1), new sj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                zjVar.a(user, (CharSequence) this.e.get(i10 - 1), new tj(1, user), z10);
            }
            boolean containsKey = this.n.w.containsKey(qj.a(E));
            pp ppVar = zjVar.d;
            if (ppVar.getVisibility() != 0) {
                ppVar.setVisibility(0);
            }
            ppVar.a(containsKey, false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View zjVar;
        Context context = this.c;
        if (i10 == 0) {
            zjVar = new zj(context, this.n.a);
        } else if (i10 != 1) {
            zjVar = new View(context);
            zjVar.setTag(-33024);
        } else {
            zjVar = new View(context);
            zjVar.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
            zjVar.setTag(-33024);
        }
        return new il0(zjVar);
    }
}
