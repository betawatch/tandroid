package mh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ mf.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ h2(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, mf.a aVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = g5Var;
        this.c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        mf.b bVar = mf.b.a;
        mf.b bVar2 = mf.b.b;
        Runnable runnable = this.e;
        mf.a aVar = this.d;
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
                lh.z2 z2Var = g5Var.a1;
                if (z2Var != null) {
                    z2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                yh.s(R.string.Gift2ResaleEnable, new Object[]{g5Var.C1()}, g5Var.getBulletinFactory(), R.raw.contact_check, 36);
                break;
            default:
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                g5Var.b0.setResellPrice(aVar);
                lh.z2 z2Var2 = g5Var.a1;
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
