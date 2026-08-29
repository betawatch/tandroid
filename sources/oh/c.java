package oh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import bg.b0;
import cg.r2;
import cg.s2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class c extends s2 {
    public Paint[] n;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i10, int i11) {
        super(context);
        this.r = i10;
        this.s = i11;
        b();
    }

    @Override // cg.s2
    public final void a() {
        r2 r2Var = new r2(this.r);
        this.a = r2Var;
        r2Var.N = 106;
        int i10 = 0;
        r2Var.M = false;
        r2Var.G = false;
        r2Var.K = true;
        r2Var.H = true;
        r2Var.J = false;
        r2Var.m = true;
        r2Var.h = true;
        if (this.s == 1) {
            r2Var.k = AndroidUtilities.dp(24.0f);
        }
        this.n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.n;
            if (i10 >= paintArr.length) {
                r2 r2Var2 = this.a;
                r2Var2.l = new b0(this, 4);
                r2Var2.r = 17;
                r2Var2.s = 18;
                r2Var2.t = 19;
                r2Var2.P = g6.G6;
                r2Var2.c();
                return;
            }
            paintArr[i10] = new Paint(1);
            this.n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
            i10++;
        }
    }

    @Override // cg.s2
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
