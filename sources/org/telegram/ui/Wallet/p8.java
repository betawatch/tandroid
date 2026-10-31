package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p8 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8 b;
    public final /* synthetic */ gf.e c;

    public /* synthetic */ p8(t8 t8Var, gf.e eVar, int i10) {
        this.a = i10;
        this.b = t8Var;
        this.c = eVar;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        gf.e eVar = this.c;
        t8 t8Var = this.b;
        String str = (String) obj;
        switch (i10) {
            case 0:
                t8Var.getClass();
                eVar.b();
                if (!TextUtils.isEmpty(str)) {
                    cc.a0(t8Var).e0(str, false);
                    break;
                }
                break;
            case 1:
                eVar.c(false);
                org.telegram.ui.ActionBar.z4 parentLayout = t8Var.getParentLayout();
                if (parentLayout != null) {
                    ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj2;
                        if ((k2Var instanceof ba) || (k2Var instanceof a9) || (k2Var instanceof ja)) {
                            ((ActionBarLayout) parentLayout).c0(k2Var, false);
                        }
                    }
                }
                if (str == null) {
                    wb I = cc.a0(t8Var).I(R.raw.contact_check, cd.L0(2131743217, null), cd.L0(2131743215, null));
                    I.j = 5000;
                    I.j();
                    break;
                } else {
                    cc.a0(t8Var).e0(str, false);
                    break;
                }
            default:
                t8Var.getClass();
                eVar.b();
                if (str == null) {
                    org.telegram.ui.ActionBar.z4 parentLayout2 = t8Var.getParentLayout();
                    if (parentLayout2 != null) {
                        ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                        int size2 = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj3 = arrayList2.get(i12);
                            i12++;
                            org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj3;
                            if ((k2Var2 instanceof ba) || (k2Var2 instanceof a9) || (k2Var2 instanceof ja) || (k2Var2 instanceof t8)) {
                                ((ActionBarLayout) parentLayout2).c0(k2Var2, false);
                            }
                        }
                        t8Var.finishFragment();
                        break;
                    } else {
                        t8Var.finishFragment();
                        break;
                    }
                } else {
                    cc.a0(t8Var).e0(str, false);
                    break;
                }
                break;
        }
    }
}
