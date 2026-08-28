package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ot0 extends dh.u {
    public final org.telegram.ui.Cells.x9 N;
    public ArrayList O;
    public boolean P;
    public Layout Q;
    public org.telegram.ui.Components.p5 R;
    public boolean S;
    public org.telegram.ui.Components.p80 T;
    public Layout U;
    public Path V;

    public ot0(Context context, mt0 mt0Var, org.telegram.ui.Cells.x9 x9Var, final Utilities.Callback2 callback2, final Utilities.Callback3 callback3) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        final int i9 = 0;
        this.x = new org.telegram.ui.Components.k80(this) { // from class: org.telegram.ui.nt0
            public final /* synthetic */ ot0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.k80
            public final void a(ClickableSpan clickableSpan) {
                switch (i9) {
                    case 0:
                        Utilities.Callback2 callback22 = (Utilities.Callback2) callback2;
                        ot0 ot0Var = this.b;
                        ot0Var.getClass();
                        callback22.run(clickableSpan, ot0Var);
                        break;
                    default:
                        Utilities.Callback3 callback32 = (Utilities.Callback3) callback2;
                        ot0 ot0Var2 = this.b;
                        callback32.run(clickableSpan, ot0Var2, new zk0(ot0Var2, 22));
                        break;
                }
            }
        };
        final int i10 = 1;
        this.y = new org.telegram.ui.Components.k80(this) { // from class: org.telegram.ui.nt0
            public final /* synthetic */ ot0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.k80
            public final void a(ClickableSpan clickableSpan) {
                switch (i10) {
                    case 0:
                        Utilities.Callback2 callback22 = (Utilities.Callback2) callback3;
                        ot0 ot0Var = this.b;
                        ot0Var.getClass();
                        callback22.run(clickableSpan, ot0Var);
                        break;
                    default:
                        Utilities.Callback3 callback32 = (Utilities.Callback3) callback3;
                        ot0 ot0Var2 = this.b;
                        callback32.run(clickableSpan, ot0Var2, new zk0(ot0Var2, 22));
                        break;
                }
            }
        };
        this.N = x9Var;
        g7.k6.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(g7.e6.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new q50(mt0Var, 20));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.S) {
            Layout layout = getLayout();
            Path path = this.V;
            if (path == null || this.U != layout) {
                if (path == null) {
                    this.V = new Path();
                } else {
                    path.rewind();
                }
                if (layout != null) {
                    float dp = AndroidUtilities.dp(16.0f);
                    float dp2 = AndroidUtilities.dp(8.0f);
                    int i9 = 0;
                    float f10 = 0.0f;
                    while (i9 < layout.getLineCount()) {
                        float f11 = dp / 3.0f;
                        float lineLeft = layout.getLineLeft(i9) - f11;
                        float lineRight = layout.getLineRight(i9) + f11;
                        if (i9 == 0) {
                            f10 = layout.getLineTop(i9) - (dp2 / 3.0f);
                        }
                        float lineBottom = layout.getLineBottom(i9);
                        float f12 = i9 >= layout.getLineCount() + (-1) ? (dp2 / 3.0f) + lineBottom : lineBottom;
                        this.V.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f10, getPaddingLeft() + lineRight, getPaddingTop() + f12, Path.Direction.CW);
                        i9++;
                        f10 = f12;
                    }
                }
                this.U = layout;
            }
            if (this.T == null) {
                org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80();
                this.T = p80Var;
                p80Var.x = this.V;
                p80Var.j(4.0f);
                this.T.f(org.telegram.ui.ActionBar.f6.l1(0.3f, -1), org.telegram.ui.ActionBar.f6.l1(0.1f, -1), org.telegram.ui.ActionBar.f6.l1(0.2f, -1), org.telegram.ui.ActionBar.f6.l1(0.7f, -1));
                this.T.setCallback(this);
            }
            this.T.setBounds(0, 0, getWidth(), getHeight());
            this.T.draw(canvas);
        }
        if (this.S) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 178, 31);
        }
        if (this.O != null && this.P) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i10 = 0; i10 < this.O.size(); i10++) {
                org.telegram.ui.Components.bi0 bi0Var = (org.telegram.ui.Components.bi0) this.O.get(i10);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int dp3 = this.P ? AndroidUtilities.dp(32.0f) : 0;
                getPaint();
                bi0Var.a(canvas, width + dp3, -1);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (this.S) {
            canvas.restore();
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.clipRect(0.0f, getScrollY(), getWidth() - getPaddingRight(), (getScrollY() + getHeight()) - (getPaddingBottom() * 0.75f));
        org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, getLayout(), this.R, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.t5.release(this, this.R);
        this.O = org.telegram.ui.Components.fi0.e(null, this.O);
    }

    @Override // dh.u, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.x9 x9Var = this.N;
        if (x9Var != null && x9Var.y()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (x9Var != null && getStaticTextLayout() != null && x9Var.u0 == this) {
                x9Var.X(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.Q != getLayout()) {
            this.R = org.telegram.ui.Components.t5.update(0, this, this.R, getLayout());
            this.O = org.telegram.ui.Components.fi0.e(getLayout(), this.O);
            boolean z10 = getLayout() != null && (getLayout().getText() instanceof Spanned) && ((org.telegram.ui.Components.ei0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.ei0.class)).length > 0;
            this.P = z10;
            g7.k6.a(this, 16.0f, 8.0f, (z10 ? 32 : 0) + 16, 8.0f);
            this.Q = getLayout();
        }
    }

    @Override // dh.u, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        this.R = org.telegram.ui.Components.t5.update(0, this, this.R, getLayout());
        this.O = org.telegram.ui.Components.fi0.e(getLayout(), this.O);
    }

    public void setLoading(boolean z10) {
        if (this.S == z10) {
            return;
        }
        this.S = z10;
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
        return drawable == this.T || super.verifyDrawable(drawable);
    }
}
