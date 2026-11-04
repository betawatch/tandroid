package ci;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m1 extends q31 {
    static {
        q31.h(new m1());
    }

    public static r31 i(int i3, k1 k1Var) {
        r31 K = r31.K(m1.class);
        K.u = 1;
        K.z = i3;
        K.G = k1Var;
        return K;
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        String str;
        n1 n1Var = (n1) view;
        k1 k1Var = (k1) r31Var.G;
        int i3 = r31Var.z;
        Integer[] numArr = new Integer[1];
        n1Var.s = i3 == 0;
        org.telegram.ui.Components.k9 k9Var = n1Var.d;
        TextView textView = n1Var.e;
        ai.m2 m2Var = n1Var.c;
        n1Var.w = k1Var;
        if (i3 == 0) {
            m2Var.d(null);
            m2Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = k1Var.c;
            textView.setText(stargiftattributemodel.name);
            n1.a(n1Var, stargiftattributemodel.document, 80, r31Var.G, true);
            k9Var.setColorFilter(null);
            m2Var.y = org.telegram.ui.ActionBar.k6.Ci;
            str = l6.G1(stargiftattributemodel.rarity, numArr);
        } else if (i3 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = k1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = k1Var.b;
            m2Var.d(stargiftattributebackdrop);
            m2Var.e(stargiftattributepattern);
            m2Var.y = org.telegram.ui.ActionBar.k6.d6;
            textView.setText(stargiftattributebackdrop.name);
            n1.a(n1Var, stargiftattributepattern.document, 48, r31Var.G, false);
            k9Var.setColorFilter(new PorterDuffColorFilter(i0.a.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = l6.G1(stargiftattributebackdrop.rarity, numArr);
        } else if (i3 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = k1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = k1Var.b;
            m2Var.d(stargiftattributebackdrop2);
            m2Var.e(stargiftattributepattern2);
            m2Var.y = org.telegram.ui.ActionBar.k6.d6;
            textView.setText(stargiftattributepattern2.name);
            n1.a(n1Var, stargiftattributepattern2.document, 64, r31Var.G, false);
            k9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = l6.G1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i3 == 0) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, n1Var.a);
        } else {
            org.telegram.ui.ActionBar.r6.r(textView);
            textView.setTextColor(-1);
        }
        n1Var.f.setText(str);
        n1Var.h = numArr[0];
        n1Var.b();
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new n1(context, e6Var);
    }
}
