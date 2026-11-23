package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z8 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9 b;
    public final /* synthetic */ vf.b c;

    public /* synthetic */ z8(d9 d9Var, vf.b bVar, int i7) {
        this.a = i7;
        this.b = d9Var;
        this.c = bVar;
    }

    @Override // org.telegram.messenger.y10
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
                    org.telegram.ui.ActionBar.r4 parentLayout = d9Var.getParentLayout();
                    if (parentLayout != null) {
                        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList.get(i10);
                            i10++;
                            org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj2;
                            if ((g2Var instanceof na) || (g2Var instanceof l9) || (g2Var instanceof va) || (g2Var instanceof d9)) {
                                ((ActionBarLayout) parentLayout).d0(g2Var, false);
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
                org.telegram.ui.ActionBar.r4 parentLayout2 = d9Var.getParentLayout();
                if (parentLayout2 != null) {
                    ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj3 = arrayList2.get(i11);
                        i11++;
                        org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) obj3;
                        if ((g2Var2 instanceof na) || (g2Var2 instanceof l9) || (g2Var2 instanceof va)) {
                            ((ActionBarLayout) parentLayout2).d0(g2Var2, false);
                        }
                    }
                }
                if (str == null) {
                    gc I = lc.b0(d9Var).I(R.raw.contact_check, hd.N0(2131742945, null), hd.N0(2131742943, null));
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
