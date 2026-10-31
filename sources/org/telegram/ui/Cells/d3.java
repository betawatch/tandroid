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
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d3 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final LinearLayout a;
    public final LinearLayout b;
    public final org.telegram.ui.Components.n5 c;
    public final p80 d;
    public final ImageView e;
    public final ImageView f;
    public final org.telegram.ui.Components.g9 h;
    public final org.telegram.ui.Components.u8 n;
    public boolean r;

    public d3(Context context) {
        super(context);
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(7.0f));
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(context, false);
        this.n = u8Var;
        u8Var.setStepFactor(0.56790125f);
        u8Var.setVisibility(8);
        u8Var.setCount(0);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.h = g9Var;
        g9Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(cd.X ? org.telegram.messenger.i0.L(24.0f) : 0, 0, cd.X ? 0 : org.telegram.messenger.i0.L(24.0f), 0);
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(context);
        this.c = n5Var;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        n5Var.setEllipsize(truncateAt);
        n5Var.setTextSize(1, 14.0f);
        n5Var.setTypeface(org.telegram.messenger.i0.o());
        n5Var.setMaxLines(5);
        linearLayout.addView(n5Var, w7.b6.p(-2, -2, 0.0f, (cd.X ? 5 : 3) | 48));
        p80 p80Var = new p80(context, null);
        this.d = p80Var;
        p80Var.setTextSize(1, 13.0f);
        p80Var.setEllipsize(truncateAt);
        p80Var.setMaxLines(5);
        linearLayout.addView(p80Var, w7.b6.p(-1, -2, 0.0f, 48));
        zs.i(n5Var);
        zs.i(p80Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (cd.X) {
            linearLayout2.addView(linearLayout, w7.b6.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(u8Var, w7.b6.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(g9Var, w7.b6.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(g9Var, w7.b6.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(u8Var, w7.b6.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, w7.b6.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, w7.b6.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.arrow_newchat);
        addView(imageView, w7.b6.d(16, 16.0f, (cd.X ? 3 : 5) | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
        addView(imageView2, w7.b6.d(36, 36.0f, (cd.X ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        updateColors();
    }

    public final void a(int i10, ArrayList arrayList) {
        int min = Math.min(3, arrayList == null ? 0 : arrayList.size());
        org.telegram.ui.Components.u8 u8Var = this.n;
        boolean z10 = min != u8Var.a.n;
        if (min <= 1) {
            u8Var.setAvatarsTextSize(org.telegram.messenger.i0.L(22.0f));
            u8Var.setSize(org.telegram.messenger.i0.L(36.0f));
        } else {
            u8Var.setAvatarsTextSize(org.telegram.messenger.i0.L(20.0f));
            u8Var.setSize(org.telegram.messenger.i0.L(30.0f));
        }
        u8Var.setCount(min);
        u8Var.setVisibility(min <= 0 ? 8 : 0);
        u8Var.getLayoutParams().width = min <= 1 ? org.telegram.messenger.i0.L(36.0f) : org.telegram.messenger.i0.L(i0.a.e(min, 1, 18, 30));
        if (z10) {
            this.a.requestLayout();
        }
        if (arrayList != null) {
            int i11 = 0;
            while (i11 < 3) {
                u8Var.b(i11, i10, i11 >= arrayList.size() ? null : (TLObject) arrayList.get(i11));
                i11++;
            }
        }
        u8Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.r = z11;
        int i10 = TextUtils.isEmpty(charSequence) ? 8 : 0;
        org.telegram.ui.Components.n5 n5Var = this.c;
        n5Var.setVisibility(i10);
        n5Var.setText(charSequence);
        n5Var.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        this.e.setVisibility(z10 ? 0 : 8);
        this.f.setVisibility(8);
        int L = z10 ? org.telegram.messenger.i0.L(24.0f) : 0;
        boolean z12 = cd.X;
        int i11 = z12 ? L : 0;
        if (z12) {
            L = 0;
        }
        this.b.setPadding(i11, 0, L, 0);
        updateColors();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        Point point = org.telegram.messenger.i0.q;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
        LinearLayout linearLayout = this.b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31));
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
        super.setOnClickListener(new c3(this, onClickListener, 0));
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        this.e.setVisibility(4);
        ImageView imageView = this.f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        this.c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, this.r ? org.telegram.ui.ActionBar.t6.q7 : org.telegram.ui.ActionBar.t6.G6, false));
        int i10 = org.telegram.ui.ActionBar.t6.y6;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        p80 p80Var = this.d;
        p80Var.setTextColor(x02);
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Uc, false));
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(x03, mode);
        int x04 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        ImageView imageView = this.f;
        imageView.setColorFilter(x04, mode);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.c(null, org.telegram.ui.ActionBar.j6.b(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.j6.a, false))));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z10) {
    }
}
