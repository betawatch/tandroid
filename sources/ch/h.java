package ch;

import org.telegram.messenger.hd;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ h(o oVar, int i7) {
        this.a = i7;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        o oVar = this.b;
        switch (i7) {
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
                    ns.e().k(98, 512);
                    oVar.c.setVisibility(0);
                    oVar.c.setLayerType(2, null);
                    oVar.j0(oVar.R.e);
                    oVar.R.a(true, true);
                    break;
                }
                break;
            case 4:
                vf.c.t(oVar.getParentActivity(), "https://t.me/stickers");
                break;
            case 5:
                vf.c.t(oVar.getParentActivity(), hd.M0(2131752409, null));
                break;
            default:
                oVar.e0(false);
                break;
        }
    }
}
