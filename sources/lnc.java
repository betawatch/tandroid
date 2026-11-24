// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lnc extends EditTextBoldCursor {
    public int M1;
    public final km N1;
    public final ho O1;
    public final /* synthetic */ ylb P1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnc(Context context, ylb ylbVar) {
        super(context);
        this.P1 = ylbVar;
        this.M1 = 960;
        this.N1 = new km(this);
        ho hoVar = new ho(false, true, true);
        this.O1 = hoVar;
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(15.33f));
        hoVar.b = 5;
        hoVar.setCallback(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a = this.N1.a(cmb.v0(this.M1 <= 0 ? cmb.o7 : cmb.O5, this.P1), false);
        ho hoVar = this.O1;
        hoVar.u(a);
        int L = gm.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
        int height = getHeight() + getScrollY();
        hoVar.setBounds(L - gm.L(48.0f), height - Math.min(gm.L(44.0f), getHeight()), L, height);
        hoVar.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, vu3, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, vu3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        ho hoVar = this.O1;
        if (hoVar == null) {
            return;
        }
        this.M1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
        hoVar.a();
        int i4 = this.M1;
        hoVar.t(i4 <= 100 ? Integer.toString(i4) : "", isAttachedToWindow(), true);
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.O1 || super.verifyDrawable(drawable);
    }
}
