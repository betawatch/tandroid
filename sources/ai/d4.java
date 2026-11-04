package ai;

import ci.s8;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d4 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o4 b;
    public final /* synthetic */ TL_stars.SavedStarGift c;

    public /* synthetic */ d4(o4 o4Var, TL_stars.SavedStarGift savedStarGift, int i3) {
        this.a = i3;
        this.b = o4Var;
        this.c = savedStarGift;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        TL_stars.SavedStarGift savedStarGift = this.c;
        o4 o4Var = this.b;
        int i10 = 1;
        switch (i3) {
            case 0:
                o4Var.a.e.b((String) obj, new d4(o4Var, savedStarGift, i10));
                break;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                vp0 vp0Var = o4Var.a;
                s8 s8Var = vp0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                s8Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                s8Var.a(i11, arrayList);
                vp0Var.f(true);
                m61 m61Var = vp0Var.n;
                int i12 = tL_starGiftCollection.collection_id;
                m61Var.d(i12, vp0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.d2 d2Var = vp0Var.a;
                if (d2Var instanceof ProfileActivity) {
                    ((ProfileActivity) d2Var).U4(true);
                }
                vp0Var.o();
                fc.a0(d2Var).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131750401, ci.l6.A1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
