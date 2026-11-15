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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class PollVotesAlert$UserCell extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public ArrayList E;
    public final /* synthetic */ te0 F;
    public final i9 a;
    public final org.telegram.ui.ActionBar.j5 b;
    public final TextView c;
    public final TextView d;
    public final t8 e;
    public final pu0 f;
    public TLRPC.User h;
    public TLRPC.Chat n;
    public CharSequence r;
    public boolean s;
    public int w;
    public boolean x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollVotesAlert$UserCell(te0 te0Var, Context context) {
        super(context);
        this.F = te0Var;
        this.y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.e = new t8((org.telegram.ui.ActionBar.e6) null);
        i9 i9Var = new i9(context);
        this.a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(i9Var, c8.ja.t(34, 34, 16, 0, 0, 11, 0));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.b = j5Var;
        int i7 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.X(j5Var, i7, null);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        j5Var.setTextSize(16);
        j5Var.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        addView(j5Var, c8.ja.q(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.r5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, c8.ja.q(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, i7, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, c8.ja.q(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f = new pu0(20, j5Var);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.z9));
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
            te0 te0Var = this.F;
            te0Var.B1.setAlpha((int) (this.y * 255.0f));
            i9 i9Var = this.a;
            canvas.drawCircle((i9Var.getMeasuredWidth() / 2) + i9Var.getLeft(), (i9Var.getMeasuredHeight() / 2) + i9Var.getTop(), i9Var.getMeasuredWidth() / 2, te0Var.B1);
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
            te0Var.H1.set(L, r5 - org.telegram.messenger.g0.L(4.0f), L + L2, org.telegram.messenger.g0.L(4.0f) + r5);
            canvas.drawRoundRect(te0Var.H1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), te0Var.B1);
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
            te0Var.H1.set(L3, r5 - org.telegram.messenger.g0.L(4.0f), L3 + L4, org.telegram.messenger.g0.L(4.0f) + r5);
            canvas.drawRoundRect(te0Var.H1, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), te0Var.B1);
        }
        if (this.s) {
            canvas.drawLine(org.telegram.messenger.hd.a0 ? 0.0f : org.telegram.messenger.g0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(64.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        pu0 pu0Var = this.f;
        if (pu0Var != null) {
            try {
                e5 e5Var = pu0Var.a;
                if (!(e5Var != null) || e5Var.G == null) {
                    return;
                }
                int i7 = org.telegram.ui.ActionBar.j6.z9;
                te0 te0Var = this.F;
                org.telegram.ui.Cells.n8 n8Var = te0.M1;
                e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i7, te0Var.J0)));
                org.telegram.ui.ActionBar.j5 j5Var = this.b;
                if (j5Var != null) {
                    j5Var.invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}
