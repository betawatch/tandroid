package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class q8 extends FrameLayout {
    public int a;
    public final TextView b;
    public final TextView c;
    public final Switch d;
    public boolean e;
    public LinearLayout f;
    public org.telegram.ui.Components.j6 h;
    public View n;
    public tm r;

    public q8(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((hd.a0 ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z9 = hd.a0;
        addView(textView, c8.ha.d(-2, -1.0f, (z9 ? 5 : 3) | 48, z9 ? 64.0f : 21.0f, 0.0f, z9 ? 21.0f : 64.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.z6, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(hd.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z10 = hd.a0;
        addView(textView2, c8.ha.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 64.0f : 21.0f, 35.0f, z10 ? 21.0f : 64.0f, 0.0f));
        Switch r22 = new Switch(context, null);
        this.d = r22;
        r22.setDrawIconType(1);
        addView(r22, c8.ha.d(37, 40.0f, (hd.a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
    }

    public final void a(Runnable runnable, String str, boolean z9) {
        if (this.f == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getContext(), false, true, true);
            this.h = j6Var;
            j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            this.h.getDrawable().J = true;
            org.telegram.ui.Components.j6 j6Var2 = this.h;
            int i7 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.Z(j6Var2, i7, null);
            this.h.setTypeface(org.telegram.messenger.g0.o());
            this.h.b(0.4f, 320L, xq.h);
            this.f.addView(this.h, c8.ha.c(20.0f, -2));
            this.n = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
            org.telegram.ui.ActionBar.r6.y(this, mutate, i7, null, PorterDuff.Mode.MULTIPLY);
            this.n.setBackground(mutate);
            this.f.addView(this.n, c8.ha.r(16, 16, 16));
            this.f.setClipChildren(false);
            setClipChildren(false);
            addView(this.f, c8.ha.e(-2, -2, 16));
            tm tmVar = new tm(getContext(), 8);
            this.r = tmVar;
            tmVar.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false), 2, -1));
            addView(this.r, c8.ha.e(76, -1, hd.a0 ? 3 : 5));
        }
        this.h.setText(str);
        this.n.animate().cancel();
        this.n.animate().rotation(z9 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(xq.h).start();
        this.r.setOnClickListener(new a(runnable, 11));
    }

    public final void b(boolean z9, boolean z10) {
        super.setEnabled(z9);
        Switch r02 = this.d;
        TextView textView = this.c;
        TextView textView2 = this.b;
        if (z10) {
            textView2.clearAnimation();
            textView.clearAnimation();
            r02.clearAnimation();
            textView2.animate().alpha(z9 ? 1.0f : 0.5f).start();
            textView.animate().alpha(z9 ? 1.0f : 0.5f).start();
            r02.animate().alpha(z9 ? 1.0f : 0.5f).start();
            return;
        }
        if (z9) {
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            r02.setAlpha(1.0f);
        } else {
            r02.setAlpha(0.5f);
            textView2.setAlpha(0.5f);
            textView.setAlpha(0.5f);
        }
    }

    public final void c(String str, boolean z9, boolean z10) {
        d(str, z9, z10, false);
    }

    public final void d(String str, boolean z9, boolean z10, boolean z11) {
        TextView textView = this.b;
        textView.setText(str);
        this.d.c(z9, z11);
        this.e = z10;
        this.c.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z10);
    }

    public Switch getCheckBox() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e) {
            canvas.drawLine(hd.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (hd.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            boolean z10 = hd.a0;
            TextView textView = this.b;
            if (z10) {
                linearLayout.setTranslationX((textView.getLeft() - this.f.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f));
            } else {
                linearLayout.setTranslationX(org.telegram.messenger.g0.L(8.0f) + textView.getRight());
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.c.getVisibility() == 0 ? 64.0f : 50.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }

    public void setChecked(boolean z9) {
        this.d.c(z9, true);
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        TextView textView = this.b;
        textView.clearAnimation();
        TextView textView2 = this.c;
        textView2.clearAnimation();
        Switch r22 = this.d;
        r22.clearAnimation();
        if (z9) {
            textView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            r22.setAlpha(1.0f);
            org.telegram.ui.Components.j6 j6Var = this.h;
            if (j6Var != null) {
                j6Var.setAlpha(1.0f);
            }
            View view = this.n;
            if (view != null) {
                view.setAlpha(1.0f);
                return;
            }
            return;
        }
        r22.setAlpha(0.5f);
        textView.setAlpha(0.5f);
        textView2.setAlpha(0.5f);
        org.telegram.ui.Components.j6 j6Var2 = this.h;
        if (j6Var2 != null) {
            j6Var2.setAlpha(0.6f);
        }
        View view2 = this.n;
        if (view2 != null) {
            view2.setAlpha(0.6f);
        }
    }

    public void setIcon(int i7) {
        this.d.setIcon(i7);
    }
}
