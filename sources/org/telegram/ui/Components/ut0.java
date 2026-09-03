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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ut0 extends FrameLayout {
    public final org.telegram.ui.Cells.h6 a;

    public ut0(int i10, Context context, boolean z4, org.telegram.ui.ActionBar.g6 g6Var, nq0 nq0Var) {
        super(context);
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, g6Var);
        this.a = h6Var;
        h6Var.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, g6Var), 2, -1));
        addView(h6Var, k7.c6.c(-2.0f, -1));
        View view = new View(context);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.k6.l1(0.4f, org.telegram.ui.ActionBar.k6.v0(i11, g6Var)), org.telegram.ui.ActionBar.k6.v0(i11, g6Var)}));
        addView(view, k7.c6.c(60.0f, -1));
        qh.d dVar = new qh.d(context, g6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(z4 ? R.string.MoreSimilarBotsButton : R.string.MoreSimilarButton));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new oq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.g(spannableStringBuilder, false, true);
        addView(dVar, k7.c6.d(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new b80(nq0Var, 17));
        g90 g90Var = new g90(context, g6Var);
        g90Var.setTextSize(1, 13.0f);
        g90Var.setTextAlignment(4);
        g90Var.setGravity(17);
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.n6, g6Var));
        g90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        SpannableStringBuilder premiumText = AndroidUtilities.premiumText(LocaleController.getString(z4 ? R.string.MoreSimilarBotsText : R.string.MoreSimilarText), new nq0(nq0Var, 4));
        SpannableString spannableString2 = new SpannableString("" + MessagesController.getInstance(i10).recommendedChannelsLimitPremium);
        spannableString2.setSpan(new e51(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        g90Var.setText(AndroidUtilities.replaceCharSequence("%s", premiumText, spannableString2));
        addView(g90Var, k7.c6.d(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(145.0f), TLObject.FLAG_30));
    }
}
