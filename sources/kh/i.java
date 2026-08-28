package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.w90;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i extends w90 {
    public final /* synthetic */ int R;
    public final /* synthetic */ KeyEvent.Callback S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(KeyEvent.Callback callback, Context context, long j10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, j10, 0L, o2Var, b6Var);
        this.R = i9;
        this.S = callback;
    }

    @Override // org.telegram.ui.Components.w90
    public void f(Canvas canvas, Rect rect, float f10) {
        switch (this.R) {
            case 0:
                m mVar = (m) this.S;
                Paint paint = mVar.e;
                RectF rectF = mVar.v0;
                rectF.set(rect);
                if (!mVar.g()) {
                    Paint c10 = mVar.P.c(1.0f);
                    if (c10 != null) {
                        canvas.drawRoundRect(rectF, f10, f10, c10);
                        paint.setAlpha(80);
                        canvas.drawRoundRect(rectF, f10, f10, paint);
                        break;
                    } else {
                        paint.setAlpha(128);
                        canvas.drawRoundRect(rectF, f10, f10, paint);
                        break;
                    }
                } else {
                    mVar.h(mVar.P, canvas, mVar.v0, f10, false, -mVar.I.getX(), -mVar.I.getY(), false);
                    break;
                }
            default:
                super.f(canvas, rect, f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.w90
    public boolean h() {
        switch (this.R) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.w90
    public void i() {
        switch (this.R) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ki) this.S).f0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.U();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w90
    public void n(boolean z10) {
        switch (this.R) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ki) this.S).f0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.U();
                    break;
                }
                break;
        }
    }
}
