// default package

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ez extends d6 {
    public final /* synthetic */ TL_stars.StarGift a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ vnb c;

    public ez(vnb vnbVar, Context context, TL_stars.StarGift starGift) {
        this.a = starGift;
        this.b = context;
        this.c = vnbVar;
    }

    @Override // d6
    public final void b(int i) {
        Context context = this.b;
        TL_stars.StarGift starGift = this.a;
        if (i != 3 && i != 2) {
            if (i == 4) {
                fz.c1(this.c, context, starGift);
                return;
            }
            return;
        }
        String str = uc7.s1(yac.t0).N2 + "/auction/" + starGift.auction_slug;
        if (i == 3) {
            hl.g(str);
        } else {
            kea.H0(context, null, str, false, str).show();
        }
    }
}
