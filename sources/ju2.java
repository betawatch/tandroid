// default package

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ContactsActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
