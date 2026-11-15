package fi;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h8 {
    public final y3 a;
    public final org.telegram.ui.Components.u5 b;
    public final TextPaint c;
    public final StaticLayout d;
    public final float e;
    public final float f;
    public float g;
    public boolean h;
    public int i;

    public h8(b4 b4Var, y3 y3Var) {
        this.a = y3Var;
        this.b = new org.telegram.ui.Components.u5(b4Var, 0L, 360L, er.h);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(hd.M0(2131744480, null), textPaint, org.telegram.messenger.g0.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        this.e = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
