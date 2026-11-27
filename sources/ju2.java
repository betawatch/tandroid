// default package

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ContactsActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ju2 extends v79 {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ContactsActivity c;

    public ju2(ContactsActivity contactsActivity) {
        this.c = contactsActivity;
    }

    @Override // v79
    public final void a(RecyclerView recyclerView, int i) {
        if (i != 1) {
            this.b = false;
            return;
        }
        ContactsActivity contactsActivity = this.c;
        if (contactsActivity.E && contactsActivity.y) {
            hl.t1(contactsActivity.getParentActivity().getCurrentFocus());
        }
        this.b = true;
    }

    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        ContactsActivity contactsActivity = this.c;
        if (contactsActivity.s == null || contactsActivity.E) {
            return;
        }
        boolean z = i2 > 0;
        if (i2 != 0 && this.a && (z || this.b)) {
            contactsActivity.w = !z;
            contactsActivity.e0();
        }
        this.a = true;
    }
}
