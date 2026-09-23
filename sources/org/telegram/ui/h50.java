package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class h50 implements org.telegram.ui.Components.fk0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ f60 c;

    public h50(f60 f60Var) {
        this.c = f60Var;
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
        f60 f60Var = this.c;
        f60Var.A1(tL_textWithEntities);
        f40 f40Var = f60Var.H;
        if (f40Var.m()) {
            f40Var.j();
        } else {
            f40Var.d();
        }
        zg.c0 reactionsWindow = f60Var.K.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        f60Var.K.getReactionsWindow().e();
        f60Var.K.n();
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
        f60 f60Var = this.c;
        if (f60Var.Q2 != null) {
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
            canvas.translate(-f60Var.K.getX(), -f60Var.K.getY());
            float f12 = f60Var.R2;
            canvas.scale(f12, f12);
            canvas.drawRenderNode(f60Var.Q2);
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
