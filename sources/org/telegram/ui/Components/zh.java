package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zh extends qa0 {
    public final /* synthetic */ int S;
    public final /* synthetic */ KeyEvent.Callback T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zh(KeyEvent.Callback callback, Context context, long j10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, j10, 0L, p2Var, f6Var);
        this.S = i10;
        this.T = callback;
    }

    @Override // org.telegram.ui.Components.qa0
    public void f(Canvas canvas, Rect rect, float f10) {
        switch (this.S) {
            case 1:
                ph.k kVar = (ph.k) this.T;
                Paint paint = kVar.e;
                RectF rectF = kVar.w0;
                rectF.set(rect);
                if (!kVar.g()) {
                    Paint c3 = kVar.Q.c(1.0f);
                    if (c3 != null) {
                        canvas.drawRoundRect(rectF, f10, f10, c3);
                        paint.setAlpha(80);
                        canvas.drawRoundRect(rectF, f10, f10, paint);
                        break;
                    } else {
                        paint.setAlpha(128);
                        canvas.drawRoundRect(rectF, f10, f10, paint);
                        break;
                    }
                } else {
                    kVar.h(kVar.Q, canvas, kVar.w0, f10, false, -kVar.J.getX(), -kVar.J.getY(), false);
                    break;
                }
            default:
                super.f(canvas, rect, f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qa0
    public boolean h() {
        switch (this.S) {
            case 1:
                return true;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.qa0
    public void i() {
        switch (this.S) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((li) this.T).g0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.qa0
    public void n(boolean z4) {
        switch (this.S) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((li) this.T).g0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                    break;
                }
                break;
        }
    }
}
