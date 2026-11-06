package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import r0.i0;
import r0.l0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                if ((sVar.i0 & 1) != 0) {
                    sVar.j(0);
                }
                if ((sVar.i0 & TLObject.FLAG_12) != 0) {
                    sVar.j(qs.t1);
                }
                sVar.h0 = false;
                sVar.i0 = 0;
                break;
            default:
                sVar.E.showAtLocation(sVar.D, 55, 0, 0);
                l0 l0Var = sVar.G;
                if (l0Var != null) {
                    l0Var.b();
                }
                if (sVar.I && (viewGroup = sVar.J) != null) {
                    WeakHashMap weakHashMap = i0.a;
                    if (viewGroup.isLaidOut()) {
                        sVar.D.setAlpha(0.0f);
                        l0 a10 = i0.a(sVar.D);
                        a10.a(1.0f);
                        sVar.G = a10;
                        a10.d(new j(this, 0));
                        break;
                    }
                }
                sVar.D.setAlpha(1.0f);
                sVar.D.setVisibility(0);
                break;
        }
    }
}
