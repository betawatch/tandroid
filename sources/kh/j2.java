package kh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k81;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class j2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ j2(w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                w3 w3Var = this.b;
                w3Var.e.b((String) obj, new j2(w3Var, 1));
                break;
            default:
                w3 w3Var2 = this.b;
                w3Var2.f(true);
                k81 k81Var = w3Var2.n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                k81Var.d(i10, w3Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.p2 p2Var = w3Var2.a;
                if (p2Var instanceof ProfileActivity) {
                    ((ProfileActivity) p2Var).G4(true);
                }
                w3Var2.n();
                break;
        }
    }
}
