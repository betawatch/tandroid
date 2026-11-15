package bi;

import di.j8;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c4 b;
    public final /* synthetic */ TL_stars.SavedStarGift c;

    public /* synthetic */ r3(c4 c4Var, TL_stars.SavedStarGift savedStarGift, int i7) {
        this.a = i7;
        this.b = c4Var;
        this.c = savedStarGift;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int i7 = this.a;
        TL_stars.SavedStarGift savedStarGift = this.c;
        c4 c4Var = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                c4Var.a.e.b((String) obj, new r3(c4Var, savedStarGift, i10));
                break;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                wp0 wp0Var = c4Var.a;
                j8 j8Var = wp0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                j8Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                j8Var.a(i11, arrayList);
                wp0Var.f(true);
                v61 v61Var = wp0Var.n;
                int i12 = tL_starGiftCollection.collection_id;
                v61Var.d(i12, wp0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.e2 e2Var = wp0Var.a;
                if (e2Var instanceof ProfileActivity) {
                    ((ProfileActivity) e2Var).W4(true);
                }
                wp0Var.o();
                cc.a0(e2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750393, di.c6.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
