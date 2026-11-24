// default package

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d00 extends c6 {
    public final /* synthetic */ TL_stars.StarGift a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ylb c;

    public d00(ylb ylbVar, Context context, TL_stars.StarGift starGift) {
        this.a = starGift;
        this.b = context;
        this.c = ylbVar;
    }

    @Override // c6
    public final void b(int i) {
        Context context = this.b;
        TL_stars.StarGift starGift = this.a;
        if (i != 3 && i != 2) {
            if (i == 4) {
                e00.b1(this.c, context, starGift);
                return;
            }
            return;
        }
        String str = oc7.r1(z8c.t0).N2 + "/auction/" + starGift.auction_slug;
        if (i == 3) {
            gm.g(str);
        } else {
            tca.G0(context, null, str, false, str).show();
        }
    }
}
