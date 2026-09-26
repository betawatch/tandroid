package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.n90;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class a3 extends FrameLayout {
    public final LinearLayout a;
    public final LinearLayout b;
    public final org.telegram.ui.Components.y5 c;
    public final n90 d;
    public final ImageView e;
    public final ImageView f;
    public final org.telegram.ui.Components.w9 h;
    public final org.telegram.ui.Components.k9 n;
    public boolean r;

    public a3(Context context) {
        super(context);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context, false);
        this.n = k9Var;
        k9Var.setStepFactor(0.56790125f);
        k9Var.setVisibility(8);
        k9Var.setCount(0);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.h = w9Var;
        w9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), 0);
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(context);
        this.c = y5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        y5Var.setEllipsize(truncateAt);
        y5Var.setTextSize(1, 14.0f);
        y5Var.setTypeface(AndroidUtilities.bold());
        y5Var.setMaxLines(5);
        linearLayout.addView(y5Var, w7.y5.o(-2, -2, 0.0f, (LocaleController.isRTL ? 5 : 3) | 48));
        n90 n90Var = new n90(context, null);
        this.d = n90Var;
        n90Var.setTextSize(1, 13.0f);
        n90Var.setEllipsize(truncateAt);
        n90Var.setMaxLines(5);
        linearLayout.addView(n90Var, w7.y5.o(-1, -2, 0.0f, 48));
        NotificationCenter.listenEmojiLoading(y5Var);
        NotificationCenter.listenEmojiLoading(n90Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (LocaleController.isRTL) {
            linearLayout2.addView(linearLayout, w7.y5.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(k9Var, w7.y5.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(w9Var, w7.y5.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(w9Var, w7.y5.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(k9Var, w7.y5.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, w7.y5.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, w7.y5.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.arrow_newchat);
        addView(imageView, w7.y5.d(16, 16.0f, (LocaleController.isRTL ? 3 : 5) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(imageView2, w7.y5.d(36, 36.0f, (LocaleController.isRTL ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        d();
    }

    public final void a(int i10, ArrayList arrayList) {
        int min = Math.min(3, arrayList == null ? 0 : arrayList.size());
        org.telegram.ui.Components.k9 k9Var = this.n;
        boolean z10 = min != k9Var.a.n;
        if (min <= 1) {
            k9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
            k9Var.setSize(AndroidUtilities.dp(36.0f));
        } else {
            k9Var.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
            k9Var.setSize(AndroidUtilities.dp(30.0f));
        }
        k9Var.setCount(min);
        k9Var.setVisibility(min <= 0 ? 8 : 0);
        k9Var.getLayoutParams().width = min <= 1 ? AndroidUtilities.dp(36.0f) : AndroidUtilities.dp(hg.c.f(min, 1, 18, 30));
        if (z10) {
            this.a.requestLayout();
        }
        if (arrayList != null) {
            int i11 = 0;
            while (i11 < 3) {
                k9Var.b(i11, i11 >= arrayList.size() ? null : (TLObject) arrayList.get(i11), i10);
                i11++;
            }
        }
        k9Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.r = z11;
        int i10 = TextUtils.isEmpty(charSequence) ? 8 : 0;
        org.telegram.ui.Components.y5 y5Var = this.c;
        y5Var.setVisibility(i10);
        y5Var.setText(charSequence);
        y5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        this.e.setVisibility(z10 ? 0 : 8);
        this.f.setVisibility(8);
        int dp = z10 ? AndroidUtilities.dp(24.0f) : 0;
        boolean z12 = LocaleController.isRTL;
        int i11 = z12 ? dp : 0;
        if (z12) {
            dp = 0;
        }
        this.b.setPadding(i11, 0, dp, 0);
        d();
    }

    public final void d() {
        this.c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, this.r ? org.telegram.ui.ActionBar.h6.q7 : org.telegram.ui.ActionBar.h6.G6, false));
        int i10 = org.telegram.ui.ActionBar.h6.y6;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        n90 n90Var = this.d;
        n90Var.setTextColor(w02);
        n90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.gc, false));
        int w03 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(w03, mode);
        int w04 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        ImageView imageView = this.f;
        imageView.setColorFilter(w04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.w5.c(null, org.telegram.ui.ActionBar.w5.b(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.w5.a, false))));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
        LinearLayout linearLayout = this.b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), TLObject.FLAG_30));
        this.f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.h.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.e.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new z2(this, onClickListener, 0));
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        this.e.setVisibility(4);
        ImageView imageView = this.f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    public void setCompact(boolean z10) {
    }
}
