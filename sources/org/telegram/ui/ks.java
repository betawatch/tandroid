package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ks implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.nk0, org.telegram.ui.Components.bl0, r0.o {
    public final /* synthetic */ ContactsActivity a;

    public /* synthetic */ ks(ContactsActivity contactsActivity) {
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

    @Override // org.telegram.ui.Components.nk0
    public void a() {
        this.a.g0();
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        ContactsActivity contactsActivity = this.a;
        f2.p0 adapter = contactsActivity.f.getAdapter();
        ps psVar = contactsActivity.d;
        if (adapter == psVar) {
            int S = psVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.w;
            if (mcVar != null) {
                mcVar.b();
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
        if (z10 || contactsActivity.H || !(view instanceof org.telegram.ui.Cells.f6)) {
            return false;
        }
        org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
        if (f6Var.getUser() != null && f6Var.getUser().contact) {
            contactsActivity.r0(f6Var);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
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
