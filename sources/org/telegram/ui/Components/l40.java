package org.telegram.ui.Components;

import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ m40 a;

    public /* synthetic */ l40(m40 m40Var) {
        this.a = m40Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((m61) obj).d;
        m40 m40Var = this.a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(m40Var.a).clearHistory();
            m40Var.f.N(true);
        } else {
            Utilities.Callback callback = m40Var.h;
            if (callback != null) {
                callback.run((String) m40Var.c.get(i10 - 1));
            }
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((m61) obj).d;
        boolean z10 = false;
        if (i10 != 0) {
            m40 m40Var = this.a;
            String str = (String) m40Var.c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m40Var.getContext(), 0, m40Var.b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.R = string;
            c2Var.T = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new p2(str, 18, m40Var));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            c2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
