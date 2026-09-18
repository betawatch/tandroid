package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class m50 implements org.telegram.ui.Components.fk0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ k60 c;

    public m50(k60 k60Var) {
        this.c = k60Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.fk0
    public final void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = p0Var.f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j3 = p0Var.g;
        if (j3 != 0) {
            tL_messageEntityCustomEmoji.document_id = j3;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        k60 k60Var = this.c;
        k60Var.A1(tL_textWithEntities);
        k40 k40Var = k60Var.H;
        if (k40Var.m()) {
            k40Var.j();
        } else {
            k40Var.d();
        }
        zg.c0 reactionsWindow = k60Var.K.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        k60Var.K.getReactionsWindow().e();
        k60Var.K.n();
    }

    @Override // org.telegram.ui.Components.fk0
    public final boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.fk0
    public final void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint = this.b;
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        k60 k60Var = this.c;
        if (k60Var.Q2 != null) {
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
            canvas.translate(-k60Var.K.getX(), -k60Var.K.getY());
            float f12 = k60Var.R2;
            canvas.scale(f12, f12);
            canvas.drawRenderNode(k60Var.Q2);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.fk0
    public final boolean q() {
        return true;
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ void o() {
    }
}
