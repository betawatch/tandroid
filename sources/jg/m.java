package jg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xt;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class m extends LinearLayout {
    public final xt a;
    public final TextView b;
    public l c;

    public m(Context context, g6 g6Var) {
        super(context);
        setOrientation(0);
        xt xtVar = new xt(context, g6Var);
        this.a = xtVar;
        xtVar.setLines(1);
        xtVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new k(this)};
        xtVar.setInputType(16384);
        xtVar.setFilters(inputFilterArr);
        xtVar.setTextSize(1, 16.0f);
        xtVar.setTextColor(k6.v0(k6.Ud, g6Var));
        xtVar.setLinkTextColor(k6.v0(k6.hc, g6Var));
        xtVar.setHighlightColor(k6.v0(k6.uf, g6Var));
        int i10 = k6.Vd;
        xtVar.setHintColor(k6.v0(i10, g6Var));
        xtVar.setHintTextColor(k6.v0(i10, g6Var));
        xtVar.setCursorColor(k6.v0(k6.Wd, g6Var));
        xtVar.setHandlesColor(k6.v0(k6.vf, g6Var));
        xtVar.setBackground(null);
        xtVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        xtVar.addTextChangedListener(new eh.c(this, 2));
        xtVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(k6.v0(k6.j5, g6Var));
        if (!LocaleController.isRTL) {
            addView(textView, c6.t(-2, -2, 16, 20, 0, 0, 0));
            addView(xtVar, c6.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t6 = c6.t(-1, -2, 16, 20, 0, 36, 0);
            t6.weight = 1.0f;
            addView(xtVar, t6);
            addView(textView, c6.t(-2, -2, 16, 0, 0, 20, 0));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }

    public void setAfterTextChangedListener(l lVar) {
        this.c = lVar;
    }

    public void setCount(int i10) {
        this.b.setText(String.valueOf(i10));
    }
}
