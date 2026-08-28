package gh;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.pc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u0 {
    public final long a;
    public final TLRPC.Document b;
    public final long c;
    public final int d;
    public final String e;
    public bb f;
    public int g = -1;
    public RadialGradient h;
    public Paint i;
    public org.telegram.ui.Components.k5 j;
    public org.telegram.ui.Components.y5 k;
    public final RectF l;
    public final pc m;

    public u0(v0 v0Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        new Matrix();
        this.l = new RectF();
        this.m = new pc(v0Var);
        this.a = tL_starGiftUnique.id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.b = document;
        this.c = document == null ? 0L : document.id;
        this.d = ((TL_stars.starGiftAttributeBackdrop) v7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f = new bb(1, 6);
        float dp = AndroidUtilities.dp(36.0f);
        float f10 = (-dp) / 2.0f;
        float f11 = dp / 2.0f;
        this.f.c.set(f10, f10, f11, f11);
    }
}
