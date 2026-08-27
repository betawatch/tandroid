package hh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i1 extends m41 {
    static {
        m41.setup(new i1());
    }

    public static n41 a(int i10, g1 g1Var) {
        n41 J = n41.J(i1.class);
        J.u = 1;
        J.z = i10;
        J.G = g1Var;
        return J;
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        String str;
        j1 j1Var = (j1) view;
        g1 g1Var = (g1) n41Var.G;
        int i10 = n41Var.z;
        Integer[] numArr = new Integer[1];
        j1Var.s = i10 == 0;
        org.telegram.ui.Components.n9 n9Var = j1Var.d;
        TextView textView = j1Var.e;
        gh.y1 y1Var = j1Var.c;
        j1Var.v = g1Var;
        if (i10 == 0) {
            y1Var.d(null);
            y1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = g1Var.c;
            textView.setText(stargiftattributemodel.name);
            j1.a(j1Var, stargiftattributemodel.document, 80, n41Var.G, true);
            n9Var.setColorFilter(null);
            y1Var.w = org.telegram.ui.ActionBar.g6.Oh;
            str = i5.J1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = g1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = g1Var.b;
            y1Var.d(stargiftattributebackdrop);
            y1Var.e(stargiftattributepattern);
            y1Var.w = org.telegram.ui.ActionBar.g6.d6;
            textView.setText(stargiftattributebackdrop.name);
            j1.a(j1Var, stargiftattributepattern.document, 48, n41Var.G, false);
            n9Var.setColorFilter(new PorterDuffColorFilter(i0.b.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = i5.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = g1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = g1Var.b;
            y1Var.d(stargiftattributebackdrop2);
            y1Var.e(stargiftattributepattern2);
            y1Var.w = org.telegram.ui.ActionBar.g6.d6;
            textView.setText(stargiftattributepattern2.name);
            j1.a(j1Var, stargiftattributepattern2.document, 64, n41Var.G, false);
            n9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = i5.J1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        textView.setTextColor(i10 == 0 ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, j1Var.a) : -1);
        j1Var.f.setText(str);
        j1Var.h = numArr[0];
        j1Var.b();
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new j1(context, c6Var);
    }
}
