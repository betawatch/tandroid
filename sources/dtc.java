// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dtc implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gtc b;
    public final /* synthetic */ l01 c;

    public /* synthetic */ dtc(gtc gtcVar, l01 l01Var, byte b) {
        this.a = b;
        this.b = gtcVar;
        this.c = l01Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        l01 l01Var = this.c;
        gtc gtcVar = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                l01Var.c(false);
                if (str == null) {
                    wk5 parentLayout = gtcVar.getParentLayout();
                    if (parentLayout != null) {
                        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            e eVar = (e) obj2;
                            if ((eVar instanceof muc) || (eVar instanceof ntc) || (eVar instanceof tuc) || (eVar instanceof gtc)) {
                                ((ActionBarLayout) parentLayout).c0(eVar, false);
                            }
                        }
                        gtcVar.finishFragment();
                        break;
                    } else {
                        gtcVar.finishFragment();
                        break;
                    }
                } else {
                    d31.b0(gtcVar).f0(str, false);
                    break;
                }
                break;
            default:
                l01Var.c(false);
                wk5 parentLayout2 = gtcVar.getParentLayout();
                if (parentLayout2 != null) {
                    ArrayList arrayList2 = new ArrayList(parentLayout2.getFragmentStack());
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj3 = arrayList2.get(i2);
                        i2++;
                        e eVar2 = (e) obj3;
                        if ((eVar2 instanceof muc) || (eVar2 instanceof ntc) || (eVar2 instanceof tuc)) {
                            ((ActionBarLayout) parentLayout2).c0(eVar2, false);
                        }
                    }
                }
                if (str == null) {
                    v21 I = d31.b0(gtcVar).I(R.raw.contact_check, ob6.M0(2131742842, null), ob6.M0(2131742840, null));
                    I.j = 5000;
                    I.j();
                    break;
                } else {
                    d31.b0(gtcVar).f0(str, false);
                    break;
                }
        }
    }
}
