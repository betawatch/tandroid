package ig;

import android.app.Activity;
import ei.e4;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class n1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ w1 a;

    public n1(w1 w1Var) {
        this.a = w1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        g6 g6Var;
        w1 w1Var = this.a;
        ArrayList arrayList = w1Var.b;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                w1Var.finishFragment();
                return;
            } else {
                w1.X(w1Var);
                return;
            }
        }
        if (i10 != 1) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w1Var.getParentActivity(), 0, w1Var.getResourceProvider());
                alertDialog$Builder.a.R = LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0]);
                alertDialog$Builder.a.T = LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new e1.c(this, 22));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                w1Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (arrayList.size() != 1) {
            return;
        }
        int intValue = ((Integer) arrayList.get(0)).intValue();
        i11 = ((o2) w1Var).currentAccount;
        y1 c10 = z1.f(i11).c(intValue);
        if (c10 == null) {
            return;
        }
        Activity parentActivity = w1Var.getParentActivity();
        i12 = ((o2) w1Var).currentAccount;
        g6Var = ((o2) w1Var).resourceProvider;
        w1.d0(parentActivity, i12, null, c10, g6Var, new e4(this, intValue, 2));
    }
}
