package gh;

import hh.k7;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class j3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;
    public final /* synthetic */ TL_stars.SavedStarGift c;

    public /* synthetic */ j3(t3 t3Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.a = i10;
        this.b = t3Var;
        this.c = savedStarGift;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        TL_stars.SavedStarGift savedStarGift = this.c;
        t3 t3Var = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                t3Var.a.e.b((String) obj, new j3(t3Var, savedStarGift, i11));
                break;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                wq0 wq0Var = t3Var.a;
                k7 k7Var = wq0Var.e;
                int i12 = tL_starGiftCollection.collection_id;
                k7Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                k7Var.a(i12, arrayList);
                wq0Var.f(true);
                o71 o71Var = wq0Var.n;
                int i13 = tL_starGiftCollection.collection_id;
                o71Var.d(i13, wq0Var.e.f(i13) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = wq0Var.a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                wq0Var.n();
                mc.a0(n2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, hh.i5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
