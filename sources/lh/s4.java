package lh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.oq;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class s4 extends TextView {
    public final oq a;

    public s4(Context context, g6 g6Var) {
        super(context);
        int v02 = k6.v0(k6.y8, g6Var);
        setTextColor(v02);
        setBackground(k6.Z(k6.l1(0.08f, v02), k6.l1(0.15f, v02), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f)));
        setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        setGravity(17);
        setTypeface(AndroidUtilities.bold());
        k7.e6.a(this);
        oq oqVar = new oq(R.drawable.arrows_select, 0);
        this.a = oqVar;
        oqVar.spaceScaleX = 0.8f;
        oqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), TLObject.FLAG_30));
    }

    public void setSorting(a5 a5Var) {
        oq oqVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        if (a5Var == a5.c) {
            oqVar = new oq(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortDateShort));
        } else if (a5Var == a5.b) {
            oqVar = new oq(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortPriceShort));
        } else if (a5Var == a5.d) {
            oqVar = new oq(R.drawable.mini_gift_sorting_num, 0);
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortNumberShort));
        } else {
            oqVar = null;
        }
        if (oqVar != null) {
            oqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        append.setSpan(this.a, append.length() - 1, append.length(), 33);
        setText(append);
    }
}
