package org.telegram.ui.Components;

import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ g40 a;

    public /* synthetic */ f40(g40 g40Var) {
        this.a = g40Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((x51) obj).d;
        g40 g40Var = this.a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(g40Var.a).clearHistory();
            g40Var.f.N(true);
        } else {
            Utilities.Callback callback = g40Var.h;
            if (callback != null) {
                callback.run((String) g40Var.c.get(i10 - 1));
            }
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((x51) obj).d;
        boolean z10 = false;
        if (i10 != 0) {
            g40 g40Var = this.a;
            String str = (String) g40Var.c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g40Var.getContext(), 0, g40Var.b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
            a2Var.R = string;
            a2Var.T = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new w2(13, g40Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            a2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
