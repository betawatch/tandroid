package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yu0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 a;
    public final org.telegram.ui.Cells.m6 b;
    public final View c;

    public yu0(int i10, Context context, boolean z10, org.telegram.ui.ActionBar.u6 u6Var, np0 np0Var) {
        super(context);
        this.a = u6Var;
        org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(context, u6Var);
        this.b = m6Var;
        int i11 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i11, u6Var), 2, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        m6Var.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(m6Var, g02, null, N, u6Var);
        addView(m6Var, kb1.g(-2.0f, -1));
        View view = new View(context);
        this.c = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i12 = org.telegram.ui.ActionBar.y6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.y6.o1(0.4f, org.telegram.ui.ActionBar.y6.w0(i12, u6Var)), org.telegram.ui.ActionBar.y6.w0(i12, u6Var)}));
        addView(view, kb1.g(60.0f, -1));
        fi.d dVar = new fi.d(context, u6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(z10 ? R.string.MoreSimilarBotsButton : R.string.MoreSimilarButton));
        spannableStringBuilder.append((CharSequence) " ");
        SpannableString spannableString = new SpannableString("l");
        spannableString.setSpan(new zq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        dVar.i(spannableStringBuilder, false, true);
        addView(dVar, kb1.h(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
        dVar.setOnClickListener(new x80(np0Var, 15));
        aa0 aa0Var = new aa0(context, u6Var);
        aa0Var.setTextSize(1, 13.0f);
        aa0Var.setTextAlignment(4);
        aa0Var.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.n6, u6Var);
        aa0Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
        SpannableStringBuilder premiumText = AndroidUtilities.premiumText(LocaleController.getString(z10 ? R.string.MoreSimilarBotsText : R.string.MoreSimilarText), new np0(np0Var, 8));
        SpannableString spannableString2 = new SpannableString("" + MessagesController.getInstance(i10).recommendedChannelsLimitPremium);
        spannableString2.setSpan(new r61(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        aa0Var.setText(AndroidUtilities.replaceCharSequence("%s", premiumText, spannableString2));
        addView(aa0Var, kb1.h(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d6));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(145.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        View view = this.c;
        if (view != null) {
            try {
                if (view.getBackground() instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) view.getBackground();
                    int i10 = org.telegram.ui.ActionBar.y6.d6;
                    gradientDrawable.setColors(new int[]{org.telegram.ui.ActionBar.y6.o1(0.4f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var)), org.telegram.ui.ActionBar.y6.w0(i10, u6Var)});
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
