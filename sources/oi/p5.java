package oi;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.dj;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.m60;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class p5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ p5(y5 y5Var, int i7) {
        this.a = i7;
        this.b = y5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set set;
        switch (this.a) {
            case 0:
                y5 y5Var = this.b;
                a aVar = y5Var.y;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f;
                    aVar.f = z10;
                    ((CheckBoxBase) y5Var.e.b).f(-1, z10, true);
                    v5 v5Var = y5Var.E;
                    if (v5Var != null) {
                        a aVar2 = y5Var.y;
                        boolean z11 = aVar2.f;
                        q3 q3Var = ((a3) v5Var).a;
                        aVar2.f = z11;
                        d2 d2Var = q3Var.R3;
                        if (d2Var != null) {
                            d2Var.d();
                            q3Var.R3.h();
                            break;
                        }
                    }
                }
                break;
            default:
                y5 y5Var2 = this.b;
                v5 v5Var2 = y5Var2.E;
                if (v5Var2 != null) {
                    a aVar3 = y5Var2.y;
                    q3 q3Var2 = ((a3) v5Var2).a;
                    if (aVar3 != null && (aVar3.b instanceof TL_iv.pageBlockPreformatted) && (set = qi.j.a.y) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.b;
                        m60 g02 = q3Var2.p3.g0(view);
                        g02.W(j6.d0(org.telegram.messenger.g0.L(3.0f), j6.w0(j6.d6, q3Var2.o3)));
                        g02.Z = true;
                        g02.X = org.telegram.messenger.g0.L(350.0f);
                        g02.i(new k2(q3Var2, aVar3, 25), hd.M0(2131753999, null), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            g02.i(null, dj.b(pageblockpreformatted.language), true);
                        }
                        g02.k();
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            String str = (String) obj;
                            g02.i(new ki.n(q3Var2, aVar3, str, 12), dj.b(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        g02.Z();
                        break;
                    }
                }
                break;
        }
    }
}
