package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class i extends gb0 {
    public final /* synthetic */ int V;
    public final /* synthetic */ KeyEvent.Callback W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(KeyEvent.Callback callback, Context context, long j10, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, j10, 0L, r2Var, u6Var);
        this.V = i10;
        this.W = callback;
    }

    @Override // org.telegram.ui.Components.gb0
    public void f(Canvas canvas, Rect rect, float f7) {
        switch (this.V) {
            case 0:
                m mVar = (m) this.W;
                Paint paint = mVar.e;
                RectF rectF = mVar.z0;
                rectF.set(rect);
                if (!mVar.g()) {
                    Paint c10 = mVar.T.c(1.0f);
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
                    mVar.h(mVar.T, canvas, mVar.z0, f7, false, -mVar.M.getX(), -mVar.M.getY(), false);
                    break;
                }
            default:
                super.f(canvas, rect, f7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.gb0
    public boolean h() {
        switch (this.V) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.gb0
    public void i() {
        switch (this.V) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ti) this.W).j0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.gb0
    public void n(boolean z10) {
        switch (this.V) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ti) this.W).j0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                    break;
                }
                break;
        }
    }
}
