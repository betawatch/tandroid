package org.telegram.ui.Components;

import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e40 implements Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ f40 a;

    public /* synthetic */ e40(f40 f40Var) {
        this.a = f40Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((i51) obj).d;
        f40 f40Var = this.a;
        if (i10 == 0) {
            HashtagSearchController.getInstance(f40Var.a).clearHistory();
            f40Var.f.N(true);
        } else {
            Utilities.Callback callback = f40Var.h;
            if (callback != null) {
                callback.run((String) f40Var.c.get(i10 - 1));
            }
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = ((i51) obj).d;
        boolean z4 = false;
        if (i10 != 0) {
            f40 f40Var = this.a;
            String str = (String) f40Var.c.get(i10 - 1);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f40Var.getContext(), 0, f40Var.b);
            String string = LocaleController.getString(R.string.ClearSearchSingleAlertTitle);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.O = string;
            d2Var.Q = LocaleController.formatString(R.string.ClearSearchSingleHashtagAlertText, str);
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearSearchRemove), new o1(20, f40Var, str));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            d2Var.show();
            z4 = true;
        }
        return Boolean.valueOf(z4);
    }
}
