package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j8 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8 b;
    public final /* synthetic */ vf.b c;

    public /* synthetic */ j8(n8 n8Var, vf.b bVar, int i7) {
        this.a = i7;
        this.b = n8Var;
        this.c = bVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        vf.b bVar = this.c;
        n8 n8Var = this.b;
        String str = (String) obj;
        switch (i7) {
            case 0:
                n8Var.getClass();
                bVar.b();
                if (!TextUtils.isEmpty(str)) {
                    hc.a0(n8Var).e0(str, false);
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
                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                        if ((f2Var instanceof w9) || (f2Var instanceof u8) || (f2Var instanceof ea)) {
                            ((ActionBarLayout) parentLayout).d0(f2Var, false);
                        }
                    }
                }
                if (str == null) {
                    cc I = hc.a0(n8Var).I(R.raw.contact_check, id.M0(2131743194, null), id.M0(2131743192, null));
                    I.j = 5000;
                    I.j();
                    break;
                } else {
                    hc.a0(n8Var).e0(str, false);
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
                            org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj3;
                            if ((f2Var2 instanceof w9) || (f2Var2 instanceof u8) || (f2Var2 instanceof ea) || (f2Var2 instanceof n8)) {
                                ((ActionBarLayout) parentLayout2).d0(f2Var2, false);
                            }
                        }
                        n8Var.finishFragment();
                        break;
                    } else {
                        n8Var.finishFragment();
                        break;
                    }
                } else {
                    hc.a0(n8Var).e0(str, false);
                    break;
                }
                break;
        }
    }
}
