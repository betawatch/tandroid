package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                org.telegram.ui.Components.ek0 ek0Var = premiumPreviewFragment.a;
                ih.d.a(ek0Var, canvas, rectF, ek0Var, premiumPreviewFragment.e0);
                break;
            case 3:
                RectF rectF2 = ProfileActivity.Z6;
                canvas.save();
                canvas.translate(-r1.getScrollX(), -r1.getScrollY());
                ((View) obj).draw(canvas);
                canvas.restore();
                break;
            case 4:
                xw0 xw0Var = ((ProfileActivity) obj).d1;
                xw0Var.P = true;
                xw0Var.draw(canvas);
                xw0Var.P = false;
                break;
            default:
                org.telegram.ui.Components.ek0 ek0Var2 = (org.telegram.ui.Components.ek0) obj;
                org.telegram.ui.Components.u9 u9Var = ek0Var2.S2;
                if (u9Var == null) {
                    org.telegram.ui.Components.oj0 oj0Var = ek0Var2.H2;
                    if (oj0Var != null) {
                        oj0Var.d(canvas, rectF);
                        break;
                    }
                } else {
                    u9Var.d(canvas, rectF);
                    break;
                }
                break;
        }
    }
}
