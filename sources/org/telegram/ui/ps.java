package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ps extends s4.u0 {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ContactsActivity c;

    public ps(ContactsActivity contactsActivity) {
        this.c = contactsActivity;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 != 1) {
            this.b = false;
            return;
        }
        ContactsActivity contactsActivity = this.c;
        if (contactsActivity.y && contactsActivity.x) {
            AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
        }
        this.b = true;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ContactsActivity contactsActivity = this.c;
        if (contactsActivity.s == null || contactsActivity.y) {
            return;
        }
        boolean z10 = i11 > 0;
        if (i11 != 0 && this.a && (z10 || this.b)) {
            contactsActivity.v = !z10;
            ContactsActivity.c0(contactsActivity);
        }
        this.a = true;
    }
}
