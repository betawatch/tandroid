package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;
    public final /* synthetic */ pf.c c;

    public /* synthetic */ d8(i8 i8Var, pf.c cVar, int i10) {
        this.a = i10;
        this.b = i8Var;
        this.c = cVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                i8 i8Var = this.b;
                i8Var.getClass();
                this.c.b();
                if (!TextUtils.isEmpty(str)) {
                    xc.a0(i8Var).e0(str, false);
                    break;
                }
                break;
            case 1:
                this.c.c(false);
                i8 i8Var2 = this.b;
                org.telegram.ui.ActionBar.h5 parentLayout = i8Var2.getParentLayout();
                if (parentLayout != null) {
                    ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                        if ((o2Var instanceof s9) || (o2Var instanceof q8) || (o2Var instanceof aa)) {
                            ((ActionBarLayout) parentLayout).b0(o2Var, false);
                        }
                    }
                }
                if (str == null) {
                    qc M = xc.a0(i8Var2).M(LocaleController.getString(R.string.WalletBackupDisabled), LocaleController.getString(R.string.WalletBackupDisabledInfo), R.raw.contact_check);
                    M.j = 5000;
                    M.j();
                    break;
                } else {
                    xc.a0(i8Var2).e0(str, false);
                    break;
                }
                break;
            default:
                i8 i8Var3 = this.b;
                i8Var3.getClass();
                this.c.b();
                if (str == null) {
                    org.telegram.ui.ActionBar.h5 parentLayout2 = i8Var3.getParentLayout();
                    if (parentLayout2 != null) {
                        ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                        int size2 = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj3;
                            if ((o2Var2 instanceof s9) || (o2Var2 instanceof q8) || (o2Var2 instanceof aa) || (o2Var2 instanceof i8)) {
                                ((ActionBarLayout) parentLayout2).b0(o2Var2, false);
                            }
                        }
                        i8Var3.finishFragment();
                        break;
                    } else {
                        i8Var3.finishFragment();
                        break;
                    }
                } else {
                    xc.a0(i8Var3).e0(str, false);
                    break;
                }
                break;
        }
    }
}
