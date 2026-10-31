package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class PollVotesAlert$UserCell extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public ArrayList D;
    public final /* synthetic */ tf0 E;
    public final g9 a;
    public final org.telegram.ui.ActionBar.u5 b;
    public final TextView c;
    public final TextView d;
    public final r8 e;
    public final pv0 f;
    public TLRPC.User h;
    public TLRPC.Chat n;
    public CharSequence r;
    public boolean s;
    public int w;
    public boolean x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollVotesAlert$UserCell(tf0 tf0Var, Context context) {
        super(context);
        this.E = tf0Var;
        this.y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        this.e = new r8((org.telegram.ui.ActionBar.p6) null);
        g9 g9Var = new g9(context);
        this.a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(18.0f));
        addView(g9Var, w7.b6.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.b = u5Var;
        int i10 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.Y(u5Var, i10, null);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setTextSize(16);
        u5Var.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
        addView(u5Var, w7.b6.q(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, w7.b6.q(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, i10, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, w7.b6.q(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f = new pv0(20, u5Var);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z9));
    }

    public float getPlaceholderAlpha() {
        return this.y;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f.a.b();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        int L;
        int L2;
        int L3;
        int L4;
        if (this.x || this.y != 0.0f) {
            tf0 tf0Var = this.E;
            tf0Var.x1.setAlpha((int) (this.y * 255.0f));
            g9 g9Var = this.a;
            canvas.drawCircle((g9Var.getMeasuredWidth() / 2) + g9Var.getLeft(), (g9Var.getMeasuredHeight() / 2) + g9Var.getTop(), g9Var.getMeasuredWidth() / 2, tf0Var.x1);
            if (this.w % 2 == 0) {
                L = org.telegram.messenger.i0.L(65.0f);
                L2 = org.telegram.messenger.i0.L(48.0f);
            } else {
                L = org.telegram.messenger.i0.L(65.0f);
                L2 = org.telegram.messenger.i0.L(60.0f);
            }
            if (org.telegram.messenger.cd.X) {
                L = (getMeasuredWidth() - L) - L2;
            }
            tf0Var.D1.set(L, r5 - org.telegram.messenger.i0.L(4.0f), L + L2, org.telegram.messenger.i0.L(4.0f) + r5);
            canvas.drawRoundRect(tf0Var.D1, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), tf0Var.x1);
            if (this.w % 2 == 0) {
                L3 = org.telegram.messenger.i0.L(119.0f);
                L4 = org.telegram.messenger.i0.L(60.0f);
            } else {
                L3 = org.telegram.messenger.i0.L(131.0f);
                L4 = org.telegram.messenger.i0.L(80.0f);
            }
            if (org.telegram.messenger.cd.X) {
                L3 = (getMeasuredWidth() - L3) - L4;
            }
            tf0Var.D1.set(L3, r5 - org.telegram.messenger.i0.L(4.0f), L3 + L4, org.telegram.messenger.i0.L(4.0f) + r5);
            canvas.drawRoundRect(tf0Var.D1, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), tf0Var.x1);
        }
        if (this.s) {
            canvas.drawLine(org.telegram.messenger.cd.X ? 0.0f : org.telegram.messenger.i0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(64.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f) + (this.s ? 1 : 0), TLObject.FLAG_30));
    }

    public void setPlaceholderAlpha(float f7) {
        this.y = f7;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        pv0 pv0Var = this.f;
        if (pv0Var != null) {
            try {
                d5 d5Var = pv0Var.a;
                if (!(d5Var != null) || d5Var.F == null) {
                    return;
                }
                int i10 = org.telegram.ui.ActionBar.t6.z9;
                tf0 tf0Var = this.E;
                mh.g gVar = tf0.I1;
                d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(i10, tf0Var.I0)));
                org.telegram.ui.ActionBar.u5 u5Var = this.b;
                if (u5Var != null) {
                    u5Var.invalidate();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }
}
