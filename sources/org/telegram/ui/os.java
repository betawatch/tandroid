package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class os implements org.telegram.ui.Components.cm0, r0.n, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ ContactsActivity a;

    public /* synthetic */ os(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.d;
        ContactsActivity contactsActivity = this.a;
        contactsActivity.k0 = i10;
        oi.a.d(contactsActivity.d, defaultWindowInsets.b, i10, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), contactsActivity.h0);
        contactsActivity.f0();
        contactsActivity.e0();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        ContactsActivity contactsActivity = this.a;
        s4.h0 adapter = contactsActivity.d.getAdapter();
        qs qsVar = contactsActivity.b;
        if (adapter == qsVar) {
            int S = qsVar.S(i10);
            int Q = contactsActivity.b.Q(i10);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.x;
            if (qcVar != null) {
                qcVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.I;
        if (!z10 && !contactsActivity.J && (view instanceof org.telegram.ui.Cells.ab)) {
            contactsActivity.l0((org.telegram.ui.Cells.ab) view);
            return true;
        }
        if (z10 || contactsActivity.J || !(view instanceof org.telegram.ui.Cells.m6)) {
            return false;
        }
        org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
        if (m6Var.getUser() != null && m6Var.getUser().contact) {
            contactsActivity.l0(m6Var);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        ContactsActivity contactsActivity = this.a;
        contactsActivity.getClass();
        a0.h hVar = contactsActivity.Z;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hVar.m());
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.i0();
    }
}
