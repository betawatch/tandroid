package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class g50 implements org.telegram.ui.Components.pk0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ d60 c;

    public g50(d60 d60Var) {
        this.c = d60Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.pk0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
        Paint paint = this.b;
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        d60 d60Var = this.c;
        if (d60Var.N2 != null) {
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
            canvas.translate(-d60Var.H.getX(), -d60Var.H.getY());
            float f13 = d60Var.O2;
            canvas.scale(f13, f13);
            canvas.drawRenderNode(d60Var.N2);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public final void o(View view, ng.q0 q0Var, boolean z4, boolean z10) {
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
        d60 d60Var = this.c;
        d60Var.A1(tL_textWithEntities);
        e40 e40Var = d60Var.E;
        if (e40Var.m()) {
            e40Var.j();
        } else {
            e40Var.d();
        }
        ng.d0 reactionsWindow = d60Var.H.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        d60Var.H.getReactionsWindow().e();
        d60Var.H.n();
    }

    @Override // org.telegram.ui.Components.pk0
    public final boolean t() {
        return true;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void m() {
    }
}
