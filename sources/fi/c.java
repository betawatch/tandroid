package fi;

import ai.kc;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import sg.w1;
import sg.x1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class c extends x1 {
    public Paint[] r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i10, int i11) {
        super(context);
        this.s = i10;
        this.v = i11;
        c();
    }

    @Override // sg.x1
    public final void a() {
        w1 w1Var = new w1(this.s);
        this.a = w1Var;
        w1Var.O = 106;
        int i10 = 0;
        w1Var.M = false;
        w1Var.G = false;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.J = false;
        w1Var.m = true;
        w1Var.h = true;
        if (this.v == 1) {
            w1Var.k = AndroidUtilities.dp(24.0f);
        }
        this.r = new Paint[20];
        while (true) {
            Paint[] paintArr = this.r;
            if (i10 >= paintArr.length) {
                w1 w1Var2 = this.a;
                w1Var2.l = new kc(this, 2);
                w1Var2.r = 17;
                w1Var2.s = 18;
                w1Var2.t = 19;
                w1Var2.Q = k6.G6;
                w1Var2.c();
                return;
            }
            paintArr[i10] = new Paint(1);
            this.r[i10].setColorFilter(new PorterDuffColorFilter(i0.a.f(i10 / (this.r.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
            i10++;
        }
    }

    @Override // sg.x1
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
