package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class na implements fh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ na(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // fh.a
    public final void b(eh.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // fh.a
    public final void d(Canvas canvas, RectF rectF) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ((ib) obj).X(canvas, rectF);
                break;
            case 1:
                la0.Z((la0) obj, canvas, rectF);
                break;
            case 2:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                org.telegram.ui.Components.tj0 tj0Var = premiumPreviewFragment.a;
                jh.d.a(tj0Var, canvas, rectF, tj0Var, premiumPreviewFragment.e0);
                break;
            case 3:
                RectF rectF2 = ProfileActivity.T6;
                canvas.save();
                canvas.translate(-r1.getScrollX(), -r1.getScrollY());
                ((View) obj).draw(canvas);
                canvas.restore();
                break;
            case 4:
                ow0 ow0Var = ((ProfileActivity) obj).d1;
                ow0Var.P = true;
                ow0Var.draw(canvas);
                ow0Var.P = false;
                break;
            default:
                org.telegram.ui.Components.tj0 tj0Var2 = (org.telegram.ui.Components.tj0) obj;
                org.telegram.ui.Components.p9 p9Var = tj0Var2.S2;
                if (p9Var == null) {
                    org.telegram.ui.Components.dj0 dj0Var = tj0Var2.H2;
                    if (dj0Var != null) {
                        dj0Var.d(canvas, rectF);
                        break;
                    }
                } else {
                    p9Var.d(canvas, rectF);
                    break;
                }
                break;
        }
    }
}
