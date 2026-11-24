// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lc1 extends u17 {
    public final /* synthetic */ byte V;
    public final /* synthetic */ KeyEvent.Callback W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc1(KeyEvent.Callback callback, Context context, long j, d dVar, ylb ylbVar, byte b) {
        super(context, j, 0L, dVar, ylbVar);
        this.V = b;
        this.W = callback;
    }

    @Override // u17
    public final void f(Canvas canvas, Rect rect, float f) {
        switch (this.V) {
            case 0:
                pc1 pc1Var = (pc1) this.W;
                Paint paint = pc1Var.e;
                RectF rectF = pc1Var.z0;
                rectF.set(rect);
                boolean g = pc1Var.g();
                wm0 wm0Var = pc1Var.U;
                if (!g) {
                    Paint c = wm0Var.c(1.0f);
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
                    pc1Var.h(wm0Var, canvas, pc1Var.z0, f, false, -pc1Var.N.getX(), -pc1Var.N.getY(), false);
                    break;
                }
            default:
                super.f(canvas, rect, f);
                break;
        }
    }

    @Override // u17
    public final boolean h() {
        switch (this.V) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override // u17
    public final void i() {
        switch (this.V) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((i22) this.W).d2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.W();
                    break;
                }
                break;
        }
    }

    @Override // u17
    public final void n(boolean z) {
        switch (this.V) {
            case 1:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((i22) this.W).d2;
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.W();
                    break;
                }
                break;
        }
    }
}
