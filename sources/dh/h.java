package dh;

import org.telegram.messenger.bd;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ h(o oVar, int i3) {
        this.a = i3;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        o oVar = this.b;
        switch (i3) {
            case 0:
                oVar.h.requestFocus();
                break;
            case 1:
                oVar.h.setFocusableInTouchMode(true);
                break;
            case 2:
                oVar.finishFragment();
                break;
            case 3:
                if (oVar.Q && !oVar.P) {
                    oVar.P = true;
                    hs.e().k(98, 512);
                    oVar.c.setVisibility(0);
                    oVar.c.setLayerType(2, null);
                    oVar.j0(oVar.R.e);
                    oVar.R.a(true, true);
                    break;
                }
                break;
            case 4:
                sf.c.t(oVar.getParentActivity(), "https://t.me/stickers");
                break;
            case 5:
                sf.c.t(oVar.getParentActivity(), bd.M0(2131752409, null));
                break;
            default:
                oVar.e0(false);
                break;
        }
    }
}
