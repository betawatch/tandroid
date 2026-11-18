package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class e1 extends k41 {
    static {
        k41.h(new e1());
    }

    public static l41 i(int i7, c1 c1Var) {
        l41 K = l41.K(e1.class);
        K.v = 1;
        K.A = i7;
        K.H = c1Var;
        return K;
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        String str;
        f1 f1Var = (f1) view;
        c1 c1Var = (c1) l41Var.H;
        int i7 = l41Var.A;
        Integer[] numArr = new Integer[1];
        f1Var.s = i7 == 0;
        org.telegram.ui.Components.q9 q9Var = f1Var.d;
        TextView textView = f1Var.e;
        bi.y2 y2Var = f1Var.c;
        f1Var.w = c1Var;
        if (i7 == 0) {
            y2Var.d(null);
            y2Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = c1Var.c;
            textView.setText(stargiftattributemodel.name);
            f1.a(f1Var, stargiftattributemodel.document, 80, l41Var.H, true);
            q9Var.setColorFilter(null);
            y2Var.y = org.telegram.ui.ActionBar.n6.Fi;
            str = f6.L1(stargiftattributemodel.rarity, numArr);
        } else if (i7 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = c1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = c1Var.b;
            y2Var.d(stargiftattributebackdrop);
            y2Var.e(stargiftattributepattern);
            y2Var.y = org.telegram.ui.ActionBar.n6.d6;
            textView.setText(stargiftattributebackdrop.name);
            f1.a(f1Var, stargiftattributepattern.document, 48, l41Var.H, false);
            q9Var.setColorFilter(new PorterDuffColorFilter(i0.a.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = f6.L1(stargiftattributebackdrop.rarity, numArr);
        } else if (i7 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = c1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = c1Var.b;
            y2Var.d(stargiftattributebackdrop2);
            y2Var.e(stargiftattributepattern2);
            y2Var.y = org.telegram.ui.ActionBar.n6.d6;
            textView.setText(stargiftattributepattern2.name);
            f1.a(f1Var, stargiftattributepattern2.document, 64, l41Var.H, false);
            q9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
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

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new f1(context, i6Var);
    }
}
