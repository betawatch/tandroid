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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.z90;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class x2 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final LinearLayout a;
    public final LinearLayout b;
    public final org.telegram.ui.Components.b6 c;
    public final z90 d;
    public final ImageView e;
    public final ImageView f;
    public final org.telegram.ui.Components.y9 h;
    public final org.telegram.ui.Components.m9 n;
    public boolean r;

    public x2(Context context) {
        super(context);
        setWillNotDraw(false);
        setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(context, false);
        this.n = m9Var;
        m9Var.setStepFactor(0.56790125f);
        m9Var.setVisibility(8);
        m9Var.setCount(0);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.h = y9Var;
        y9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(24.0f), 0);
        org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(context);
        this.c = b6Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b6Var.setEllipsize(truncateAt);
        b6Var.setTextSize(1, 14.0f);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setMaxLines(5);
        linearLayout.addView(b6Var, gb1.s(-2, -2, 0.0f, (LocaleController.isRTL ? 5 : 3) | 48));
        z90 z90Var = new z90(context, null);
        this.d = z90Var;
        z90Var.setTextSize(1, 13.0f);
        z90Var.setEllipsize(truncateAt);
        z90Var.setMaxLines(5);
        linearLayout.addView(z90Var, gb1.s(-1, -2, 0.0f, 48));
        NotificationCenter.listenEmojiLoading(b6Var);
        NotificationCenter.listenEmojiLoading(z90Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (LocaleController.isRTL) {
            linearLayout2.addView(linearLayout, gb1.h(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(m9Var, gb1.h(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(y9Var, gb1.h(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(y9Var, gb1.h(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(m9Var, gb1.h(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, gb1.h(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, gb1.g(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.arrow_newchat);
        addView(imageView, gb1.h(16, 16.0f, (LocaleController.isRTL ? 3 : 5) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        addView(imageView2, gb1.h(36, 36.0f, (LocaleController.isRTL ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        updateColors();
    }

    public final void a(int i10, ArrayList arrayList) {
        int min = Math.min(3, arrayList == null ? 0 : arrayList.size());
        org.telegram.ui.Components.m9 m9Var = this.n;
        boolean z10 = min != m9Var.a.n;
        if (min <= 1) {
            m9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
            m9Var.setSize(AndroidUtilities.dp(36.0f));
        } else {
            m9Var.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
            m9Var.setSize(AndroidUtilities.dp(30.0f));
        }
        m9Var.setCount(min);
        m9Var.setVisibility(min <= 0 ? 8 : 0);
        m9Var.getLayoutParams().width = min <= 1 ? AndroidUtilities.dp(36.0f) : AndroidUtilities.dp(c3.h0.w(min, 1, 18, 30));
        if (z10) {
            this.a.requestLayout();
        }
        if (arrayList != null) {
            int i11 = 0;
            while (i11 < 3) {
                m9Var.b(i11, i11 >= arrayList.size() ? null : (TLObject) arrayList.get(i11), i10);
                i11++;
            }
        }
        m9Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.r = z11;
        int i10 = TextUtils.isEmpty(charSequence) ? 8 : 0;
        org.telegram.ui.Components.b6 b6Var = this.c;
        b6Var.setVisibility(i10);
        b6Var.setText(charSequence);
        b6Var.setCompoundDrawables(null, null, null, null);
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
        updateColors();
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
        super.setOnClickListener(new w2(0, this, onClickListener));
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        this.e.setVisibility(4);
        ImageView imageView = this.f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        this.c.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, this.r ? org.telegram.ui.ActionBar.y6.q7 : org.telegram.ui.ActionBar.y6.G6, false));
        int i10 = org.telegram.ui.ActionBar.y6.y6;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        z90 z90Var = this.d;
        z90Var.setTextColor(x02);
        z90Var.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gc, false));
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(x03, mode);
        int x04 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        ImageView imageView = this.f;
        imageView.setColorFilter(x04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.o6.c(null, org.telegram.ui.ActionBar.o6.b(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.o6.a, false))));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z10) {
    }
}
