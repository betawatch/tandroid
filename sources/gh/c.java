package gh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import b8.mc;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c extends mc {
    public final Paint a = new Paint(1);
    public final Paint b;
    public final /* synthetic */ g c;

    public c(g gVar) {
        this.c = gVar;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(0);
    }

    @Override // b8.mc
    public final void b(Canvas canvas, si.a aVar) {
        g gVar = this.c;
        f fVar = gVar.R;
        int i3 = gVar.c;
        if (i3 == 0) {
            return;
        }
        int r12 = k6.r1(i3 / 255.0f, gVar.y);
        if (Color.alpha(gVar.x) > 0 && i3 == 255) {
            float f10 = gVar.W;
            if (f10 > 0.0f) {
                float f11 = gVar.U;
                float f12 = gVar.V;
                int r13 = k6.r1(f10, gVar.x);
                Paint paint = this.b;
                paint.setShadowLayer(f11, 0.0f, f12, r13);
                fVar.d(canvas, paint, gVar.T);
            }
        }
        Rect rect = fVar.m;
        float f13 = rect.left;
        float f14 = gVar.d;
        float f15 = f13 + f14;
        float f16 = rect.top;
        float f17 = gVar.e;
        float f18 = f16 + f17;
        float f19 = rect.right;
        float f20 = f19 + f14;
        float f21 = rect.bottom;
        float f22 = f21 + f17;
        boolean z10 = i3 != 255;
        if (z10) {
            canvas.saveLayerAlpha(f13, f16, f19, f21, i3);
        }
        canvas.save();
        canvas.clipPath(fVar.k);
        canvas.translate(rect.left, rect.top);
        canvas.translate(-f15, -f18);
        aVar.l(canvas, f15, f18, f20, f22);
        canvas.restore();
        if (Color.alpha(r12) > 0) {
            Paint paint2 = this.a;
            paint2.setColor(r12);
            fVar.c(canvas, paint2);
        }
        if (z10) {
            canvas.restore();
        }
    }
}
