package dh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import bh.g;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class e extends d {
    public final gh.a X;
    public final Outline Y = new Outline();
    public final Rect Z = new Rect();
    public final RenderNode a0;
    public final RenderNode b0;
    public final Paint c0;
    public final Paint d0;
    public final Paint e0;
    public boolean f0;
    public g g0;

    public e(gh.a aVar) {
        Paint paint = new Paint(1);
        this.c0 = paint;
        Paint paint2 = new Paint(1);
        this.d0 = paint2;
        Paint paint3 = new Paint(1);
        this.e0 = paint3;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.a0 = renderNode;
        this.b0 = new RenderNode("BlurredFill");
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        this.X = aVar;
        paint.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint3.setStyle(style);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10 = r6.b;
        if (this.s != i10) {
            this.s = i10;
            try {
                updateColors();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        c cVar = this.v;
        if (cVar.m.isEmpty()) {
            return;
        }
        boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
        gh.a aVar = this.X;
        if (!isHardwareAccelerated) {
            c(canvas, aVar);
            return;
        }
        if (!this.a0.hasDisplayList()) {
            aVar.b();
            v();
        } else if (this.f0) {
            v();
        }
        this.f0 = false;
        int o12 = k6.o1(this.a0.getAlpha() * this.G, this.d);
        if (Color.alpha(o12) != 0) {
            float f7 = this.E;
            float f10 = this.F;
            Paint paint = this.c0;
            paint.setShadowLayer(f7, 0.0f, f10, o12);
            cVar.c(canvas, paint, this.y);
        }
        canvas.save();
        Rect rect = cVar.m;
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.a0);
        canvas.restore();
    }

    @Override // dh.d
    public final gh.a i() {
        return this.X;
    }

    @Override // dh.d
    public final boolean j() {
        return this.a0.hasDisplayList();
    }

    @Override // dh.d
    public final void k() {
        b();
        c cVar = this.v;
        this.d0.setStrokeWidth(cVar.i);
        this.e0.setStrokeWidth(cVar.j);
        int width = cVar.m.width();
        int height = cVar.m.height();
        Rect rect = this.Z;
        rect.set(0, 0, width, height);
        float[] fArr = cVar.b;
        Outline outline = this.Y;
        d.h(outline, rect, fArr);
        outline.setAlpha(1.0f);
        if (cVar.m.isEmpty()) {
            return;
        }
        this.b0.setPosition(0, 0, cVar.m.width(), cVar.m.height());
        this.a0.setPosition(0, 0, cVar.m.width(), cVar.m.height());
        this.a0.setOutline(outline);
        this.f0 = true;
    }

    @Override // dh.d
    public final void l() {
        b();
        this.f0 = true;
    }

    @Override // dh.d
    public final void m() {
        this.X.b();
    }

    @Override // dh.d
    public final d n() {
        this.a0.setClipToOutline(false);
        return this;
    }

    @Override // dh.d, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        int i11 = this.x;
        this.x = i10;
        this.a0.setAlpha(i10 / 255.0f);
        this.f0 = true;
        if (i11 != 0 || i10 <= 0) {
            return;
        }
        this.X.b();
    }

    @Override // dh.d, org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        super.updateColors();
        this.c0.setShadowLayer(this.E, 0.0f, this.F, this.d);
        this.d0.setColor(this.f);
        this.e0.setColor(this.h);
        this.f0 = true;
    }

    @Override // dh.d
    public final void v() {
        float f7 = this.a;
        float f10 = this.b;
        c cVar = this.v;
        Rect rect = cVar.m;
        Rect rect2 = cVar.m;
        float f11 = rect.left + f7;
        float f12 = rect.top + f10;
        float f13 = rect.right + f7;
        float f14 = rect.bottom + f10;
        RecordingCanvas beginRecording = this.b0.beginRecording();
        beginRecording.save();
        beginRecording.translate(-f11, -f12);
        if (this.g0 != null && Build.VERSION.SDK_INT >= 33) {
            int i10 = cVar.f;
            if (i10 <= 0) {
                i10 = AndroidUtilities.dp(11.0f);
            }
            int max = Math.max(Math.min(i10, Math.min(rect2.width(), rect2.height()) / 5), 1);
            g gVar = this.g0;
            float width = rect2.width();
            float height = rect2.height();
            float[] fArr = cVar.c;
            gVar.a(width, height, fArr[0], fArr[2], fArr[4], fArr[6], max, cVar.g, cVar.h, this.e);
        }
        this.X.y(beginRecording, f11, f12, f13, f14);
        beginRecording.save();
        this.b0.endRecording();
        RecordingCanvas beginRecording2 = this.a0.beginRecording();
        if (Color.alpha(this.e) == 255) {
            beginRecording2.drawColor(this.e);
        } else {
            beginRecording2.drawRenderNode(this.b0);
            if (this.g0 == null && Color.alpha(this.e) != 0) {
                beginRecording2.drawColor(this.e);
            }
        }
        if (this.f != 0) {
            d.e(beginRecording2, rect2.width(), rect2.height(), cVar.b, cVar.i, true, this.d0);
        }
        if (this.h != 0) {
            d.e(beginRecording2, rect2.width(), rect2.height(), cVar.b, cVar.j, false, this.e0);
        }
        this.a0.endRecording();
    }
}
