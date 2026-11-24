// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class eb1 extends uz6 {
    public final /* synthetic */ byte V;
    public final /* synthetic */ KeyEvent.Callback W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eb1(KeyEvent.Callback callback, Context context, long j, d dVar, wjb wjbVar, byte b) {
        super(context, j, 0L, dVar, wjbVar);
        this.V = b;
        this.W = callback;
    }

    @Override // uz6
    public final void f(Canvas canvas, Rect rect, float f) {
        switch (this.V) {
            case 0:
                ib1 ib1Var = (ib1) this.W;
                Paint paint = ib1Var.e;
                RectF rectF = ib1Var.z0;
                rectF.set(rect);
                boolean g = ib1Var.g();
                wl0 wl0Var = ib1Var.U;
                if (!g) {
                    Paint c = wl0Var.c(1.0f);
                    if (c != null) {
                        canvas.drawRoundRect(rectF, f, f, c);
                        paint.setAlpha(80);
                        canvas.drawRoundRect(rectF, f, f, paint);
                        break;
                    } else {
                        paint.setAlpha(128);
                        canvas.drawRoundRect(rectF, f, f, paint);
                        break;
                    }
                } else {
                    ib1Var.h(wl0Var, canvas, ib1Var.z0, f, false, -ib1Var.N.getX(), -ib1Var.N.getY(), false);
                    break;
                }
            default:
                super.f(canvas, rect, f);
                break;
        }
    }

    @Override // uz6
    public final boolean h() {
        switch (this.V) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override // uz6
    public final void i() {
        switch (this.V) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((x02) this.W).d2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.W();
                    break;
                }
                break;
        }
    }

    @Override // uz6
    public final void n(boolean z) {
        switch (this.V) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((x02) this.W).d2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.W();
                    break;
                }
                break;
        }
    }
}
