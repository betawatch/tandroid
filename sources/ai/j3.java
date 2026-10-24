package ai;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ ag.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ j3(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = l7Var;
        this.c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ag.b bVar = ag.b.a;
        ag.b bVar2 = ag.b.b;
        Runnable runnable = this.e;
        ag.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
        l7 l7Var = this.b;
        switch (i10) {
            case 0:
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                l7Var.f0.setResellPrice(aVar);
                yh.a2 a2Var = l7Var.k1;
                if (a2Var != null) {
                    a2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                l7Var.getClass();
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                l7Var.f0.setResellPrice(aVar);
                yh.a2 a2Var2 = l7Var.k1;
                if (a2Var2 != null) {
                    a2Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                i2.o1.t(R.string.Gift2ResaleEnable, new Object[]{l7Var.W1()}, l7Var.getBulletinFactory(), R.raw.contact_check, 36);
                break;
        }
    }
}
