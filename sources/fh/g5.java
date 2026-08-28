package fh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.eq;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g5 extends TextView {
    public final eq a;

    public g5(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.y8, b6Var);
        setTextColor(v02);
        setBackground(org.telegram.ui.ActionBar.f6.Z(org.telegram.ui.ActionBar.f6.l1(0.08f, v02), org.telegram.ui.ActionBar.f6.l1(0.15f, v02), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f)));
        setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        setGravity(17);
        setTypeface(AndroidUtilities.bold());
        g7.g6.a(this);
        eq eqVar = new eq(R.drawable.arrows_select, 0);
        this.a = eqVar;
        eqVar.spaceScaleX = 0.8f;
        eqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), TLObject.FLAG_30));
    }

    public void setSorting(o5 o5Var) {
        eq eqVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        if (o5Var == o5.c) {
            eqVar = new eq(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortDateShort));
        } else if (o5Var == o5.b) {
            eqVar = new eq(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortPriceShort));
        } else if (o5Var == o5.d) {
            eqVar = new eq(R.drawable.mini_gift_sorting_num, 0);
            spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortNumberShort));
        } else {
            eqVar = null;
        }
        if (eqVar != null) {
            eqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        append.setSpan(this.a, append.length() - 1, append.length(), 33);
        setText(append);
    }
}
