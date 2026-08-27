package eg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.lt;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m extends LinearLayout {
    public final lt a;
    public final TextView b;
    public l c;

    public m(Context context, c6 c6Var) {
        super(context);
        setOrientation(0);
        lt ltVar = new lt(context, c6Var);
        this.a = ltVar;
        ltVar.setLines(1);
        ltVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new k(this)};
        ltVar.setInputType(16384);
        ltVar.setFilters(inputFilterArr);
        ltVar.setTextSize(1, 16.0f);
        ltVar.setTextColor(g6.v0(g6.Ud, c6Var));
        ltVar.setLinkTextColor(g6.v0(g6.hc, c6Var));
        ltVar.setHighlightColor(g6.v0(g6.uf, c6Var));
        int i10 = g6.Vd;
        ltVar.setHintColor(g6.v0(i10, c6Var));
        ltVar.setHintTextColor(g6.v0(i10, c6Var));
        ltVar.setCursorColor(g6.v0(g6.Wd, c6Var));
        ltVar.setHandlesColor(g6.v0(g6.vf, c6Var));
        ltVar.setBackground(null);
        ltVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        ltVar.addTextChangedListener(new ch.e(this, 1));
        ltVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(g6.v0(g6.j5, c6Var));
        if (!LocaleController.isRTL) {
            addView(textView, z5.t(-2, -2, 16, 20, 0, 0, 0));
            addView(ltVar, z5.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t10 = z5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(ltVar, t10);
            addView(textView, z5.t(-2, -2, 16, 0, 0, 20, 0));
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
