package lh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l81;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class j2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;

    public /* synthetic */ j2(x3 x3Var, int i10) {
        this.a = i10;
        this.b = x3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                x3 x3Var = this.b;
                x3Var.e.b((String) obj, new j2(x3Var, 1));
                break;
            default:
                x3 x3Var2 = this.b;
                x3Var2.f(true);
                l81 l81Var = x3Var2.n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                l81Var.d(i10, x3Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.p2 p2Var = x3Var2.a;
                if (p2Var instanceof ProfileActivity) {
                    ((ProfileActivity) p2Var).G4(true);
                }
                x3Var2.n();
                break;
        }
    }
}
