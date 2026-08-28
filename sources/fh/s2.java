package fh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.m71;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class s2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ s2(j4 j4Var, int i9) {
        this.a = i9;
        this.b = j4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                j4 j4Var = this.b;
                j4Var.e.b((String) obj, new s2(j4Var, 1));
                break;
            default:
                j4 j4Var2 = this.b;
                j4Var2.f(true);
                m71 m71Var = j4Var2.n;
                int i9 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                m71Var.d(i9, j4Var2.e.f(i9) + 1);
                org.telegram.ui.ActionBar.o2 o2Var = j4Var2.a;
                if (o2Var instanceof ProfileActivity) {
                    ((ProfileActivity) o2Var).G4(true);
                }
                j4Var2.n();
                break;
        }
    }
}
