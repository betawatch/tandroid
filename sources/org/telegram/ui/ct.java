package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ct extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ContactsActivity a;

    public ct(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ContactsActivity contactsActivity = this.a;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.m2) contactsActivity).actionBar;
            if (kVar.t()) {
                contactsActivity.o0();
                return;
            } else {
                contactsActivity.finishFragment();
                return;
            }
        }
        if (i10 != 100) {
            if (i10 != 1) {
                if (i10 == 0) {
                    contactsActivity.f.x0(0);
                    AndroidUtilities.doOnPreDraw(contactsActivity.Z.r, new gj(this, 15));
                    return;
                }
                return;
            }
            SharedConfig.toggleSortContactsByName();
            boolean z10 = SharedConfig.sortContactsByName;
            contactsActivity.v = z10;
            contactsActivity.d.Y(z10 ? 1 : 2, false);
            contactsActivity.s.setIcon(contactsActivity.v ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity(), 0, contactsActivity.getResourceProvider());
        a0.h hVar = contactsActivity.d0;
        if (hVar.m() == 1) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteContactTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.DeleteContactSubtitle);
        } else {
            alertDialog$Builder.a.R = LocaleController.formatPluralString("DeleteContactsTitle", hVar.m(), new Object[0]);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.DeleteContactsSubtitle);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zs(contactsActivity));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.co0(17));
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        a2Var.show();
        a2Var.h();
    }
}
