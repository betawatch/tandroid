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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class mh0 extends FrameLayout {
    public final b6 a;
    public final TextView b;
    public final org.telegram.ui.Cells.v1 c;
    public final /* synthetic */ oh0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh0(oh0 oh0Var, Context context) {
        super(context);
        this.d = oh0Var;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.i5, this, null);
        b6 b6Var = new b6(getContext());
        this.a = b6Var;
        b6Var.setTextSize(1, 14.0f);
        b6Var.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.y6.f7;
        org.telegram.ui.ActionBar.f7.V(b6Var, i10, null);
        b6Var.setSingleLine(true);
        b6Var.setEllipsize(TextUtils.TruncateAt.END);
        b6Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextView textView = new TextView(getContext());
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView, i10, null);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        org.telegram.ui.Cells.v1 v1Var = new org.telegram.ui.Cells.v1(this, getContext(), 1);
        this.c = v1Var;
        v1Var.setTextSize(AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.f7.Z(v1Var, i10, null);
        v1Var.setGravity(LocaleController.isRTL ? 3 : 5);
        v1Var.setOnClickListener(new x80(this, 7));
        boolean z10 = LocaleController.isRTL;
        addView(b6Var, kb1.h(-2, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 16, 0.0f, z10 ? 16 : 0, 0.0f));
        addView(textView, kb1.h(-2, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(v1Var, kb1.h(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void a(String str, ArrayList arrayList, int i10, int i11, int i12, boolean z10) {
        b6 b6Var = this.a;
        if (arrayList != null) {
            NotificationCenter.listenEmojiLoading(b6Var);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            MediaDataController.addTextStyleRuns((ArrayList<TLRPC.MessageEntity>) arrayList, str, spannableStringBuilder);
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, b6Var.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(replaceEmoji, arrayList, b6Var.getPaint().getFontMetricsInt());
            b6Var.setText(replaceEmoji);
        } else {
            b6Var.setText(Emoji.replaceEmoji(str, b6Var.getPaint().getFontMetricsInt(), false));
        }
        String format = String.format("%d", Integer.valueOf(i10));
        SpannableStringBuilder spannableStringBuilder2 = LocaleController.isRTL ? new SpannableStringBuilder(a1.g.m(i10, "% – ")) : new SpannableStringBuilder(ic.a.j(i10, " – ", "%"));
        spannableStringBuilder2.setSpan(new r61(AndroidUtilities.bold()), 3, format.length() + 3, 33);
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
        b6 b6Var = this.a;
        TextView textView = this.b;
        if (z11) {
            int left = b6Var.getLeft() - textView.getMeasuredWidth();
            textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
        } else {
            int right = b6Var.getRight();
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
