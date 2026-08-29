package ih;

import java.util.ArrayList;
import jh.i7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.y71;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class d3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;
    public final /* synthetic */ TL_stars.SavedStarGift c;

    public /* synthetic */ d3(n3 n3Var, TL_stars.SavedStarGift savedStarGift, int i10) {
        this.a = i10;
        this.b = n3Var;
        this.c = savedStarGift;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        TL_stars.SavedStarGift savedStarGift = this.c;
        n3 n3Var = this.b;
        int i11 = 1;
        switch (i10) {
            case 0:
                n3Var.a.e.b((String) obj, new d3(n3Var, savedStarGift, i11));
                break;
            default:
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                gr0 gr0Var = n3Var.a;
                i7 i7Var = gr0Var.e;
                int i12 = tL_starGiftCollection.collection_id;
                i7Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                i7Var.a(i12, arrayList);
                gr0Var.f(true);
                y71 y71Var = gr0Var.n;
                int i13 = tL_starGiftCollection.collection_id;
                y71Var.d(i13, gr0Var.e.f(i13) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = gr0Var.a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).G4(true);
                }
                gr0Var.n();
                tc.a0(o2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, jh.h5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
