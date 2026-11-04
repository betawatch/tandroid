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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class PollVotesAlert$UserCell extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public ArrayList E;
    public final /* synthetic */ se0 F;
    public final k9 a;
    public final org.telegram.ui.ActionBar.k5 b;
    public final TextView c;
    public final TextView d;
    public final u8 e;
    public final mu0 f;
    public TLRPC.User h;
    public TLRPC.Chat n;
    public CharSequence r;
    public boolean s;
    public int w;
    public boolean x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollVotesAlert$UserCell(se0 se0Var, Context context) {
        super(context);
        this.F = se0Var;
        this.y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.e = new u8((org.telegram.ui.ActionBar.e6) null);
        k9 k9Var = new k9(context);
        this.a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(k9Var, b8.mf.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var;
        int i3 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i3, null);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(16);
        k5Var.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
        addView(k5Var, b8.mf.q(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, b8.mf.q(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i3, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, b8.mf.q(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f = new mu0(20, k5Var);
    }

    @Override // org.telegram.ui.ActionBar.z5
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
            se0 se0Var = this.F;
            se0Var.y1.setAlpha((int) (this.y * 255.0f));
            k9 k9Var = this.a;
            canvas.drawCircle((k9Var.getMeasuredWidth() / 2) + k9Var.getLeft(), (k9Var.getMeasuredHeight() / 2) + k9Var.getTop(), k9Var.getMeasuredWidth() / 2, se0Var.y1);
            if (this.w % 2 == 0) {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(48.0f);
            } else {
                L = org.telegram.messenger.g0.L(65.0f);
                L2 = org.telegram.messenger.g0.L(60.0f);
            }
            if (org.telegram.messenger.bd.a0) {
                L = (getMeasuredWidth() - L) - L2;
            }
            se0Var.E1.set(L, r5 - org.telegram.messenger.g0.L(4.0f), L + L2, org.telegram.messenger.g0.L(4.0f) + r5);
            canvas.drawRoundRect(se0Var.E1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), se0Var.y1);
            if (this.w % 2 == 0) {
                L3 = org.telegram.messenger.g0.L(119.0f);
                L4 = org.telegram.messenger.g0.L(60.0f);
            } else {
                L3 = org.telegram.messenger.g0.L(131.0f);
                L4 = org.telegram.messenger.g0.L(80.0f);
            }
            if (org.telegram.messenger.bd.a0) {
                L3 = (getMeasuredWidth() - L3) - L4;
            }
            se0Var.E1.set(L3, r5 - org.telegram.messenger.g0.L(4.0f), L3 + L4, org.telegram.messenger.g0.L(4.0f) + r5);
            canvas.drawRoundRect(se0Var.E1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), se0Var.y1);
        }
        if (this.s) {
            canvas.drawLine(org.telegram.messenger.bd.a0 ? 0.0f : org.telegram.messenger.g0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(64.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f) + (this.s ? 1 : 0), TLObject.FLAG_30));
    }

    public void setPlaceholderAlpha(float f10) {
        this.y = f10;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        mu0 mu0Var = this.f;
        if (mu0Var != null) {
            try {
                e5 e5Var = mu0Var.a;
                if (!(e5Var != null) || e5Var.G == null) {
                    return;
                }
                int i3 = org.telegram.ui.ActionBar.k6.z9;
                se0 se0Var = this.F;
                org.telegram.ui.Cells.n8 n8Var = se0.J1;
                e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i3, se0Var.J0)));
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
