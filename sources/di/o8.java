package di;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.id;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class o8 {
    public final f4 a;
    public final org.telegram.ui.Components.w5 b;
    public final TextPaint c;
    public final StaticLayout d;
    public final float e;
    public final float f;
    public float g;
    public boolean h;
    public int i;

    public o8(i4 i4Var, f4 f4Var) {
        this.a = f4Var;
        this.b = new org.telegram.ui.Components.w5(i4Var, 0L, 360L, xq.h);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(id.M0(2131744483, null), textPaint, org.telegram.messenger.g0.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        this.e = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
