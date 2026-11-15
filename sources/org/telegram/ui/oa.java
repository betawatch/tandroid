package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                ((jb) obj).X(canvas, rectF);
                break;
            case 1:
                pa0.Z((pa0) obj, canvas, rectF);
                break;
            case 2:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                org.telegram.ui.Components.uj0 uj0Var = premiumPreviewFragment.a;
                ih.d.a(uj0Var, canvas, rectF, uj0Var, premiumPreviewFragment.e0);
                break;
            case 3:
                RectF rectF2 = ProfileActivity.X6;
                canvas.save();
                canvas.translate(-r1.getScrollX(), -r1.getScrollY());
                ((View) obj).draw(canvas);
                canvas.restore();
                break;
            case 4:
                vw0 vw0Var = ((ProfileActivity) obj).d1;
                vw0Var.P = true;
                vw0Var.draw(canvas);
                vw0Var.P = false;
                break;
            default:
                org.telegram.ui.Components.uj0 uj0Var2 = (org.telegram.ui.Components.uj0) obj;
                org.telegram.ui.Components.n9 n9Var = uj0Var2.S2;
                if (n9Var == null) {
                    org.telegram.ui.Components.ej0 ej0Var = uj0Var2.H2;
                    if (ej0Var != null) {
                        ej0Var.d(canvas, rectF);
                        break;
                    }
                } else {
                    n9Var.d(canvas, rectF);
                    break;
                }
                break;
        }
    }
}
