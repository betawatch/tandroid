package bi;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ bg.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ f3(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, bg.a aVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = h7Var;
        this.c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        bg.b bVar = bg.b.a;
        bg.b bVar2 = bg.b.b;
        Runnable runnable = this.e;
        bg.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
        h7 h7Var = this.b;
        switch (i10) {
            case 0:
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                h7Var.f0.setResellPrice(aVar);
                zh.b2 b2Var = h7Var.k1;
                if (b2Var != null) {
                    b2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                h7Var.getClass();
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == bVar2;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(bVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(bVar2).o());
                h7Var.f0.setResellPrice(aVar);
                zh.b2 b2Var2 = h7Var.k1;
                if (b2Var2 != null) {
                    b2Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                ic.a.s(R.string.Gift2ResaleEnable, new Object[]{h7Var.W1()}, h7Var.getBulletinFactory(), R.raw.contact_check, 36);
                break;
        }
    }
}
