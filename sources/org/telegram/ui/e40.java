package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e40 implements org.telegram.ui.Components.lj0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ b50 c;

    public e40(b50 b50Var) {
        this.c = b50Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.lj0
    public final boolean A() {
        return true;
    }

    @Override // org.telegram.ui.Components.lj0
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.Components.lj0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.lj0
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
        b50 b50Var = this.c;
        if (b50Var.H4 != null) {
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
            canvas.translate(-b50Var.B1.getX(), -b50Var.B1.getY());
            float f12 = b50Var.I4;
            canvas.scale(f12, f12);
            canvas.drawRenderNode(b50Var.H4);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.lj0
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
        b50 b50Var = this.c;
        b50Var.C1(tL_textWithEntities);
        g30 g30Var = b50Var.y1;
        if (g30Var.m()) {
            g30Var.j();
        } else {
            g30Var.d();
        }
        sg.b0 reactionsWindow = b50Var.B1.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        b50Var.B1.getReactionsWindow().e();
        b50Var.B1.n();
    }

    @Override // org.telegram.ui.Components.lj0
    public final /* synthetic */ void t() {
    }
}
