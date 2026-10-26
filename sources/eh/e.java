package eh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import ch.g;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e extends d {
    public final hh.a Y;
    public final Outline Z = new Outline();
    public final Rect a0 = new Rect();
    public final RenderNode b0;
    public final RenderNode c0;
    public final Paint d0;
    public final Paint e0;
    public final Paint f0;
    public boolean g0;
    public g h0;

    public e(hh.a aVar) {
        Paint paint = new Paint(1);
        this.d0 = paint;
        Paint paint2 = new Paint(1);
        this.e0 = paint2;
        Paint paint3 = new Paint(1);
        this.f0 = paint3;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.b0 = renderNode;
        this.c0 = new RenderNode("BlurredFill");
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        this.Y = aVar;
        paint.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint3.setStyle(style);
    }

    public final void B() {
        float f7 = this.c;
        float f10 = this.d;
        c cVar = this.x;
        Rect rect = cVar.m;
        Rect rect2 = cVar.m;
        float f11 = rect.left + f7;
        float f12 = rect.top + f10;
        float f13 = rect.right + f7;
        float f14 = rect.bottom + f10;
        RecordingCanvas beginRecording = this.c0.beginRecording();
        beginRecording.save();
        beginRecording.translate(-f11, -f12);
        if (this.h0 != null && Build.VERSION.SDK_INT >= 33) {
            int i10 = cVar.f;
            if (i10 <= 0) {
                i10 = AndroidUtilities.dp(11.0f);
            }
            int max = Math.max(Math.min(i10, Math.min(rect2.width(), rect2.height()) / 5), 1);
            g gVar = this.h0;
            float width = rect2.width();
            float height = rect2.height();
            float[] fArr = cVar.c;
            gVar.a(width, height, fArr[0], fArr[2], fArr[4], fArr[6], max, cVar.g, cVar.h, this.h);
        }
        this.Y.w(beginRecording, f11, f12, f13, f14);
        beginRecording.save();
        this.c0.endRecording();
        RecordingCanvas beginRecording2 = this.b0.beginRecording();
        if (Color.alpha(this.h) == 255) {
            beginRecording2.drawColor(this.h);
        } else {
            beginRecording2.drawRenderNode(this.c0);
            if (this.h0 == null && Color.alpha(this.h) != 0) {
                beginRecording2.drawColor(this.h);
            }
        }
        if (this.n != 0) {
            d.o(beginRecording2, rect2.width(), rect2.height(), cVar.b, cVar.i, true, this.e0);
        }
        if (this.r != 0) {
            d.o(beginRecording2, rect2.width(), rect2.height(), cVar.b, cVar.j, false, this.f0);
        }
        this.b0.endRecording();
    }

    @Override // eh.d, oi.e
    public final void a() {
        B();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10 = f7.b;
        if (this.w != i10) {
            this.w = i10;
            try {
                updateColors();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        c cVar = this.x;
        if (cVar.m.isEmpty()) {
            return;
        }
        if (!canvas.isHardwareAccelerated()) {
            m(canvas, this.Y);
            return;
        }
        if (!this.b0.hasDisplayList()) {
            B();
        } else if (this.g0) {
            B();
        }
        this.g0 = false;
        int o12 = y6.o1(this.b0.getAlpha() * this.H, this.f);
        if (Color.alpha(o12) != 0) {
            float f7 = this.F;
            float f10 = this.G;
            Paint paint = this.d0;
            paint.setShadowLayer(f7, 0.0f, f10, o12);
            cVar.c(canvas, paint, this.E);
        }
        canvas.save();
        Rect rect = cVar.m;
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.b0);
        canvas.restore();
    }

    @Override // eh.d, oi.e
    public final boolean e() {
        return this.b0.hasDisplayList();
    }

    @Override // oi.e
    public final void f(int i10) {
        this.b0.setAlpha(i10 / 255.0f);
        this.g0 = true;
    }

    @Override // eh.d, oi.e
    public final void h() {
        l();
        this.g0 = true;
    }

    @Override // eh.d
    public final hh.a s() {
        return this.Y;
    }

    @Override // eh.d
    public final void t() {
        l();
        c cVar = this.x;
        this.e0.setStrokeWidth(cVar.i);
        this.f0.setStrokeWidth(cVar.j);
        int width = cVar.m.width();
        int height = cVar.m.height();
        Rect rect = this.a0;
        rect.set(0, 0, width, height);
        float[] fArr = cVar.b;
        Outline outline = this.Z;
        d.r(outline, rect, fArr);
        outline.setAlpha(1.0f);
        if (cVar.m.isEmpty()) {
            return;
        }
        this.c0.setPosition(0, 0, cVar.m.width(), cVar.m.height());
        this.b0.setPosition(0, 0, cVar.m.width(), cVar.m.height());
        this.b0.setOutline(outline);
        this.g0 = true;
    }

    @Override // eh.d
    public final d u() {
        this.b0.setClipToOutline(false);
        return this;
    }

    @Override // eh.d, oi.e, org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        super.updateColors();
        this.d0.setShadowLayer(this.F, 0.0f, this.G, this.f);
        this.e0.setColor(this.n);
        this.f0.setColor(this.r);
        this.g0 = true;
    }
}
