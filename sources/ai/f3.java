package ai;

import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ TL_stars.TL_starGiftUnique c;
    public final /* synthetic */ ag.a d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ f3(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = k7Var;
        this.c = tL_starGiftUnique;
        this.d = aVar;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ag.c cVar = ag.c.a;
        ag.c cVar2 = ag.c.b;
        Runnable runnable = this.e;
        ag.a aVar = this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.c;
        k7 k7Var = this.b;
        switch (i10) {
            case 0:
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == cVar2;
                ArrayList<TL_stars.StarsAmount> arrayList = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList;
                arrayList.add(aVar.e(cVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(cVar2).o());
                k7Var.f0.setResellPrice(aVar);
                yh.a2 a2Var = k7Var.k1;
                if (a2Var != null) {
                    a2Var.run();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                k7Var.getClass();
                tL_starGiftUnique.flags |= 16;
                tL_starGiftUnique.resale_ton_only = aVar.a == cVar2;
                ArrayList<TL_stars.StarsAmount> arrayList2 = new ArrayList<>();
                tL_starGiftUnique.resell_amount = arrayList2;
                arrayList2.add(aVar.e(cVar).o());
                tL_starGiftUnique.resell_amount.add(aVar.e(cVar2).o());
                k7Var.f0.setResellPrice(aVar);
                yh.a2 a2Var2 = k7Var.k1;
                if (a2Var2 != null) {
                    a2Var2.run();
                }
                if (runnable != null) {
                    runnable.run();
                }
                i2.d.s(R.string.Gift2ResaleEnable, new Object[]{k7Var.Q1()}, k7Var.getBulletinFactory(), R.raw.contact_check, 36);
                break;
        }
    }
}
