package cg;

import bg.k1;
import org.telegram.messenger.l0;
import org.telegram.ui.dy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ c(e eVar, int i9) {
        this.a = i9;
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.E();
                break;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                e eVar = this.b;
                sb2.append(eVar.h);
                String sb3 = sb2.toString();
                dy dyVar = new dy(l0.e(3, "onlySelect", "dialogsType", true));
                dyVar.y2 = new b5.d(10, eVar, sb3);
                eVar.e.presentFragment(dyVar);
                ((k1) eVar).r.dismiss();
                break;
        }
    }
}
