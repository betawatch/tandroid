package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final LinearLayout a;
    public final LinearLayout b;
    public final org.telegram.ui.Components.p5 c;
    public final w70 d;
    public final ImageView e;
    public final ImageView f;
    public final org.telegram.ui.Components.k9 h;
    public final org.telegram.ui.Components.y8 n;
    public boolean r;

    public b3(Context context) {
        super(context);
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(7.0f));
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8(context, false);
        this.n = y8Var;
        y8Var.setStepFactor(0.56790125f);
        y8Var.setVisibility(8);
        y8Var.setCount(0);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.h = k9Var;
        k9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(id.a0 ? org.telegram.messenger.g0.L(24.0f) : 0, 0, id.a0 ? 0 : org.telegram.messenger.g0.L(24.0f), 0);
        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(context);
        this.c = p5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        p5Var.setEllipsize(truncateAt);
        p5Var.setTextSize(1, 14.0f);
        p5Var.setTypeface(org.telegram.messenger.g0.o());
        p5Var.setMaxLines(5);
        linearLayout.addView(p5Var, c8.ha.p(-2, -2, 0.0f, (id.a0 ? 5 : 3) | 48));
        w70 w70Var = new w70(context, null);
        this.d = w70Var;
        w70Var.setTextSize(1, 13.0f);
        w70Var.setEllipsize(truncateAt);
        w70Var.setMaxLines(5);
        linearLayout.addView(w70Var, c8.ha.p(-1, -2, 0.0f, 48));
        qs.i(p5Var);
        qs.i(w70Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (id.a0) {
            linearLayout2.addView(linearLayout, c8.ha.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(y8Var, c8.ha.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(k9Var, c8.ha.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(k9Var, c8.ha.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(y8Var, c8.ha.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, c8.ha.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, c8.ha.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.arrow_newchat);
        addView(imageView, c8.ha.d(16, 16.0f, (id.a0 ? 3 : 5) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(imageView2, c8.ha.d(36, 36.0f, (id.a0 ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        updateColors();
    }

    public final void a(int i7, ArrayList arrayList) {
        int min = Math.min(3, arrayList == null ? 0 : arrayList.size());
        org.telegram.ui.Components.y8 y8Var = this.n;
        boolean z9 = min != y8Var.a.n;
        if (min <= 1) {
            y8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
            y8Var.setSize(org.telegram.messenger.g0.L(36.0f));
        } else {
            y8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(20.0f));
            y8Var.setSize(org.telegram.messenger.g0.L(30.0f));
        }
        y8Var.setCount(min);
        y8Var.setVisibility(min <= 0 ? 8 : 0);
        y8Var.getLayoutParams().width = min <= 1 ? org.telegram.messenger.g0.L(36.0f) : org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(min, 1, 18, 30));
        if (z9) {
            this.a.requestLayout();
        }
        if (arrayList != null) {
            int i10 = 0;
            while (i10 < 3) {
                y8Var.b(i10, i7, i10 >= arrayList.size() ? null : (TLObject) arrayList.get(i10));
                i10++;
            }
        }
        y8Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z9, boolean z10) {
        this.r = z10;
        int i7 = TextUtils.isEmpty(charSequence) ? 8 : 0;
        org.telegram.ui.Components.p5 p5Var = this.c;
        p5Var.setVisibility(i7);
        p5Var.setText(charSequence);
        p5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        this.e.setVisibility(z9 ? 0 : 8);
        this.f.setVisibility(8);
        int L = z9 ? org.telegram.messenger.g0.L(24.0f) : 0;
        boolean z11 = id.a0;
        int i10 = z11 ? L : 0;
        if (z11) {
            L = 0;
        }
        this.b.setPadding(i10, 0, L, 0);
        updateColors();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        Point point = org.telegram.messenger.g0.q;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
        LinearLayout linearLayout = this.b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), TLObject.FLAG_30));
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
        super.setOnClickListener(new a3(this, onClickListener, 0));
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        this.e.setVisibility(4);
        ImageView imageView = this.f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        this.c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, this.r ? org.telegram.ui.ActionBar.m6.q7 : org.telegram.ui.ActionBar.m6.G6, false));
        int i7 = org.telegram.ui.ActionBar.m6.y6;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        w70 w70Var = this.d;
        w70Var.setTextColor(x02);
        w70Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Uc, false));
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(x03, mode);
        int x04 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        ImageView imageView = this.f;
        imageView.setColorFilter(x04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.b6.c(null, org.telegram.ui.ActionBar.b6.b(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.b6.a, false))));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z9) {
    }
}
