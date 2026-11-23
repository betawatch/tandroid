package bi;

import android.content.Context;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ap0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class l0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ TL_stars.StarGift a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c;

    public l0(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.h6 h6Var) {
        this.a = starGift;
        this.b = context;
        this.c = h6Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        Context context = this.b;
        TL_stars.StarGift starGift = this.a;
        if (i7 != 3 && i7 != 2) {
            if (i7 == 4) {
                m0.h1(context, starGift, this.c);
                return;
            }
            return;
        }
        String str = np.u1(k10.t0).X2 + "/auction/" + starGift.auction_slug;
        if (i7 == 3) {
            org.telegram.messenger.g0.g(str);
        } else {
            ap0.O0(context, null, str, false, str).show();
        }
    }
}
