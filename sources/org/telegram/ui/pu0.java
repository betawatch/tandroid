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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class pu0 extends wh.p {
    public final org.telegram.ui.Cells.aa R;
    public ArrayList S;
    public boolean T;
    public Layout U;
    public org.telegram.ui.Components.v5 V;
    public boolean W;
    public org.telegram.ui.Components.h90 a0;
    public Layout b0;
    public Path c0;

    public pu0(Context context, nu0 nu0Var, org.telegram.ui.Cells.aa aaVar, final Utilities.Callback2 callback2, final Utilities.Callback3 callback3) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        final int i10 = 0;
        this.x = new org.telegram.ui.Components.c90(this) { // from class: org.telegram.ui.ou0
            public final /* synthetic */ pu0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.c90
            public final void a(ClickableSpan clickableSpan) {
                switch (i10) {
                    case 0:
                        Utilities.Callback2 callback22 = (Utilities.Callback2) callback2;
                        pu0 pu0Var = this.b;
                        pu0Var.getClass();
                        callback22.run(clickableSpan, pu0Var);
                        break;
                    default:
                        Utilities.Callback3 callback32 = (Utilities.Callback3) callback2;
                        pu0 pu0Var2 = this.b;
                        callback32.run(clickableSpan, pu0Var2, new rl0(pu0Var2, 21));
                        break;
                }
            }
        };
        final int i11 = 1;
        this.y = new org.telegram.ui.Components.c90(this) { // from class: org.telegram.ui.ou0
            public final /* synthetic */ pu0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.c90
            public final void a(ClickableSpan clickableSpan) {
                switch (i11) {
                    case 0:
                        Utilities.Callback2 callback22 = (Utilities.Callback2) callback3;
                        pu0 pu0Var = this.b;
                        pu0Var.getClass();
                        callback22.run(clickableSpan, pu0Var);
                        break;
                    default:
                        Utilities.Callback3 callback32 = (Utilities.Callback3) callback3;
                        pu0 pu0Var2 = this.b;
                        callback32.run(clickableSpan, pu0Var2, new rl0(pu0Var2, 21));
                        break;
                }
            }
        };
        this.R = aaVar;
        w7.d6.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(w7.x5.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new l60(nu0Var, 19));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            Layout layout = getLayout();
            Path path = this.c0;
            if (path == null || this.b0 != layout) {
                if (path == null) {
                    this.c0 = new Path();
                } else {
                    path.rewind();
                }
                if (layout != null) {
                    float dp = AndroidUtilities.dp(16.0f);
                    float dp2 = AndroidUtilities.dp(8.0f);
                    int i10 = 0;
                    float f7 = 0.0f;
                    while (i10 < layout.getLineCount()) {
                        float f10 = dp / 3.0f;
                        float lineLeft = layout.getLineLeft(i10) - f10;
                        float lineRight = layout.getLineRight(i10) + f10;
                        if (i10 == 0) {
                            f7 = layout.getLineTop(i10) - (dp2 / 3.0f);
                        }
                        float lineBottom = layout.getLineBottom(i10);
                        float f11 = i10 >= layout.getLineCount() + (-1) ? (dp2 / 3.0f) + lineBottom : lineBottom;
                        this.c0.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f7, getPaddingLeft() + lineRight, getPaddingTop() + f11, Path.Direction.CW);
                        i10++;
                        f7 = f11;
                    }
                }
                this.b0 = layout;
            }
            if (this.a0 == null) {
                org.telegram.ui.Components.h90 h90Var = new org.telegram.ui.Components.h90();
                this.a0 = h90Var;
                h90Var.x = this.c0;
                h90Var.j(4.0f);
                this.a0.f(org.telegram.ui.ActionBar.j6.l1(0.3f, -1), org.telegram.ui.ActionBar.j6.l1(0.1f, -1), org.telegram.ui.ActionBar.j6.l1(0.2f, -1), org.telegram.ui.ActionBar.j6.l1(0.7f, -1));
                this.a0.setCallback(this);
            }
            this.a0.setBounds(0, 0, getWidth(), getHeight());
            this.a0.draw(canvas);
        }
        if (this.W) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 178, 31);
        }
        if (this.S != null && this.T) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i11 = 0; i11 < this.S.size(); i11++) {
                org.telegram.ui.Components.oi0 oi0Var = (org.telegram.ui.Components.oi0) this.S.get(i11);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int dp3 = this.T ? AndroidUtilities.dp(32.0f) : 0;
                getPaint();
                oi0Var.a(canvas, width + dp3, -1);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (this.W) {
            canvas.restore();
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.clipRect(0.0f, getScrollY(), getWidth() - getPaddingRight(), (getScrollY() + getHeight()) - (getPaddingBottom() * 0.75f));
        org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, getLayout(), this.V, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.z5.release(this, this.V);
        this.S = org.telegram.ui.Components.si0.e(null, this.S);
    }

    @Override // wh.p, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.aa aaVar = this.R;
        if (aaVar != null && aaVar.y()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (aaVar != null && getStaticTextLayout() != null && aaVar.u0 == this) {
                aaVar.X(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.U != getLayout()) {
            this.V = org.telegram.ui.Components.z5.update(0, this, this.V, getLayout());
            this.S = org.telegram.ui.Components.si0.e(getLayout(), this.S);
            boolean z10 = getLayout() != null && (getLayout().getText() instanceof Spanned) && ((org.telegram.ui.Components.ri0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.ri0.class)).length > 0;
            this.T = z10;
            w7.d6.a(this, 16.0f, 8.0f, (z10 ? 32 : 0) + 16, 8.0f);
            this.U = getLayout();
        }
    }

    @Override // wh.p, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        this.V = org.telegram.ui.Components.z5.update(0, this, this.V, getLayout());
        this.S = org.telegram.ui.Components.si0.e(getLayout(), this.S);
    }

    public void setLoading(boolean z10) {
        if (this.W == z10) {
            return;
        }
        this.W = z10;
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
        return drawable == this.a0 || super.verifyDrawable(drawable);
    }
}
