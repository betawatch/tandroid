package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jl0 extends FrameLayout implements org.telegram.messenger.z5 {
    public final TextView a;
    public final TextView b;
    public final org.telegram.ui.Components.g9 c;
    public final org.telegram.ui.Components.fi0 d;
    public int e;
    public org.telegram.messenger.pw f;
    public final int h;
    public final /* synthetic */ ll0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl0(ll0 ll0Var, Activity activity) {
        super(activity);
        int i10;
        this.n = ll0Var;
        i10 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
        this.h = org.telegram.messenger.b6.q(i10).k();
        this.d = new org.telegram.ui.Components.fi0(this);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(activity);
        this.c = g9Var;
        addView(g9Var, w7.b6.d(48, 48.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 21.0f, 8.0f, 21.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        org.telegram.messenger.z20.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
        boolean z10 = org.telegram.messenger.cd.X;
        addView(textView, w7.b6.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 81, 10.0f, z10 ? 81 : 21, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.z6, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        boolean z11 = org.telegram.messenger.cd.X;
        addView(textView2, w7.b6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 81, 35.0f, z11 ? 81 : 21, 0.0f));
        setWillNotDraw(false);
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
        a(false);
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
        this.d.e(true, 1.0f);
        a(true);
    }

    public final void a(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        String r10 = org.telegram.messenger.b8.r(null, this.f);
        org.telegram.messenger.b8.G(org.telegram.messenger.d20.s0);
        boolean exists = org.telegram.messenger.b8.I(this.f).exists();
        boolean isEmpty = TextUtils.isEmpty(r10);
        org.telegram.ui.Components.fi0 fi0Var = this.d;
        if (isEmpty) {
            fi0Var.d(null, false, false);
            return;
        }
        org.telegram.messenger.pw pwVar = this.f;
        String str = pwVar.c;
        ll0 ll0Var = this.n;
        if (str != null) {
            if (pwVar.d != null) {
                i13 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
                org.telegram.messenger.b6.q(i13).v(this);
                fi0Var.d(null, false, z10);
                this.e = -1;
                return;
            }
            i12 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
            org.telegram.messenger.b6.q(i12).a(this.f.c, null, this);
            this.e = 1;
            Float w9 = org.telegram.messenger.hc.D().w(this.f.c);
            fi0Var.d(getResources().getDrawable(R.drawable.circle), true, z10);
            fi0Var.e(false, w9 != null ? w9.floatValue() : 0.0f);
            invalidate();
            return;
        }
        if (exists) {
            i11 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
            org.telegram.messenger.b6.q(i11).v(this);
            this.e = -1;
            fi0Var.d(null, false, z10);
            invalidate();
            return;
        }
        i10 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
        org.telegram.messenger.b6.q(i10).a(r10, null, this);
        this.e = 1;
        Float w10 = org.telegram.messenger.hc.D().w(r10);
        fi0Var.d(getResources().getDrawable(R.drawable.circle), true, z10);
        fi0Var.e(z10, w10 != null ? w10.floatValue() : 0.0f);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view == this.c) {
            this.d.a(canvas);
        }
        return drawChild;
    }

    @Override // org.telegram.messenger.z5
    public int getObserverTag() {
        return this.h;
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        this.d.e(true, Math.min(1.0f, j10 / j11));
        if (this.e != 1) {
            a(false);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
        this.d.e(true, Math.min(1.0f, j10 / j11));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(org.telegram.messenger.cd.X ? 0.0f : org.telegram.messenger.i0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        org.telegram.ui.Components.g9 g9Var = this.c;
        int measuredWidth = ((g9Var.getMeasuredWidth() - org.telegram.messenger.i0.L(24.0f)) / 2) + g9Var.getLeft();
        int measuredHeight = ((g9Var.getMeasuredHeight() - org.telegram.messenger.i0.L(24.0f)) / 2) + g9Var.getTop();
        this.d.f(measuredWidth, measuredHeight, org.telegram.messenger.i0.L(24.0f) + measuredWidth, org.telegram.messenger.i0.L(24.0f) + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), org.telegram.messenger.z20.B(64.0f, 1, TLObject.FLAG_30));
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
