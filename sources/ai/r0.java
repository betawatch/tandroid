package ai;

import android.content.Context;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.oo0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ TL_stars.StarGift a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;

    public r0(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = starGift;
        this.b = context;
        this.c = e6Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        Context context = this.b;
        TL_stars.StarGift starGift = this.a;
        if (i3 != 3 && i3 != 2) {
            if (i3 == 4) {
                s0.g1(context, starGift, this.c);
                return;
            }
            return;
        }
        String str = hp.s1(h10.t0).V2 + "/auction/" + starGift.auction_slug;
        if (i3 == 3) {
            org.telegram.messenger.g0.g(str);
        } else {
            oo0.N0(context, null, str, false, str).show();
        }
    }
}
