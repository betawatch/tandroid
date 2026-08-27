package hh;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ hf.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ k2(i5 i5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, hf.a aVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = i5Var;
        this.c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        hf.b bVar = hf.b.a;
        hf.b bVar2 = hf.b.b;
        Runnable runnable = this.e;
        hf.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
        i5 i5Var = this.b;
        switch (i10) {
            case 0:
                i5Var.getClass();
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                i5Var.a0.setResellPrice(aVar);
                gh.g3 g3Var = i5Var.Z0;
                if (g3Var != null) {
                    g3Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                org.telegram.ui.Cells.pa.r(R.string.Gift2ResaleEnable, new Object[]{i5Var.C1()}, i5Var.getBulletinFactory(), R.raw.contact_check, 36);
                break;
            default:
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                i5Var.a0.setResellPrice(aVar);
                gh.g3 g3Var2 = i5Var.Z0;
                if (g3Var2 != null) {
                    g3Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
