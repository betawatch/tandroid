package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class os extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ContactsActivity a;

    public os(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        org.telegram.ui.ActionBar.k kVar;
        ContactsActivity contactsActivity = this.a;
        if (i9 == -1) {
            kVar = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
            if (kVar.s()) {
                contactsActivity.n0();
                return;
            } else {
                contactsActivity.finishFragment();
                return;
            }
        }
        if (i9 != 100) {
            if (i9 != 1) {
                if (i9 == 0) {
                    contactsActivity.f.x0(0);
                    AndroidUtilities.doOnPreDraw(contactsActivity.V.r, new ri(this, 14));
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
        a0.h hVar = contactsActivity.Z;
        if (hVar.m() == 1) {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteContactTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.DeleteContactSubtitle);
        } else {
            alertDialog$Builder.a.N = LocaleController.formatPluralString("DeleteContactsTitle", hVar.m(), new Object[0]);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.DeleteContactsSubtitle);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ls(contactsActivity));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.if0(19));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.show();
        c2Var.h();
    }
}
