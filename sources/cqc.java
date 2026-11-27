// default package

import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class cqc implements View.OnAttachStateChangeListener {
    public final /* synthetic */ cg5 a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ bqc c;
    public final /* synthetic */ int d;
    public final /* synthetic */ icc e;
    public final /* synthetic */ kl7[] f;
    public final /* synthetic */ String[] h;
    public final /* synthetic */ boolean[] n;

    public cqc(cg5 cg5Var, TL_wallet.walletTransaction[] wallettransactionArr, bqc bqcVar, int i, icc iccVar, kl7[] kl7VarArr, String[] strArr, boolean[] zArr) {
        this.a = cg5Var;
        this.b = wallettransactionArr;
        this.c = bqcVar;
        this.d = i;
        this.e = iccVar;
        this.f = kl7VarArr;
        this.h = strArr;
        this.n = zArr;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a(this.b[0]);
        bqc bqcVar = this.c;
        if (bqcVar != null) {
            int i = this.d;
            jn7.f(i).b(bqcVar, jn7.d4);
            jn7.f(i).b(bqcVar, jn7.e4);
        }
        icc iccVar = this.e;
        if (iccVar != null) {
            this.f[0].n(new b6c(iccVar, this.h, this.n, (byte) 21));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        bqc bqcVar = this.c;
        if (bqcVar != null) {
            int i = this.d;
            jn7.f(i).n(bqcVar, jn7.d4);
            jn7.f(i).n(bqcVar, jn7.e4);
        }
    }
}
