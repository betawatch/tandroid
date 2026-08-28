package org.telegram.ui.Components;

import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m30 implements Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ n30 a;

    public /* synthetic */ m30(n30 n30Var) {
        this.a = n30Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i9 = ((l41) obj).d;
        n30 n30Var = this.a;
        if (i9 == 0) {
            HashtagSearchController.getInstance(n30Var.a).clearHistory();
            n30Var.f.N(true);
        } else {
            Utilities.Callback callback = n30Var.h;
            if (callback != null) {
                callback.run((String) n30Var.c.get(i9 - 1));
            }
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i9 = ((l41) obj).d;
        boolean z10 = false;
        if (i9 != 0) {
            n30 n30Var = this.a;
            String str = (String) n30Var.c.get(i9 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n30Var.getContext(), 0, n30Var.b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new g1(21, n30Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            c2Var.show();
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
