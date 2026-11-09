package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class i30 implements org.telegram.ui.Components.ii0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ e40 c;

    public i30(e40 e40Var) {
        this.c = e40Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.ii0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii0
    public final void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
        Paint paint = this.b;
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        e40 e40Var = this.c;
        if (e40Var.H4 != null) {
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
            canvas.translate(-e40Var.B1.getX(), -e40Var.B1.getY());
            float f13 = e40Var.I4;
            canvas.scale(f13, f13);
            canvas.drawRenderNode(e40Var.H4);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.ii0
    public final boolean U() {
        return true;
    }

    @Override // org.telegram.ui.Components.ii0
    public final void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
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
        e40 e40Var = this.c;
        e40Var.F1(tL_textWithEntities);
        j20 j20Var = e40Var.y1;
        if (j20Var.m()) {
            j20Var.j();
        } else {
            j20Var.d();
        }
        ch.b0 reactionsWindow = e40Var.B1.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        e40Var.B1.getReactionsWindow().e();
        e40Var.B1.n();
    }

    @Override // org.telegram.ui.Components.ii0
    public final boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii0
    public final /* synthetic */ void M() {
    }
}
