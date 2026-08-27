package lg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e extends d {
    public final og.a E;
    public final Outline F = new Outline();
    public final Rect G = new Rect();
    public final RenderNode H;
    public final RenderNode I;
    public final Paint J;
    public final Paint K;
    public final Paint L;
    public boolean M;
    public jg.f N;

    public e(og.a aVar) {
        Paint paint = new Paint(1);
        this.J = paint;
        Paint paint2 = new Paint(1);
        this.K = paint2;
        Paint paint3 = new Paint(1);
        this.L = paint3;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.H = renderNode;
        this.I = new RenderNode("BlurredFill");
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        this.E = aVar;
        paint.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint3.setStyle(style);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        c cVar = this.h;
        if (cVar.m.isEmpty()) {
            return;
        }
        boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
        og.a aVar = this.E;
        if (!isHardwareAccelerated) {
            c(canvas, aVar);
            return;
        }
        if (!this.H.hasDisplayList()) {
            aVar.r();
            w();
        } else if (this.M) {
            w();
        }
        this.M = false;
        int l1 = g6.l1(this.H.getAlpha() * this.n, this.d);
        if (Color.alpha(l1) != 0) {
            float f10 = this.l;
            float f11 = this.m;
            Paint paint = this.J;
            paint.setShadowLayer(f10, 0.0f, f11, l1);
            cVar.c(canvas, paint, this.k);
        }
        canvas.save();
        Rect rect = cVar.m;
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.H);
        canvas.restore();
    }

    @Override // lg.d
    public final og.a i() {
        return this.E;
    }

    @Override // lg.d
    public final void j() {
        b();
        c cVar = this.h;
        this.K.setStrokeWidth(cVar.i);
        this.L.setStrokeWidth(cVar.j);
        int width = cVar.m.width();
        int height = cVar.m.height();
        Rect rect = this.G;
        rect.set(0, 0, width, height);
        float[] fArr = cVar.b;
        Outline outline = this.F;
        d.h(outline, rect, fArr);
        outline.setAlpha(1.0f);
        if (cVar.m.isEmpty()) {
            return;
        }
        this.I.setPosition(0, 0, cVar.m.width(), cVar.m.height());
        this.H.setPosition(0, 0, cVar.m.width(), cVar.m.height());
        this.H.setOutline(outline);
        this.M = true;
    }

    @Override // lg.d
    public final void k() {
        b();
        this.M = true;
    }

    @Override // lg.d
    public final void l() {
        this.E.r();
    }

    @Override // lg.d
    public final d m() {
        this.H.setClipToOutline(false);
        return this;
    }

    @Override // lg.d, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        int i11 = this.j;
        this.j = i10;
        this.H.setAlpha(i10 / 255.0f);
        this.M = true;
        if (i11 != 0 || i10 <= 0) {
            return;
        }
        this.E.r();
    }

    @Override // lg.d
    public final void u() {
        super.u();
        this.J.setShadowLayer(this.l, 0.0f, this.m, this.d);
        this.K.setColor(this.f);
        this.L.setColor(this.g);
        this.M = true;
    }

    public final boolean v() {
        return this.H.hasDisplayList();
    }

    public final void w() {
        float f10 = this.a;
        float f11 = this.b;
        c cVar = this.h;
        Rect rect = cVar.m;
        Rect rect2 = cVar.m;
        float f12 = rect.left + f10;
        float f13 = rect.top + f11;
        float f14 = rect.right + f10;
        float f15 = rect.bottom + f11;
        RecordingCanvas beginRecording = this.I.beginRecording();
        beginRecording.save();
        beginRecording.translate(-f12, -f13);
        if (this.N != null && Build.VERSION.SDK_INT >= 33) {
            int i10 = cVar.f;
            if (i10 <= 0) {
                i10 = AndroidUtilities.dp(11.0f);
            }
            int max = Math.max(Math.min(i10, Math.min(rect2.width(), rect2.height()) / 5), 1);
            jg.f fVar = this.N;
            float width = rect2.width();
            float height = rect2.height();
            float[] fArr = cVar.c;
            fVar.a(width, height, fArr[0], fArr[2], fArr[4], fArr[6], max, cVar.g, cVar.h, this.e);
        }
        this.E.T0(beginRecording, f12, f13, f14, f15);
        beginRecording.save();
        this.I.endRecording();
        RecordingCanvas beginRecording2 = this.H.beginRecording();
        if (Color.alpha(this.e) == 255) {
            beginRecording2.drawColor(this.e);
        } else {
            beginRecording2.drawRenderNode(this.I);
            if (this.N == null && Color.alpha(this.e) != 0) {
                beginRecording2.drawColor(this.e);
            }
        }
        if (this.f != 0) {
            d.e(beginRecording2, rect2.width(), rect2.height(), cVar.b, cVar.i, true, this.K);
        }
        if (this.g != 0) {
            d.e(beginRecording2, rect2.width(), rect2.height(), cVar.b, cVar.j, false, this.L);
        }
        this.H.endRecording();
    }
}
