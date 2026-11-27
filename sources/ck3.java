// default package

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ck3 extends ilb {
    public long E;
    public int F;
    public int G;
    public final /* synthetic */ gk3 H;
    public boolean x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck3(gk3 gk3Var, Context context) {
        super(context);
        this.H = gk3Var;
    }

    @Override // ilb
    public final void a() {
        gk3 gk3Var = this.H;
        Drawable drawable = gk3Var.P;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = gk3Var.P;
            int i = this.F;
            drawable2.setBounds(i, this.G, bounds.width() + i, bounds.height() + this.G);
        }
    }

    @Override // ilb
    public final void b() {
        gk3 gk3Var = this.H;
        Drawable drawable = gk3Var.P;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int L = (int) (this.y * hl.L(3.0f));
            int i = bounds.left;
            this.F = i;
            int i2 = bounds.top;
            this.G = i2;
            gk3Var.P.setBounds(i + L, hl.L(1.0f) + i2, bounds.width() + this.F + L, bounds.height() + hl.L(1.0f) + this.G);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.E;
            if (j > 17) {
                j = 17;
            }
            this.E = elapsedRealtime;
            boolean z = this.x;
            float f = this.y;
            if (z) {
                float f2 = f - (j / 664.0f);
                this.y = f2;
                if (f2 <= 0.0f) {
                    this.x = false;
                    this.y = 0.0f;
                }
            } else {
                float f3 = (j / 664.0f) + f;
                this.y = f3;
                if (f3 >= 1.0f) {
                    this.x = true;
                    this.y = 1.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
