package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s8 extends FrameLayout {
    public int a;
    public final TextView b;
    public final TextView c;
    public final Switch d;
    public boolean e;
    public LinearLayout f;
    public org.telegram.ui.Components.j6 h;
    public View n;
    public an r;

    public s8(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.b = textView;
        ll.n(org.telegram.ui.ActionBar.f6.G6, null, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z10 = LocaleController.isRTL;
        addView(textView, g7.e6.d(-2, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 64.0f : 21.0f, 0.0f, z10 ? 21.0f : 64.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        ll.n(org.telegram.ui.ActionBar.f6.z6, null, textView2, 1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, g7.e6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 64.0f : 21.0f, 35.0f, z11 ? 21.0f : 64.0f, 0.0f));
        Switch r22 = new Switch(context, null);
        this.d = r22;
        r22.setDrawIconType(1);
        addView(r22, g7.e6.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
    }

    public final void a(Runnable runnable, String str, boolean z10) {
        if (this.f == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getContext(), false, true, true);
            this.h = j6Var;
            j6Var.setTextSize(AndroidUtilities.dp(14.0f));
            this.h.getDrawable().D = true;
            org.telegram.ui.Components.j6 j6Var2 = this.h;
            int i9 = org.telegram.ui.ActionBar.f6.G6;
            j6Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
            this.h.setTypeface(AndroidUtilities.bold());
            this.h.b(0.4f, 320L, gr.h);
            this.f.addView(this.h, g7.e6.c(20.0f, -2));
            this.n = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i9, false), PorterDuff.Mode.MULTIPLY));
            this.n.setBackground(mutate);
            this.f.addView(this.n, g7.e6.q(16, 16, 16));
            this.f.setClipChildren(false);
            setClipChildren(false);
            addView(this.f, g7.e6.e(-2, -2, 16));
            an anVar = new an(getContext(), 10);
            this.r = anVar;
            anVar.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 2, -1));
            addView(this.r, g7.e6.e(76, -1, LocaleController.isRTL ? 3 : 5));
        }
        this.h.setText(str);
        this.n.animate().cancel();
        this.n.animate().rotation(z10 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(gr.h).start();
        this.r.setOnClickListener(new a(runnable, 11));
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        Switch r02 = this.d;
        TextView textView = this.c;
        TextView textView2 = this.b;
        if (z11) {
            textView2.clearAnimation();
            textView.clearAnimation();
            r02.clearAnimation();
            textView2.animate().alpha(z10 ? 1.0f : 0.5f).start();
            textView.animate().alpha(z10 ? 1.0f : 0.5f).start();
            r02.animate().alpha(z10 ? 1.0f : 0.5f).start();
            return;
        }
        if (z10) {
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            r02.setAlpha(1.0f);
        } else {
            r02.setAlpha(0.5f);
            textView2.setAlpha(0.5f);
            textView.setAlpha(0.5f);
        }
    }

    public final void c(String str, boolean z10, boolean z11) {
        d(str, z10, z11, false);
    }

    public final void d(String str, boolean z10, boolean z11, boolean z12) {
        TextView textView = this.b;
        textView.setText(str);
        this.d.c(z10, z12);
        this.e = z11;
        this.c.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z11);
    }

    public Switch getCheckBox() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            boolean z11 = LocaleController.isRTL;
            TextView textView = this.b;
            if (z11) {
                linearLayout.setTranslationX((textView.getLeft() - this.f.getMeasuredWidth()) - AndroidUtilities.dp(8.0f));
            } else {
                linearLayout.setTranslationX(AndroidUtilities.dp(8.0f) + textView.getRight());
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.c.getVisibility() == 0 ? 64.0f : 50.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }

    public void setChecked(boolean z10) {
        this.d.c(z10, true);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        TextView textView = this.b;
        textView.clearAnimation();
        TextView textView2 = this.c;
        textView2.clearAnimation();
        Switch r22 = this.d;
        r22.clearAnimation();
        if (z10) {
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

    public void setIcon(int i9) {
        this.d.setIcon(i9);
    }
}
