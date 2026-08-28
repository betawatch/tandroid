package kg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e extends d {
    public final ng.a E;
    public final Outline F = new Outline();
    public final Rect G = new Rect();
    public final RenderNode H;
    public final RenderNode I;
    public final Paint J;
    public final Paint K;
    public final Paint L;
    public boolean M;
    public ig.f N;

    public e(ng.a aVar) {
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
        ng.a aVar = this.E;
        if (!isHardwareAccelerated) {
            c(canvas, aVar);
            return;
        }
        if (!this.H.hasDisplayList()) {
            aVar.t();
            w();
        } else if (this.M) {
            w();
        }
        this.M = false;
        int l1 = f6.l1(this.H.getAlpha() * this.n, this.d);
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

    @Override // kg.d
    public final ng.a i() {
        return this.E;
    }

    @Override // kg.d
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

    @Override // kg.d
    public final void k() {
        b();
        this.M = true;
    }

    @Override // kg.d
    public final void l() {
        this.E.t();
    }

    @Override // kg.d
    public final d m() {
        this.H.setClipToOutline(false);
        return this;
    }

    @Override // kg.d, android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        int i10 = this.j;
        this.j = i9;
        this.H.setAlpha(i9 / 255.0f);
        this.M = true;
        if (i10 != 0 || i9 <= 0) {
            return;
        }
        this.E.t();
    }

    @Override // kg.d
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
            int i9 = cVar.f;
            if (i9 <= 0) {
                i9 = AndroidUtilities.dp(11.0f);
            }
            int max = Math.max(Math.min(i9, Math.min(rect2.width(), rect2.height()) / 5), 1);
            ig.f fVar = this.N;
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
