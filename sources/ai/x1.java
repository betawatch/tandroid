package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class x1 extends f61 {
    static {
        f61.setup(new x1());
    }

    public static g61 a(int i10, v1 v1Var) {
        g61 J = g61.J(x1.class);
        J.u = 1;
        J.z = i10;
        J.G = v1Var;
        return J;
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        String str;
        y1 y1Var = (y1) view;
        v1 v1Var = (v1) g61Var.G;
        int i10 = g61Var.z;
        Integer[] numArr = new Integer[1];
        y1Var.s = i10 == 0;
        org.telegram.ui.Components.w9 w9Var = y1Var.d;
        TextView textView = y1Var.e;
        yh.d1 d1Var = y1Var.c;
        y1Var.v = v1Var;
        if (i10 == 0) {
            d1Var.d(null);
            d1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = v1Var.c;
            textView.setText(stargiftattributemodel.name);
            y1.a(y1Var, stargiftattributemodel.document, 80, g61Var.G, true);
            w9Var.setColorFilter(null);
            d1Var.w = org.telegram.ui.ActionBar.h6.Oh;
            str = l7.e2(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = v1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = v1Var.b;
            d1Var.d(stargiftattributebackdrop);
            d1Var.e(stargiftattributepattern);
            d1Var.w = org.telegram.ui.ActionBar.h6.d6;
            textView.setText(stargiftattributebackdrop.name);
            y1.a(y1Var, stargiftattributepattern.document, 48, g61Var.G, false);
            w9Var.setColorFilter(new PorterDuffColorFilter(i0.a.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = l7.e2(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = v1Var.a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = v1Var.b;
            d1Var.d(stargiftattributebackdrop2);
            d1Var.e(stargiftattributepattern2);
            d1Var.w = org.telegram.ui.ActionBar.h6.d6;
            textView.setText(stargiftattributepattern2.name);
            y1.a(y1Var, stargiftattributepattern2.document, 64, g61Var.G, false);
            w9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = l7.e2(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        textView.setTextColor(i10 == 0 ? org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.j5, y1Var.a) : -1);
        y1Var.f.setText(str);
        y1Var.h = numArr[0];
        y1Var.b();
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y1(context, d6Var);
    }
}
