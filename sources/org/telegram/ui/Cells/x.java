package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fc;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.mp;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x extends FrameLayout {
    public final org.telegram.ui.ActionBar.n5 a;
    public final org.telegram.ui.Components.q9 b;
    public final Switch c;
    public final mp d;
    public final View e;
    public TLRPC.TL_availableReaction f;
    public final boolean h;
    public boolean n;

    public x(Context context, boolean z10, boolean z11) {
        super(context);
        this.h = z11;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.a = n5Var;
        ks.i(n5Var);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, null);
        n5Var.setTextSize(16);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setMaxLines(1);
        n5Var.setMaxLines(1);
        n5Var.setGravity(16 | c8.ma.y());
        addView(n5Var, c8.ma.i(-2.0f, -2.0f, 8388627, 81.0f, 0.0f, 61.0f, 0.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.b = q9Var;
        q9Var.setAspectFit(true);
        q9Var.setLayerNum(1);
        addView(q9Var, c8.ma.i(32.0f, 32.0f, 8388627, 23.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            mp mpVar = new mp(26, context, null);
            this.d = mpVar;
            mpVar.setDrawUnchecked(false);
            mpVar.b(-1, -1, org.telegram.ui.ActionBar.n6.h7);
            mpVar.setDrawBackgroundAsArc(-1);
            addView(mpVar, c8.ma.i(26.0f, 26.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        } else {
            Switch r14 = new Switch(context, null);
            this.c = r14;
            r14.d(org.telegram.ui.ActionBar.n6.M6, org.telegram.ui.ActionBar.n6.N6, org.telegram.ui.ActionBar.n6.Q6, org.telegram.ui.ActionBar.n6.R6);
            addView(r14, c8.ma.i(37.0f, 20.0f, 8388629, 0.0f, 0.0f, 22.0f, 0.0f));
        }
        View view = new View(context);
        this.e = view;
        view.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
        addView(view, c8.ma.c(-1.0f, -1));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_availableReaction tL_availableReaction, boolean z10, int i7) {
        TLRPC.TL_availableReaction tL_availableReaction2 = this.f;
        boolean z11 = tL_availableReaction2 != null && tL_availableReaction.reaction.equals(tL_availableReaction2.reaction);
        this.f = tL_availableReaction;
        String str = tL_availableReaction.title;
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        n5Var.l(org.telegram.messenger.j6.m(str, n5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        this.b.k(fc.b(tL_availableReaction.activate_animation), "30_30_pcache", "tgs", org.telegram.messenger.u5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.n6.a7, 1.0f, null), tL_availableReaction);
        boolean z12 = this.h && tL_availableReaction.premium && !j10.i(i7).q();
        this.n = z12;
        if (z12) {
            Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
            org.telegram.ui.ActionBar.u6.x(this, drawable, org.telegram.ui.ActionBar.n6.Li, null, PorterDuff.Mode.MULTIPLY);
            n5Var.i(drawable);
        } else {
            n5Var.i(null);
        }
        Switch r02 = this.c;
        if (r02 != null) {
            r02.c(z10, z11);
        }
        mp mpVar = this.d;
        if (mpVar != null) {
            mpVar.a(z10, z11);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float strokeWidth = org.telegram.ui.ActionBar.n6.k0.getStrokeWidth();
        int L = org.telegram.messenger.g0.L(81.0f);
        int i7 = 0;
        if (gd.a0) {
            i7 = L;
            L = 0;
        }
        canvas.drawLine(getPaddingLeft() + L, getHeight() - strokeWidth, (getWidth() - getPaddingRight()) - i7, getHeight() - strokeWidth, org.telegram.ui.ActionBar.n6.k0);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(true);
        boolean z10 = false;
        mp mpVar = this.d;
        Switch r32 = this.c;
        if (r32 != null) {
            accessibilityNodeInfo.setCheckable(true);
            if (r32 != null) {
                z10 = r32.h;
            } else if (mpVar != null) {
                z10 = mpVar.a.q;
            }
            accessibilityNodeInfo.setChecked(z10);
            accessibilityNodeInfo.setClassName("android.widget.Switch");
        } else {
            if (r32 != null) {
                z10 = r32.h;
            } else if (mpVar != null) {
                z10 = mpVar.a.q;
            }
            if (z10) {
                accessibilityNodeInfo.setSelected(true);
            }
        }
        accessibilityNodeInfo.setContentDescription(this.a.getText());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.ActionBar.n6.k0.getStrokeWidth() + org.telegram.messenger.g0.L(58.0f)), TLObject.FLAG_30));
    }

    public void setChecked(boolean z10) {
        Switch r12 = this.c;
        if (r12 != null) {
            r12.c(z10, false);
        }
        mp mpVar = this.d;
        if (mpVar != null) {
            mpVar.a(z10, false);
        }
    }
}
