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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class PollVotesAlert$UserCell extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public ArrayList D;
    public final /* synthetic */ qe0 E;
    public final k9 a;
    public final org.telegram.ui.ActionBar.m5 b;
    public final TextView c;
    public final TextView d;
    public final v8 e;
    public final ou0 f;
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
        this.e = new v8((org.telegram.ui.ActionBar.h6) null);
        k9 k9Var = new k9(context);
        this.a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(k9Var, c8.ha.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.b = m5Var;
        int i7 = org.telegram.ui.ActionBar.m6.j5;
        org.telegram.ui.ActionBar.t6.X(m5Var, i7, null);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setTextSize(16);
        m5Var.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 16);
        addView(m5Var, c8.ha.q(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, c8.ha.q(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, i7, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, c8.ha.q(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f = new ou0(20, m5Var);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z9));
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
            qe0Var.A1.setAlpha((int) (this.y * 255.0f));
            k9 k9Var = this.a;
            canvas.drawCircle((k9Var.getMeasuredWidth() / 2) + k9Var.getLeft(), (k9Var.getMeasuredHeight() / 2) + k9Var.getTop(), k9Var.getMeasuredWidth() / 2, qe0Var.A1);
            if (this.w % 2 == 0) {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(48.0f);
            } else {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(60.0f);
            }
            if (org.telegram.messenger.id.a0) {
                L = (getMeasuredWidth() - L) - L2;
            }
            qe0Var.G1.set(L, r5 - org.telegram.messenger.g0.L(4.0f), L + L2, org.telegram.messenger.g0.L(4.0f) + r5);
            canvas.drawRoundRect(qe0Var.G1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), qe0Var.A1);
            if (this.w % 2 == 0) {
                L3 = org.telegram.messenger.g0.L(119.0f);
                L4 = org.telegram.messenger.g0.L(60.0f);
            } else {
                L3 = org.telegram.messenger.g0.L(131.0f);
                L4 = org.telegram.messenger.g0.L(80.0f);
            }
            if (org.telegram.messenger.id.a0) {
                L3 = (getMeasuredWidth() - L3) - L4;
            }
            qe0Var.G1.set(L3, r5 - org.telegram.messenger.g0.L(4.0f), L3 + L4, org.telegram.messenger.g0.L(4.0f) + r5);
            canvas.drawRoundRect(qe0Var.G1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), qe0Var.A1);
        }
        if (this.s) {
            canvas.drawLine(org.telegram.messenger.id.a0 ? 0.0f : org.telegram.messenger.g0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(64.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.k0);
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        ou0 ou0Var = this.f;
        if (ou0Var != null) {
            try {
                f5 f5Var = ou0Var.a;
                if (!(f5Var != null) || f5Var.F == null) {
                    return;
                }
                int i7 = org.telegram.ui.ActionBar.m6.z9;
                qe0 qe0Var = this.E;
                org.telegram.ui.Cells.o8 o8Var = qe0.L1;
                f5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i7, qe0Var.I0)));
                org.telegram.ui.ActionBar.m5 m5Var = this.b;
                if (m5Var != null) {
                    m5Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
