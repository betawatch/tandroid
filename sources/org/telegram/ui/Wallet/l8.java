package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l8 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p8 b;
    public final /* synthetic */ vf.b c;

    public /* synthetic */ l8(p8 p8Var, vf.b bVar, int i7) {
        this.a = i7;
        this.b = p8Var;
        this.c = bVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        vf.b bVar = this.c;
        p8 p8Var = this.b;
        String str = (String) obj;
        switch (i7) {
            case 0:
                p8Var.getClass();
                bVar.b();
                if (!TextUtils.isEmpty(str)) {
                    gc.a0(p8Var).e0(str, false);
                    break;
                }
                break;
            case 1:
                bVar.c(false);
                org.telegram.ui.ActionBar.r4 parentLayout = p8Var.getParentLayout();
                if (parentLayout != null) {
                    ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                        if ((f2Var instanceof y9) || (f2Var instanceof w8) || (f2Var instanceof ga)) {
                            ((ActionBarLayout) parentLayout).d0(f2Var, false);
                        }
                    }
                }
                if (str == null) {
                    bc I = gc.a0(p8Var).I(R.raw.contact_check, id.M0(2131743191, null), id.M0(2131743189, null));
                    I.j = 5000;
                    I.j();
                    break;
                } else {
                    gc.a0(p8Var).e0(str, false);
                    break;
                }
            default:
                p8Var.getClass();
                bVar.b();
                if (str == null) {
                    org.telegram.ui.ActionBar.r4 parentLayout2 = p8Var.getParentLayout();
                    if (parentLayout2 != null) {
                        ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                        int size2 = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj3;
                            if ((f2Var2 instanceof y9) || (f2Var2 instanceof w8) || (f2Var2 instanceof ga) || (f2Var2 instanceof p8)) {
                                ((ActionBarLayout) parentLayout2).d0(f2Var2, false);
                            }
                        }
                        p8Var.finishFragment();
                        break;
                    } else {
                        p8Var.finishFragment();
                        break;
                    }
                } else {
                    gc.a0(p8Var).e0(str, false);
                    break;
                }
                break;
        }
    }
}
