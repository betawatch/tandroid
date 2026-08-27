package gh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.o71;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class n2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ n2(d4 d4Var, int i10) {
        this.a = i10;
        this.b = d4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                d4 d4Var = this.b;
                d4Var.e.b((String) obj, new n2(d4Var, 1));
                break;
            default:
                d4 d4Var2 = this.b;
                d4Var2.f(true);
                o71 o71Var = d4Var2.n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                o71Var.d(i10, d4Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.n2 n2Var = d4Var2.a;
                if (n2Var instanceof ProfileActivity) {
                    ((ProfileActivity) n2Var).G4(true);
                }
                d4Var2.n();
                break;
        }
    }
}
