package dg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.mt;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m extends LinearLayout {
    public final mt a;
    public final TextView b;
    public l c;

    public m(Context context, b6 b6Var) {
        super(context);
        setOrientation(0);
        mt mtVar = new mt(context, b6Var);
        this.a = mtVar;
        mtVar.setLines(1);
        mtVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new k(this)};
        mtVar.setInputType(16384);
        mtVar.setFilters(inputFilterArr);
        mtVar.setTextSize(1, 16.0f);
        mtVar.setTextColor(f6.v0(f6.Ud, b6Var));
        mtVar.setLinkTextColor(f6.v0(f6.hc, b6Var));
        mtVar.setHighlightColor(f6.v0(f6.uf, b6Var));
        int i9 = f6.Vd;
        mtVar.setHintColor(f6.v0(i9, b6Var));
        mtVar.setHintTextColor(f6.v0(i9, b6Var));
        mtVar.setCursorColor(f6.v0(f6.Wd, b6Var));
        mtVar.setHandlesColor(f6.v0(f6.vf, b6Var));
        mtVar.setBackground(null);
        mtVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        mtVar.addTextChangedListener(new bh.f(this, 1));
        mtVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(f6.v0(f6.j5, b6Var));
        if (!LocaleController.isRTL) {
            addView(textView, e6.t(-2, -2, 16, 20, 0, 0, 0));
            addView(mtVar, e6.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t10 = e6.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(mtVar, t10);
            addView(textView, e6.t(-2, -2, 16, 0, 0, 20, 0));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }

    public void setAfterTextChangedListener(l lVar) {
        this.c = lVar;
    }

    public void setCount(int i9) {
        this.b.setText(String.valueOf(i9));
    }
}
