package bi;

import android.content.Context;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.po0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ TL_stars.StarGift a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;

    public l0(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = starGift;
        this.b = context;
        this.c = e6Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        Context context = this.b;
        TL_stars.StarGift starGift = this.a;
        if (i7 != 3 && i7 != 2) {
            if (i7 == 4) {
                m0.g1(context, starGift, this.c);
                return;
            }
            return;
        }
        String str = np.s1(m10.t0).V2 + "/auction/" + starGift.auction_slug;
        if (i7 == 3) {
            org.telegram.messenger.g0.g(str);
        } else {
            po0.N0(context, null, str, false, str).show();
        }
    }
}
