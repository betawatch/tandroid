package ig;

import android.app.Activity;
import ei.e4;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class m1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ v1 a;

    public m1(v1 v1Var) {
        this.a = v1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        d6 d6Var;
        v1 v1Var = this.a;
        ArrayList arrayList = v1Var.b;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                v1Var.finishFragment();
                return;
            } else {
                v1.X(v1Var);
                return;
            }
        }
        if (i10 != 1) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v1Var.getParentActivity(), 0, v1Var.getResourceProvider());
                alertDialog$Builder.a.R = LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0]);
                alertDialog$Builder.a.T = LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new e1.c(this, 22));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                v1Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (arrayList.size() != 1) {
            return;
        }
        int intValue = ((Integer) arrayList.get(0)).intValue();
        i11 = ((n2) v1Var).currentAccount;
        x1 c10 = y1.f(i11).c(intValue);
        if (c10 == null) {
            return;
        }
        Activity parentActivity = v1Var.getParentActivity();
        i12 = ((n2) v1Var).currentAccount;
        d6Var = ((n2) v1Var).resourceProvider;
        v1.d0(parentActivity, i12, null, c10, d6Var, new e4(this, intValue, 2));
    }
}
