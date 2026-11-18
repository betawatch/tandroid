package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                qa0.Z((qa0) obj, canvas, rectF);
                break;
            case 2:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                org.telegram.ui.Components.ck0 ck0Var = premiumPreviewFragment.a;
                ih.d.a(ck0Var, canvas, rectF, ck0Var, premiumPreviewFragment.e0);
                break;
            case 3:
                RectF rectF2 = ProfileActivity.Z6;
                canvas.save();
                canvas.translate(-r1.getScrollX(), -r1.getScrollY());
                ((View) obj).draw(canvas);
                canvas.restore();
                break;
            case 4:
                zw0 zw0Var = ((ProfileActivity) obj).d1;
                zw0Var.P = true;
                zw0Var.draw(canvas);
                zw0Var.P = false;
                break;
            default:
                org.telegram.ui.Components.ck0 ck0Var2 = (org.telegram.ui.Components.ck0) obj;
                org.telegram.ui.Components.v9 v9Var = ck0Var2.S2;
                if (v9Var == null) {
                    org.telegram.ui.Components.mj0 mj0Var = ck0Var2.H2;
                    if (mj0Var != null) {
                        mj0Var.d(canvas, rectF);
                        break;
                    }
                } else {
                    v9Var.d(canvas, rectF);
                    break;
                }
                break;
        }
    }
}
