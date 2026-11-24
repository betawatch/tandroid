// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gb8 extends xna {
    public final pkb V;
    public ArrayList W;
    public boolean a0;
    public Layout b0;
    public cn c0;
    public boolean d0;
    public qa6 e0;
    public Layout f0;
    public Path g0;

    public gb8(Context context, eb8 eb8Var, pkb pkbVar, final jac jacVar, final lac lacVar) {
        super(context);
        final byte b = 0;
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        this.G = new k66(this) { // from class: fb8
            public final /* synthetic */ gb8 b;

            {
                this.b = this;
            }

            @Override // k66
            public final void a(ClickableSpan clickableSpan) {
                byte b2 = b;
                Object obj = jacVar;
                gb8 gb8Var = this.b;
                switch (b2) {
                    case 0:
                        ((jac) obj).a(clickableSpan, gb8Var);
                        break;
                    default:
                        ((lac) obj).a(clickableSpan, gb8Var, new q78(gb8Var, (byte) 9));
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.H = new k66(this) { // from class: fb8
            public final /* synthetic */ gb8 b;

            {
                this.b = this;
            }

            @Override // k66
            public final void a(ClickableSpan clickableSpan) {
                byte b22 = b2;
                Object obj = lacVar;
                gb8 gb8Var = this.b;
                switch (b22) {
                    case 0:
                        ((jac) obj).a(clickableSpan, gb8Var);
                        break;
                    default:
                        ((lac) obj).a(clickableSpan, gb8Var, new q78(gb8Var, (byte) 9));
                        break;
                }
            }
        };
        this.V = pkbVar;
        vze.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(qoe.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new m67(eb8Var, (byte) 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        if (this.d0) {
            Layout layout = getLayout();
            Path path = this.g0;
            if (path != null) {
                if (this.f0 != layout) {
                    path.rewind();
                }
                if (this.e0 == null) {
                    qa6 qa6Var = new qa6();
                    this.e0 = qa6Var;
                    qa6Var.y = this.g0;
                    qa6Var.j(4.0f);
                    this.e0.g(cmb.p1(0.3f, -1), cmb.p1(0.1f, -1), cmb.p1(0.2f, -1), cmb.p1(0.7f, -1));
                    this.e0.setCallback(this);
                }
                this.e0.setBounds(0, 0, getWidth(), getHeight());
                this.e0.draw(canvas);
            } else {
                this.g0 = new Path();
            }
            if (layout != null) {
                float L = gm.L(16.0f);
                float L2 = gm.L(8.0f);
                float f = 0.0f;
                int i = 0;
                while (i < layout.getLineCount()) {
                    float f2 = L / 3.0f;
                    float lineLeft = layout.getLineLeft(i) - f2;
                    float lineRight = layout.getLineRight(i) + f2;
                    if (i == 0) {
                        f = layout.getLineTop(i) - (L2 / 3.0f);
                    }
                    float lineBottom = layout.getLineBottom(i);
                    float f3 = i >= layout.getLineCount() + (-1) ? (L2 / 3.0f) + lineBottom : lineBottom;
                    this.g0.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f, getPaddingLeft() + lineRight, getPaddingTop() + f3, Path.Direction.CW);
                    i++;
                    f = f3;
                }
            }
            this.f0 = layout;
            if (this.e0 == null) {
            }
            this.e0.setBounds(0, 0, getWidth(), getHeight());
            this.e0.draw(canvas);
        }
        if (this.d0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), nm7.H2, 31);
        }
        if (this.W != null && this.a0) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i2 = 0; i2 < this.W.size(); i2++) {
                b09 b09Var = (b09) this.W.get(i2);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int L3 = this.a0 ? gm.L(32.0f) : 0;
                getPaint();
                b09Var.a(canvas, width + L3, -1);
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
        gn.drawAnimatedEmojis(canvas, getLayout(), this.c0, 0.0f, this.b, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gn.release(this, this.c0);
        this.W = f09.e(null, this.W);
    }

    @Override // xna, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        pkb pkbVar = this.V;
        if (pkbVar != null && pkbVar.w()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getStaticTextLayout() != null && pkbVar.p0 == this) {
                pkbVar.V(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.b0 != getLayout()) {
            this.c0 = gn.update(0, this, this.c0, getLayout());
            this.W = f09.e(getLayout(), this.W);
            boolean z = getLayout() != null && (getLayout().getText() instanceof Spanned) && ((e09[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), e09.class)).length > 0;
            this.a0 = z;
            vze.a(this, 16.0f, 8.0f, (z ? 32 : 0) + 16, 8.0f);
            this.b0 = getLayout();
        }
    }

    @Override // xna, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.c0 = gn.update(0, this, this.c0, getLayout());
        this.W = f09.e(getLayout(), this.W);
    }

    public void setLoading(boolean z) {
        if (this.d0 == z) {
            return;
        }
        this.d0 = z;
        invalidate();
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        boolean z2 = z != isPressed();
        super.setPressed(z);
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e0 || super.verifyDrawable(drawable);
    }
}
