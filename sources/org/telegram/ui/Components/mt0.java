package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mt0 extends FrameLayout {
    public final org.telegram.ui.Cells.f6 a;

    public mt0(int i10, Context context, boolean z10, org.telegram.ui.ActionBar.c6 c6Var, fq0 fq0Var) {
        super(context);
        org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, c6Var);
        this.a = f6Var;
        f6Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 2, -1));
        addView(f6Var, i7.f6.c(-2.0f, -1));
        View view = new View(context);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = org.telegram.ui.ActionBar.g6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.g6.l1(0.4f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)}));
        addView(view, i7.f6.c(60.0f, -1));
        nh.d dVar = new nh.d(context, c6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(z10 ? R.string.MoreSimilarBotsButton : R.string.MoreSimilarButton));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new iq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.g(spannableStringBuilder, false, true);
        addView(dVar, i7.f6.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new u70(fq0Var, 17));
        y80 y80Var = new y80(context, c6Var);
        y80Var.setTextSize(1, 13.0f);
        y80Var.setTextAlignment(4);
        y80Var.setGravity(17);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.n6, c6Var));
        y80Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        SpannableStringBuilder premiumText = AndroidUtilities.premiumText(LocaleController.getString(z10 ? R.string.MoreSimilarBotsText : R.string.MoreSimilarText), new fq0(fq0Var, 4));
        SpannableString spannableString2 = new SpannableString("" + MessagesController.getInstance(i10).recommendedChannelsLimitPremium);
        spannableString2.setSpan(new t41(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        y80Var.setText(AndroidUtilities.replaceCharSequence("%s", premiumText, spannableString2));
        addView(y80Var, i7.f6.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(145.0f), TLObject.FLAG_30));
    }
}
