package oi;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.cj;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.y60;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class q5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;

    public /* synthetic */ q5(z5 z5Var, int i7) {
        this.a = i7;
        this.b = z5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set set;
        switch (this.a) {
            case 0:
                z5 z5Var = this.b;
                a aVar = z5Var.y;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f;
                    aVar.f = z10;
                    ((CheckBoxBase) z5Var.e.b).f(-1, z10, true);
                    w5 w5Var = z5Var.E;
                    if (w5Var != null) {
                        a aVar2 = z5Var.y;
                        boolean z11 = aVar2.f;
                        s3 s3Var = ((c3) w5Var).a;
                        aVar2.f = z11;
                        e2 e2Var = s3Var.R3;
                        if (e2Var != null) {
                            e2Var.d();
                            s3Var.R3.h();
                            break;
                        }
                    }
                }
                break;
            default:
                z5 z5Var2 = this.b;
                w5 w5Var2 = z5Var2.E;
                if (w5Var2 != null) {
                    a aVar3 = z5Var2.y;
                    s3 s3Var2 = ((c3) w5Var2).a;
                    if (aVar3 != null && (aVar3.b instanceof TL_iv.pageBlockPreformatted) && (set = qi.j.a.y) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.b;
                        y60 G0 = s3Var2.p3.G0(view);
                        G0.X(n6.d0(org.telegram.messenger.g0.L(3.0f), n6.w0(n6.d6, s3Var2.o3)));
                        G0.c0 = true;
                        G0.a0 = org.telegram.messenger.g0.L(350.0f);
                        G0.i(new l2(s3Var2, aVar3, 25), gd.M0(2131753997, null), TextUtils.isEmpty(pageblockpreformatted.language));
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
                            G0.i(new kg.i0(s3Var2, aVar3, str, 16), cj.b(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        G0.a0();
                        break;
                    }
                }
                break;
        }
    }
}
