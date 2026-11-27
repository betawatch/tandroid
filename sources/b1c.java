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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class b1c extends q9c {
    public final pm3 n3;
    public final mm o3;
    public Drawable p3;
    public int q3;
    public final Paint r3;

    public b1c(Activity activity, int i, y0c y0cVar, t0c t0cVar, t0c t0cVar2, vnb vnbVar) {
        super(activity, i, 0, false, y0cVar, t0cVar, t0cVar2, vnbVar);
        this.n3 = new pm3((byte) 7);
        this.o3 = new mm(320L, this, k43.h);
        this.r3 = new Paint(1);
    }

    @Override // q9c, d79, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.o3.d(canScrollVertically(-1));
        if (d > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), jn7.d4, 31);
        } else {
            canvas2 = canvas;
        }
        float height = getHeight();
        float f = 0.0f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof k1c) {
                k1c k1cVar = (k1c) childAt;
                if (k1cVar.F) {
                    if (height > k1cVar.getY()) {
                        height = k1cVar.getY();
                        RecyclerView.S(k1cVar);
                    }
                    if (f < k1cVar.getY() + k1cVar.getHeight()) {
                        f = k1cVar.getY() + k1cVar.getHeight();
                        RecyclerView.S(k1cVar);
                    }
                }
            }
        }
        if (f > height) {
            int i2 = aob.s9;
            vnb vnbVar = this.o2;
            int v0 = aob.v0(i2, vnbVar);
            Paint paint = this.r3;
            paint.setColor(v0);
            RectF rectF = hl.P;
            rectF.set((getWidth() - hl.L(56.0f)) / 2.0f, height, (hl.L(56.0f) + getWidth()) / 2.0f, f);
            canvas2.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint);
            if (this.p3 == null) {
                this.p3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v02 = aob.v0(aob.b9, vnbVar);
            if (this.q3 != v02) {
                Drawable drawable = this.p3;
                this.q3 = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            this.p3.setBounds((int) (rectF.left + hl.L(4.0f)), (int) (rectF.top + hl.L(2.66f)), (int) (rectF.left + hl.L(13.66f)), (int) (rectF.top + hl.L(12.32f)));
            this.p3.draw(canvas2);
        }
        super.dispatchDraw(canvas2);
        if (d > 0.0f) {
            canvas2.save();
            RectF rectF2 = hl.P;
            rectF2.set(0.0f, 0.0f, getWidth(), hl.L(12.0f));
            this.n3.r(canvas2, rectF2, 1, d);
            canvas2.restore();
            canvas2.restore();
        }
    }
}
