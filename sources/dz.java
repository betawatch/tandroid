// default package

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dz extends c6 {
    public final /* synthetic */ TL_stars.StarGift a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ wjb c;

    public dz(wjb wjbVar, Context context, TL_stars.StarGift starGift) {
        this.a = starGift;
        this.b = context;
        this.c = wjbVar;
    }

    @Override // c6
    public final void b(int i) {
        Context context = this.b;
        TL_stars.StarGift starGift = this.a;
        if (i != 3 && i != 2) {
            if (i == 4) {
                ez.b1(this.c, context, starGift);
                return;
            }
            return;
        }
        String str = na7.q1(y6c.t0).N2 + "/auction/" + starGift.auction_slug;
        if (i == 3) {
            gl.g(str);
        } else {
            taa.G0(context, null, str, false, str).show();
        }
    }
}
