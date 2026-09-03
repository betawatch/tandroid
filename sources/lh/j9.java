package lh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class j9 extends eg.q2 {
    public Paint[] n;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(Context context, int i10, int i11) {
        super(context);
        this.r = i10;
        this.s = i11;
        b();
    }

    @Override // eg.q2
    public final void a() {
        eg.p2 p2Var = new eg.p2(this.r);
        this.a = p2Var;
        p2Var.N = 105;
        int i10 = 0;
        p2Var.M = false;
        p2Var.G = false;
        p2Var.K = true;
        p2Var.H = true;
        p2Var.J = false;
        p2Var.m = true;
        p2Var.h = true;
        if (this.s == 1) {
            p2Var.k = AndroidUtilities.dp(24.0f);
        }
        this.n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.n;
            if (i10 >= paintArr.length) {
                eg.p2 p2Var2 = this.a;
                p2Var2.l = new dg.a0(this, 2);
                p2Var2.r = 17;
                p2Var2.s = 18;
                p2Var2.t = 19;
                p2Var2.P = org.telegram.ui.ActionBar.j6.G6;
                p2Var2.c();
                return;
            }
            paintArr[i10] = new Paint(1);
            this.n[i10].setColorFilter(new PorterDuffColorFilter(i0.a.d(i10 / (this.n.length - 1), -371690, -14281), PorterDuff.Mode.SRC_IN));
            i10++;
        }
    }

    @Override // eg.q2
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
