package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.t90;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class i extends t90 {
    public final /* synthetic */ int W;
    public final /* synthetic */ KeyEvent.Callback a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(KeyEvent.Callback callback, Context context, long j3, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, j3, 0L, h2Var, i6Var);
        this.W = i7;
        this.a0 = callback;
    }

    @Override // org.telegram.ui.Components.t90
    public void f(Canvas canvas, Rect rect, float f10) {
        switch (this.W) {
            case 0:
                n nVar = (n) this.a0;
                Paint paint = nVar.e;
                RectF rectF = nVar.z0;
                rectF.set(rect);
                if (!nVar.g()) {
                    Paint c10 = nVar.U.c(1.0f);
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
                    nVar.h(nVar.U, canvas, nVar.z0, f10, false, -nVar.N.getX(), -nVar.N.getY(), false);
                    break;
                }
            default:
                super.f(canvas, rect, f10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.t90
    public boolean h() {
        switch (this.W) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override // org.telegram.ui.Components.t90
    public void i() {
        switch (this.W) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((si) this.a0).e2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.Y();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.t90
    public void n(boolean z10) {
        switch (this.W) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((si) this.a0).e2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.Y();
                    break;
                }
                break;
        }
    }
}
