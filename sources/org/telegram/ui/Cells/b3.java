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
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.z70;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class b3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final LinearLayout a;
    public final LinearLayout b;
    public final org.telegram.ui.Components.o5 c;
    public final z70 d;
    public final ImageView e;
    public final ImageView f;
    public final org.telegram.ui.Components.i9 h;
    public final org.telegram.ui.Components.w8 n;
    public boolean r;

    public b3(Context context) {
        super(context);
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(7.0f));
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(context, false);
        this.n = w8Var;
        w8Var.setStepFactor(0.56790125f);
        w8Var.setVisibility(8);
        w8Var.setCount(0);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.h = i9Var;
        i9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(hd.a0 ? org.telegram.messenger.g0.L(24.0f) : 0, 0, hd.a0 ? 0 : org.telegram.messenger.g0.L(24.0f), 0);
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        this.c = o5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        o5Var.setEllipsize(truncateAt);
        o5Var.setTextSize(1, 14.0f);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        o5Var.setMaxLines(5);
        linearLayout.addView(o5Var, c8.ja.p(-2, -2, 0.0f, (hd.a0 ? 5 : 3) | 48));
        z70 z70Var = new z70(context, null);
        this.d = z70Var;
        z70Var.setTextSize(1, 13.0f);
        z70Var.setEllipsize(truncateAt);
        z70Var.setMaxLines(5);
        linearLayout.addView(z70Var, c8.ja.p(-1, -2, 0.0f, 48));
        ns.i(o5Var);
        ns.i(z70Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (hd.a0) {
            linearLayout2.addView(linearLayout, c8.ja.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(w8Var, c8.ja.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(i9Var, c8.ja.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(i9Var, c8.ja.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(w8Var, c8.ja.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, c8.ja.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, c8.ja.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.arrow_newchat);
        addView(imageView, c8.ja.d(16, 16.0f, (hd.a0 ? 3 : 5) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(imageView2, c8.ja.d(36, 36.0f, (hd.a0 ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        updateColors();
    }

    public final void a(int i7, ArrayList arrayList) {
        int min = Math.min(3, arrayList == null ? 0 : arrayList.size());
        org.telegram.ui.Components.w8 w8Var = this.n;
        boolean z10 = min != w8Var.a.n;
        if (min <= 1) {
            w8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
            w8Var.setSize(org.telegram.messenger.g0.L(36.0f));
        } else {
            w8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(20.0f));
            w8Var.setSize(org.telegram.messenger.g0.L(30.0f));
        }
        w8Var.setCount(min);
        w8Var.setVisibility(min <= 0 ? 8 : 0);
        w8Var.getLayoutParams().width = min <= 1 ? org.telegram.messenger.g0.L(36.0f) : org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(min, 1, 18, 30));
        if (z10) {
            this.a.requestLayout();
        }
        if (arrayList != null) {
            int i10 = 0;
            while (i10 < 3) {
                w8Var.b(i10, i7, i10 >= arrayList.size() ? null : (TLObject) arrayList.get(i10));
                i10++;
            }
        }
        w8Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.r = z11;
        int i7 = TextUtils.isEmpty(charSequence) ? 8 : 0;
        org.telegram.ui.Components.o5 o5Var = this.c;
        o5Var.setVisibility(i7);
        o5Var.setText(charSequence);
        o5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        this.e.setVisibility(z10 ? 0 : 8);
        this.f.setVisibility(8);
        int L = z10 ? org.telegram.messenger.g0.L(24.0f) : 0;
        boolean z12 = hd.a0;
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
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, this.r ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.G6, false));
        int i7 = org.telegram.ui.ActionBar.j6.y6;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        z70 z70Var = this.d;
        z70Var.setTextColor(x02);
        z70Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xc, false));
        int x03 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(x03, mode);
        int x04 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        ImageView imageView = this.f;
        imageView.setColorFilter(x04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.y5.c(null, org.telegram.ui.ActionBar.y5.b(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.y5.a, false))));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z10) {
    }
}
