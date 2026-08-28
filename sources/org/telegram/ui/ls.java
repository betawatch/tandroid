package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ls implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.ck0, org.telegram.ui.Components.ok0, r0.o {
    public final /* synthetic */ ContactsActivity a;

    public /* synthetic */ ls(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        int i9 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        ContactsActivity contactsActivity = this.a;
        contactsActivity.m0 = i9;
        contactsActivity.i0();
        contactsActivity.h0();
        contactsActivity.g0();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        ContactsActivity contactsActivity = this.a;
        f2.r0 adapter = contactsActivity.f.getAdapter();
        qs qsVar = contactsActivity.d;
        if (adapter == qsVar) {
            int S = qsVar.S(i9);
            int Q = contactsActivity.d.Q(i9);
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.w;
            if (gcVar != null) {
                gcVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.G;
        if (!z10 && !contactsActivity.H && (view instanceof org.telegram.ui.Cells.va)) {
            contactsActivity.q0((org.telegram.ui.Cells.va) view);
            return true;
        }
        if (z10 || contactsActivity.H || !(view instanceof org.telegram.ui.Cells.h6)) {
            return false;
        }
        org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
        if (h6Var.getUser() != null && h6Var.getUser().contact) {
            contactsActivity.q0(h6Var);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ck0
    public void b() {
        this.a.f0();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        ContactsActivity contactsActivity = this.a;
        contactsActivity.getClass();
        a0.h hVar = contactsActivity.Z;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hVar.m());
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i10)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.n0();
    }
}
