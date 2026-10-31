package bi;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.cd;
import org.telegram.messenger.gj;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class e6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q6 b;

    public /* synthetic */ e6(q6 q6Var, int i10) {
        this.a = i10;
        this.b = q6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set set;
        switch (this.a) {
            case 0:
                q6 q6Var = this.b;
                a aVar = q6Var.y;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f;
                    aVar.f = z10;
                    ((CheckBoxBase) q6Var.e.b).f(-1, z10, true);
                    n6 n6Var = q6Var.D;
                    if (n6Var != null) {
                        a aVar2 = q6Var.y;
                        boolean z11 = aVar2.f;
                        d4 d4Var = ((m3) n6Var).a;
                        aVar2.f = z11;
                        o2 o2Var = d4Var.Q3;
                        if (o2Var != null) {
                            o2Var.d();
                            d4Var.Q3.h();
                            break;
                        }
                    }
                }
                break;
            default:
                q6 q6Var2 = this.b;
                n6 n6Var2 = q6Var2.D;
                if (n6Var2 != null) {
                    a aVar3 = q6Var2.y;
                    d4 d4Var2 = ((m3) n6Var2).a;
                    if (aVar3 != null && (aVar3.b instanceof TL_iv.pageBlockPreformatted) && (set = di.l.a.y) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.b;
                        z60 U = d4Var2.o3.U(view);
                        U.W(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, d4Var2.n3)));
                        U.Z = true;
                        U.X = org.telegram.messenger.i0.L(350.0f);
                        U.i(new v2(d4Var2, aVar3, 25), cd.L0(2131753999, null), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            U.i(null, gj.b(pageblockpreformatted.language), true);
                        }
                        U.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            U.i(new a3.l0(d4Var2, aVar3, str, 14), gj.b(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        U.Z();
                        break;
                    }
                }
                break;
        }
    }
}
