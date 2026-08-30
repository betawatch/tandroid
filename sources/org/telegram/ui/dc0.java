package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class dc0 extends FrameLayout {
    public final ImageView a;
    public final LinearLayout b;
    public final gg.q c;
    public final org.telegram.ui.Components.k6 d;
    public final ImageView e;
    public final Switch f;
    public final org.telegram.ui.Components.lp h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean v;
    public int w;
    public int x;
    public final /* synthetic */ ec0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc0(ec0 ec0Var, Context context) {
        super(context);
        this.y = ec0Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.m6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setVisibility(8);
        addView(imageView, k7.b6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        gg.q qVar = new gg.q(context, 26);
        this.c = qVar;
        qVar.setLines(1);
        qVar.setSingleLine(true);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        qVar.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        qVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        qVar.setGravity(LocaleController.isRTL ? 5 : 3);
        qVar.setImportantForAccessibility(2);
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, true, true);
        this.d = k6Var;
        k6Var.b(0.35f, 200L, org.telegram.ui.Components.nr.h);
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        k6Var.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.e = imageView2;
        imageView2.setVisibility(8);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), mode));
        imageView2.setImageResource(R.drawable.arrow_more);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(LocaleController.isRTL ? 5 : 3);
        if (LocaleController.isRTL) {
            linearLayout.addView(imageView2, k7.b6.p(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(k6Var, k7.b6.p(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(qVar, k7.b6.o(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(qVar, k7.b6.o(-2, -2, 1.0f, 16));
            linearLayout.addView(k6Var, k7.b6.p(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, k7.b6.p(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        addView(linearLayout, k7.b6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r32 = new Switch(context, null);
        this.f = r32;
        r32.setVisibility(8);
        int i11 = org.telegram.ui.ActionBar.j6.M6;
        int i12 = org.telegram.ui.ActionBar.j6.N6;
        int i13 = org.telegram.ui.ActionBar.j6.d6;
        r32.d(i11, i12, i13, i13);
        r32.setImportantForAccessibility(2);
        addView(r32, k7.b6.d(37, 50.0f, (LocaleController.isRTL ? 3 : 5) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(context, 21, null);
        this.h = lpVar;
        lpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
        lpVar.setDrawUnchecked(true);
        lpVar.a(true, false);
        lpVar.setDrawBackgroundAsArc(10);
        lpVar.setVisibility(8);
        lpVar.setImportantForAccessibility(2);
        boolean z4 = LocaleController.isRTL;
        addView(lpVar, k7.b6.d(21, 21.0f, (z4 ? 5 : 3) | 16, z4 ? 0.0f : 64.0f, 0.0f, z4 ? 64.0f : 0.0f, 0.0f));
        setFocusable(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if ((r5 & 16384) > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0031, code lost:
    
        if ((r5 & 4) > 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(int i10) {
        boolean isPremium = this.y.getUserConfig().isPremium();
        int bitCount = Integer.bitCount(i10);
        if (isPremium) {
            if ((i10 & 4096) > 0) {
                bitCount--;
            }
            if ((i10 & 8192) > 0) {
                bitCount--;
            }
        } else {
            if ((i10 & 16) > 0) {
                bitCount--;
            }
            if ((i10 & 8) > 0) {
                bitCount--;
            }
        }
        if (SharedConfig.getDevicePerformanceClass() < 1 && (i10 & 256) > 0) {
            bitCount--;
        }
        if ((Build.VERSION.SDK_INT < 33 || (SharedConfig.getDevicePerformanceClass() < 1 && !BuildVars.DEBUG_PRIVATE_VERSION)) && (262144 & i10) > 0) {
            bitCount--;
        }
        return (org.telegram.ui.Components.a11.c() || (i10 & 65536) <= 0) ? bitCount : bitCount - 1;
    }

    public final void b(boolean z4, boolean z10) {
        if (this.s != z4) {
            this.s = z4;
            org.telegram.ui.Components.lp lpVar = this.h;
            Switch r12 = this.f;
            LinearLayout linearLayout = this.b;
            ImageView imageView = this.a;
            if (z10) {
                imageView.animate().alpha(z4 ? 0.5f : 1.0f).setDuration(220L).start();
                linearLayout.animate().alpha(z4 ? 0.5f : 1.0f).setDuration(220L).start();
                r12.animate().alpha(z4 ? 0.5f : 1.0f).setDuration(220L).start();
                lpVar.animate().alpha(z4 ? 0.5f : 1.0f).setDuration(220L).start();
            } else {
                imageView.setAlpha(z4 ? 0.5f : 1.0f);
                linearLayout.setAlpha(z4 ? 0.5f : 1.0f);
                r12.setAlpha(z4 ? 0.5f : 1.0f);
                lpVar.setAlpha(z4 ? 0.5f : 1.0f);
            }
            setEnabled(!z4);
        }
    }

    public final void c(yb0 yb0Var, boolean z4) {
        int value = LiteMode.getValue(true);
        int i10 = yb0Var.e;
        this.w = a(value & i10);
        this.x = a(i10);
        boolean z10 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.w), Integer.valueOf(this.x));
        if (z4 && !LocaleController.isRTL) {
            z10 = true;
        }
        this.d.c(format, z10, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z4 = LocaleController.isRTL;
        gg.q qVar = this.c;
        if (z4) {
            if (this.r) {
                float dp = AndroidUtilities.dp(75.0f);
                canvas.drawRect(dp - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, dp, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.j6.k0);
            }
            if (this.n) {
                canvas.drawLine((getMeasuredWidth() - AndroidUtilities.dp(64.0f)) + (qVar.getTranslationX() < 0.0f ? AndroidUtilities.dp(-32.0f) : 0), getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
                return;
            }
            return;
        }
        if (this.r) {
            float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(75.0f);
            canvas.drawRect(measuredWidth - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, measuredWidth, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.j6.k0);
        }
        if (this.n) {
            canvas.drawLine(qVar.getTranslationX() + AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.Components.lp lpVar = this.h;
        accessibilityNodeInfo.setClassName(lpVar.getVisibility() == 0 ? "android.widget.CheckBox" : "android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (lpVar.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(lpVar.a.q);
        } else {
            accessibilityNodeInfo.setChecked(this.f.h);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.getText());
        if (this.v) {
            sb.append('\n');
            sb.append(LocaleController.formatString("Of", R.string.Of, Integer.valueOf(this.w), Integer.valueOf(this.x)));
        }
        accessibilityNodeInfo.setContentDescription(sb);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }
}
