package lh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class g1 extends h51 {
    static {
        h51.setup(new g1());
    }

    public static i51 a(int i10, f1 f1Var) {
        i51 J = i51.J(g1.class);
        J.u = 1;
        J.z = i10;
        J.G = f1Var;
        return J;
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        String str;
        h1 h1Var = (h1) view;
        f1 f1Var = (f1) i51Var.G;
        int i10 = i51Var.z;
        Integer[] numArr = new Integer[1];
        h1Var.s = i10 == 0;
        org.telegram.ui.Components.p9 p9Var = h1Var.d;
        TextView textView = h1Var.e;
        kh.u1 u1Var = h1Var.c;
        h1Var.v = f1Var;
        if (i10 == 0) {
            u1Var.d(null);
            u1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = f1Var.c;
            textView.setText(stargiftattributemodel.name);
            h1.a(h1Var, stargiftattributemodel.document, 80, i51Var.G, true);
            p9Var.setColorFilter(null);
            u1Var.w = org.telegram.ui.ActionBar.j6.Oh;
            str = g5.J1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = f1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = f1Var.b;
            u1Var.d(stargiftattributebackdrop);
            u1Var.e(stargiftattributepattern);
            u1Var.w = org.telegram.ui.ActionBar.j6.d6;
            textView.setText(stargiftattributebackdrop.name);
            h1.a(h1Var, stargiftattributepattern.document, 48, i51Var.G, false);
            p9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = g5.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = f1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = f1Var.b;
            u1Var.d(stargiftattributebackdrop2);
            u1Var.e(stargiftattributepattern2);
            u1Var.w = org.telegram.ui.ActionBar.j6.d6;
            textView.setText(stargiftattributepattern2.name);
            h1.a(h1Var, stargiftattributepattern2.document, 64, i51Var.G, false);
            p9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = g5.J1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        textView.setTextColor(i10 == 0 ? org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, h1Var.a) : -1);
        h1Var.f.setText(str);
        h1Var.h = numArr[0];
        h1Var.b();
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new h1(context, f6Var);
    }
}
