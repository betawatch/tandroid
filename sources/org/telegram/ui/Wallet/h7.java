package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.tc;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;
    public final /* synthetic */ of.e c;

    public /* synthetic */ h7(l7 l7Var, of.e eVar, int i10) {
        this.a = i10;
        this.b = l7Var;
        this.c = eVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                l7 l7Var = this.b;
                l7Var.getClass();
                this.c.b();
                if (!TextUtils.isEmpty(str)) {
                    ad.a0(l7Var).e0(str, false);
                    break;
                }
                break;
            case 1:
                this.c.c(false);
                l7 l7Var2 = this.b;
                org.telegram.ui.ActionBar.d5 parentLayout = l7Var2.getParentLayout();
                if (parentLayout != null) {
                    ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                        if ((n2Var instanceof s8) || (n2Var instanceof p7) || (n2Var instanceof z8)) {
                            ((ActionBarLayout) parentLayout).a0(n2Var, false);
                        }
                    }
                }
                if (str == null) {
                    tc M = ad.a0(l7Var2).M(LocaleController.getString(R.string.WalletBackupDisabled), LocaleController.getString(R.string.WalletBackupDisabledInfo), R.raw.contact_check);
                    M.j = 5000;
                    M.j();
                    break;
                } else {
                    ad.a0(l7Var2).e0(str, false);
                    break;
                }
                break;
            default:
                l7 l7Var3 = this.b;
                l7Var3.getClass();
                this.c.b();
                if (str == null) {
                    org.telegram.ui.ActionBar.d5 parentLayout2 = l7Var3.getParentLayout();
                    if (parentLayout2 != null) {
                        ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                        int size2 = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj3;
                            if ((n2Var2 instanceof s8) || (n2Var2 instanceof p7) || (n2Var2 instanceof z8) || (n2Var2 instanceof l7)) {
                                ((ActionBarLayout) parentLayout2).a0(n2Var2, false);
                            }
                        }
                        l7Var3.finishFragment();
                        break;
                    } else {
                        l7Var3.finishFragment();
                        break;
                    }
                } else {
                    ad.a0(l7Var3).e0(str, false);
                    break;
                }
                break;
        }
    }
}
