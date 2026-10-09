package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class i50 implements org.telegram.ui.Components.jl0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ g60 c;

    public i50(g60 g60Var) {
        this.c = g60Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.jl0
    public final void m(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = n0Var.f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j3 = n0Var.g;
        if (j3 != 0) {
            tL_messageEntityCustomEmoji.document_id = j3;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        g60 g60Var = this.c;
        g60Var.B1(tL_textWithEntities);
        g40 g40Var = g60Var.H;
        if (g40Var.m()) {
            g40Var.j();
        } else {
            g40Var.d();
        }
        zg.a0 reactionsWindow = g60Var.K.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        g60Var.K.getReactionsWindow().e();
        g60Var.K.n();
    }

    @Override // org.telegram.ui.Components.jl0
    public final boolean o() {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint = this.b;
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        g60 g60Var = this.c;
        if (g60Var.Q2 != null) {
            canvas.save();
            if (f7 > 0.0f) {
                Path path = this.a;
                path.rewind();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                path.close();
                canvas.clipPath(path);
            } else {
                canvas.clipRect(rectF);
            }
            canvas.translate(-g60Var.K.getX(), -g60Var.K.getY());
            float f12 = g60Var.R2;
            canvas.scale(f12, f12);
            canvas.drawRenderNode(g60Var.Q2);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public final boolean v() {
        return true;
    }

    @Override // org.telegram.ui.Components.jl0
    public final /* synthetic */ void s() {
    }
}
