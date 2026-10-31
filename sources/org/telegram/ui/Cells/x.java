package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ic;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ep;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x extends FrameLayout {
    public final org.telegram.ui.ActionBar.u5 a;
    public final org.telegram.ui.Components.g9 b;
    public final Switch c;
    public final ep d;
    public final View e;
    public TLRPC.TL_availableReaction f;
    public final boolean h;
    public boolean n;

    public x(Context context, boolean z10, boolean z11) {
        super(context);
        this.h = z11;
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.a = u5Var;
        zs.i(u5Var);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, null);
        u5Var.setTextSize(16);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setMaxLines(1);
        u5Var.setMaxLines(1);
        u5Var.setGravity(16 | w7.b6.y());
        addView(u5Var, w7.b6.i(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.b = g9Var;
        g9Var.setAspectFit(true);
        g9Var.setLayerNum(1);
        addView(g9Var, w7.b6.i(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            ep epVar = new ep(26, context, null);
            this.d = epVar;
            epVar.setDrawUnchecked(false);
            epVar.b(-1, -1, org.telegram.ui.ActionBar.t6.h7);
            epVar.setDrawBackgroundAsArc(-1);
            addView(epVar, w7.b6.i(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.c = r14;
            r14.d(org.telegram.ui.ActionBar.t6.M6, org.telegram.ui.ActionBar.t6.N6, org.telegram.ui.ActionBar.t6.Q6, org.telegram.ui.ActionBar.t6.R6);
            addView(r14, w7.b6.i(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        this.e = view;
        view.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
        addView(view, w7.b6.c(-1.0f, -1));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_availableReaction tL_availableReaction, boolean z10, int i10) {
        TLRPC.TL_availableReaction tL_availableReaction2 = this.f;
        boolean z11 = tL_availableReaction2 != null && tL_availableReaction.reaction.equals(tL_availableReaction2.reaction);
        this.f = tL_availableReaction;
        String str = tL_availableReaction.title;
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        u5Var.l(org.telegram.messenger.k6.m(str, u5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        this.b.k(ic.b(tL_availableReaction.activate_animation), "30_30_pcache", "tgs", org.telegram.messenger.v5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.t6.a7, 1.0f, null), tL_availableReaction);
        boolean z12 = this.h && tL_availableReaction.premium && !d20.i(i10).q();
        this.n = z12;
        if (z12) {
            Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
            org.telegram.ui.ActionBar.a7.y(this, drawable, org.telegram.ui.ActionBar.t6.Ii, null, PorterDuff.Mode.MULTIPLY);
            u5Var.i(drawable);
        } else {
            u5Var.i(null);
        }
        Switch r02 = this.c;
        if (r02 != null) {
            r02.c(z10, z11);
        }
        ep epVar = this.d;
        if (epVar != null) {
            epVar.a(z10, z11);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float strokeWidth = org.telegram.ui.ActionBar.t6.k0.getStrokeWidth();
        int L = org.telegram.messenger.i0.L(81.0f);
        int i10 = 0;
        if (cd.X) {
            i10 = L;
            L = 0;
        }
        canvas.drawLine(getPaddingLeft() + L, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - i10, getHeight() - strokeWidth, org.telegram.ui.ActionBar.t6.k0);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        boolean z10 = false;
        ep epVar = this.d;
        Switch r32 = this.c;
        if (r32 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r32 != null) {
                z10 = r32.h;
            } else if (epVar != null) {
                z10 = epVar.a.q;
            }
            accessibilityNodeInfo.setChecked(z10);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r32 != null) {
                z10 = r32.h;
            } else if (epVar != null) {
                z10 = epVar.a.q;
            }
            if (z10) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.a.getText());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.ActionBar.t6.k0.getStrokeWidth() + org.telegram.messenger.i0.L(58.0f)), TLObject.FLAG_30));
    }

    public void setChecked(boolean z10) {
        Switch r12 = this.c;
        if (r12 != null) {
            r12.c(z10, false);
        }
        ep epVar = this.d;
        if (epVar != null) {
            epVar.a(z10, false);
        }
    }
}
