package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q40 implements org.telegram.ui.Components.tj0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ o50 c;

    public q40(o50 o50Var) {
        this.c = o50Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.tj0
    public final void d(View view, hg.r0 r0Var, boolean z10, boolean z11) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = r0Var.f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j10 = r0Var.g;
        if (j10 != 0) {
            tL_messageEntityCustomEmoji.document_id = j10;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        o50 o50Var = this.c;
        o50Var.A1(tL_textWithEntities);
        o30 o30Var = o50Var.D;
        if (o30Var.m()) {
            o30Var.j();
        } else {
            o30Var.d();
        }
        hg.e0 reactionsWindow = o50Var.G.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        o50Var.G.getReactionsWindow().e();
        o50Var.G.n();
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean n() {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public final void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
        Paint paint = this.b;
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        o50 o50Var = this.c;
        if (o50Var.M2 != null) {
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
            canvas.translate(-o50Var.G.getX(), -o50Var.G.getY());
            float f13 = o50Var.N2;
            canvas.scale(f13, f13);
            canvas.drawRenderNode(o50Var.M2);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean u() {
        return true;
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ void t() {
    }
}
