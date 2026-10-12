package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class g7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ pf.c c;

    public /* synthetic */ g7(k7 k7Var, pf.c cVar, int i10) {
        this.a = i10;
        this.b = k7Var;
        this.c = cVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                k7 k7Var = this.b;
                k7Var.getClass();
                this.c.b();
                if (!TextUtils.isEmpty(str)) {
                    zc.a0(k7Var).e0(str, false);
                    break;
                }
                break;
            case 1:
                this.c.c(false);
                k7 k7Var2 = this.b;
                org.telegram.ui.ActionBar.b5 parentLayout = k7Var2.getParentLayout();
                if (parentLayout != null) {
                    ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                        if ((m2Var instanceof r8) || (m2Var instanceof o7) || (m2Var instanceof z8)) {
                            ((ActionBarLayout) parentLayout).a0(m2Var, false);
                        }
                    }
                }
                if (str == null) {
                    sc M = zc.a0(k7Var2).M(LocaleController.getString(R.string.WalletBackupDisabled), LocaleController.getString(R.string.WalletBackupDisabledInfo), R.raw.contact_check);
                    M.j = 5000;
                    M.j();
                    break;
                } else {
                    zc.a0(k7Var2).e0(str, false);
                    break;
                }
                break;
            default:
                k7 k7Var3 = this.b;
                k7Var3.getClass();
                this.c.b();
                if (str == null) {
                    org.telegram.ui.ActionBar.b5 parentLayout2 = k7Var3.getParentLayout();
                    if (parentLayout2 != null) {
                        ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                        int size2 = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj3;
                            if ((m2Var2 instanceof r8) || (m2Var2 instanceof o7) || (m2Var2 instanceof z8) || (m2Var2 instanceof k7)) {
                                ((ActionBarLayout) parentLayout2).a0(m2Var2, false);
                            }
                        }
                        k7Var3.finishFragment();
                        break;
                    } else {
                        k7Var3.finishFragment();
                        break;
                    }
                } else {
                    zc.a0(k7Var3).e0(str, false);
                    break;
                }
                break;
        }
    }
}
