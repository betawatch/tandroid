package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ContactsController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class bt extends fg.e {
    public final /* synthetic */ ContactsActivity L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt(ContactsActivity contactsActivity, Context context, int i10, boolean z10, a0.i iVar, int i11) {
        super(context, i10, z10, iVar, i11);
        this.L = contactsActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // org.telegram.ui.Components.rl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        int size;
        boolean z10;
        boolean z11 = false;
        this.I = false;
        int i10 = this.F;
        int i11 = this.r;
        int i12 = this.v;
        int i13 = 1;
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
            if (this.I && this.w && !z10 && i12 == 0) {
                z11 = true;
            }
            this.K = z11;
            if (z11) {
                i13 = size;
            } else if (!isEmpty) {
                i13 = 2;
            }
            ContactsActivity contactsActivity = this.L;
            ContactsActivity.e0(contactsActivity);
            contactsActivity.m0();
            contactsActivity.l0();
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
            z11 = true;
        }
        this.K = z11;
        if (z11) {
        }
        ContactsActivity contactsActivity2 = this.L;
        ContactsActivity.e0(contactsActivity2);
        contactsActivity2.m0();
        contactsActivity2.l0();
        return i13;
    }

    @Override // org.telegram.ui.Components.rl0, s4.h0
    public final void l() {
        X(false);
        ContactsActivity contactsActivity = this.L;
        org.telegram.ui.Components.vl0 vl0Var = contactsActivity.f;
        if (vl0Var == null || vl0Var.getAdapter() != this) {
            return;
        }
        int h = h();
        if (contactsActivity.H) {
            contactsActivity.f.setFastScrollVisible(h != 2);
        } else {
            contactsActivity.f.setFastScrollVisible(h != 0);
        }
    }
}
