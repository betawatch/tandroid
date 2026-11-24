// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.ui.ContactsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nt2 extends sr9 {
    public final /* synthetic */ ContactsActivity L;

    public nt2(ContactsActivity contactsActivity, Context context, vf6 vf6Var, boolean z, boolean z2, boolean z3) {
        this.L = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.I = new ArrayList();
        this.c = context;
        this.h = vf6Var;
        this.r = z;
        this.s = z2;
        this.y = 0L;
        this.w = z3;
        this.x = true;
        zr9 zr9Var = new zr9(true);
        this.f = zr9Var;
        zr9Var.a = new qr9(this);
    }

    @Override // sr9
    public final void F() {
        if (this.E || this.f.e() || b() != 0) {
            return;
        }
        this.L.c.e(false, true);
    }
}
