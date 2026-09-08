package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class bt extends s4.s0 {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ContactsActivity c;

    public bt(ContactsActivity contactsActivity) {
        this.c = contactsActivity;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 != 1) {
            this.b = false;
            return;
        }
        ContactsActivity contactsActivity = this.c;
        if ((contactsActivity.F && contactsActivity.E) || contactsActivity.Z.r.isFocused()) {
            AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
        }
        this.b = true;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        ContactsActivity contactsActivity = this.c;
        int L0 = contactsActivity.n.L0();
        View childAt = recyclerView.getChildAt(0);
        int top = childAt != null ? childAt.getTop() : 0;
        if (contactsActivity.w != null && !contactsActivity.F) {
            boolean z10 = i11 > 0;
            if (i11 != 0 && this.a && (z10 || this.b)) {
                contactsActivity.x = !z10;
                ContactsActivity.e0(contactsActivity);
            }
            this.a = true;
        }
        contactsActivity.Y.b(L0 != 0 || top < contactsActivity.f.getPaddingTop(), true);
        if (Build.VERSION.SDK_INT >= 31 && (fVar = contactsActivity.t0) != null) {
            fVar.f(i10, i11);
            contactsActivity.g0();
        }
        ContactsActivity.d0(contactsActivity);
    }
}
