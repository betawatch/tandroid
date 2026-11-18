package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import r0.i0;
import r0.l0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ h(s sVar, int i7) {
        this.a = i7;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i7 = this.a;
        s sVar = this.b;
        switch (i7) {
            case 0:
                if ((sVar.j0 & 1) != 0) {
                    sVar.l(0);
                }
                if ((sVar.j0 & TLObject.FLAG_12) != 0) {
                    sVar.l(ks.t1);
                }
                sVar.i0 = false;
                sVar.j0 = 0;
                break;
            default:
                sVar.F.showAtLocation(sVar.E, 55, 0, 0);
                l0 l0Var = sVar.H;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (sVar.J && (viewGroup = sVar.K) != null) {
                    WeakHashMap weakHashMap = i0.a;
                    if (viewGroup.isLaidOut()) {
                        sVar.E.setAlpha(0.0f);
                        l0 a10 = i0.a(sVar.E);
                        a10.a(1.0f);
                        sVar.H = a10;
                        a10.d(new j(this, 0));
                        break;
                    }
                }
                sVar.E.setAlpha(1.0f);
                sVar.E.setVisibility(0);
                break;
        }
    }
}
