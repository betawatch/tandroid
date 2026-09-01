package mh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class f1 extends i51 {
    static {
        i51.setup(new f1());
    }

    public static j51 a(int i10, e1 e1Var) {
        j51 J = j51.J(f1.class);
        J.u = 1;
        J.z = i10;
        J.G = e1Var;
        return J;
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        String str;
        g1 g1Var = (g1) view;
        e1 e1Var = (e1) j51Var.G;
        int i10 = j51Var.z;
        Integer[] numArr = new Integer[1];
        g1Var.s = i10 == 0;
        org.telegram.ui.Components.p9 p9Var = g1Var.d;
        TextView textView = g1Var.e;
        lh.u1 u1Var = g1Var.c;
        g1Var.v = e1Var;
        if (i10 == 0) {
            u1Var.d(null);
            u1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = e1Var.c;
            textView.setText(stargiftattributemodel.name);
            g1.a(g1Var, stargiftattributemodel.document, 80, j51Var.G, true);
            p9Var.setColorFilter(null);
            u1Var.w = org.telegram.ui.ActionBar.k6.Oh;
            str = g5.J1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = e1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = e1Var.b;
            u1Var.d(stargiftattributebackdrop);
            u1Var.e(stargiftattributepattern);
            u1Var.w = org.telegram.ui.ActionBar.k6.d6;
            textView.setText(stargiftattributebackdrop.name);
            g1.a(g1Var, stargiftattributepattern.document, 48, j51Var.G, false);
            p9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = g5.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = e1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = e1Var.b;
            u1Var.d(stargiftattributebackdrop2);
            u1Var.e(stargiftattributepattern2);
            u1Var.w = org.telegram.ui.ActionBar.k6.d6;
            textView.setText(stargiftattributepattern2.name);
            g1.a(g1Var, stargiftattributepattern2.document, 64, j51Var.G, false);
            p9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = g5.J1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        textView.setTextColor(i10 == 0 ? org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.j5, g1Var.a) : -1);
        g1Var.f.setText(str);
        g1Var.h = numArr[0];
        g1Var.b();
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new g1(context, g6Var);
    }
}
