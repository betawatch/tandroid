package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class oh extends y90 {
    public final /* synthetic */ int V;
    public final /* synthetic */ KeyEvent.Callback W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oh(KeyEvent.Callback callback, Context context, long j10, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, j10, 0L, k2Var, p6Var);
        this.V = i10;
        this.W = callback;
    }

    @Override // org.telegram.ui.Components.y90
    public void f(Canvas canvas, Rect rect, float f7) {
        switch (this.V) {
            case 1:
                vh.k kVar = (vh.k) this.W;
                Paint paint = kVar.e;
                RectF rectF = kVar.y0;
                rectF.set(rect);
                if (!kVar.g()) {
                    Paint c10 = kVar.T.c(1.0f);
                    if (c10 != null) {
                        canvas.drawRoundRect(rectF, f7, f7, c10);
                        paint.setAlpha(80);
                        canvas.drawRoundRect(rectF, f7, f7, paint);
                        break;
                    } else {
                        paint.setAlpha(128);
                        canvas.drawRoundRect(rectF, f7, f7, paint);
                        break;
                    }
                } else {
                    kVar.h(kVar.T, canvas, kVar.y0, f7, false, -kVar.M.getX(), -kVar.M.getY(), false);
                    break;
                }
            default:
                super.f(canvas, rect, f7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.y90
    public boolean h() {
        switch (this.V) {
            case 1:
                return true;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.y90
    public void i() {
        switch (this.V) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((bi) this.W).a2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.W();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.y90
    public void n(boolean z10) {
        switch (this.V) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((bi) this.W).a2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.W();
                    break;
                }
                break;
        }
    }
}
