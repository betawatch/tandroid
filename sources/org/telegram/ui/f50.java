package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class f50 implements org.telegram.ui.Components.pk0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ d60 c;

    public f50(d60 d60Var) {
        this.c = d60Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.pk0
    public final void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = o0Var.f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j3 = o0Var.g;
        if (j3 != 0) {
            tL_messageEntityCustomEmoji.document_id = j3;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        d60 d60Var = this.c;
        d60Var.A1(tL_textWithEntities);
        d40 d40Var = d60Var.H;
        if (d40Var.m()) {
            d40Var.j();
        } else {
            d40Var.d();
        }
        zg.b0 reactionsWindow = d60Var.K.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        d60Var.K.getReactionsWindow().e();
        d60Var.K.n();
    }

    @Override // org.telegram.ui.Components.pk0
    public final boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint = this.b;
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        d60 d60Var = this.c;
        if (d60Var.Q2 != null) {
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
            canvas.translate(-d60Var.K.getX(), -d60Var.K.getY());
            float f12 = d60Var.R2;
            canvas.scale(f12, f12);
            canvas.drawRenderNode(d60Var.Q2);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public final boolean p() {
        return true;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void n() {
    }
}
