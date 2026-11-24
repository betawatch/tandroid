// default package

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ContactsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class av2 extends k69 {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ContactsActivity c;

    public av2(ContactsActivity contactsActivity) {
        this.c = contactsActivity;
    }

    @Override // k69
    public final void a(RecyclerView recyclerView, int i) {
        if (i != 1) {
            this.b = false;
            return;
        }
        ContactsActivity contactsActivity = this.c;
        if (contactsActivity.E && contactsActivity.y) {
            gm.t1(contactsActivity.getParentActivity().getCurrentFocus());
        }
        this.b = true;
    }

    @Override // k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        ContactsActivity contactsActivity = this.c;
        if (contactsActivity.s == null || contactsActivity.E) {
            return;
        }
        boolean z = i2 > 0;
        if (i2 != 0 && this.a && (z || this.b)) {
            contactsActivity.w = !z;
            contactsActivity.f0();
        }
        this.a = true;
    }
}
