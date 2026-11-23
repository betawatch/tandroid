package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e1 extends m41 {
    static {
        m41.h(new e1());
    }

    public static n41 i(int i7, c1 c1Var) {
        n41 K = n41.K(e1.class);
        K.v = 1;
        K.A = i7;
        K.H = c1Var;
        return K;
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        String str;
        f1 f1Var = (f1) view;
        c1 c1Var = (c1) n41Var.H;
        int i7 = n41Var.A;
        Integer[] numArr = new Integer[1];
        f1Var.s = i7 == 0;
        org.telegram.ui.Components.p9 p9Var = f1Var.d;
        TextView textView = f1Var.e;
        bi.e3 e3Var = f1Var.c;
        f1Var.w = c1Var;
        if (i7 == 0) {
            e3Var.d(null);
            e3Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = c1Var.c;
            textView.setText(stargiftattributemodel.name);
            f1.a(f1Var, stargiftattributemodel.document, 80, n41Var.H, true);
            p9Var.setColorFilter(null);
            e3Var.y = org.telegram.ui.ActionBar.n6.Fi;
            str = f6.L1(stargiftattributemodel.rarity, numArr);
        } else if (i7 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = c1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = c1Var.b;
            e3Var.d(stargiftattributebackdrop);
            e3Var.e(stargiftattributepattern);
            e3Var.y = org.telegram.ui.ActionBar.n6.d6;
            textView.setText(stargiftattributebackdrop.name);
            f1.a(f1Var, stargiftattributepattern.document, 48, n41Var.H, false);
            p9Var.setColorFilter(new PorterDuffColorFilter(i0.a.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = f6.L1(stargiftattributebackdrop.rarity, numArr);
        } else if (i7 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = c1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = c1Var.b;
            e3Var.d(stargiftattributebackdrop2);
            e3Var.e(stargiftattributepattern2);
            e3Var.y = org.telegram.ui.ActionBar.n6.d6;
            textView.setText(stargiftattributepattern2.name);
            f1.a(f1Var, stargiftattributepattern2.document, 64, n41Var.H, false);
            p9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = f6.L1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i7 == 0) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, f1Var.a);
        } else {
            org.telegram.ui.ActionBar.u6.q(textView);
            textView.setTextColor(-1);
        }
        f1Var.f.setText(str);
        f1Var.h = numArr[0];
        f1Var.b();
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new f1(context, i6Var);
    }
}
