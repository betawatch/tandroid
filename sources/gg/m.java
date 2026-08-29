package gg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.st;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m extends LinearLayout {
    public final st a;
    public final TextView b;
    public l c;

    public m(Context context, c6 c6Var) {
        super(context);
        setOrientation(0);
        st stVar = new st(context, c6Var);
        this.a = stVar;
        stVar.setLines(1);
        stVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new k(this)};
        stVar.setInputType(16384);
        stVar.setFilters(inputFilterArr);
        stVar.setTextSize(1, 16.0f);
        stVar.setTextColor(g6.v0(g6.Ud, c6Var));
        stVar.setLinkTextColor(g6.v0(g6.hc, c6Var));
        stVar.setHighlightColor(g6.v0(g6.uf, c6Var));
        int i10 = g6.Vd;
        stVar.setHintColor(g6.v0(i10, c6Var));
        stVar.setHintTextColor(g6.v0(i10, c6Var));
        stVar.setCursorColor(g6.v0(g6.Wd, c6Var));
        stVar.setHandlesColor(g6.v0(g6.vf, c6Var));
        stVar.setBackground(null);
        stVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        stVar.addTextChangedListener(new bh.c(this, 2));
        stVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(g6.v0(g6.j5, c6Var));
        if (!LocaleController.isRTL) {
            addView(textView, f6.t(-2, -2, 16, 20, 0, 0, 0));
            addView(stVar, f6.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t10 = f6.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(stVar, t10);
            addView(textView, f6.t(-2, -2, 16, 0, 0, 20, 0));
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
