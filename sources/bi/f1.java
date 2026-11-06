package bi;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class f1 {
    public final long a;
    public final TLRPC.Document b;
    public final long c;
    public final int d;
    public final String e;
    public ud f;
    public int g = -1;
    public RadialGradient h;
    public Paint i;
    public org.telegram.ui.Components.i5 j;
    public org.telegram.ui.Components.w5 k;
    public final RectF l;
    public final org.telegram.ui.Components.ic m;

    public f1(g1 g1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        new Matrix();
        this.l = new RectF();
        this.m = new org.telegram.ui.Components.ic(g1Var);
        this.a = tL_starGiftUnique.id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.b = document;
        this.c = document == null ? 0L : document.id;
        this.d = ((TL_stars.starGiftAttributeBackdrop) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f = new ud(1, 6);
        float L = org.telegram.messenger.g0.L(36.0f);
        float f10 = (-L) / 2.0f;
        float f11 = L / 2.0f;
        this.f.c.set(f10, f10, f11, f11);
    }
}
