package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ContactsController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ps extends rf.e {
    public final /* synthetic */ ContactsActivity H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps(ContactsActivity contactsActivity, Context context, int i10, boolean z10, a0.h hVar, int i11) {
        super(context, i10, z10, hVar, i11);
        this.H = contactsActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // org.telegram.ui.Components.fl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        int size;
        boolean z10;
        boolean z11 = false;
        this.E = false;
        int i10 = this.B;
        int i11 = this.r;
        int i12 = this.v;
        int i13 = 1;
        if (i10 != 2) {
            size = (i12 == 2 ? ContactsController.getInstance(i11).sortedUsersMutualSectionsArray : ContactsController.getInstance(i11).sortedUsersSectionsArray).size();
            if (size == 0) {
                this.E = true;
            }
            if (i12 == 0) {
                size++;
            }
            z10 = this.A;
            if (z10) {
                size++;
            }
            boolean isEmpty = ContactsController.getInstance(i11).phoneBookContacts.isEmpty();
            this.F = !isEmpty;
            if (this.E && this.w && !z10 && i12 == 0) {
                z11 = true;
            }
            this.G = z11;
            if (z11) {
                i13 = size;
            } else if (!isEmpty) {
                i13 = 2;
            }
            ContactsActivity contactsActivity = this.H;
            ContactsActivity.e0(contactsActivity);
            contactsActivity.m0();
            contactsActivity.l0();
            return i13;
        }
        this.E = this.y.isEmpty();
        size = 1;
        if (i12 == 0) {
        }
        z10 = this.A;
        if (z10) {
        }
        boolean isEmpty2 = ContactsController.getInstance(i11).phoneBookContacts.isEmpty();
        this.F = !isEmpty2;
        if (this.E) {
            z11 = true;
        }
        this.G = z11;
        if (z11) {
        }
        ContactsActivity contactsActivity2 = this.H;
        ContactsActivity.e0(contactsActivity2);
        contactsActivity2.m0();
        contactsActivity2.l0();
        return i13;
    }

    @Override // org.telegram.ui.Components.fl0, f2.p0
    public final void l() {
        X(false);
        ContactsActivity contactsActivity = this.H;
        org.telegram.ui.Components.jl0 jl0Var = contactsActivity.f;
        if (jl0Var == null || jl0Var.getAdapter() != this) {
            return;
        }
        int h = h();
        if (contactsActivity.D) {
            contactsActivity.f.setFastScrollVisible(h != 2);
        } else {
            contactsActivity.f.setFastScrollVisible(h != 0);
        }
    }
}
