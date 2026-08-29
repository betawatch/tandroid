package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.ni;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class i extends ka0 {
    public final /* synthetic */ int R;
    public final /* synthetic */ KeyEvent.Callback S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(KeyEvent.Callback callback, Context context, long j10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, j10, 0L, o2Var, c6Var);
        this.R = i10;
        this.S = callback;
    }

    @Override // org.telegram.ui.Components.ka0
    public void f(Canvas canvas, Rect rect, float f9) {
        switch (this.R) {
            case 0:
                m mVar = (m) this.S;
                Paint paint = mVar.e;
                RectF rectF = mVar.v0;
                rectF.set(rect);
                if (!mVar.g()) {
                    Paint c3 = mVar.P.c(1.0f);
                    if (c3 != null) {
                        canvas.drawRoundRect(rectF, f9, f9, c3);
                        paint.setAlpha(80);
                        canvas.drawRoundRect(rectF, f9, f9, paint);
                        break;
                    } else {
                        paint.setAlpha(128);
                        canvas.drawRoundRect(rectF, f9, f9, paint);
                        break;
                    }
                } else {
                    mVar.h(mVar.P, canvas, mVar.v0, f9, false, -mVar.I.getX(), -mVar.I.getY(), false);
                    break;
                }
            default:
                super.f(canvas, rect, f9);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ka0
    public boolean h() {
        switch (this.R) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.ka0
    public void i() {
        switch (this.R) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ni) this.S).f0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ka0
    public void n(boolean z10) {
        switch (this.R) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ni) this.S).f0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                    break;
                }
                break;
        }
    }
}
