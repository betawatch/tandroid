package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f50 implements org.telegram.ui.Components.ok0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ c60 c;

    public f50(c60 c60Var) {
        this.c = c60Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.ok0
    public final boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void i(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = q0Var.f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = q0Var.g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        c60 c60Var = this.c;
        c60Var.A1(tL_textWithEntities);
        d40 d40Var = c60Var.E;
        if (d40Var.m()) {
            d40Var.j();
        } else {
            d40Var.d();
        }
        mg.d0 reactionsWindow = c60Var.H.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        c60Var.H.getReactionsWindow().e();
        c60Var.H.n();
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void n(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
        Paint paint = this.b;
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        c60 c60Var = this.c;
        if (c60Var.N2 != null) {
            canvas.save();
            if (f10 > 0.0f) {
                Path path = this.a;
                path.rewind();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                path.close();
                canvas.clipPath(path);
            } else {
                canvas.clipRect(rectF);
            }
            canvas.translate(-c60Var.H.getX(), -c60Var.H.getY());
            float f13 = c60Var.O2;
            canvas.scale(f13, f13);
            canvas.drawRenderNode(c60Var.N2);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public final boolean s() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void o() {
    }
}
