// default package

import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class fu8 {
    public final long a;
    public final TLRPC.Document b;
    public final long c;
    public final int d;
    public final String e;
    public yza f;
    public RadialGradient h;
    public Paint i;
    public wl j;
    public mm k;
    public final v41 m;
    public int g = -1;
    public final RectF l = new RectF();

    public fu8(gu8 gu8Var, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.m = new v41(gu8Var);
        this.a = tL_starGiftUnique.id;
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        this.b = document;
        this.c = document == null ? 0L : document.id;
        this.d = ((TL_stars.starGiftAttributeBackdrop) jxa.i(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class)).center_color | (-16777216);
        this.e = tL_starGiftUnique.slug;
        this.f = new yza(1, 6);
        float L = hl.L(36.0f);
        float f = (-L) / 2.0f;
        float f2 = L / 2.0f;
        this.f.c.set(f, f, f2, f2);
    }
}
