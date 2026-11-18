package bi;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.lc;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y5 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j6 b;
    public final /* synthetic */ TL_stars.SavedStarGift c;

    public /* synthetic */ y5(j6 j6Var, TL_stars.SavedStarGift savedStarGift, int i7) {
        this.a = i7;
        this.b = j6Var;
        this.c = savedStarGift;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        TL_stars.SavedStarGift savedStarGift = this.c;
        j6 j6Var = this.b;
        int i10 = 1;
        switch (i7) {
            case 0:
                j6Var.a.e.b((String) obj, new y5(j6Var, savedStarGift, i10));
                break;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                eq0 eq0Var = j6Var.a;
                di.m8 m8Var = eq0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                m8Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                m8Var.a(i11, arrayList);
                eq0Var.f(true);
                f71 f71Var = eq0Var.n;
                int i12 = tL_starGiftCollection.collection_id;
                f71Var.e(i12, eq0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.h2 h2Var = eq0Var.a;
                if (h2Var instanceof ProfileActivity) {
                    ((ProfileActivity) h2Var).X4(true);
                }
                eq0Var.o();
                lc.b0(h2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131750377, di.f6.F1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
