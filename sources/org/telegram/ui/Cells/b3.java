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
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.s70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final LinearLayout a;
    public final LinearLayout b;
    public final org.telegram.ui.Components.o5 c;
    public final s70 d;
    public final ImageView e;
    public final ImageView f;
    public final org.telegram.ui.Components.k9 h;
    public final org.telegram.ui.Components.x8 n;
    public boolean r;

    public b3(Context context) {
        super(context);
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(7.0f));
        org.telegram.ui.Components.x8 x8Var = new org.telegram.ui.Components.x8(context, false);
        this.n = x8Var;
        x8Var.setStepFactor(0.56790125f);
        x8Var.setVisibility(8);
        x8Var.setCount(0);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.h = k9Var;
        k9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(bd.a0 ? org.telegram.messenger.g0.L(24.0f) : 0, 0, bd.a0 ? 0 : org.telegram.messenger.g0.L(24.0f), 0);
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        this.c = o5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        o5Var.setEllipsize(truncateAt);
        o5Var.setTextSize(1, 14.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        o5Var.setMaxLines(5);
        linearLayout.addView(o5Var, mf.p(-2, -2, 0.0f, (bd.a0 ? 5 : 3) | 48));
        s70 s70Var = new s70(context, null);
        this.d = s70Var;
        s70Var.setTextSize(1, 13.0f);
        s70Var.setEllipsize(truncateAt);
        s70Var.setMaxLines(5);
        linearLayout.addView(s70Var, mf.p(-1, -2, 0.0f, 48));
        hs.i(o5Var);
        hs.i(s70Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (bd.a0) {
            linearLayout2.addView(linearLayout, mf.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(x8Var, mf.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(k9Var, mf.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(k9Var, mf.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(x8Var, mf.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, mf.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, mf.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.arrow_newchat);
        addView(imageView, mf.d(16, 16.0f, (bd.a0 ? 3 : 5) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(imageView2, mf.d(36, 36.0f, (bd.a0 ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        updateColors();
    }

    public final void a(int i3, ArrayList arrayList) {
        int min = Math.min(3, arrayList == null ? 0 : arrayList.size());
        org.telegram.ui.Components.x8 x8Var = this.n;
        boolean z10 = min != x8Var.a.n;
        if (min <= 1) {
            x8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
            x8Var.setSize(org.telegram.messenger.g0.L(36.0f));
        } else {
            x8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(20.0f));
            x8Var.setSize(org.telegram.messenger.g0.L(30.0f));
        }
        x8Var.setCount(min);
        x8Var.setVisibility(min <= 0 ? 8 : 0);
        x8Var.getLayoutParams().width = min <= 1 ? org.telegram.messenger.g0.L(36.0f) : org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(min, 1, 18, 30));
        if (z10) {
            this.a.requestLayout();
        }
        if (arrayList != null) {
            int i10 = 0;
            while (i10 < 3) {
                x8Var.b(i10, i3, i10 >= arrayList.size() ? null : (TLObject) arrayList.get(i10));
                i10++;
            }
        }
        x8Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.r = z11;
        int i3 = TextUtils.isEmpty(charSequence) ? 8 : 0;
        org.telegram.ui.Components.o5 o5Var = this.c;
        o5Var.setVisibility(i3);
        o5Var.setText(charSequence);
        o5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        this.e.setVisibility(z10 ? 0 : 8);
        this.f.setVisibility(8);
        int L = z10 ? org.telegram.messenger.g0.L(24.0f) : 0;
        boolean z12 = bd.a0;
        int i10 = z12 ? L : 0;
        if (z12) {
            L = 0;
        }
        this.b.setPadding(i10, 0, L, 0);
        updateColors();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        Point point = org.telegram.messenger.g0.q;
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
        LinearLayout linearLayout = this.b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), TLObject.FLAG_30));
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, this.r ? org.telegram.ui.ActionBar.k6.q7 : org.telegram.ui.ActionBar.k6.G6, false));
        int i3 = org.telegram.ui.ActionBar.k6.y6;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        s70 s70Var = this.d;
        s70Var.setTextColor(x02);
        s70Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false));
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(x03, mode);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        ImageView imageView = this.f;
        imageView.setColorFilter(x04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.y5.c(null, org.telegram.ui.ActionBar.y5.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.y5.a, false))));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z10) {
    }
}
