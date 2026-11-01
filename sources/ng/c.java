package ng;

import mg.x0;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ c(f fVar, int i10) {
        this.a = i10;
        this.b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.E();
                break;
            default:
                StringBuilder sb2 = new StringBuilder("https://t.me/giftcode/");
                f fVar = this.b;
                sb2.append(fVar.h);
                String sb3 = sb2.toString();
                zx zxVar = new zx(f1.j(3, "onlySelect", "dialogsType", true));
                zxVar.C2 = new d(0, fVar, sb3);
                fVar.e.presentFragment(zxVar);
                ((x0) fVar).r.dismiss();
                break;
        }
    }
}
