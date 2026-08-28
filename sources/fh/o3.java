package fh;

import gh.l7;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class o3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;
    public final /* synthetic */ TL_stars.SavedStarGift c;

    public /* synthetic */ o3(y3 y3Var, TL_stars.SavedStarGift savedStarGift, int i9) {
        this.a = i9;
        this.b = y3Var;
        this.c = savedStarGift;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i9 = this.a;
        TL_stars.SavedStarGift savedStarGift = this.c;
        y3 y3Var = this.b;
        int i10 = 1;
        switch (i9) {
            case 0:
                y3Var.a.e.b((String) obj, new o3(y3Var, savedStarGift, i10));
                break;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                vq0 vq0Var = y3Var.a;
                l7 l7Var = vq0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                l7Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                l7Var.a(i11, arrayList);
                vq0Var.f(true);
                m71 m71Var = vq0Var.n;
                int i12 = tL_starGiftCollection.collection_id;
                m71Var.d(i12, vq0Var.e.f(i12) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = vq0Var.a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).G4(true);
                }
                vq0Var.n();
                oc.a0(o2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, gh.k5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
