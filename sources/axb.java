// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class axb extends q5c {
    public final xl3 n3;
    public final lm o3;
    public Drawable p3;
    public int q3;
    public final Paint r3;

    public axb(Activity activity, int i, swb swbVar, twb twbVar, twb twbVar2, wjb wjbVar) {
        super(activity, i, 0, false, swbVar, twbVar, twbVar2, wjbVar);
        this.n3 = new xl3((byte) 7);
        this.o3 = new lm(320L, this, s33.h);
        this.r3 = new Paint(1);
    }

    @Override // q5c, o39, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.o3.d(canScrollVertically(-1));
        if (d > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.d4, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f = 0.0f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof jxb) {
                jxb jxbVar = (jxb) childAt;
                if (jxbVar.F) {
                    if (height > jxbVar.getY()) {
                        height = jxbVar.getY();
                        RecyclerView.R(jxbVar);
                    }
                    if (f < jxbVar.getY() + jxbVar.getHeight()) {
                        f = jxbVar.getY() + jxbVar.getHeight();
                        RecyclerView.R(jxbVar);
                    }
                }
            }
        }
        if (f > height) {
            int i2 = bkb.r9;
            wjb wjbVar = this.o2;
            int v0 = bkb.v0(i2, wjbVar);
            Paint paint = this.r3;
            paint.setColor(v0);
            RectF rectF = gl.P;
            rectF.set((getWidth() - gl.L(56.0f)) / 2.0f, height, (gl.L(56.0f) + getWidth()) / 2.0f, f);
            canvas2.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint);
            if (this.p3 == null) {
                this.p3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v02 = bkb.v0(bkb.a9, wjbVar);
            if (this.q3 != v02) {
                Drawable drawable = this.p3;
                this.q3 = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            this.p3.setBounds((int) (rectF.left + gl.L(4.0f)), (int) (rectF.top + gl.L(2.66f)), (int) (rectF.left + gl.L(13.66f)), (int) (rectF.top + gl.L(12.32f)));
            this.p3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (d > 0.0f) {
            canvas2.save();
            RectF rectF2 = gl.P;
            rectF2.set(0.0f, 0.0f, getWidth(), gl.L(12.0f));
            this.n3.s(canvas2, rectF2, 1, d);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
