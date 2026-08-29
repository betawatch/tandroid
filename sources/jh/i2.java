package jh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ kf.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ i2(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, kf.a aVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = h5Var;
        this.c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        kf.b bVar = kf.b.a;
        kf.b bVar2 = kf.b.b;
        Runnable runnable = this.e;
        kf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
        h5 h5Var = this.b;
        switch (i10) {
            case 0:
                h5Var.getClass();
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                h5Var.a0.setResellPrice(aVar);
                ih.a3 a3Var = h5Var.Z0;
                if (a3Var != null) {
                    a3Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                th.r(R.string.Gift2ResaleEnable, new Object[]{h5Var.C1()}, h5Var.getBulletinFactory(), R.raw.contact_check, 36);
                break;
            default:
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                h5Var.a0.setResellPrice(aVar);
                ih.a3 a3Var2 = h5Var.Z0;
                if (a3Var2 != null) {
                    a3Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
