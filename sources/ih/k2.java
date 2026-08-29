package ih;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.y71;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class k2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;

    public /* synthetic */ k2(x3 x3Var, int i10) {
        this.a = i10;
        this.b = x3Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                x3 x3Var = this.b;
                x3Var.e.b((String) obj, new k2(x3Var, 1));
                break;
            default:
                x3 x3Var2 = this.b;
                x3Var2.f(true);
                y71 y71Var = x3Var2.n;
                int i10 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                y71Var.d(i10, x3Var2.e.f(i10) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = x3Var2.a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).G4(true);
                }
                x3Var2.n();
                break;
        }
    }
}
