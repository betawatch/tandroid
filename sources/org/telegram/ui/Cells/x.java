package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 a;
    public final org.telegram.ui.Components.k9 b;
    public final Switch c;
    public final wo d;
    public final View e;
    public TLRPC.TL_availableReaction f;
    public final boolean h;
    public boolean n;

    public x(Context context, boolean z10, boolean z11) {
        super(context);
        this.h = z11;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.a = k5Var;
        hs.i(k5Var);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, null);
        k5Var.setTextSize(16);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setMaxLines(1);
        k5Var.setMaxLines(1);
        k5Var.setGravity(16 | mf.y());
        addView(k5Var, mf.i(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.b = k9Var;
        k9Var.setAspectFit(true);
        k9Var.setLayerNum(1);
        addView(k9Var, mf.i(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            wo woVar = new wo(26, context, null);
            this.d = woVar;
            woVar.setDrawUnchecked(false);
            woVar.b(-1, -1, org.telegram.ui.ActionBar.k6.h7);
            woVar.setDrawBackgroundAsArc(-1);
            addView(woVar, mf.i(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.c = r14;
            r14.d(org.telegram.ui.ActionBar.k6.M6, org.telegram.ui.ActionBar.k6.N6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
            addView(r14, mf.i(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        this.e = view;
        view.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
        addView(view, mf.c(-1.0f, -1));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_availableReaction tL_availableReaction, boolean z10, int i3) {
        TLRPC.TL_availableReaction tL_availableReaction2 = this.f;
        boolean z11 = tL_availableReaction2 != null && tL_availableReaction.reaction.equals(tL_availableReaction2.reaction);
        this.f = tL_availableReaction;
        String str = tL_availableReaction.title;
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.l(org.telegram.messenger.i6.m(str, k5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        this.b.k(ac.b(tL_availableReaction.activate_animation), "30_30_pcache", "tgs", org.telegram.messenger.t5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.k6.a7, 1.0f, null), tL_availableReaction);
        boolean z12 = this.h && tL_availableReaction.premium && !h10.i(i3).q();
        this.n = z12;
        if (z12) {
            Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
            org.telegram.ui.ActionBar.r6.y(this, drawable, org.telegram.ui.ActionBar.k6.Ii, null, PorterDuff.Mode.MULTIPLY);
            k5Var.i(drawable);
        } else {
            k5Var.i(null);
        }
        Switch r02 = this.c;
        if (r02 != null) {
            r02.c(z10, z11);
        }
        wo woVar = this.d;
        if (woVar != null) {
            woVar.a(z10, z11);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float strokeWidth = org.telegram.ui.ActionBar.k6.k0.getStrokeWidth();
        int L = org.telegram.messenger.g0.L(81.0f);
        int i3 = 0;
        if (bd.a0) {
            i3 = L;
            L = 0;
        }
        canvas.drawLine(getPaddingLeft() + L, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - i3, getHeight() - strokeWidth, org.telegram.ui.ActionBar.k6.k0);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        boolean z10 = false;
        wo woVar = this.d;
        Switch r32 = this.c;
        if (r32 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r32 != null) {
                z10 = r32.h;
            } else if (woVar != null) {
                z10 = woVar.a.q;
            }
            accessibilityNodeInfo.setChecked(z10);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r32 != null) {
                z10 = r32.h;
            } else if (woVar != null) {
                z10 = woVar.a.q;
            }
            if (z10) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.a.getText());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.ActionBar.k6.k0.getStrokeWidth() + org.telegram.messenger.g0.L(58.0f)), TLObject.FLAG_30));
    }

    public void setChecked(boolean z10) {
        Switch r12 = this.c;
        if (r12 != null) {
            r12.c(z10, false);
        }
        wo woVar = this.d;
        if (woVar != null) {
            woVar.a(z10, false);
        }
    }
}
