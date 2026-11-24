// default package

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n42 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k47 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ q59 e;

    public /* synthetic */ n42(q59 q59Var, ViewGroup viewGroup, k47 k47Var, boolean z, byte b) {
        this.a = b;
        this.e = q59Var;
        this.d = viewGroup;
        this.b = k47Var;
        this.c = z;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        byte b = this.a;
        q59 q59Var = this.e;
        ViewGroup viewGroup = this.d;
        k47 k47Var = this.b;
        boolean z = this.c;
        switch (b) {
            case 0:
                ida idaVar = (ida) viewGroup;
                idaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                o42 o42Var = (o42) q59Var;
                ug4 ug4Var = o42Var.I;
                p42 p42Var = o42Var.Y;
                if (!p42Var.b.U2.y()) {
                    idaVar.b(false, z);
                    break;
                } else {
                    int e1 = k47Var.e1();
                    ug4Var.a = k47.B0(k47Var.k);
                    ug4Var.b = e1;
                    idaVar.b(p42Var.U.containsKey(ug4Var), z);
                    break;
                }
            case 1:
                hg3 hg3Var = (hg3) viewGroup;
                hg3Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ch4 ch4Var = ((vg4) q59Var).c;
                if (!ch4Var.p0.u()) {
                    hg3Var.d0(false, z);
                    break;
                } else {
                    ug4 ug4Var2 = ch4Var.T;
                    int e12 = k47Var.e1();
                    ug4Var2.a = k47.B0(k47Var.k);
                    ug4Var2.b = e12;
                    hg3Var.d0(ch4Var.p0.e(ch4Var.T), z);
                    break;
                }
            case 2:
                ida idaVar2 = (ida) viewGroup;
                idaVar2.getViewTreeObserver().removeOnPreDrawListener(this);
                ch4 ch4Var2 = ((xg4) q59Var).w;
                if (!ch4Var2.p0.u()) {
                    idaVar2.b(false, z);
                    break;
                } else {
                    ug4 ug4Var3 = ch4Var2.T;
                    int e13 = k47Var.e1();
                    ug4Var3.a = k47.B0(k47Var.k);
                    ug4Var3.b = e13;
                    idaVar2.b(ch4Var2.p0.e(ch4Var2.T), z);
                    break;
                }
            case 3:
                eda edaVar = (eda) viewGroup;
                edaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                ch4 ch4Var3 = ((xg4) q59Var).w;
                if (!ch4Var3.p0.u()) {
                    edaVar.e(false, z);
                    break;
                } else {
                    ug4 ug4Var4 = ch4Var3.T;
                    int e14 = k47Var.e1();
                    ug4Var4.a = k47.B0(k47Var.k);
                    ug4Var4.b = e14;
                    edaVar.e(ch4Var3.p0.e(ch4Var3.T), z);
                    break;
                }
            default:
                lda ldaVar = (lda) viewGroup;
                ldaVar.getViewTreeObserver().removeOnPreDrawListener(this);
                ch4 ch4Var4 = ((zg4) q59Var).w;
                if (!ch4Var4.p0.u()) {
                    ldaVar.f(false, z);
                    break;
                } else {
                    ug4 ug4Var5 = ch4Var4.T;
                    int e15 = k47Var.e1();
                    ug4Var5.a = k47.B0(k47Var.k);
                    ug4Var5.b = e15;
                    ldaVar.f(ch4Var4.p0.e(ch4Var4.T), z);
                    break;
                }
        }
        return true;
    }
}
