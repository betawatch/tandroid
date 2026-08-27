package mh;

import ag.j3;
import ag.k3;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import eg.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class c extends k3 {
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

    @Override // ag.k3
    public final void a() {
        j3 j3Var = new j3(this.r);
        this.a = j3Var;
        j3Var.N = 106;
        int i10 = 0;
        j3Var.M = false;
        j3Var.G = false;
        j3Var.K = true;
        j3Var.H = true;
        j3Var.J = false;
        j3Var.m = true;
        j3Var.h = true;
        if (this.s == 1) {
            j3Var.k = AndroidUtilities.dp(24.0f);
        }
        this.n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.n;
            if (i10 >= paintArr.length) {
                j3 j3Var2 = this.a;
                j3Var2.l = new o(this, 3);
                j3Var2.r = 17;
                j3Var2.s = 18;
                j3Var2.t = 19;
                j3Var2.P = g6.G6;
                j3Var2.c();
                return;
            }
            paintArr[i10] = new Paint(1);
            this.n[i10].setColorFilter(new PorterDuffColorFilter(i0.b.d(i10 / (this.n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
            i10++;
        }
    }

    @Override // ag.k3
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
