package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class mq0 extends xh.l {
    public final org.telegram.ui.Cells.s9 U;
    public ArrayList V;
    public boolean W;
    public Layout a0;
    public org.telegram.ui.Components.n5 b0;
    public boolean c0;
    public org.telegram.ui.Components.b80 d0;
    public Layout e0;
    public Path f0;

    public mq0(Context context, kq0 kq0Var, org.telegram.ui.Cells.s9 s9Var, final org.telegram.messenger.v10 v10Var, final org.telegram.messenger.x10 x10Var) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        final int i7 = 0;
        this.F = new org.telegram.ui.Components.w70(this) { // from class: org.telegram.ui.lq0
            public final /* synthetic */ mq0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.w70
            public final void a(ClickableSpan clickableSpan) {
                switch (i7) {
                    case 0:
                        org.telegram.messenger.v10 v10Var2 = (org.telegram.messenger.v10) v10Var;
                        mq0 mq0Var = this.b;
                        mq0Var.getClass();
                        v10Var2.a(clickableSpan, mq0Var);
                        break;
                    default:
                        org.telegram.messenger.x10 x10Var2 = (org.telegram.messenger.x10) v10Var;
                        mq0 mq0Var2 = this.b;
                        x10Var2.a(clickableSpan, mq0Var2, new gf0(mq0Var2, 25));
                        break;
                }
            }
        };
        final int i10 = 1;
        this.G = new org.telegram.ui.Components.w70(this) { // from class: org.telegram.ui.lq0
            public final /* synthetic */ mq0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.w70
            public final void a(ClickableSpan clickableSpan) {
                switch (i10) {
                    case 0:
                        org.telegram.messenger.v10 v10Var2 = (org.telegram.messenger.v10) x10Var;
                        mq0 mq0Var = this.b;
                        mq0Var.getClass();
                        v10Var2.a(clickableSpan, mq0Var);
                        break;
                    default:
                        org.telegram.messenger.x10 x10Var2 = (org.telegram.messenger.x10) x10Var;
                        mq0 mq0Var2 = this.b;
                        x10Var2.a(clickableSpan, mq0Var2, new gf0(mq0Var2, 25));
                        break;
                }
            }
        };
        this.U = s9Var;
        c8.sa.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(c8.ha.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new i40(kq0Var, 20));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.c0) {
            Layout layout = getLayout();
            Path path = this.f0;
            if (path == null || this.e0 != layout) {
                if (path == null) {
                    this.f0 = new Path();
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
                        this.f0.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f10, getPaddingLeft() + lineRight, getPaddingTop() + f12, Path.Direction.CW);
                        i7++;
                        f10 = f12;
                    }
                }
                this.e0 = layout;
            }
            if (this.d0 == null) {
                org.telegram.ui.Components.b80 b80Var = new org.telegram.ui.Components.b80();
                this.d0 = b80Var;
                b80Var.y = this.f0;
                b80Var.k(4.0f);
                this.d0.g(org.telegram.ui.ActionBar.l6.r1(0.3f, -1), org.telegram.ui.ActionBar.l6.r1(0.1f, -1), org.telegram.ui.ActionBar.l6.r1(0.2f, -1), org.telegram.ui.ActionBar.l6.r1(0.7f, -1));
                this.d0.setCallback(this);
            }
            this.d0.setBounds(0, 0, getWidth(), getHeight());
            this.d0.draw(canvas);
        }
        if (this.c0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.qs.I2, 31);
        }
        if (this.V != null && this.W) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i10 = 0; i10 < this.V.size(); i10++) {
                org.telegram.ui.Components.rg0 rg0Var = (org.telegram.ui.Components.rg0) this.V.get(i10);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int L3 = this.W ? org.telegram.messenger.g0.L(32.0f) : 0;
                getPaint();
                rg0Var.a(canvas, width + L3, -1);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (this.c0) {
            canvas.restore();
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.clipRect(0.0f, getScrollY(), getWidth() - getPaddingRight(), (getScrollY() + getHeight()) - (getPaddingBottom() * 0.75f));
        org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, getLayout(), this.b0, 0.0f, this.b, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.r5.release(this, this.b0);
        this.V = org.telegram.ui.Components.vg0.e(null, this.V);
    }

    @Override // xh.l, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.s9 s9Var = this.U;
        if (s9Var != null && s9Var.x()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (s9Var != null && getStaticTextLayout() != null && s9Var.p0 == this) {
                s9Var.W(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.a0 != getLayout()) {
            this.b0 = org.telegram.ui.Components.r5.update(0, this, this.b0, getLayout());
            this.V = org.telegram.ui.Components.vg0.e(getLayout(), this.V);
            boolean z9 = getLayout() != null && (getLayout().getText() instanceof Spanned) && ((org.telegram.ui.Components.ug0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.ug0.class)).length > 0;
            this.W = z9;
            c8.sa.a(this, 16.0f, 8.0f, (z9 ? 32 : 0) + 16, 8.0f);
            this.a0 = getLayout();
        }
    }

    @Override // xh.l, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        this.b0 = org.telegram.ui.Components.r5.update(0, this, this.b0, getLayout());
        this.V = org.telegram.ui.Components.vg0.e(getLayout(), this.V);
    }

    public void setLoading(boolean z9) {
        if (this.c0 == z9) {
            return;
        }
        this.c0 = z9;
        invalidate();
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        boolean z10 = z9 != isPressed();
        super.setPressed(z9);
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d0 || super.verifyDrawable(drawable);
    }
}
