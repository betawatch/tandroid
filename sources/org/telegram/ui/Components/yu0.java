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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class yu0 extends FrameLayout {
    public final org.telegram.ui.Cells.i6 a;
    public final View b;

    public yu0(int i10, Context context, boolean z10, org.telegram.ui.ActionBar.e6 e6Var, or0 or0Var) {
        super(context);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, e6Var);
        this.a = i6Var;
        i6Var.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var), 2, -1));
        addView(i6Var, w7.x5.d(-2.0f, -1));
        View view = new View(context);
        this.b = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = org.telegram.ui.ActionBar.i6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.i6.m1(0.4f, org.telegram.ui.ActionBar.i6.w0(i11, e6Var)), org.telegram.ui.ActionBar.i6.w0(i11, e6Var)}));
        addView(view, w7.x5.d(60.0f, -1));
        ci.d dVar = new ci.d(context, e6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(z10 ? R.string.MoreSimilarBotsButton : R.string.MoreSimilarButton));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new er(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.g(spannableStringBuilder, false, true);
        addView(dVar, w7.x5.a(48.0f, 14.0f, 38.0f, 14.0f, 0.0f, -1, 48));
        dVar.setOnClickListener(new b90(or0Var, 16));
        ea0 ea0Var = new ea0(context, e6Var);
        ea0Var.setTextSize(1, 13.0f);
        ea0Var.setTextAlignment(4);
        ea0Var.setGravity(17);
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.n6, e6Var));
        ea0Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        SpannableStringBuilder premiumText = AndroidUtilities.premiumText(LocaleController.getString(z10 ? R.string.MoreSimilarBotsText : R.string.MoreSimilarText), new or0(or0Var, 4));
        SpannableString spannableString2 = new SpannableString("" + MessagesController.getInstance(i10).recommendedChannelsLimitPremium);
        spannableString2.setSpan(new m61(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        ea0Var.setText(AndroidUtilities.replaceCharSequence("%s", premiumText, spannableString2));
        addView(ea0Var, w7.x5.a(-2.0f, 24.0f, 96.0f, 24.0f, 12.0f, -1, 49));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(145.0f), TLObject.FLAG_30));
    }
}
