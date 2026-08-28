package gh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i1 extends k41 {
    static {
        k41.setup(new i1());
    }

    public static l41 a(int i9, g1 g1Var) {
        l41 J = l41.J(i1.class);
        J.u = 1;
        J.z = i9;
        J.G = g1Var;
        return J;
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        String str;
        j1 j1Var = (j1) view;
        g1 g1Var = (g1) l41Var.G;
        int i9 = l41Var.z;
        Integer[] numArr = new Integer[1];
        j1Var.s = i9 == 0;
        org.telegram.ui.Components.o9 o9Var = j1Var.d;
        TextView textView = j1Var.e;
        fh.b2 b2Var = j1Var.c;
        j1Var.v = g1Var;
        if (i9 == 0) {
            b2Var.d(null);
            b2Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = g1Var.c;
            textView.setText(stargiftattributemodel.name);
            j1.a(j1Var, stargiftattributemodel.document, 80, l41Var.G, true);
            o9Var.setColorFilter(null);
            b2Var.w = org.telegram.ui.ActionBar.f6.Oh;
            str = k5.J1(stargiftattributemodel.rarity, numArr);
        } else if (i9 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = g1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = g1Var.b;
            b2Var.d(stargiftattributebackdrop);
            b2Var.e(stargiftattributepattern);
            b2Var.w = org.telegram.ui.ActionBar.f6.d6;
            textView.setText(stargiftattributebackdrop.name);
            j1.a(j1Var, stargiftattributepattern.document, 48, l41Var.G, false);
            o9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = k5.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i9 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = g1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = g1Var.b;
            b2Var.d(stargiftattributebackdrop2);
            b2Var.e(stargiftattributepattern2);
            b2Var.w = org.telegram.ui.ActionBar.f6.d6;
            textView.setText(stargiftattributepattern2.name);
            j1.a(j1Var, stargiftattributepattern2.document, 64, l41Var.G, false);
            o9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = k5.J1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        textView.setTextColor(i9 == 0 ? org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, j1Var.a) : -1);
        j1Var.f.setText(str);
        j1Var.h = numArr[0];
        j1Var.b();
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new j1(context, b6Var);
    }
}
