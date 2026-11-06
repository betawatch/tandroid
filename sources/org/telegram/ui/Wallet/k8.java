package org.telegram.ui.Wallet;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k8 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;
    public final /* synthetic */ vf.b c;

    public /* synthetic */ k8(o8 o8Var, vf.b bVar, int i7) {
        this.a = i7;
        this.b = o8Var;
        this.c = bVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        vf.b bVar = this.c;
        o8 o8Var = this.b;
        String str = (String) obj;
        switch (i7) {
            case 0:
                o8Var.getClass();
                bVar.b();
                if (!TextUtils.isEmpty(str)) {
                    hc.a0(o8Var).e0(str, false);
                    break;
                }
                break;
            case 1:
                bVar.c(false);
                org.telegram.ui.ActionBar.q4 parentLayout = o8Var.getParentLayout();
                if (parentLayout != null) {
                    ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                        if ((f2Var instanceof x9) || (f2Var instanceof v8) || (f2Var instanceof fa)) {
                            ((ActionBarLayout) parentLayout).d0(f2Var, false);
                        }
                    }
                }
                if (str == null) {
                    cc I = hc.a0(o8Var).I(R.raw.contact_check, hd.M0(2131743192, null), hd.M0(2131743190, null));
                    I.j = 5000;
                    I.j();
                    break;
                } else {
                    hc.a0(o8Var).e0(str, false);
                    break;
                }
            default:
                o8Var.getClass();
                bVar.b();
                if (str == null) {
                    org.telegram.ui.ActionBar.q4 parentLayout2 = o8Var.getParentLayout();
                    if (parentLayout2 != null) {
                        ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                        int size2 = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj3;
                            if ((f2Var2 instanceof x9) || (f2Var2 instanceof v8) || (f2Var2 instanceof fa) || (f2Var2 instanceof o8)) {
                                ((ActionBarLayout) parentLayout2).d0(f2Var2, false);
                            }
                        }
                        o8Var.finishFragment();
                        break;
                    } else {
                        o8Var.finishFragment();
                        break;
                    }
                } else {
                    hc.a0(o8Var).e0(str, false);
                    break;
                }
                break;
        }
    }
}
