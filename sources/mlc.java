// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mlc extends EditTextBoldCursor {
    public int M1;
    public final kl N1;
    public final gn O1;
    public final /* synthetic */ wjb P1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlc(Context context, wjb wjbVar) {
        super(context);
        this.P1 = wjbVar;
        this.M1 = 960;
        this.N1 = new kl(this);
        gn gnVar = new gn(false, true, true);
        this.O1 = gnVar;
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(15.33f));
        gnVar.b = 5;
        gnVar.setCallback(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a = this.N1.a(bkb.v0(this.M1 <= 0 ? bkb.o7 : bkb.O5, this.P1), false);
        gn gnVar = this.O1;
        gnVar.u(a);
        int L = gl.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
        int height = getHeight() + getScrollY();
        gnVar.setBounds(L - gl.L(48.0f), height - Math.min(gl.L(44.0f), getHeight()), L, height);
        gnVar.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, lt3, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, lt3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        gn gnVar = this.O1;
        if (gnVar == null) {
            return;
        }
        this.M1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
        gnVar.a();
        int i4 = this.M1;
        gnVar.t(i4 <= 100 ? Integer.toString(i4) : "", isAttachedToWindow(), true);
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.O1 || super.verifyDrawable(drawable);
    }
}
