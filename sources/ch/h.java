package ch;

import org.telegram.messenger.gd;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ h(p pVar, int i7) {
        this.a = i7;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        p pVar = this.b;
        switch (i7) {
            case 0:
                pVar.h.requestFocus();
                break;
            case 1:
                pVar.h.setFocusableInTouchMode(true);
                break;
            case 2:
                pVar.finishFragment();
                break;
            case 3:
                if (pVar.Q && !pVar.P) {
                    pVar.P = true;
                    ks.e().k(98, 512);
                    pVar.c.setVisibility(0);
                    pVar.c.setLayerType(2, null);
                    pVar.j0(pVar.R.e);
                    pVar.R.a(true, true);
                    break;
                }
                break;
            case 4:
                vf.c.t(pVar.getParentActivity(), "https://t.me/stickers");
                break;
            case 5:
                vf.c.t(pVar.getParentActivity(), gd.N0(2131752397, null));
                break;
            default:
                pVar.e0(false);
                break;
        }
    }
}
