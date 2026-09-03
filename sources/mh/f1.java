package mh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class f1 extends g51 {
    static {
        g51.setup(new f1());
    }

    public static h51 a(int i10, e1 e1Var) {
        h51 J = h51.J(f1.class);
        J.u = 1;
        J.z = i10;
        J.G = e1Var;
        return J;
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        String str;
        g1 g1Var = (g1) view;
        e1 e1Var = (e1) h51Var.G;
        int i10 = h51Var.z;
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
            g1.a(g1Var, stargiftattributemodel.document, 80, h51Var.G, true);
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
            g1.a(g1Var, stargiftattributepattern.document, 48, h51Var.G, false);
            p9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = g5.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = e1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = e1Var.b;
            u1Var.d(stargiftattributebackdrop2);
            u1Var.e(stargiftattributepattern2);
            u1Var.w = org.telegram.ui.ActionBar.k6.d6;
            textView.setText(stargiftattributepattern2.name);
            g1.a(g1Var, stargiftattributepattern2.document, 64, h51Var.G, false);
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

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new g1(context, g6Var);
    }
}
