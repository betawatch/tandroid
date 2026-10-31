package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import r0.h0;
import r0.k0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ h(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.a;
        r rVar = this.b;
        switch (i10) {
            case 0:
                if ((rVar.i0 & 1) != 0) {
                    rVar.j(0);
                }
                if ((rVar.i0 & TLObject.FLAG_12) != 0) {
                    rVar.j(zs.t1);
                }
                rVar.h0 = false;
                rVar.i0 = 0;
                break;
            default:
                rVar.E.showAtLocation(rVar.D, 55, 0, 0);
                k0 k0Var = rVar.G;
                if (k0Var != null) {
                    k0Var.b();
                }
                if (rVar.I && (viewGroup = rVar.J) != null) {
                    WeakHashMap weakHashMap = h0.a;
                    if (viewGroup.isLaidOut()) {
                        rVar.D.setAlpha(0.0f);
                        k0 a2 = h0.a(rVar.D);
                        a2.a(1.0f);
                        rVar.G = a2;
                        a2.d(new i(this, 0));
                        break;
                    }
                }
                rVar.D.setAlpha(1.0f);
                rVar.D.setVisibility(0);
                break;
        }
    }
}
