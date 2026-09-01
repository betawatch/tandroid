package lh;

import java.util.ArrayList;
import mh.j7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                pr0 pr0Var = n3Var.a;
                j7 j7Var = pr0Var.e;
                int i12 = tL_starGiftCollection.collection_id;
                j7Var.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(savedStarGift);
                j7Var.a(i12, arrayList);
                pr0Var.f(true);
                l81 l81Var = pr0Var.n;
                int i13 = tL_starGiftCollection.collection_id;
                l81Var.d(i13, pr0Var.e.f(i13) + 1);
                org.telegram.ui.ActionBar.p2 p2Var = pr0Var.a;
                if (p2Var instanceof ProfileActivity) {
                    ((ProfileActivity) p2Var).G4(true);
                }
                pr0Var.n();
                qc.a0(p2Var).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2AddedToCollection, mh.g5.D1(savedStarGift.gift), tL_starGiftCollection.title))).j();
                break;
        }
    }
}
