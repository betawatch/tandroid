package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.v90;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class j extends v90 {
    public final /* synthetic */ int W;
    public final /* synthetic */ KeyEvent.Callback a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(KeyEvent.Callback callback, Context context, long j3, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, j3, 0L, g2Var, h6Var);
        this.W = i7;
        this.a0 = callback;
    }

    @Override // org.telegram.ui.Components.v90
    public void f(Canvas canvas, Rect rect, float f10) {
        switch (this.W) {
            case 0:
                o oVar = (o) this.a0;
                Paint paint = oVar.e;
                RectF rectF = oVar.z0;
                rectF.set(rect);
                if (!oVar.g()) {
                    Paint c10 = oVar.U.c(1.0f);
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
                    oVar.h(oVar.U, canvas, oVar.z0, f10, false, -oVar.N.getX(), -oVar.N.getY(), false);
                    break;
                }
            default:
                super.f(canvas, rect, f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.v90
    public boolean h() {
        switch (this.W) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.v90
    public void i() {
        switch (this.W) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ui) this.a0).e2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.Y();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.v90
    public void n(boolean z10) {
        switch (this.W) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ui) this.a0).e2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.Y();
                    break;
                }
                break;
        }
    }
}
