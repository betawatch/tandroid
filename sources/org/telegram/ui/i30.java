package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class i30 implements org.telegram.ui.Components.wi0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ e40 c;

    public i30(e40 e40Var) {
        this.c = e40Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.wi0
    public final void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
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
        e40 e40Var = this.c;
        e40Var.G1(tL_textWithEntities);
        j20 j20Var = e40Var.C1;
        if (j20Var.m()) {
            j20Var.j();
        } else {
            j20Var.d();
        }
        ch.b0 reactionsWindow = e40Var.F1.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        e40Var.F1.getReactionsWindow().e();
        e40Var.F1.n();
    }

    @Override // org.telegram.ui.Components.wi0
    public final boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public final void q(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
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
        if (e40Var.P4 != null) {
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
            canvas.translate(-e40Var.F1.getX(), -e40Var.F1.getY());
            float f13 = e40Var.Q4;
            canvas.scale(f13, f13);
            canvas.drawRenderNode(e40Var.P4);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.wi0
    public final boolean t() {
        return true;
    }

    @Override // org.telegram.ui.Components.wi0
    public final /* synthetic */ void r() {
    }
}
