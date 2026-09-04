package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class i extends oa0 {
    public final /* synthetic */ int V;
    public final /* synthetic */ KeyEvent.Callback W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(KeyEvent.Callback callback, Context context, long j3, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, j3, 0L, n2Var, f6Var);
        this.V = i10;
        this.W = callback;
    }

    @Override // org.telegram.ui.Components.oa0
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

    @Override // org.telegram.ui.Components.oa0
    public boolean h() {
        switch (this.V) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.oa0
    public void i() {
        switch (this.V) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((vi) this.W).j0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.oa0
    public void n(boolean z10) {
        switch (this.V) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((vi) this.W).j0;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                    break;
                }
                break;
        }
    }
}
