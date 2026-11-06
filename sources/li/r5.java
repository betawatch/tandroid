package li;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.fj;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.k60;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6 b;

    public /* synthetic */ r5(a6 a6Var, int i7) {
        this.a = i7;
        this.b = a6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set set;
        switch (this.a) {
            case 0:
                a6 a6Var = this.b;
                a aVar = a6Var.y;
                if (aVar != null && aVar.e) {
                    boolean z9 = !aVar.f;
                    aVar.f = z9;
                    ((CheckBoxBase) a6Var.e.b).f(-1, z9, true);
                    x5 x5Var = a6Var.D;
                    if (x5Var != null) {
                        a aVar2 = a6Var.y;
                        boolean z10 = aVar2.f;
                        t3 t3Var = ((c3) x5Var).a;
                        aVar2.f = z10;
                        f2 f2Var = t3Var.Q3;
                        if (f2Var != null) {
                            f2Var.d();
                            t3Var.Q3.h();
                            break;
                        }
                    }
                }
                break;
            default:
                a6 a6Var2 = this.b;
                x5 x5Var2 = a6Var2.D;
                if (x5Var2 != null) {
                    a aVar3 = a6Var2.y;
                    t3 t3Var2 = ((c3) x5Var2).a;
                    if (aVar3 != null && (aVar3.b instanceof TL_iv.pageBlockPreformatted) && (set = ni.m.a.y) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.b;
                        k60 J = t3Var2.o3.J(view);
                        J.W(k6.d0(org.telegram.messenger.g0.L(3.0f), k6.w0(k6.d6, t3Var2.n3)));
                        J.Z = true;
                        J.X = org.telegram.messenger.g0.L(350.0f);
                        J.i(new m2(t3Var2, aVar3, 25), hd.M0(2131753999, null), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            J.i(null, fj.b(pageblockpreformatted.language), true);
                        }
                        J.k();
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            String str = (String) obj;
                            J.i(new l2.z0(t3Var2, aVar3, str, 5), fj.b(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        J.Z();
                        break;
                    }
                }
                break;
        }
    }
}
