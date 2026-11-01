package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class d40 implements org.telegram.ui.Components.mj0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ a50 c;

    public d40(a50 a50Var) {
        this.c = a50Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.mj0
    public final boolean A() {
        return true;
    }

    @Override // org.telegram.ui.Components.mj0
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Components.mj0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.mj0
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
        a50 a50Var = this.c;
        if (a50Var.H4 != null) {
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
            canvas.translate(-a50Var.B1.getX(), -a50Var.B1.getY());
            float f12 = a50Var.I4;
            canvas.scale(f12, f12);
            canvas.drawRenderNode(a50Var.H4);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.mj0
    public final void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = o0Var.f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = o0Var.g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        a50 a50Var = this.c;
        a50Var.C1(tL_textWithEntities);
        f30 f30Var = a50Var.y1;
        if (f30Var.m()) {
            f30Var.j();
        } else {
            f30Var.d();
        }
        sg.b0 reactionsWindow = a50Var.B1.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        a50Var.B1.getReactionsWindow().e();
        a50Var.B1.n();
    }

    @Override // org.telegram.ui.Components.mj0
    public final /* synthetic */ void t() {
    }
}
