// default package

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class kj3 extends mhb {
    public long E;
    public int F;
    public int G;
    public final /* synthetic */ oj3 H;
    public boolean x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj3(oj3 oj3Var, Context context) {
        super(context);
        this.H = oj3Var;
    }

    @Override // mhb
    public final void a() {
        oj3 oj3Var = this.H;
        Drawable drawable = oj3Var.P;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = oj3Var.P;
            int i = this.F;
            drawable2.setBounds(i, this.G, bounds.width() + i, bounds.height() + this.G);
        }
    }

    @Override // mhb
    public final void b() {
        oj3 oj3Var = this.H;
        Drawable drawable = oj3Var.P;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int L = (int) (this.y * gl.L(3.0f));
            int i = bounds.left;
            this.F = i;
            int i2 = bounds.top;
            this.G = i2;
            oj3Var.P.setBounds(i + L, gl.L(1.0f) + i2, bounds.width() + this.F + L, bounds.height() + gl.L(1.0f) + this.G);
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
