// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nt0 implements g94, bja, dja, ee, oac {
    public final /* synthetic */ au0 a;

    public /* synthetic */ nt0(au0 au0Var) {
        this.a = au0Var;
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        this.a.y0();
    }

    @Override // bja
    public final int b() {
        return this.a.n;
    }

    @Override // dja
    public final float f(RecyclerView recyclerView) {
        return fja.j(recyclerView);
    }

    @Override // dja
    public final RecyclerView h(View view) {
        au0 au0Var = this.a;
        if (au0Var.a) {
            return ((zt0) view).c;
        }
        au0Var.L.getClass();
        return ((kxa) view).a;
    }

    @Override // oac
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.v0((c6c) obj);
    }

    @Override // dja
    public final /* synthetic */ void q(RecyclerView recyclerView) {
        hg9.d(recyclerView);
    }

    @Override // ee
    public final void r(he heVar, int i) {
        au0 au0Var = this.a;
        au0Var.getClass();
        au0Var.presentFragment(new p5c(6, null));
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}
