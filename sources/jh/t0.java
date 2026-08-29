package jh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.uc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class t0 {
    public final long a;
    public final TLRPC.Document b;
    public final long c;
    public final int d;
    public final String e;
    public va f;
    public int g = -1;
    public RadialGradient h;
    public Paint i;
    public org.telegram.ui.Components.p5 j;
    public org.telegram.ui.Components.d6 k;
    public final RectF l;
    public final uc m;

    public t0(u0 u0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        new Matrix();
        this.l = new RectF();
        this.m = new uc(u0Var);
        this.a = tL_starGiftUnique.id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.b = document;
        this.c = document == null ? 0L : document.id;
        this.d = ((TL_stars.starGiftAttributeBackdrop) s7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f = new va(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f9 = (-dp) / 2.0f;
        float f10 = dp / 2.0f;
        this.f.c.set(f9, f9, f10, f10);
    }
}
