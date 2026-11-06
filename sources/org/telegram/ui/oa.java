package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oa implements eh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oa(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // eh.a
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // eh.a
    public final void d(Canvas canvas, RectF rectF) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((kb) obj).X(canvas, rectF);
                break;
            case 1:
                pa0.Z((pa0) obj, canvas, rectF);
                break;
            case 2:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                org.telegram.ui.Components.pj0 pj0Var = premiumPreviewFragment.a;
                ih.d.a(pj0Var, canvas, rectF, pj0Var, premiumPreviewFragment.d0);
                break;
            case 3:
                RectF rectF2 = ProfileActivity.S6;
                canvas.save();
                canvas.translate(-r1.getScrollX(), -r1.getScrollY());
                ((View) obj).draw(canvas);
                canvas.restore();
                break;
            case 4:
                ww0 ww0Var = ((ProfileActivity) obj).c1;
                ww0Var.O = true;
                ww0Var.draw(canvas);
                ww0Var.O = false;
                break;
            default:
                org.telegram.ui.Components.pj0 pj0Var2 = (org.telegram.ui.Components.pj0) obj;
                org.telegram.ui.Components.q9 q9Var = pj0Var2.R2;
                if (q9Var == null) {
                    org.telegram.ui.Components.zi0 zi0Var = pj0Var2.G2;
                    if (zi0Var != null) {
                        zi0Var.d(canvas, rectF);
                        break;
                    }
                } else {
                    q9Var.d(canvas, rectF);
                    break;
                }
                break;
        }
    }
}
