// default package

import android.content.Context;
import org.telegram.ui.ContactsActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class iu2 extends nu2 {
    public final /* synthetic */ ContactsActivity P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu2(ContactsActivity contactsActivity, Context context, int i, boolean z, zh6 zh6Var, int i2) {
        super(context, i, z, zh6Var, i2);
        this.P = contactsActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // y69
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        int size;
        boolean z;
        boolean z2;
        sla slaVar;
        boolean z3 = false;
        this.J = false;
        byte b = this.G;
        int i = this.r;
        int i2 = this.w;
        int i3 = 2;
        if (b != 2) {
            size = (i2 == 2 ? lv2.r(i).k0 : lv2.r(i).i0).size();
            if (size == 0) {
                this.J = true;
            }
            if (i2 == 0) {
                size++;
            }
            z = this.F;
            if (z) {
                size++;
            }
            boolean isEmpty = lv2.r(i).b0.isEmpty();
            this.K = !isEmpty;
            z2 = !this.J && this.x && !z && i2 == 0;
            this.L = z2;
            if (z2) {
                i3 = size;
            } else if (isEmpty) {
                i3 = 1;
            }
            ContactsActivity contactsActivity = this.P;
            contactsActivity.e0();
            slaVar = contactsActivity.n;
            if (slaVar != null) {
                iu2 iu2Var = contactsActivity.b;
                if (iu2Var != null && !iu2Var.J) {
                    z3 = true;
                }
                slaVar.Y(z3, true);
            }
            contactsActivity.f0();
            return i3;
        }
        this.J = this.E.isEmpty();
        size = 1;
        if (i2 == 0) {
        }
        z = this.F;
        if (z) {
        }
        boolean isEmpty2 = lv2.r(i).b0.isEmpty();
        this.K = !isEmpty2;
        if (this.J) {
        }
        this.L = z2;
        if (z2) {
        }
        ContactsActivity contactsActivity2 = this.P;
        contactsActivity2.e0();
        slaVar = contactsActivity2.n;
        if (slaVar != null) {
        }
        contactsActivity2.f0();
        return i3;
    }

    @Override // y69, j79
    public final void f() {
        X(false);
        ContactsActivity contactsActivity = this.P;
        d79 d79Var = contactsActivity.d;
        if (d79Var == null || d79Var.getAdapter() != this) {
            return;
        }
        int b = b();
        boolean z = contactsActivity.G;
        d79 d79Var2 = contactsActivity.d;
        if (z) {
            d79Var2.setFastScrollVisible(b != 2);
        } else {
            d79Var2.setFastScrollVisible(b != 0);
        }
    }
}
