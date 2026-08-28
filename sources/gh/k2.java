package gh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ gf.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ k2(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, gf.a aVar, Runnable runnable, int i9) {
        this.a = i9;
        this.b = k5Var;
        this.c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        gf.b bVar = gf.b.a;
        gf.b bVar2 = gf.b.b;
        Runnable runnable = this.e;
        gf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
        k5 k5Var = this.b;
        switch (i9) {
            case 0:
                k5Var.getClass();
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                k5Var.a0.setResellPrice(aVar);
                fh.l3 l3Var = k5Var.Z0;
                if (l3Var != null) {
                    l3Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                org.telegram.ui.Cells.j2.q(R.string.Gift2ResaleEnable, new Object[]{k5Var.C1()}, k5Var.getBulletinFactory(), R.raw.contact_check, 36);
                break;
            default:
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                k5Var.a0.setResellPrice(aVar);
                fh.l3 l3Var2 = k5Var.Z0;
                if (l3Var2 != null) {
                    l3Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
