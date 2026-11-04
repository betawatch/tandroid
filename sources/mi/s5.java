package mi;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.bd;
import org.telegram.messenger.wi;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.f60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;

    public /* synthetic */ s5(b6 b6Var, int i3) {
        this.a = i3;
        this.b = b6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set set;
        switch (this.a) {
            case 0:
                b6 b6Var = this.b;
                a aVar = b6Var.y;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f;
                    aVar.f = z10;
                    ((CheckBoxBase) b6Var.e.b).f(-1, z10, true);
                    y5 y5Var = b6Var.E;
                    if (y5Var != null) {
                        a aVar2 = b6Var.y;
                        boolean z11 = aVar2.f;
                        t3 t3Var = ((d3) y5Var).a;
                        aVar2.f = z11;
                        g2 g2Var = t3Var.R3;
                        if (g2Var != null) {
                            g2Var.d();
                            t3Var.R3.h();
                            break;
                        }
                    }
                }
                break;
            default:
                b6 b6Var2 = this.b;
                y5 y5Var2 = b6Var2.E;
                if (y5Var2 != null) {
                    a aVar3 = b6Var2.y;
                    t3 t3Var2 = ((d3) y5Var2).a;
                    if (aVar3 != null && (aVar3.b instanceof TL_iv.pageBlockPreformatted) && (set = oi.k.a.y) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.b;
                        f60 D1 = t3Var2.p3.D1(view);
                        D1.W(k6.d0(org.telegram.messenger.g0.L(3.0f), k6.w0(k6.d6, t3Var2.o3)));
                        D1.Z = true;
                        D1.X = org.telegram.messenger.g0.L(350.0f);
                        D1.i(new n2(t3Var2, aVar3, 25), bd.M0(2131753999, null), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            D1.i(null, wi.b(pageblockpreformatted.language), true);
                        }
                        D1.k();
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            String str = (String) obj;
                            D1.i(new lg.y((ViewGroup) t3Var2, (Object) aVar3, str, 9), wi.b(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        D1.Z();
                        break;
                    }
                }
                break;
        }
    }
}
