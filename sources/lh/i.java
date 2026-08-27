package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.gi;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class i extends aa0 {
    public final /* synthetic */ int R;
    public final /* synthetic */ KeyEvent.Callback S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(KeyEvent.Callback callback, Context context, long j10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, j10, 0L, n2Var, c6Var);
        this.R = i10;
        this.S = callback;
    }

    @Override // org.telegram.ui.Components.aa0
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

    @Override // org.telegram.ui.Components.aa0
    public boolean h() {
        switch (this.R) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.aa0
    public void i() {
        switch (this.R) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((gi) this.S).f0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.aa0
    public void n(boolean z10) {
        switch (this.R) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((gi) this.S).f0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                    break;
                }
                break;
        }
    }
}
