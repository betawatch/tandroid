package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class lq0 extends xh.l {
    public final org.telegram.ui.Cells.t9 V;
    public ArrayList W;
    public boolean a0;
    public Layout b0;
    public org.telegram.ui.Components.u5 c0;
    public boolean d0;
    public org.telegram.ui.Components.q80 e0;
    public Layout f0;
    public Path g0;

    public lq0(Context context, jq0 jq0Var, org.telegram.ui.Cells.t9 t9Var, final org.telegram.messenger.q10 q10Var, final org.telegram.messenger.s10 s10Var) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        final int i7 = 0;
        this.G = new org.telegram.ui.Components.l80(this) { // from class: org.telegram.ui.kq0
            public final /* synthetic */ lq0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.l80
            public final void a(ClickableSpan clickableSpan) {
                switch (i7) {
                    case 0:
                        org.telegram.messenger.q10 q10Var2 = (org.telegram.messenger.q10) q10Var;
                        lq0 lq0Var = this.b;
                        lq0Var.getClass();
                        q10Var2.a(clickableSpan, lq0Var);
                        break;
                    default:
                        org.telegram.messenger.s10 s10Var2 = (org.telegram.messenger.s10) q10Var;
                        lq0 lq0Var2 = this.b;
                        s10Var2.a(clickableSpan, lq0Var2, new hf0(lq0Var2, 25));
                        break;
                }
            }
        };
        final int i10 = 1;
        this.H = new org.telegram.ui.Components.l80(this) { // from class: org.telegram.ui.kq0
            public final /* synthetic */ lq0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.l80
            public final void a(ClickableSpan clickableSpan) {
                switch (i10) {
                    case 0:
                        org.telegram.messenger.q10 q10Var2 = (org.telegram.messenger.q10) s10Var;
                        lq0 lq0Var = this.b;
                        lq0Var.getClass();
                        q10Var2.a(clickableSpan, lq0Var);
                        break;
                    default:
                        org.telegram.messenger.s10 s10Var2 = (org.telegram.messenger.s10) s10Var;
                        lq0 lq0Var2 = this.b;
                        s10Var2.a(clickableSpan, lq0Var2, new hf0(lq0Var2, 25));
                        break;
                }
            }
        };
        this.V = t9Var;
        c8.xa.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(c8.ma.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new j40(jq0Var, 20));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d0) {
            Layout layout = getLayout();
            Path path = this.g0;
            if (path == null || this.f0 != layout) {
                if (path == null) {
                    this.g0 = new Path();
                } else {
                    path.rewind();
                }
                if (layout != null) {
                    float L = org.telegram.messenger.g0.L(16.0f);
                    float L2 = org.telegram.messenger.g0.L(8.0f);
                    float f10 = 0.0f;
                    int i7 = 0;
                    while (i7 < layout.getLineCount()) {
                        float f11 = L / 3.0f;
                        float lineLeft = layout.getLineLeft(i7) - f11;
                        float lineRight = layout.getLineRight(i7) + f11;
                        if (i7 == 0) {
                            f10 = layout.getLineTop(i7) - (L2 / 3.0f);
                        }
                        float lineBottom = layout.getLineBottom(i7);
                        float f12 = i7 >= layout.getLineCount() + (-1) ? (L2 / 3.0f) + lineBottom : lineBottom;
                        this.g0.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f10, getPaddingLeft() + lineRight, getPaddingTop() + f12, Path.Direction.CW);
                        i7++;
                        f10 = f12;
                    }
                }
                this.f0 = layout;
            }
            if (this.e0 == null) {
                org.telegram.ui.Components.q80 q80Var = new org.telegram.ui.Components.q80();
                this.e0 = q80Var;
                q80Var.y = this.g0;
                q80Var.k(4.0f);
                this.e0.g(org.telegram.ui.ActionBar.m6.r1(0.3f, -1), org.telegram.ui.ActionBar.m6.r1(0.1f, -1), org.telegram.ui.ActionBar.m6.r1(0.2f, -1), org.telegram.ui.ActionBar.m6.r1(0.7f, -1));
                this.e0.setCallback(this);
            }
            this.e0.setBounds(0, 0, getWidth(), getHeight());
            this.e0.draw(canvas);
        }
        if (this.d0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.ks.I2, 31);
        }
        if (this.W != null && this.a0) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i10 = 0; i10 < this.W.size(); i10++) {
                org.telegram.ui.Components.fh0 fh0Var = (org.telegram.ui.Components.fh0) this.W.get(i10);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int L3 = this.a0 ? org.telegram.messenger.g0.L(32.0f) : 0;
                getPaint();
                fh0Var.a(canvas, width + L3, -1);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (this.d0) {
            canvas.restore();
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.clipRect(0.0f, getScrollY(), getWidth() - getPaddingRight(), (getScrollY() + getHeight()) - (getPaddingBottom() * 0.75f));
        org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, getLayout(), this.c0, 0.0f, this.b, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.y5.release(this, this.c0);
        this.W = org.telegram.ui.Components.jh0.e(null, this.W);
    }

    @Override // xh.l, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.t9 t9Var = this.V;
        if (t9Var != null && t9Var.x()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (t9Var != null && getStaticTextLayout() != null && t9Var.p0 == this) {
                t9Var.W(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.b0 != getLayout()) {
            this.c0 = org.telegram.ui.Components.y5.update(0, this, this.c0, getLayout());
            this.W = org.telegram.ui.Components.jh0.e(getLayout(), this.W);
            boolean z10 = getLayout() != null && (getLayout().getText() instanceof Spanned) && ((org.telegram.ui.Components.ih0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.ih0.class)).length > 0;
            this.a0 = z10;
            c8.xa.a(this, 16.0f, 8.0f, (z10 ? 32 : 0) + 16, 8.0f);
            this.b0 = getLayout();
        }
    }

    @Override // xh.l, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        this.c0 = org.telegram.ui.Components.y5.update(0, this, this.c0, getLayout());
        this.W = org.telegram.ui.Components.jh0.e(getLayout(), this.W);
    }

    public void setLoading(boolean z10) {
        if (this.d0 == z10) {
            return;
        }
        this.d0 = z10;
        invalidate();
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        boolean z11 = z10 != isPressed();
        super.setPressed(z10);
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e0 || super.verifyDrawable(drawable);
    }
}
