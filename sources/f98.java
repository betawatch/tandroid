// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class f98 extends wla {
    public final oib V;
    public ArrayList W;
    public boolean a0;
    public Layout b0;
    public cm c0;
    public boolean d0;
    public r86 e0;
    public Layout f0;
    public Path g0;

    public f98(Context context, d98 d98Var, oib oibVar, final i8c i8cVar, final k8c k8cVar) {
        super(context);
        final byte b = 0;
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        this.G = new k46(this) { // from class: e98
            public final /* synthetic */ f98 b;

            {
                this.b = this;
            }

            @Override // k46
            public final void a(ClickableSpan clickableSpan) {
                byte b2 = b;
                Object obj = i8cVar;
                f98 f98Var = this.b;
                switch (b2) {
                    case 0:
                        ((i8c) obj).a(clickableSpan, f98Var);
                        break;
                    default:
                        ((k8c) obj).a(clickableSpan, f98Var, new w88(f98Var, (byte) 2));
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.H = new k46(this) { // from class: e98
            public final /* synthetic */ f98 b;

            {
                this.b = this;
            }

            @Override // k46
            public final void a(ClickableSpan clickableSpan) {
                byte b22 = b2;
                Object obj = k8cVar;
                f98 f98Var = this.b;
                switch (b22) {
                    case 0:
                        ((i8c) obj).a(clickableSpan, f98Var);
                        break;
                    default:
                        ((k8c) obj).a(clickableSpan, f98Var, new w88(f98Var, (byte) 2));
                        break;
                }
            }
        };
        this.V = oibVar;
        txe.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(nme.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new fr7(d98Var, (byte) 14));
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
                    r86 r86Var = new r86();
                    this.e0 = r86Var;
                    r86Var.y = this.g0;
                    r86Var.j(4.0f);
                    this.e0.g(bkb.p1(0.3f, -1), bkb.p1(0.1f, -1), bkb.p1(0.2f, -1), bkb.p1(0.7f, -1));
                    this.e0.setCallback(this);
                }
                this.e0.setBounds(0, 0, getWidth(), getHeight());
                this.e0.draw(canvas);
            } else {
                this.g0 = new Path();
            }
            if (layout != null) {
                float L = gl.L(16.0f);
                float L2 = gl.L(8.0f);
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
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.H2, 31);
        }
        if (this.W != null && this.a0) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i2 = 0; i2 < this.W.size(); i2++) {
                ay8 ay8Var = (ay8) this.W.get(i2);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int L3 = this.a0 ? gl.L(32.0f) : 0;
                getPaint();
                ay8Var.a(canvas, width + L3, -1);
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
        gm.drawAnimatedEmojis(canvas, getLayout(), this.c0, 0.0f, this.b, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gm.release(this, this.c0);
        this.W = ey8.e(null, this.W);
    }

    @Override // wla, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        oib oibVar = this.V;
        if (oibVar != null && oibVar.w()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getStaticTextLayout() != null && oibVar.p0 == this) {
                oibVar.V(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.b0 != getLayout()) {
            this.c0 = gm.update(0, this, this.c0, getLayout());
            this.W = ey8.e(getLayout(), this.W);
            boolean z = getLayout() != null && (getLayout().getText() instanceof Spanned) && ((dy8[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), dy8.class)).length > 0;
            this.a0 = z;
            txe.a(this, 16.0f, 8.0f, (z ? 32 : 0) + 16, 8.0f);
            this.b0 = getLayout();
        }
    }

    @Override // wla, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.c0 = gm.update(0, this, this.c0, getLayout());
        this.W = ey8.e(getLayout(), this.W);
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
