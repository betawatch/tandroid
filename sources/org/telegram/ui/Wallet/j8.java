package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.u10;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j8 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8 b;
    public final /* synthetic */ sf.b c;

    public /* synthetic */ j8(n8 n8Var, sf.b bVar, int i3) {
        this.a = i3;
        this.b = n8Var;
        this.c = bVar;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        sf.b bVar = this.c;
        n8 n8Var = this.b;
        String str = (String) obj;
        switch (i3) {
            case 0:
                n8Var.getClass();
                bVar.b();
                if (!TextUtils.isEmpty(str)) {
                    fc.a0(n8Var).e0(str, false);
                    break;
                }
                break;
            case 1:
                bVar.c(false);
                org.telegram.ui.ActionBar.q4 parentLayout = n8Var.getParentLayout();
                if (parentLayout != null) {
                    ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                        if ((d2Var instanceof w9) || (d2Var instanceof u8) || (d2Var instanceof ea)) {
                            ((ActionBarLayout) parentLayout).d0(d2Var, false);
                        }
                    }
                }
                if (str == null) {
                    ac I = fc.a0(n8Var).I(R.raw.contact_check, bd.M0(2131743201, null), bd.M0(2131743199, null));
                    I.j = 5000;
                    I.j();
                    break;
                } else {
                    fc.a0(n8Var).e0(str, false);
                    break;
                }
            default:
                n8Var.getClass();
                bVar.b();
                if (str == null) {
                    org.telegram.ui.ActionBar.q4 parentLayout2 = n8Var.getParentLayout();
                    if (parentLayout2 != null) {
                        ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                        int size2 = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj3;
                            if ((d2Var2 instanceof w9) || (d2Var2 instanceof u8) || (d2Var2 instanceof ea) || (d2Var2 instanceof n8)) {
                                ((ActionBarLayout) parentLayout2).d0(d2Var2, false);
                            }
                        }
                        n8Var.finishFragment();
                        break;
                    } else {
                        n8Var.finishFragment();
                        break;
                    }
                } else {
                    fc.a0(n8Var).e0(str, false);
                    break;
                }
                break;
        }
    }
}
