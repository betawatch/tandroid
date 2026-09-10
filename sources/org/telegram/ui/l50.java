package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l50 implements org.telegram.ui.Components.ok0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ j60 c;

    public l50(j60 j60Var) {
        this.c = j60Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.ok0
    public final boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void l(View view, yg.p0 p0Var, boolean z10, boolean z11) {
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
        j60 j60Var = this.c;
        j60Var.A1(tL_textWithEntities);
        j40 j40Var = j60Var.H;
        if (j40Var.m()) {
            j40Var.j();
        } else {
            j40Var.d();
        }
        yg.c0 reactionsWindow = j60Var.K.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        j60Var.K.getReactionsWindow().e();
        j60Var.K.n();
    }

    @Override // org.telegram.ui.Components.ok0
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
        j60 j60Var = this.c;
        if (j60Var.Q2 != null) {
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
            canvas.translate(-j60Var.K.getX(), -j60Var.K.getY());
            float f12 = j60Var.R2;
            canvas.scale(f12, f12);
            canvas.drawRenderNode(j60Var.Q2);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public final boolean t() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void s() {
    }
}
