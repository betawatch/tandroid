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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class PollVotesAlert$UserCell extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public ArrayList D;
    public final /* synthetic */ qe0 E;
    public final l9 a;
    public final org.telegram.ui.ActionBar.k5 b;
    public final TextView c;
    public final TextView d;
    public final w8 e;
    public final nu0 f;
    public TLRPC.User h;
    public TLRPC.Chat n;
    public CharSequence r;
    public boolean s;
    public int w;
    public boolean x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollVotesAlert$UserCell(qe0 qe0Var, Context context) {
        super(context);
        this.E = qe0Var;
        this.y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.e = new w8((org.telegram.ui.ActionBar.f6) null);
        l9 l9Var = new l9(context);
        this.a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(l9Var, c8.ha.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var;
        int i7 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i7, null);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(16);
        k5Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        addView(k5Var, c8.ha.q(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, c8.ha.q(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i7, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, c8.ha.q(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f = new nu0(20, k5Var);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z9));
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
            qe0 qe0Var = this.E;
            qe0Var.x1.setAlpha((int) (this.y * 255.0f));
            l9 l9Var = this.a;
            canvas.drawCircle((l9Var.getMeasuredWidth() / 2) + l9Var.getLeft(), (l9Var.getMeasuredHeight() / 2) + l9Var.getTop(), l9Var.getMeasuredWidth() / 2, qe0Var.x1);
            if (this.w % 2 == 0) {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(48.0f);
            } else {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(60.0f);
            }
            if (org.telegram.messenger.hd.a0) {
                L = (getMeasuredWidth() - L) - L2;
            }
            qe0Var.D1.set(L, r5 - org.telegram.messenger.g0.L(4.0f), L + L2, org.telegram.messenger.g0.L(4.0f) + r5);
            canvas.drawRoundRect(qe0Var.D1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), qe0Var.x1);
            if (this.w % 2 == 0) {
                L3 = org.telegram.messenger.g0.L(119.0f);
                L4 = org.telegram.messenger.g0.L(60.0f);
            } else {
                L3 = org.telegram.messenger.g0.L(131.0f);
                L4 = org.telegram.messenger.g0.L(80.0f);
            }
            if (org.telegram.messenger.hd.a0) {
                L3 = (getMeasuredWidth() - L3) - L4;
            }
            qe0Var.D1.set(L3, r5 - org.telegram.messenger.g0.L(4.0f), L3 + L4, org.telegram.messenger.g0.L(4.0f) + r5);
            canvas.drawRoundRect(qe0Var.D1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), qe0Var.x1);
        }
        if (this.s) {
            canvas.drawLine(org.telegram.messenger.hd.a0 ? 0.0f : org.telegram.messenger.g0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(64.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + (this.s ? 1 : 0), TLObject.FLAG_30));
    }

    public void setPlaceholderAlpha(float f10) {
        this.y = f10;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        nu0 nu0Var = this.f;
        if (nu0Var != null) {
            try {
                g5 g5Var = nu0Var.a;
                if (!(g5Var != null) || g5Var.F == null) {
                    return;
                }
                int i7 = org.telegram.ui.ActionBar.k6.z9;
                qe0 qe0Var = this.E;
                org.telegram.ui.Cells.o8 o8Var = qe0.I1;
                g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i7, qe0Var.I0)));
                org.telegram.ui.ActionBar.k5 k5Var = this.b;
                if (k5Var != null) {
                    k5Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
