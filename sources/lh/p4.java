package lh;

import android.widget.FrameLayout;
import org.telegram.ui.Components.aa0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ p4(FrameLayout frameLayout, boolean z10, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                g5 g5Var = f6Var.s1;
                if (hVar == f6Var.y1) {
                    f6Var.y1 = null;
                    if (!this.c) {
                        g5Var.setVisibility(8);
                        yf.r0.e(f6Var.B1).g();
                        g5Var.getAdapter().l();
                        break;
                    }
                }
                break;
            case 1:
                f6 f6Var2 = (f6) this.b;
                zf.t1 t1Var = f6Var2.i1;
                if (hVar == f6Var2.r1) {
                    f6Var2.r1 = null;
                    if (!this.c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                aa0 aa0Var = (aa0) this.b;
                if (!z10) {
                    aa0Var.G = null;
                    boolean z11 = this.c;
                    aa0Var.setVisibility(z11 ? 8 : 0);
                    if (aa0Var.J && z11) {
                        aa0Var.J = false;
                        aa0Var.b.setLayoutManager(aa0Var.getNeededLayoutManager());
                        aa0Var.E = true;
                        aa0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
