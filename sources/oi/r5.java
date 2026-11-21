package oi;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.cj;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.a70;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                    boolean z10 = !aVar.f;
                    aVar.f = z10;
                    ((CheckBoxBase) a6Var.e.b).f(-1, z10, true);
                    x5 x5Var = a6Var.E;
                    if (x5Var != null) {
                        a aVar2 = a6Var.y;
                        boolean z11 = aVar2.f;
                        t3 t3Var = ((d3) x5Var).a;
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
                a6 a6Var2 = this.b;
                x5 x5Var2 = a6Var2.E;
                if (x5Var2 != null) {
                    a aVar3 = a6Var2.y;
                    t3 t3Var2 = ((d3) x5Var2).a;
                    if (aVar3 != null && (aVar3.b instanceof TL_iv.pageBlockPreformatted) && (set = qi.j.a.y) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.b;
                        a70 G0 = t3Var2.p3.G0(view);
                        G0.X(m6.d0(org.telegram.messenger.g0.L(3.0f), m6.w0(m6.d6, t3Var2.o3)));
                        G0.c0 = true;
                        G0.a0 = org.telegram.messenger.g0.L(350.0f);
                        G0.i(new n2(t3Var2, aVar3, 25), gd.N0(2131753996, null), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            G0.i(null, cj.b(pageblockpreformatted.language), true);
                        }
                        G0.k();
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            String str = (String) obj;
                            G0.i(new kg.y((ViewGroup) t3Var2, (Object) aVar3, str, 17), cj.b(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        G0.a0();
                        break;
                    }
                }
                break;
        }
    }
}
