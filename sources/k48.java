// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class k48 extends FrameLayout {
    public final /* synthetic */ byte a;
    public RectF b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k48(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                RectF rectF = this.b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), bkb.h2);
                break;
            default:
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, gl.L(4.0f), gl.L(4.0f), bkb.h2);
                break;
        }
    }
}
