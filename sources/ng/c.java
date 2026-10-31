package ng;

import mg.x0;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.ay;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                ay ayVar = new ay(f1.j(3, "onlySelect", "dialogsType", true));
                ayVar.C2 = new d(0, fVar, sb3);
                fVar.e.presentFragment(ayVar);
                ((x0) fVar).r.dismiss();
                break;
        }
    }
}
