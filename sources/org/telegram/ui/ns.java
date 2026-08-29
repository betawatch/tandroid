package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ns extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ContactsActivity a;

    public ns(ContactsActivity contactsActivity) {
        this.a = contactsActivity;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        org.telegram.ui.ActionBar.l lVar;
        ContactsActivity contactsActivity = this.a;
        if (i10 == -1) {
            lVar = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
            if (lVar.s()) {
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
                    AndroidUtilities.doOnPreDraw(contactsActivity.V.r, new ui(this, 14));
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
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ks(contactsActivity));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.xo0(13));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.show();
        c2Var.h();
    }
}
