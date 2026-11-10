package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.g90;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i extends g90 {
    public final /* synthetic */ int V;
    public final /* synthetic */ KeyEvent.Callback W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(KeyEvent.Callback callback, Context context, long j3, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, j3, 0L, f2Var, h6Var);
        this.V = i7;
        this.W = callback;
    }

    @Override // org.telegram.ui.Components.g90
    public void f(Canvas canvas, Rect rect, float f10) {
        switch (this.V) {
            case 0:
                m mVar = (m) this.W;
                Paint paint = mVar.e;
                RectF rectF = mVar.y0;
                rectF.set(rect);
                if (!mVar.g()) {
                    Paint c10 = mVar.T.c(1.0f);
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
                    mVar.h(mVar.T, canvas, mVar.y0, f10, false, -mVar.M.getX(), -mVar.M.getY(), false);
                    break;
                }
            default:
                super.f(canvas, rect, f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.g90
    public boolean h() {
        switch (this.V) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.g90
    public void i() {
        switch (this.V) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ci) this.W).d2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.X();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.g90
    public void n(boolean z9) {
        switch (this.V) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ci) this.W).d2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.X();
                    break;
                }
                break;
        }
    }
}
