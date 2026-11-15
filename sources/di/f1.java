package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f1 extends a41 {
    static {
        a41.h(new f1());
    }

    public static b41 i(int i7, d1 d1Var) {
        b41 K = b41.K(f1.class);
        K.u = 1;
        K.z = i7;
        K.G = d1Var;
        return K;
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        String str;
        g1 g1Var = (g1) view;
        d1 d1Var = (d1) b41Var.G;
        int i7 = b41Var.z;
        Integer[] numArr = new Integer[1];
        g1Var.s = i7 == 0;
        org.telegram.ui.Components.i9 i9Var = g1Var.d;
        TextView textView = g1Var.e;
        bi.e2 e2Var = g1Var.c;
        g1Var.w = d1Var;
        if (i7 == 0) {
            e2Var.d(null);
            e2Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = d1Var.c;
            textView.setText(stargiftattributemodel.name);
            g1.a(g1Var, stargiftattributemodel.document, 80, b41Var.G, true);
            i9Var.setColorFilter(null);
            e2Var.y = org.telegram.ui.ActionBar.j6.Fi;
            str = c6.G1(stargiftattributemodel.rarity, numArr);
        } else if (i7 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = d1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = d1Var.b;
            e2Var.d(stargiftattributebackdrop);
            e2Var.e(stargiftattributepattern);
            e2Var.y = org.telegram.ui.ActionBar.j6.d6;
            textView.setText(stargiftattributebackdrop.name);
            g1.a(g1Var, stargiftattributepattern.document, 48, b41Var.G, false);
            i9Var.setColorFilter(new PorterDuffColorFilter(i0.a.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = c6.G1(stargiftattributebackdrop.rarity, numArr);
        } else if (i7 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = d1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = d1Var.b;
            e2Var.d(stargiftattributebackdrop2);
            e2Var.e(stargiftattributepattern2);
            e2Var.y = org.telegram.ui.ActionBar.j6.d6;
            textView.setText(stargiftattributepattern2.name);
            g1.a(g1Var, stargiftattributepattern2.document, 64, b41Var.G, false);
            i9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = c6.G1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i7 == 0) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, g1Var.a);
        } else {
            org.telegram.ui.ActionBar.q6.q(textView);
            textView.setTextColor(-1);
        }
        g1Var.f.setText(str);
        g1Var.h = numArr[0];
        g1Var.b();
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new g1(context, e6Var);
    }
}
