package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ck0 extends FrameLayout implements org.telegram.messenger.x5 {
    public final TextView a;
    public final TextView b;
    public final org.telegram.ui.Components.i9 c;
    public final org.telegram.ui.Components.gh0 d;
    public int e;
    public org.telegram.messenger.cw f;
    public final int h;
    public final /* synthetic */ ek0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck0(ek0 ek0Var, Activity activity) {
        super(activity);
        int i7;
        this.n = ek0Var;
        i7 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
        this.h = org.telegram.messenger.z5.q(i7).k();
        this.d = new org.telegram.ui.Components.gh0(this);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(activity);
        this.c = i9Var;
        addView(i9Var, c8.ja.d(48, 48.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 21.0f, 8.0f, 21.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.a = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
        org.telegram.messenger.i20.p(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        boolean z10 = org.telegram.messenger.hd.a0;
        addView(textView, c8.ja.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 81, 10.0f, z10 ? 81 : 21, 0.0f));
        TextView textView2 = new TextView(activity);
        this.b = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.z6, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        boolean z11 = org.telegram.messenger.hd.a0;
        addView(textView2, c8.ja.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 81, 35.0f, z11 ? 81 : 21, 0.0f));
        setWillNotDraw(false);
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
        a(false);
    }

    @Override // org.telegram.messenger.x5
    public final void N(String str) {
        this.d.e(true, 1.0f);
        a(true);
    }

    public final void a(boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12;
        String r10 = org.telegram.messenger.w7.r(null, this.f);
        org.telegram.messenger.w7.G(org.telegram.messenger.m10.t0);
        boolean exists = org.telegram.messenger.w7.I(this.f).exists();
        boolean isEmpty = TextUtils.isEmpty(r10);
        org.telegram.ui.Components.gh0 gh0Var = this.d;
        if (isEmpty) {
            gh0Var.d(null, false, false);
            return;
        }
        org.telegram.messenger.cw cwVar = this.f;
        String str = cwVar.c;
        ek0 ek0Var = this.n;
        if (str != null) {
            if (cwVar.d != null) {
                i12 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
                org.telegram.messenger.z5.q(i12).v(this);
                gh0Var.d(null, false, z10);
                this.e = -1;
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
            org.telegram.messenger.z5.q(i11).a(this.f.c, null, this);
            this.e = 1;
            Float w10 = org.telegram.messenger.fc.D().w(this.f.c);
            gh0Var.d(getResources().getDrawable(R.drawable.circle), true, z10);
            gh0Var.e(false, w10 != null ? w10.floatValue() : 0.0f);
            invalidate();
            return;
        }
        if (exists) {
            i10 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
            org.telegram.messenger.z5.q(i10).v(this);
            this.e = -1;
            gh0Var.d(null, false, z10);
            invalidate();
            return;
        }
        i7 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
        org.telegram.messenger.z5.q(i7).a(r10, null, this);
        this.e = 1;
        Float w11 = org.telegram.messenger.fc.D().w(r10);
        gh0Var.d(getResources().getDrawable(R.drawable.circle), true, z10);
        gh0Var.e(z10, w11 != null ? w11.floatValue() : 0.0f);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view == this.c) {
            this.d.a(canvas);
        }
        return drawChild;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.h;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        this.d.e(true, Math.min(1.0f, j3 / j10));
        if (this.e != 1) {
            a(false);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
        this.d.e(true, Math.min(1.0f, j3 / j10));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(org.telegram.messenger.hd.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        org.telegram.ui.Components.i9 i9Var = this.c;
        int measuredWidth = ((i9Var.getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f)) / 2) + i9Var.getLeft();
        int measuredHeight = ((i9Var.getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f)) / 2) + i9Var.getTop();
        this.d.f(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(24.0f) + measuredWidth, org.telegram.messenger.g0.L(24.0f) + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), org.telegram.messenger.i20.B(64.0f, 1, TLObject.FLAG_30));
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
