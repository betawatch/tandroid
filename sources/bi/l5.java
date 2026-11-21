package bi;

import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i71;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l5 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t6 b;

    public /* synthetic */ l5(t6 t6Var, int i7) {
        this.a = i7;
        this.b = t6Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                t6 t6Var = this.b;
                t6Var.f(true);
                i71 i71Var = t6Var.n;
                int i7 = ((TL_stars.TL_starGiftCollection) obj).collection_id;
                i71Var.e(i7, t6Var.e.f(i7) + 1);
                org.telegram.ui.ActionBar.g2 g2Var = t6Var.a;
                if (g2Var instanceof ProfileActivity) {
                    ((ProfileActivity) g2Var).X4(true);
                }
                t6Var.o();
                break;
            default:
                t6 t6Var2 = this.b;
                t6Var2.e.b((String) obj, new l5(t6Var2, 0));
                break;
        }
    }
}
