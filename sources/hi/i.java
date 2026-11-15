package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.ki;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i extends j90 {
    public final /* synthetic */ int W;
    public final /* synthetic */ KeyEvent.Callback a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(KeyEvent.Callback callback, Context context, long j3, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, j3, 0L, e2Var, e6Var);
        this.W = i7;
        this.a0 = callback;
    }

    @Override // org.telegram.ui.Components.j90
    public void f(Canvas canvas, Rect rect, float f10) {
        switch (this.W) {
            case 0:
                m mVar = (m) this.a0;
                Paint paint = mVar.e;
                RectF rectF = mVar.z0;
                rectF.set(rect);
                if (!mVar.g()) {
                    Paint c10 = mVar.U.c(1.0f);
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
                    mVar.h(mVar.U, canvas, mVar.z0, f10, false, -mVar.N.getX(), -mVar.N.getY(), false);
                    break;
                }
            default:
                super.f(canvas, rect, f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.j90
    public boolean h() {
        switch (this.W) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.j90
    public void i() {
        switch (this.W) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ki) this.a0).e2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.Y();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.j90
    public void n(boolean z10) {
        switch (this.W) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ki) this.a0).e2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.Y();
                    break;
                }
                break;
        }
    }
}
