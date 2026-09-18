package hg;

import android.app.Activity;
import ci.b7;
import ei.d5;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ y1 a;

    public p1(y1 y1Var) {
        this.a = y1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        f6 f6Var;
        y1 y1Var = this.a;
        ArrayList arrayList = y1Var.b;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                y1Var.finishFragment();
                return;
            } else {
                y1.X(y1Var);
                return;
            }
        }
        if (i10 != 1) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y1Var.getParentActivity(), 0, y1Var.getResourceProvider());
                alertDialog$Builder.a.R = LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0]);
                alertDialog$Builder.a.T = LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new d5(this, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                y1Var.showDialog(alertDialog$Builder.a);
                return;
            }
            return;
        }
        if (arrayList.size() != 1) {
            return;
        }
        int intValue = ((Integer) arrayList.get(0)).intValue();
        i11 = ((o2) y1Var).currentAccount;
        a2 c10 = b2.f(i11).c(intValue);
        if (c10 == null) {
            return;
        }
        Activity parentActivity = y1Var.getParentActivity();
        i12 = ((o2) y1Var).currentAccount;
        f6Var = ((o2) y1Var).resourceProvider;
        y1.d0(parentActivity, i12, null, c10, f6Var, new b7(this, intValue, 1));
    }
}
