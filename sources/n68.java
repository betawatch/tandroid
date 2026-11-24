// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n68 extends FrameLayout {
    public final /* synthetic */ byte a;
    public RectF b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n68(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                RectF rectF = this.b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), cmb.h2);
                break;
            default:
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, gm.L(4.0f), gm.L(4.0f), cmb.h2);
                break;
        }
    }
}
