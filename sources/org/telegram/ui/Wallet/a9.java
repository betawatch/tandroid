package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a9 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9 b;
    public final /* synthetic */ vf.b c;

    public /* synthetic */ a9(e9 e9Var, vf.b bVar, int i7) {
        this.a = i7;
        this.b = e9Var;
        this.c = bVar;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        int i7 = this.a;
        vf.b bVar = this.c;
        e9 e9Var = this.b;
        String str = (String) obj;
        switch (i7) {
            case 0:
                e9Var.getClass();
                bVar.b();
                if (str == null) {
                    org.telegram.ui.ActionBar.r4 parentLayout = e9Var.getParentLayout();
                    if (parentLayout != null) {
                        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList.get(i10);
                            i10++;
                            org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj2;
                            if ((g2Var instanceof oa) || (g2Var instanceof m9) || (g2Var instanceof wa) || (g2Var instanceof e9)) {
                                ((ActionBarLayout) parentLayout).d0(g2Var, false);
                            }
                        }
                        e9Var.finishFragment();
                        break;
                    } else {
                        e9Var.finishFragment();
                        break;
                    }
                } else {
                    kc.b0(e9Var).f0(str, false);
                    break;
                }
                break;
            default:
                bVar.c(false);
                org.telegram.ui.ActionBar.r4 parentLayout2 = e9Var.getParentLayout();
                if (parentLayout2 != null) {
                    ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj3 = arrayList2.get(i11);
                        i11++;
                        org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) obj3;
                        if ((g2Var2 instanceof oa) || (g2Var2 instanceof m9) || (g2Var2 instanceof wa)) {
                            ((ActionBarLayout) parentLayout2).d0(g2Var2, false);
                        }
                    }
                }
                if (str == null) {
                    fc I = kc.b0(e9Var).I(R.raw.contact_check, gd.N0(2131742940, null), gd.N0(2131742938, null));
                    I.j = 5000;
                    I.j();
                    break;
                } else {
                    kc.b0(e9Var).f0(str, false);
                    break;
                }
        }
    }
}
