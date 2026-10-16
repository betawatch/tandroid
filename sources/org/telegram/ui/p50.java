package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class p50 implements org.telegram.ui.Components.fl0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ n60 c;

    public p50(n60 n60Var) {
        this.c = n60Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.fl0
    public final boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final void n(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = i1Var.f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = i1Var.g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        n60 n60Var = this.c;
        n60Var.B1(tL_textWithEntities);
        m40 m40Var = n60Var.H;
        if (m40Var.m()) {
            m40Var.j();
        } else {
            m40Var.d();
        }
        ah.t0 reactionsWindow = n60Var.K.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        n60Var.K.getReactionsWindow().e();
        n60Var.K.n();
    }

    @Override // org.telegram.ui.Components.fl0
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
        n60 n60Var = this.c;
        if (n60Var.Q2 != null) {
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
            canvas.translate(-n60Var.K.getX(), -n60Var.K.getY());
            float f12 = n60Var.R2;
            canvas.scale(f12, f12);
            canvas.drawRenderNode(n60Var.Q2);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public final boolean z() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void y() {
    }
}
