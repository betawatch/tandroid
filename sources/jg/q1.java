package jg;

import android.app.Activity;
import fi.c4;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        u6 u6Var;
        z1 z1Var = this.a;
        ArrayList arrayList = z1Var.b;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                z1Var.finishFragment();
                return;
            } else {
                z1.Y(z1Var);
                return;
            }
        }
        if (i10 != 1) {
            if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z1Var.getParentActivity(), 0, z1Var.getResourceProvider());
                alertDialog$Builder.a.R = LocaleController.formatPluralString("BusinessRepliesDeleteTitle", arrayList.size(), new Object[0]);
                alertDialog$Builder.a.T = LocaleController.formatPluralString("BusinessRepliesDeleteMessage", arrayList.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new e1(this, 2));
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
        i11 = ((r2) z1Var).currentAccount;
        b2 c10 = c2.f(i11).c(intValue);
        if (c10 == null) {
            return;
        }
        Activity parentActivity = z1Var.getParentActivity();
        i12 = ((r2) z1Var).currentAccount;
        u6Var = ((r2) z1Var).resourceProvider;
        z1.e0(parentActivity, i12, null, c10, u6Var, new c4(this, intValue, 2));
    }
}
