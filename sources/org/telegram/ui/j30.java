package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j30 implements org.telegram.ui.Components.hi0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ f40 c;

    public j30(f40 f40Var) {
        this.c = f40Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.hi0
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
        f40 f40Var = this.c;
        if (f40Var.K4 != null) {
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
            canvas.translate(-f40Var.E1.getX(), -f40Var.E1.getY());
            float f13 = f40Var.L4;
            canvas.scale(f13, f13);
            canvas.drawRenderNode(f40Var.K4);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.hi0
    public final boolean U() {
        return true;
    }

    @Override // org.telegram.ui.Components.hi0
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
        f40 f40Var = this.c;
        f40Var.F1(tL_textWithEntities);
        k20 k20Var = f40Var.B1;
        if (k20Var.m()) {
            k20Var.j();
        } else {
            k20Var.d();
        }
        ch.b0 reactionsWindow = f40Var.E1.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        f40Var.E1.getReactionsWindow().e();
        f40Var.E1.n();
    }

    @Override // org.telegram.ui.Components.hi0
    public final boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ void M() {
    }
}
