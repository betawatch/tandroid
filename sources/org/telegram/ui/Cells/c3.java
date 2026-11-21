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
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.m80;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class c3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final LinearLayout a;
    public final LinearLayout b;
    public final org.telegram.ui.Components.x5 c;
    public final m80 d;
    public final ImageView e;
    public final ImageView f;
    public final org.telegram.ui.Components.q9 h;
    public final org.telegram.ui.Components.e9 n;
    public boolean r;

    public c3(Context context) {
        super(context);
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(7.0f));
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9(context, false);
        this.n = e9Var;
        e9Var.setStepFactor(0.56790125f);
        e9Var.setVisibility(8);
        e9Var.setCount(0);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.h = q9Var;
        q9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gd.a0 ? org.telegram.messenger.g0.L(24.0f) : 0, 0, gd.a0 ? 0 : org.telegram.messenger.g0.L(24.0f), 0);
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.c = x5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        x5Var.setEllipsize(truncateAt);
        x5Var.setTextSize(1, 14.0f);
        x5Var.setTypeface(org.telegram.messenger.g0.o());
        x5Var.setMaxLines(5);
        linearLayout.addView(x5Var, c8.ma.p(-2, -2, 0.0f, (gd.a0 ? 5 : 3) | 48));
        m80 m80Var = new m80(context, null);
        this.d = m80Var;
        m80Var.setTextSize(1, 13.0f);
        m80Var.setEllipsize(truncateAt);
        m80Var.setMaxLines(5);
        linearLayout.addView(m80Var, c8.ma.p(-1, -2, 0.0f, 48));
        ks.i(x5Var);
        ks.i(m80Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (gd.a0) {
            linearLayout2.addView(linearLayout, c8.ma.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(e9Var, c8.ma.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(q9Var, c8.ma.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(q9Var, c8.ma.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(e9Var, c8.ma.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, c8.ma.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, c8.ma.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.arrow_newchat);
        addView(imageView, c8.ma.d(16, 16.0f, (gd.a0 ? 3 : 5) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(imageView2, c8.ma.d(36, 36.0f, (gd.a0 ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        updateColors();
    }

    public final void a(int i7, ArrayList arrayList) {
        int min = Math.min(3, arrayList == null ? 0 : arrayList.size());
        org.telegram.ui.Components.e9 e9Var = this.n;
        boolean z10 = min != e9Var.a.n;
        if (min <= 1) {
            e9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
            e9Var.setSize(org.telegram.messenger.g0.L(36.0f));
        } else {
            e9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(20.0f));
            e9Var.setSize(org.telegram.messenger.g0.L(30.0f));
        }
        e9Var.setCount(min);
        e9Var.setVisibility(min <= 0 ? 8 : 0);
        e9Var.getLayoutParams().width = min <= 1 ? org.telegram.messenger.g0.L(36.0f) : org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(min, 1, 18, 30));
        if (z10) {
            this.a.requestLayout();
        }
        if (arrayList != null) {
            int i10 = 0;
            while (i10 < 3) {
                e9Var.b(i10, i7, i10 >= arrayList.size() ? null : (TLObject) arrayList.get(i10));
                i10++;
            }
        }
        e9Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.r = z11;
        int i7 = TextUtils.isEmpty(charSequence) ? 8 : 0;
        org.telegram.ui.Components.x5 x5Var = this.c;
        x5Var.setVisibility(i7);
        x5Var.setText(charSequence);
        x5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        this.e.setVisibility(z10 ? 0 : 8);
        this.f.setVisibility(8);
        int L = z10 ? org.telegram.messenger.g0.L(24.0f) : 0;
        boolean z12 = gd.a0;
        int i10 = z12 ? L : 0;
        if (z12) {
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
        super.setOnClickListener(new b3(this, onClickListener, 0));
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        this.e.setVisibility(4);
        ImageView imageView = this.f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        this.c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, this.r ? org.telegram.ui.ActionBar.m6.q7 : org.telegram.ui.ActionBar.m6.G6, false));
        int i7 = org.telegram.ui.ActionBar.m6.y6;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        m80 m80Var = this.d;
        m80Var.setTextColor(x02);
        m80Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xc, false));
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(x03, mode);
        int x04 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        ImageView imageView = this.f;
        imageView.setColorFilter(x04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.a6.c(null, org.telegram.ui.ActionBar.a6.b(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.a6.a, false))));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z10) {
    }
}
