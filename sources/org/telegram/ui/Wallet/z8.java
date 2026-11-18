package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class z8 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9 b;
    public final /* synthetic */ vf.b c;

    public /* synthetic */ z8(d9 d9Var, vf.b bVar, int i7) {
        this.a = i7;
        this.b = d9Var;
        this.c = bVar;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        vf.b bVar = this.c;
        d9 d9Var = this.b;
        String str = (String) obj;
        switch (i7) {
            case 0:
                d9Var.getClass();
                bVar.b();
                if (str == null) {
                    org.telegram.ui.ActionBar.s4 parentLayout = d9Var.getParentLayout();
                    if (parentLayout != null) {
                        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList.get(i10);
                            i10++;
                            org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj2;
                            if ((h2Var instanceof na) || (h2Var instanceof l9) || (h2Var instanceof va) || (h2Var instanceof d9)) {
                                ((ActionBarLayout) parentLayout).d0(h2Var, false);
                            }
                        }
                        d9Var.finishFragment();
                        break;
                    } else {
                        d9Var.finishFragment();
                        break;
                    }
                } else {
                    lc.b0(d9Var).f0(str, false);
                    break;
                }
                break;
            default:
                bVar.c(false);
                org.telegram.ui.ActionBar.s4 parentLayout2 = d9Var.getParentLayout();
                if (parentLayout2 != null) {
                    ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj3 = arrayList2.get(i11);
                        i11++;
                        org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) obj3;
                        if ((h2Var2 instanceof na) || (h2Var2 instanceof l9) || (h2Var2 instanceof va)) {
                            ((ActionBarLayout) parentLayout2).d0(h2Var2, false);
                        }
                    }
                }
                if (str == null) {
                    gc I = lc.b0(d9Var).I(R.raw.contact_check, gd.M0(2131742953, null), gd.M0(2131742951, null));
                    I.j = 5000;
                    I.j();
                    break;
                } else {
                    lc.b0(d9Var).f0(str, false);
                    break;
                }
        }
    }
}
