package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ms implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ek0, org.telegram.ui.Components.rk0, r0.o {
    public final /* synthetic */ ContactsActivity a;

    public /* synthetic */ ms(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        ContactsActivity contactsActivity = this.a;
        contactsActivity.m0 = i10;
        contactsActivity.j0();
        contactsActivity.i0();
        contactsActivity.h0();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        ContactsActivity contactsActivity = this.a;
        f2.q0 adapter = contactsActivity.f.getAdapter();
        rs rsVar = contactsActivity.d;
        if (adapter == rsVar) {
            int S = rsVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.w;
            if (ecVar != null) {
                ecVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.G;
        if (!z10 && !contactsActivity.H && (view instanceof org.telegram.ui.Cells.sa)) {
            contactsActivity.r0((org.telegram.ui.Cells.sa) view);
            return true;
        }
        if (z10 || contactsActivity.H || !(view instanceof org.telegram.ui.Cells.e6)) {
            return false;
        }
        org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
        if (e6Var.getUser() != null && e6Var.getUser().contact) {
            contactsActivity.r0(e6Var);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public void b() {
        this.a.g0();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ContactsActivity contactsActivity = this.a;
        contactsActivity.getClass();
        a0.h hVar = contactsActivity.Z;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hVar.m());
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.o0();
    }
}
