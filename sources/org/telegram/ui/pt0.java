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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pt0 extends eh.s {
    public final org.telegram.ui.Cells.t9 N;
    public ArrayList O;
    public boolean P;
    public Layout Q;
    public org.telegram.ui.Components.p5 R;
    public boolean S;
    public org.telegram.ui.Components.t80 T;
    public Layout U;
    public Path V;

    public pt0(Context context, nt0 nt0Var, org.telegram.ui.Cells.t9 t9Var, final Utilities.Callback2 callback2, final Utilities.Callback3 callback3) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        final int i10 = 0;
        this.x = new org.telegram.ui.Components.o80(this) { // from class: org.telegram.ui.ot0
            public final /* synthetic */ pt0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.o80
            public final void a(ClickableSpan clickableSpan) {
                switch (i10) {
                    case 0:
                        Utilities.Callback2 callback22 = (Utilities.Callback2) callback2;
                        pt0 pt0Var = this.b;
                        pt0Var.getClass();
                        callback22.run(clickableSpan, pt0Var);
                        break;
                    default:
                        Utilities.Callback3 callback32 = (Utilities.Callback3) callback2;
                        pt0 pt0Var2 = this.b;
                        callback32.run(clickableSpan, pt0Var2, new zk0(pt0Var2, 22));
                        break;
                }
            }
        };
        final int i11 = 1;
        this.y = new org.telegram.ui.Components.o80(this) { // from class: org.telegram.ui.ot0
            public final /* synthetic */ pt0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.o80
            public final void a(ClickableSpan clickableSpan) {
                switch (i11) {
                    case 0:
                        Utilities.Callback2 callback22 = (Utilities.Callback2) callback3;
                        pt0 pt0Var = this.b;
                        pt0Var.getClass();
                        callback22.run(clickableSpan, pt0Var);
                        break;
                    default:
                        Utilities.Callback3 callback32 = (Utilities.Callback3) callback3;
                        pt0 pt0Var2 = this.b;
                        callback32.run(clickableSpan, pt0Var2, new zk0(pt0Var2, 22));
                        break;
                }
            }
        };
        this.N = t9Var;
        h7.f6.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(h7.z5.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new u50(nt0Var, 20));
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
                    int i10 = 0;
                    float f10 = 0.0f;
                    while (i10 < layout.getLineCount()) {
                        float f11 = dp / 3.0f;
                        float lineLeft = layout.getLineLeft(i10) - f11;
                        float lineRight = layout.getLineRight(i10) + f11;
                        if (i10 == 0) {
                            f10 = layout.getLineTop(i10) - (dp2 / 3.0f);
                        }
                        float lineBottom = layout.getLineBottom(i10);
                        float f12 = i10 >= layout.getLineCount() + (-1) ? (dp2 / 3.0f) + lineBottom : lineBottom;
                        this.V.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f10, getPaddingLeft() + lineRight, getPaddingTop() + f12, Path.Direction.CW);
                        i10++;
                        f10 = f12;
                    }
                }
                this.U = layout;
            }
            if (this.T == null) {
                org.telegram.ui.Components.t80 t80Var = new org.telegram.ui.Components.t80();
                this.T = t80Var;
                t80Var.x = this.V;
                t80Var.j(4.0f);
                this.T.f(org.telegram.ui.ActionBar.g6.l1(0.3f, -1), org.telegram.ui.ActionBar.g6.l1(0.1f, -1), org.telegram.ui.ActionBar.g6.l1(0.2f, -1), org.telegram.ui.ActionBar.g6.l1(0.7f, -1));
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
            for (int i11 = 0; i11 < this.O.size(); i11++) {
                org.telegram.ui.Components.di0 di0Var = (org.telegram.ui.Components.di0) this.O.get(i11);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int dp3 = this.P ? AndroidUtilities.dp(32.0f) : 0;
                getPaint();
                di0Var.a(canvas, width + dp3, -1);
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
        this.O = org.telegram.ui.Components.hi0.e(null, this.O);
    }

    @Override // eh.s, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.t9 t9Var = this.N;
        if (t9Var != null && t9Var.y()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (t9Var != null && getStaticTextLayout() != null && t9Var.u0 == this) {
                t9Var.X(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.Q != getLayout()) {
            this.R = org.telegram.ui.Components.t5.update(0, this, this.R, getLayout());
            this.O = org.telegram.ui.Components.hi0.e(getLayout(), this.O);
            boolean z10 = getLayout() != null && (getLayout().getText() instanceof Spanned) && ((org.telegram.ui.Components.gi0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.gi0.class)).length > 0;
            this.P = z10;
            h7.f6.a(this, 16.0f, 8.0f, (z10 ? 32 : 0) + 16, 8.0f);
            this.Q = getLayout();
        }
    }

    @Override // eh.s, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        this.R = org.telegram.ui.Components.t5.update(0, this, this.R, getLayout());
        this.O = org.telegram.ui.Components.hi0.e(getLayout(), this.O);
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
