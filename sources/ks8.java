// default package

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ks8 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rs8 b;
    public final /* synthetic */ TL_stars.SavedStarGift c;

    public /* synthetic */ ks8(rs8 rs8Var, TL_stars.SavedStarGift savedStarGift, byte b) {
        this.a = b;
        this.b = rs8Var;
        this.c = savedStarGift;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        TL_stars.SavedStarGift savedStarGift = this.c;
        rs8 rs8Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                rs8Var.a.e.b(new ks8(rs8Var, savedStarGift, b2), (String) obj);
                break;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                lea leaVar = rs8Var.a;
                yua yuaVar = leaVar.e;
                int i = tL_starGiftCollection.collection_id;
                yuaVar.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                yuaVar.a(i, arrayList);
                leaVar.f(true);
                vgc vgcVar = leaVar.n;
                int i2 = tL_starGiftCollection.collection_id;
                vgcVar.e(i2, leaVar.e.f(i2) + 1);
                d dVar = leaVar.a;
                if (dVar instanceof ProfileActivity) {
                    ((ProfileActivity) dVar).n3(true);
                }
                leaVar.o();
                c41.b0(dVar).R(savedStarGift.gift.getDocument(), gm.S2(jb6.a0(null, null, 2131750326, wsa.t1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
