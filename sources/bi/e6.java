package bi;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.kc;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p6 b;
    public final /* synthetic */ TL_stars.SavedStarGift c;

    public /* synthetic */ e6(p6 p6Var, TL_stars.SavedStarGift savedStarGift, int i7) {
        this.a = i7;
        this.b = p6Var;
        this.c = savedStarGift;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        int i7 = this.a;
        TL_stars.SavedStarGift savedStarGift = this.c;
        p6 p6Var = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                p6Var.a.e.b((String) obj, new e6(p6Var, savedStarGift, i10));
                break;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                fq0 fq0Var = p6Var.a;
                di.n8 n8Var = fq0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                n8Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                n8Var.a(i11, arrayList);
                fq0Var.f(true);
                j71 j71Var = fq0Var.n;
                int i12 = tL_starGiftCollection.collection_id;
                j71Var.e(i12, fq0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.g2 g2Var = fq0Var.a;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).X4(true);
                }
                fq0Var.o();
                kc.b0(g2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750376, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
