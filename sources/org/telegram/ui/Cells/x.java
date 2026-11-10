package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x extends FrameLayout {
    public final org.telegram.ui.ActionBar.m5 a;
    public final org.telegram.ui.Components.k9 b;
    public final Switch c;
    public final wo d;
    public final View e;
    public TLRPC.TL_availableReaction f;
    public final boolean h;
    public boolean n;

    public x(Context context, boolean z9, boolean z10) {
        super(context);
        this.h = z10;
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.a = m5Var;
        qs.i(m5Var);
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, null);
        m5Var.setTextSize(16);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setMaxLines(1);
        m5Var.setMaxLines(1);
        m5Var.setGravity(16 | c8.ha.y());
        addView(m5Var, c8.ha.i(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.b = k9Var;
        k9Var.setAspectFit(true);
        k9Var.setLayerNum(1);
        addView(k9Var, c8.ha.i(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z9) {
            wo woVar = new wo(26, context, null);
            this.d = woVar;
            woVar.setDrawUnchecked(false);
            woVar.b(-1, -1, org.telegram.ui.ActionBar.m6.h7);
            woVar.setDrawBackgroundAsArc(-1);
            addView(woVar, c8.ha.i(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.c = r14;
            r14.d(org.telegram.ui.ActionBar.m6.M6, org.telegram.ui.ActionBar.m6.N6, org.telegram.ui.ActionBar.m6.Q6, org.telegram.ui.ActionBar.m6.R6);
            addView(r14, c8.ha.i(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        this.e = view;
        view.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
        addView(view, c8.ha.c(-1.0f, -1));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_availableReaction tL_availableReaction, boolean z9, int i7) {
        TLRPC.TL_availableReaction tL_availableReaction2 = this.f;
        boolean z10 = tL_availableReaction2 != null && tL_availableReaction.reaction.equals(tL_availableReaction2.reaction);
        this.f = tL_availableReaction;
        String str = tL_availableReaction.title;
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        m5Var.l(org.telegram.messenger.i6.m(str, m5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        this.b.k(hc.b(tL_availableReaction.activate_animation), "30_30_pcache", "tgs", org.telegram.messenger.t5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.m6.a7, 1.0f, null), tL_availableReaction);
        boolean z11 = this.h && tL_availableReaction.premium && !p10.i(i7).q();
        this.n = z11;
        if (z11) {
            Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
            org.telegram.ui.ActionBar.t6.x(this, drawable, org.telegram.ui.ActionBar.m6.Ii, null, PorterDuff.Mode.MULTIPLY);
            m5Var.i(drawable);
        } else {
            m5Var.i(null);
        }
        Switch r02 = this.c;
        if (r02 != null) {
            r02.c(z9, z10);
        }
        wo woVar = this.d;
        if (woVar != null) {
            woVar.a(z9, z10);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float strokeWidth = org.telegram.ui.ActionBar.m6.k0.getStrokeWidth();
        int L = org.telegram.messenger.g0.L(81.0f);
        int i7 = 0;
        if (id.a0) {
            i7 = L;
            L = 0;
        }
        canvas.drawLine(getPaddingLeft() + L, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - i7, getHeight() - strokeWidth, org.telegram.ui.ActionBar.m6.k0);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        boolean z9 = false;
        wo woVar = this.d;
        Switch r32 = this.c;
        if (r32 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r32 != null) {
                z9 = r32.h;
            } else if (woVar != null) {
                z9 = woVar.a.q;
            }
            accessibilityNodeInfo.setChecked(z9);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r32 != null) {
                z9 = r32.h;
            } else if (woVar != null) {
                z9 = woVar.a.q;
            }
            if (z9) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.a.getText());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.ActionBar.m6.k0.getStrokeWidth() + org.telegram.messenger.g0.L(58.0f)), TLObject.FLAG_30));
    }

    public void setChecked(boolean z9) {
        Switch r12 = this.c;
        if (r12 != null) {
            r12.c(z9, false);
        }
        wo woVar = this.d;
        if (woVar != null) {
            woVar.a(z9, false);
        }
    }
}
