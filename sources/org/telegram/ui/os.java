package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ContactsController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class os extends ig.e {
    public final /* synthetic */ ContactsActivity O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os(ContactsActivity contactsActivity, Context context, int i10, boolean z10, a0.h hVar, int i11) {
        super(context, i10, z10, hVar, i11);
        this.O = contactsActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // org.telegram.ui.Components.hm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        int size;
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.y5 y5Var;
        boolean z12 = false;
        this.I = false;
        int i10 = this.F;
        int i11 = this.r;
        int i12 = this.v;
        int i13 = 2;
        if (i10 != 2) {
            size = (i12 == 2 ? ContactsController.getInstance(i11).sortedUsersMutualSectionsArray : ContactsController.getInstance(i11).sortedUsersSectionsArray).size();
            if (size == 0) {
                this.I = true;
            }
            if (i12 == 0) {
                size++;
            }
            z10 = this.E;
            if (z10) {
                size++;
            }
            boolean isEmpty = ContactsController.getInstance(i11).phoneBookContacts.isEmpty();
            this.J = !isEmpty;
            z11 = !this.I && this.w && !z10 && i12 == 0;
            this.K = z11;
            if (z11) {
                i13 = size;
            } else if (isEmpty) {
                i13 = 1;
            }
            ContactsActivity contactsActivity = this.O;
            ContactsActivity.c0(contactsActivity);
            y5Var = contactsActivity.n;
            if (y5Var != null) {
                os osVar = contactsActivity.b;
                if (osVar != null && !osVar.I) {
                    z12 = true;
                }
                y5Var.Y(z12, true);
            }
            contactsActivity.g0();
            return i13;
        }
        this.I = this.y.isEmpty();
        size = 1;
        if (i12 == 0) {
        }
        z10 = this.E;
        if (z10) {
        }
        boolean isEmpty2 = ContactsController.getInstance(i11).phoneBookContacts.isEmpty();
        this.J = !isEmpty2;
        if (this.I) {
        }
        this.K = z11;
        if (z11) {
        }
        ContactsActivity contactsActivity2 = this.O;
        ContactsActivity.c0(contactsActivity2);
        y5Var = contactsActivity2.n;
        if (y5Var != null) {
        }
        contactsActivity2.g0();
        return i13;
    }

    @Override // org.telegram.ui.Components.hm0, s4.h0
    public final void l() {
        X(false);
        ContactsActivity contactsActivity = this.O;
        org.telegram.ui.Components.mm0 mm0Var = contactsActivity.d;
        if (mm0Var == null || mm0Var.getAdapter() != this) {
            return;
        }
        int h = h();
        if (contactsActivity.F) {
            contactsActivity.d.setFastScrollVisible(h != 2);
        } else {
            contactsActivity.d.setFastScrollVisible(h != 0);
        }
    }
}
