// default package

import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class onc implements View.OnAttachStateChangeListener {
    public final /* synthetic */ zf5 a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ nnc c;
    public final /* synthetic */ int d;
    public final /* synthetic */ jac e;
    public final /* synthetic */ el7[] f;
    public final /* synthetic */ String[] h;
    public final /* synthetic */ boolean[] n;

    public onc(zf5 zf5Var, TL_wallet.walletTransaction[] wallettransactionArr, nnc nncVar, int i, jac jacVar, el7[] el7VarArr, String[] strArr, boolean[] zArr) {
        this.a = zf5Var;
        this.b = wallettransactionArr;
        this.c = nncVar;
        this.d = i;
        this.e = jacVar;
        this.f = el7VarArr;
        this.h = strArr;
        this.n = zArr;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a(this.b[0]);
        nnc nncVar = this.c;
        if (nncVar != null) {
            int i = this.d;
            nm7.f(i).b(nncVar, nm7.e4);
            nm7.f(i).b(nncVar, nm7.f4);
        }
        jac jacVar = this.e;
        if (jacVar != null) {
            this.f[0].n(new gcc(jacVar, this.h, this.n, (byte) 14));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        nnc nncVar = this.c;
        if (nncVar != null) {
            int i = this.d;
            nm7.f(i).n(nncVar, nm7.e4);
            nm7.f(i).n(nncVar, nm7.f4);
        }
    }
}
