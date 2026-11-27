// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mb1 extends b27 {
    public final /* synthetic */ byte V;
    public final /* synthetic */ KeyEvent.Callback W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb1(KeyEvent.Callback callback, Context context, long j, e eVar, vnb vnbVar, byte b) {
        super(context, j, 0L, eVar, vnbVar);
        this.V = b;
        this.W = callback;
    }

    @Override // b27
    public final void f(Canvas canvas, Rect rect, float f) {
        switch (this.V) {
            case 0:
                qb1 qb1Var = (qb1) this.W;
                Paint paint = qb1Var.e;
                RectF rectF = qb1Var.z0;
                rectF.set(rect);
                boolean g = qb1Var.g();
                xl0 xl0Var = qb1Var.U;
                if (!g) {
                    Paint c = xl0Var.c(1.0f);
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
                    qb1Var.h(xl0Var, canvas, qb1Var.z0, f, false, -qb1Var.N.getX(), -qb1Var.N.getY(), false);
                    break;
                }
            default:
                super.f(canvas, rect, f);
                break;
        }
    }

    @Override // b27
    public final boolean h() {
        switch (this.V) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override // b27
    public final void i() {
        switch (this.V) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((n12) this.W).d2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                    break;
                }
                break;
        }
    }

    @Override // b27
    public final void n(boolean z) {
        switch (this.V) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((n12) this.W).d2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.V();
                    break;
                }
                break;
        }
    }
}
