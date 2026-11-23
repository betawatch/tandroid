package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class e1 extends n41 {
    static {
        n41.h(new e1());
    }

    public static o41 i(int i7, c1 c1Var) {
        o41 K = o41.K(e1.class);
        K.v = 1;
        K.A = i7;
        K.H = c1Var;
        return K;
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        String str;
        f1 f1Var = (f1) view;
        c1 c1Var = (c1) o41Var.H;
        int i7 = o41Var.A;
        Integer[] numArr = new Integer[1];
        f1Var.s = i7 == 0;
        org.telegram.ui.Components.q9 q9Var = f1Var.d;
        TextView textView = f1Var.e;
        bi.c3 c3Var = f1Var.c;
        f1Var.w = c1Var;
        if (i7 == 0) {
            c3Var.d(null);
            c3Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = c1Var.c;
            textView.setText(stargiftattributemodel.name);
            f1.a(f1Var, stargiftattributemodel.document, 80, o41Var.H, true);
            q9Var.setColorFilter(null);
            c3Var.y = org.telegram.ui.ActionBar.m6.Fi;
            str = f6.L1(stargiftattributemodel.rarity, numArr);
        } else if (i7 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = c1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = c1Var.b;
            c3Var.d(stargiftattributebackdrop);
            c3Var.e(stargiftattributepattern);
            c3Var.y = org.telegram.ui.ActionBar.m6.d6;
            textView.setText(stargiftattributebackdrop.name);
            f1.a(f1Var, stargiftattributepattern.document, 48, o41Var.H, false);
            q9Var.setColorFilter(new PorterDuffColorFilter(i0.a.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = f6.L1(stargiftattributebackdrop.rarity, numArr);
        } else if (i7 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = c1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = c1Var.b;
            c3Var.d(stargiftattributebackdrop2);
            c3Var.e(stargiftattributepattern2);
            c3Var.y = org.telegram.ui.ActionBar.m6.d6;
            textView.setText(stargiftattributepattern2.name);
            f1.a(f1Var, stargiftattributepattern2.document, 64, o41Var.H, false);
            q9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = f6.L1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i7 == 0) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, f1Var.a);
        } else {
            org.telegram.ui.ActionBar.t6.q(textView);
            textView.setTextColor(-1);
        }
        f1Var.f.setText(str);
        f1Var.h = numArr[0];
        f1Var.b();
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new f1(context, h6Var);
    }
}
