package ch;

import org.telegram.messenger.id;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                if (oVar.P && !oVar.O) {
                    oVar.O = true;
                    qs.e().k(98, 512);
                    oVar.c.setVisibility(0);
                    oVar.c.setLayerType(2, null);
                    oVar.j0(oVar.Q.e);
                    oVar.Q.a(true, true);
                    break;
                }
                break;
            case 4:
                vf.c.t(oVar.getParentActivity(), "https://t.me/stickers");
                break;
            case 5:
                vf.c.t(oVar.getParentActivity(), id.M0(2131752409, null));
                break;
            default:
                oVar.e0(false);
                break;
        }
    }
}
