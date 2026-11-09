package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                ra0.Z((ra0) obj, canvas, rectF);
                break;
            case 2:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                org.telegram.ui.Components.qj0 qj0Var = premiumPreviewFragment.a;
                ih.d.a(qj0Var, canvas, rectF, qj0Var, premiumPreviewFragment.d0);
                break;
            case 3:
                RectF rectF2 = ProfileActivity.V6;
                canvas.save();
                canvas.translate(-r1.getScrollX(), -r1.getScrollY());
                ((View) obj).draw(canvas);
                canvas.restore();
                break;
            case 4:
                zw0 zw0Var = ((ProfileActivity) obj).c1;
                zw0Var.O = true;
                zw0Var.draw(canvas);
                zw0Var.O = false;
                break;
            default:
                org.telegram.ui.Components.qj0 qj0Var2 = (org.telegram.ui.Components.qj0) obj;
                org.telegram.ui.Components.q9 q9Var = qj0Var2.R2;
                if (q9Var == null) {
                    org.telegram.ui.Components.aj0 aj0Var = qj0Var2.G2;
                    if (aj0Var != null) {
                        aj0Var.d(canvas, rectF);
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
