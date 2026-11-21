package bi;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.lc;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c6 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n6 b;
    public final /* synthetic */ TL_stars.SavedStarGift c;

    public /* synthetic */ c6(n6 n6Var, TL_stars.SavedStarGift savedStarGift, int i7) {
        this.a = i7;
        this.b = n6Var;
        this.c = savedStarGift;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        TL_stars.SavedStarGift savedStarGift = this.c;
        n6 n6Var = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                n6Var.a.e.b((String) obj, new c6(n6Var, savedStarGift, i10));
                break;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                gq0 gq0Var = n6Var.a;
                di.n8 n8Var = gq0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                n8Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                n8Var.a(i11, arrayList);
                gq0Var.f(true);
                i71 i71Var = gq0Var.n;
                int i12 = tL_starGiftCollection.collection_id;
                i71Var.e(i12, gq0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.g2 g2Var = gq0Var.a;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).X4(true);
                }
                gq0Var.o();
                lc.b0(g2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750376, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
