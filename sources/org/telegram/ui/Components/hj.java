package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hj extends yk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public fj f;
    public int h;
    public final /* synthetic */ lj n;

    public hj(lj ljVar, Context context) {
        this.n = ljVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f == 0;
    }

    public final Object E(int i10) {
        int i11 = i10 - 1;
        if (i11 < 0 || i11 >= this.d.size()) {
            return null;
        }
        return this.d.get(i11);
    }

    @Override // f2.q0
    public final int h() {
        return this.d.size() + 2;
    }

    @Override // f2.q0
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == h() - 1 ? 2 : 0;
    }

    @Override // f2.q0
    public final void l() {
        super.l();
        this.n.N();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.User user;
        if (o1Var.f == 0) {
            kj kjVar = (kj) o1Var.a;
            boolean z10 = i10 != h() + (-2);
            Object E = E(i10);
            if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                user = contact.user;
                if (user == null) {
                    kjVar.setCurrentId(contact.contact_id);
                    kjVar.a(null, (CharSequence) this.e.get(i10 - 1), new cj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                kjVar.a(user, (CharSequence) this.e.get(i10 - 1), new dj(1, user), z10);
            }
            boolean containsKey = this.n.w.containsKey(aj.a(E));
            bp bpVar = kjVar.d;
            if (bpVar.getVisibility() != 0) {
                bpVar.setVisibility(0);
            }
            bpVar.a(containsKey, false);
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View kjVar;
        Context context = this.c;
        if (i10 == 0) {
            kjVar = new kj(context, this.n.a);
        } else if (i10 != 1) {
            kjVar = new View(context);
            kjVar.setTag(-33024);
        } else {
            kjVar = new View(context);
            kjVar.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(56.0f)));
            kjVar.setTag(-33024);
        }
        return new lk0(kjVar);
    }
}
