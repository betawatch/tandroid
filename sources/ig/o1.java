package ig;

import android.app.Activity;
import ei.e4;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class o1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ x1 a;

    public o1(x1 x1Var) {
        this.a = x1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        d6 d6Var;
        x1 x1Var = this.a;
        ArrayList arrayList = x1Var.b;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                x1Var.finishFragment();
                return;
            } else {
                x1.X(x1Var);
                return;
            }
        }
        if (i10 != 1) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x1Var.getParentActivity(), 0, x1Var.getResourceProvider());
                alertDialog$Builder.a.R = LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0]);
                alertDialog$Builder.a.T = LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new e1.c(this, 22));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                x1Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (arrayList.size() != 1) {
            return;
        }
        int intValue = ((Integer) arrayList.get(0)).intValue();
        i11 = ((n2) x1Var).currentAccount;
        z1 c10 = a2.f(i11).c(intValue);
        if (c10 == null) {
            return;
        }
        Activity parentActivity = x1Var.getParentActivity();
        i12 = ((n2) x1Var).currentAccount;
        d6Var = ((n2) x1Var).resourceProvider;
        x1.d0(parentActivity, i12, null, c10, d6Var, new e4(this, intValue, 2));
    }
}
