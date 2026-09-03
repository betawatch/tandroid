package lh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ lf.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ i2(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, lf.a aVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = g5Var;
        this.c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        lf.b bVar = lf.b.a;
        lf.b bVar2 = lf.b.b;
        Runnable runnable = this.e;
        lf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
        g5 g5Var = this.b;
        switch (i10) {
            case 0:
                g5Var.getClass();
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                g5Var.b0.setResellPrice(aVar);
                kh.z2 z2Var = g5Var.a1;
                if (z2Var != null) {
                    z2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                ai.r(R.string.Gift2ResaleEnable, new Object[]{g5Var.C1()}, g5Var.getBulletinFactory(), R.raw.contact_check, 36);
                break;
            default:
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                g5Var.b0.setResellPrice(aVar);
                kh.z2 z2Var2 = g5Var.a1;
                if (z2Var2 != null) {
                    z2Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
