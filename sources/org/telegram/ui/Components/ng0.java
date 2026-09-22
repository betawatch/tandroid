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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class ng0 extends FrameLayout {
    public final w5 a;
    public final TextView b;
    public final org.telegram.ui.Cells.w1 c;
    public final /* synthetic */ pg0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng0(pg0 pg0Var, Context context) {
        super(context);
        this.d = pg0Var;
        setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.i5, false));
        w5 w5Var = new w5(getContext());
        this.a = w5Var;
        w5Var.setTextSize(1, 14.0f);
        w5Var.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.i6.f7;
        w5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        w5Var.setSingleLine(true);
        w5Var.setEllipsize(TextUtils.TruncateAt.END);
        w5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, getContext(), 1);
        this.c = w1Var;
        w1Var.setTextSize(AndroidUtilities.dp(14.0f));
        w1Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        w1Var.setGravity(LocaleController.isRTL ? 3 : 5);
        w1Var.setOnClickListener(new x70(this, 9));
        boolean z10 = LocaleController.isRTL;
        addView(w5Var, w7.x5.d(-2, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 16, 0.0f, z10 ? 16 : 0, 0.0f));
        addView(textView, w7.x5.d(-2, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(w1Var, w7.x5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i10, int i11, int i12, boolean z10) {
        w5 w5Var = this.a;
        if (arrayList != null) {
            NotificationCenter.listenEmojiLoading(w5Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            MediaDataController.addTextStyleRuns((ArrayList<TLRPC.MessageEntity>) arrayList, str, spannableStringBuilder);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, w5Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, w5Var.getPaint().getFontMetricsInt());
            w5Var.setText(replaceEmoji);
        } else {
            w5Var.setText(Emoji.replaceEmoji(str, w5Var.getPaint().getFontMetricsInt(), false));
        }
        String format = String.format("%d", Integer.valueOf(i10));
        SpannableStringBuilder spannableStringBuilder2 = LocaleController.isRTL ? new SpannableStringBuilder(a4.a.n(i10, "% – ")) : new SpannableStringBuilder(hg.c.j(i10, " – ", "%"));
        spannableStringBuilder2.setSpan(new f51(AndroidUtilities.bold()), 3, format.length() + 3, 33);
        this.b.setText(spannableStringBuilder2);
        org.telegram.ui.Cells.w1 w1Var = this.c;
        if (i12 == 0) {
            if (this.d.r.quiz) {
                w1Var.c(LocaleController.formatPluralString("Answer", i11, new Object[0]), z10, true);
                return;
            } else {
                w1Var.c(LocaleController.formatPluralString("Vote", i11, new Object[0]), z10, true);
                return;
            }
        }
        if (i12 == 1) {
            w1Var.c(LocaleController.getString(R.string.PollExpand), z10, true);
        } else {
            w1Var.c(LocaleController.getString(R.string.PollCollapse), z10, true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = LocaleController.isRTL;
        w5 w5Var = this.a;
        TextView textView = this.b;
        if (z11) {
            int left = w5Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
        } else {
            int right = w5Var.getRight();
            textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30);
        TextView textView = this.b;
        measureChildWithMargins(textView, i10, 0, makeMeasureSpec, 0);
        org.telegram.ui.Cells.w1 w1Var = this.c;
        measureChildWithMargins(w1Var, i10, 0, makeMeasureSpec, 0);
        measureChildWithMargins(this.a, i10, AndroidUtilities.dp(32.0f) + w1Var.getMeasuredWidth() + textView.getMeasuredWidth(), makeMeasureSpec, 0);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(32.0f));
    }
}
