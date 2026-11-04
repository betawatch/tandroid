package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bq0 extends yh.l {
    public final org.telegram.ui.Cells.r9 V;
    public ArrayList W;
    public boolean a0;
    public Layout b0;
    public org.telegram.ui.Components.l5 c0;
    public boolean d0;
    public org.telegram.ui.Components.w70 e0;
    public Layout f0;
    public Path g0;

    public bq0(Context context, zp0 zp0Var, org.telegram.ui.Cells.r9 r9Var, final org.telegram.messenger.n10 n10Var, final org.telegram.messenger.p10 p10Var) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        final int i3 = 0;
        this.G = new org.telegram.ui.Components.r70(this) { // from class: org.telegram.ui.aq0
            public final /* synthetic */ bq0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.r70
            public final void a(ClickableSpan clickableSpan) {
                switch (i3) {
                    case 0:
                        org.telegram.messenger.n10 n10Var2 = (org.telegram.messenger.n10) n10Var;
                        bq0 bq0Var = this.b;
                        bq0Var.getClass();
                        n10Var2.a(clickableSpan, bq0Var);
                        break;
                    default:
                        org.telegram.messenger.p10 p10Var2 = (org.telegram.messenger.p10) n10Var;
                        bq0 bq0Var2 = this.b;
                        p10Var2.a(clickableSpan, bq0Var2, new sg0(bq0Var2, 24));
                        break;
                }
            }
        };
        final int i10 = 1;
        this.H = new org.telegram.ui.Components.r70(this) { // from class: org.telegram.ui.aq0
            public final /* synthetic */ bq0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.r70
            public final void a(ClickableSpan clickableSpan) {
                switch (i10) {
                    case 0:
                        org.telegram.messenger.n10 n10Var2 = (org.telegram.messenger.n10) p10Var;
                        bq0 bq0Var = this.b;
                        bq0Var.getClass();
                        n10Var2.a(clickableSpan, bq0Var);
                        break;
                    default:
                        org.telegram.messenger.p10 p10Var2 = (org.telegram.messenger.p10) p10Var;
                        bq0 bq0Var2 = this.b;
                        p10Var2.a(clickableSpan, bq0Var2, new sg0(bq0Var2, 24));
                        break;
                }
            }
        };
        this.V = r9Var;
        b8.tf.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(b8.mf.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new b40(zp0Var, 20));
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
                    int i3 = 0;
                    while (i3 < layout.getLineCount()) {
                        float f11 = L / 3.0f;
                        float lineLeft = layout.getLineLeft(i3) - f11;
                        float lineRight = layout.getLineRight(i3) + f11;
                        if (i3 == 0) {
                            f10 = layout.getLineTop(i3) - (L2 / 3.0f);
                        }
                        float lineBottom = layout.getLineBottom(i3);
                        float f12 = i3 >= layout.getLineCount() + (-1) ? (L2 / 3.0f) + lineBottom : lineBottom;
                        this.g0.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f10, getPaddingLeft() + lineRight, getPaddingTop() + f12, Path.Direction.CW);
                        i3++;
                        f10 = f12;
                    }
                }
                this.f0 = layout;
            }
            if (this.e0 == null) {
                org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70();
                this.e0 = w70Var;
                w70Var.y = this.g0;
                w70Var.k(4.0f);
                this.e0.g(org.telegram.ui.ActionBar.k6.r1(0.3f, -1), org.telegram.ui.ActionBar.k6.r1(0.1f, -1), org.telegram.ui.ActionBar.k6.r1(0.2f, -1), org.telegram.ui.ActionBar.k6.r1(0.7f, -1));
                this.e0.setCallback(this);
            }
            this.e0.setBounds(0, 0, getWidth(), getHeight());
            this.e0.draw(canvas);
        }
        if (this.d0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.hs.I2, 31);
        }
        if (this.W != null && this.a0) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i10 = 0; i10 < this.W.size(); i10++) {
                org.telegram.ui.Components.tg0 tg0Var = (org.telegram.ui.Components.tg0) this.W.get(i10);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int L3 = this.a0 ? org.telegram.messenger.g0.L(32.0f) : 0;
                getPaint();
                tg0Var.a(canvas, width + L3, -1);
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
        org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, getLayout(), this.c0, 0.0f, this.b, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.p5.release(this, this.c0);
        this.W = org.telegram.ui.Components.xg0.e(null, this.W);
    }

    @Override // yh.l, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.r9 r9Var = this.V;
        if (r9Var != null && r9Var.x()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (r9Var != null && getStaticTextLayout() != null && r9Var.p0 == this) {
                r9Var.W(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.b0 != getLayout()) {
            this.c0 = org.telegram.ui.Components.p5.update(0, this, this.c0, getLayout());
            this.W = org.telegram.ui.Components.xg0.e(getLayout(), this.W);
            boolean z10 = getLayout() != null && (getLayout().getText() instanceof Spanned) && ((org.telegram.ui.Components.wg0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.wg0.class)).length > 0;
            this.a0 = z10;
            b8.tf.a(this, 16.0f, 8.0f, (z10 ? 32 : 0) + 16, 8.0f);
            this.b0 = getLayout();
        }
    }

    @Override // yh.l, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        super.onTextChanged(charSequence, i3, i10, i11);
        this.c0 = org.telegram.ui.Components.p5.update(0, this, this.c0, getLayout());
        this.W = org.telegram.ui.Components.xg0.e(getLayout(), this.W);
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
