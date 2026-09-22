package hg;

import android.app.Activity;
import ci.b7;
import ei.d5;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.n2;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class q1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ z1 a;

    public q1(z1 z1Var) {
        this.a = z1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        e6 e6Var;
        z1 z1Var = this.a;
        ArrayList arrayList = z1Var.b;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                z1Var.finishFragment();
                return;
            } else {
                z1.X(z1Var);
                return;
            }
        }
        if (i10 != 1) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z1Var.getParentActivity(), 0, z1Var.getResourceProvider());
                alertDialog$Builder.a.R = LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0]);
                alertDialog$Builder.a.T = LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new d5(this, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                z1Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (arrayList.size() != 1) {
            return;
        }
        int intValue = ((Integer) arrayList.get(0)).intValue();
        i11 = ((n2) z1Var).currentAccount;
        b2 c10 = c2.f(i11).c(intValue);
        if (c10 == null) {
            return;
        }
        Activity parentActivity = z1Var.getParentActivity();
        i12 = ((n2) z1Var).currentAccount;
        e6Var = ((n2) z1Var).resourceProvider;
        z1.d0(parentActivity, i12, null, c10, e6Var, new b7(this, intValue, 1));
    }
}
