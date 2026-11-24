// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fz extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final /* synthetic */ lz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz(lz lzVar, Context context) {
        super(context);
        this.c = lzVar;
        this.a = new RectF();
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        lz lzVar = this.c;
        gz gzVar = lzVar.V1;
        FrameLayout frameLayout = gzVar.b;
        RectF rectF = this.a;
        if (zec.c(frameLayout, this, rectF)) {
            TextView textView = lzVar.W1;
            RectF rectF2 = this.b;
            if (zec.c(textView, this, rectF2)) {
                float L = rectF2.right - gl.L(32.0f);
                float centerY = rectF2.centerY() - gl.L(16.0f);
                if (rectF.isEmpty()) {
                    return;
                }
                canvas.save();
                canvas.translate(L, centerY);
                canvas.scale(gl.L(32.0f) / rectF.width(), gl.L(32.0f) / rectF.height());
                gzVar.b.draw(canvas);
                canvas.restore();
            }
        }
    }
}
