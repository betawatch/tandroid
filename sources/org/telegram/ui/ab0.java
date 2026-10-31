package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ab0 extends FrameLayout {
    public final /* synthetic */ bb0 D;
    public final ImageView a;
    public final LinearLayout b;
    public final ag.j3 c;
    public final org.telegram.ui.Components.f6 d;
    public final ImageView e;
    public final Switch f;
    public final org.telegram.ui.Components.ep h;
    public boolean n;
    public boolean r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab0(bb0 bb0Var, Context context) {
        super(context);
        this.D = bb0Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i10 = org.telegram.ui.ActionBar.t6.m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView, i10, null, mode);
        imageView.setVisibility(8);
        addView(imageView, w7.b6.d(24, 24.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        ag.j3 j3Var = new ag.j3(context, 26);
        this.c = j3Var;
        j3Var.setLines(1);
        j3Var.setSingleLine(true);
        j3Var.setEllipsize(TextUtils.TruncateAt.END);
        j3Var.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(j3Var, i11, null);
        j3Var.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        j3Var.setImportantForAccessibility(2);
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, true, true);
        this.d = f6Var;
        f6Var.b(0.35f, 200L, org.telegram.ui.Components.gr.h);
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        org.telegram.ui.ActionBar.a7.Z(f6Var, i11, null);
        f6Var.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.e = imageView2;
        imageView2.setVisibility(8);
        org.telegram.ui.ActionBar.a7.t(imageView2, i11, null, mode);
        imageView2.setImageResource(R.drawable.arrow_more);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        if (org.telegram.messenger.cd.X) {
            linearLayout.addView(imageView2, w7.b6.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(f6Var, w7.b6.q(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(j3Var, w7.b6.p(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(j3Var, w7.b6.p(-2, -2, 1.0f, 16));
            linearLayout.addView(f6Var, w7.b6.q(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, w7.b6.q(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        addView(linearLayout, w7.b6.d(-1, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r32 = new Switch(context, null);
        this.f = r32;
        r32.setVisibility(8);
        int i12 = org.telegram.ui.ActionBar.t6.M6;
        int i13 = org.telegram.ui.ActionBar.t6.N6;
        int i14 = org.telegram.ui.ActionBar.t6.d6;
        r32.d(i12, i13, i14, i14);
        r32.setImportantForAccessibility(2);
        addView(r32, w7.b6.d(37, 50.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.ep epVar = new org.telegram.ui.Components.ep(21, context, null);
        this.h = epVar;
        epVar.b(org.telegram.ui.ActionBar.t6.h7, org.telegram.ui.ActionBar.t6.j7, org.telegram.ui.ActionBar.t6.k7);
        epVar.setDrawUnchecked(true);
        epVar.a(true, false);
        epVar.setDrawBackgroundAsArc(10);
        epVar.setVisibility(8);
        epVar.setImportantForAccessibility(2);
        boolean z10 = org.telegram.messenger.cd.X;
        addView(epVar, w7.b6.d(21, 21.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 64.0f, 0.0f, z10 ? 64.0f : 0.0f, 0.0f));
        setFocusable(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if ((r5 & org.telegram.tgnet.TLObject.FLAG_14) > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0031, code lost:
    
        if ((r5 & 4) > 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(int i10) {
        boolean q6 = this.D.getUserConfig().q();
        int bitCount = Integer.bitCount(i10);
        if (q6) {
            if ((i10 & TLObject.FLAG_12) > 0) {
                bitCount--;
            }
            if ((i10 & TLObject.FLAG_13) > 0) {
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
        if (org.telegram.messenger.tz.o() < 1 && (i10 & 256) > 0) {
            bitCount--;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (org.telegram.messenger.tz.o() < 1) {
                boolean z10 = org.telegram.messenger.v2.a;
            }
            return (org.telegram.ui.Components.h01.c() || (i10 & 65536) <= 0) ? bitCount : bitCount - 1;
        }
        if ((262144 & i10) > 0) {
            bitCount--;
        }
        if (org.telegram.ui.Components.h01.c()) {
            return bitCount;
        }
    }

    public final void b(boolean z10, boolean z11) {
        if (this.s != z10) {
            this.s = z10;
            org.telegram.ui.Components.ep epVar = this.h;
            Switch r12 = this.f;
            LinearLayout linearLayout = this.b;
            ImageView imageView = this.a;
            if (z11) {
                imageView.animate().alpha(z10 ? 0.5f : 1.0f).setDuration(220L).start();
                linearLayout.animate().alpha(z10 ? 0.5f : 1.0f).setDuration(220L).start();
                r12.animate().alpha(z10 ? 0.5f : 1.0f).setDuration(220L).start();
                org.telegram.messenger.z20.l(epVar.animate(), z10 ? 0.5f : 1.0f, 220L);
            } else {
                imageView.setAlpha(z10 ? 0.5f : 1.0f);
                linearLayout.setAlpha(z10 ? 0.5f : 1.0f);
                r12.setAlpha(z10 ? 0.5f : 1.0f);
                epVar.setAlpha(z10 ? 0.5f : 1.0f);
            }
            setEnabled(!z10);
        }
    }

    public final void c(wa0 wa0Var, boolean z10) {
        int d = org.telegram.messenger.sc.d(true);
        int i10 = wa0Var.e;
        this.x = a(d & i10);
        this.y = a(i10);
        boolean z11 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.x), Integer.valueOf(this.y));
        if (z10 && !org.telegram.messenger.cd.X) {
            z11 = true;
        }
        this.d.c(format, z11, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z10 = org.telegram.messenger.cd.X;
        ag.j3 j3Var = this.c;
        if (z10) {
            if (this.r) {
                float L = org.telegram.messenger.i0.L(75.0f);
                canvas.drawRect(L - org.telegram.messenger.i0.L(0.66f), (getMeasuredHeight() - org.telegram.messenger.i0.L(20.0f)) / 2.0f, L, (org.telegram.messenger.i0.L(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.t6.k0);
            }
            if (this.n) {
                canvas.drawLine((getMeasuredWidth() - org.telegram.messenger.i0.L(64.0f)) + (j3Var.getTranslationX() < 0.0f ? org.telegram.messenger.i0.L(-32.0f) : 0), getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
                return;
            }
            return;
        }
        if (this.r) {
            float measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(75.0f);
            canvas.drawRect(measuredWidth - org.telegram.messenger.i0.L(0.66f), (getMeasuredHeight() - org.telegram.messenger.i0.L(20.0f)) / 2.0f, measuredWidth, (org.telegram.messenger.i0.L(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.t6.k0);
        }
        if (this.n) {
            canvas.drawLine(j3Var.getTranslationX() + org.telegram.messenger.i0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.Components.ep epVar = this.h;
        accessibilityNodeInfo.setClassName(epVar.getVisibility() == 0 ? "android.widget.CheckBox" : "android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (epVar.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(epVar.a.q);
        } else {
            accessibilityNodeInfo.setChecked(this.f.h);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.c.getText());
        if (this.w) {
            sb2.append('\n');
            sb2.append(org.telegram.messenger.cd.a0("Of", null, 2131747845, Integer.valueOf(this.x), Integer.valueOf(this.y)));
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), TLObject.FLAG_30));
    }
}
