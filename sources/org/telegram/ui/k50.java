package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class k50 implements org.telegram.ui.Components.pk0 {
    public final Path a = new Path();
    public final Paint b;
    public final /* synthetic */ i60 c;

    public k50(i60 i60Var) {
        this.c = i60Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override // org.telegram.ui.Components.pk0
    public final void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
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
        i60 i60Var = this.c;
        i60Var.A1(tL_textWithEntities);
        i40 i40Var = i60Var.H;
        if (i40Var.m()) {
            i40Var.j();
        } else {
            i40Var.d();
        }
        zg.b0 reactionsWindow = i60Var.K.getReactionsWindow();
        if (reactionsWindow == null || reactionsWindow.q) {
            return;
        }
        i60Var.K.getReactionsWindow().e();
        i60Var.K.n();
    }

    @Override // org.telegram.ui.Components.pk0
    public final boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint = this.b;
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        i60 i60Var = this.c;
        if (i60Var.Q2 != null) {
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
            canvas.translate(-i60Var.K.getX(), -i60Var.K.getY());
            float f12 = i60Var.R2;
            canvas.scale(f12, f12);
            canvas.drawRenderNode(i60Var.Q2);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public final boolean r() {
        return true;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void p() {
    }
}
