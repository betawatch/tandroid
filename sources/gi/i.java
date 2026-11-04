package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.c90;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i extends c90 {
    public final /* synthetic */ int W;
    public final /* synthetic */ KeyEvent.Callback a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(KeyEvent.Callback callback, Context context, long j10, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, j10, 0L, d2Var, e6Var);
        this.W = i3;
        this.a0 = callback;
    }

    @Override // org.telegram.ui.Components.c90
    public void f(Canvas canvas, Rect rect, float f10) {
        switch (this.W) {
            case 0:
                m mVar = (m) this.a0;
                Paint paint = mVar.e;
                RectF rectF = mVar.z0;
                rectF.set(rect);
                if (!mVar.g()) {
                    Paint c2 = mVar.U.c(1.0f);
                    if (c2 != null) {
                        canvas.drawRoundRect(rectF, f10, f10, c2);
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

    @Override // org.telegram.ui.Components.c90
    public boolean h() {
        switch (this.W) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.c90
    public void i() {
        switch (this.W) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((bi) this.a0).b2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.X();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.c90
    public void n(boolean z10) {
        switch (this.W) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((bi) this.a0).b2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.X();
                    break;
                }
                break;
        }
    }
}
