package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class jg0 extends FrameLayout {
    public final x5 a;
    public final TextView b;
    public final org.telegram.ui.Cells.v1 c;
    public final /* synthetic */ lg0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg0(lg0 lg0Var, Context context) {
        super(context);
        this.d = lg0Var;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i5, false));
        x5 x5Var = new x5(getContext());
        this.a = x5Var;
        x5Var.setTextSize(1, 14.0f);
        x5Var.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.g6.f7;
        x5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        x5Var.setSingleLine(true);
        x5Var.setEllipsize(TextUtils.TruncateAt.END);
        x5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        org.telegram.ui.Cells.v1 v1Var = new org.telegram.ui.Cells.v1(this, getContext(), 1);
        this.c = v1Var;
        v1Var.setTextSize(AndroidUtilities.dp(14.0f));
        v1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        v1Var.setGravity(LocaleController.isRTL ? 3 : 5);
        v1Var.setOnClickListener(new u70(this, 9));
        boolean z10 = LocaleController.isRTL;
        addView(x5Var, i7.f6.d(-2, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 16, 0.0f, z10 ? 16 : 0, 0.0f));
        addView(textView, i7.f6.d(-2, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(v1Var, i7.f6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i10, int i11, int i12, boolean z10) {
        x5 x5Var = this.a;
        if (arrayList != null) {
            NotificationCenter.listenEmojiLoading(x5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            MediaDataController.addTextStyleRuns((ArrayList<TLRPC.MessageEntity>) arrayList, str, spannableStringBuilder);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, x5Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, x5Var.getPaint().getFontMetricsInt());
            x5Var.setText(replaceEmoji);
        } else {
            x5Var.setText(Emoji.replaceEmoji(str, x5Var.getPaint().getFontMetricsInt(), false));
        }
        String format = String.format("%d", Integer.valueOf(i10));
        SpannableStringBuilder spannableStringBuilder2 = LocaleController.isRTL ? new SpannableStringBuilder(u3.c.d(i10, "% – ")) : new SpannableStringBuilder(j7.l1.l(i10, " – ", "%"));
        spannableStringBuilder2.setSpan(new t41(AndroidUtilities.bold()), 3, format.length() + 3, 33);
        this.b.setText(spannableStringBuilder2);
        org.telegram.ui.Cells.v1 v1Var = this.c;
        if (i12 == 0) {
            if (this.d.r.quiz) {
                v1Var.c(LocaleController.formatPluralString("Answer", i11, new Object[0]), z10, true);
                return;
            } else {
                v1Var.c(LocaleController.formatPluralString("Vote", i11, new Object[0]), z10, true);
                return;
            }
        }
        if (i12 == 1) {
            v1Var.c(LocaleController.getString(R.string.PollExpand), z10, true);
        } else {
            v1Var.c(LocaleController.getString(R.string.PollCollapse), z10, true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = LocaleController.isRTL;
        x5 x5Var = this.a;
        TextView textView = this.b;
        if (z11) {
            int left = x5Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
        } else {
            int right = x5Var.getRight();
            textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30);
        TextView textView = this.b;
        measureChildWithMargins(textView, i10, 0, makeMeasureSpec, 0);
        org.telegram.ui.Cells.v1 v1Var = this.c;
        measureChildWithMargins(v1Var, i10, 0, makeMeasureSpec, 0);
        measureChildWithMargins(this.a, i10, AndroidUtilities.dp(32.0f) + v1Var.getMeasuredWidth() + textView.getMeasuredWidth(), makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(32.0f));
    }
}
