// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class o47 extends o72 {
    public final /* synthetic */ s47 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o47(s47 s47Var, Context context) {
        super(context, null, false, null);
        this.B0 = s47Var;
    }

    @Override // o72, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        s47 s47Var = this.B0;
        s47Var.X.i0(s47Var.c0.getAvatarImageView().getX(), s47Var.c0.getAvatarImageView().getY(), s47Var.c0.getAvatarImageView().getWidth(), s47Var.c0.getAvatarImageView().getHeight());
        if (s47Var.Z) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, s47Var.X.r(), s47Var.X.s());
            s47Var.X.h(canvas, null);
            canvas.restore();
        }
        if (s47Var.Y) {
            int r = (int) (s47Var.X.r() - (bkb.T0.getIntrinsicWidth() / 2));
            int s = (int) (s47Var.X.s() - (bkb.T0.getIntrinsicHeight() / 2));
            Drawable drawable = bkb.T0;
            drawable.setBounds(r, s, drawable.getIntrinsicWidth() + r, bkb.T0.getIntrinsicHeight() + s);
            bkb.T0.draw(canvas);
        }
    }

    @Override // o72, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B0.X.I();
    }

    @Override // o72, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B0.X.K();
    }
}
