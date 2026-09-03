package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h50 implements org.telegram.ui.Components.ok0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ e60 c;

    public h50(e60 e60Var) {
        this.c = e60Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.ok0
    public final boolean i() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void j(View view, mg.q0 q0Var, boolean z4, boolean z10) {
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
        e60 e60Var = this.c;
        e60Var.A1(tL_textWithEntities);
        f40 f40Var = e60Var.E;
        if (f40Var.m()) {
            f40Var.j();
        } else {
            f40Var.d();
        }
        mg.d0 reactionsWindow = e60Var.H.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        e60Var.H.getReactionsWindow().e();
        e60Var.H.n();
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public final void l(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
        Paint paint = this.b;
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        e60 e60Var = this.c;
        if (e60Var.N2 != null) {
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
            canvas.translate(-e60Var.H.getX(), -e60Var.H.getY());
            float f13 = e60Var.O2;
            canvas.scale(f13, f13);
            canvas.drawRenderNode(e60Var.N2);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public final boolean o() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ void m() {
    }
}
