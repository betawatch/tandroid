package ch;

import ah.j;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class e extends d {
    public final fh.a H;
    public final Outline I = new Outline();
    public final Rect J = new Rect();
    public final RenderNode K;
    public final RenderNode L;
    public final Paint M;
    public final Paint N;
    public final Paint O;
    public boolean P;
    public j Q;

    public e(fh.a aVar) {
        Paint paint = new Paint(1);
        this.M = paint;
        Paint paint2 = new Paint(1);
        this.N = paint2;
        Paint paint3 = new Paint(1);
        this.O = paint3;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.K = renderNode;
        this.L = new RenderNode("BlurredFill");
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        this.H = aVar;
        paint.setColor(0);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint3.setStyle(style);
    }

    public final void D() {
        float f7 = this.c;
        float f10 = this.d;
        c cVar = this.l;
        Rect rect = cVar.m;
        Rect rect2 = cVar.m;
        float f11 = rect.left + f7;
        float f12 = rect.top + f10;
        float f13 = rect.right + f7;
        float f14 = rect.bottom + f10;
        RecordingCanvas beginRecording = this.L.beginRecording();
        beginRecording.save();
        beginRecording.translate(-f11, -f12);
        if (this.Q != null && Build.VERSION.SDK_INT >= 33) {
            int i10 = cVar.f;
            if (i10 <= 0) {
                i10 = AndroidUtilities.dp(11.0f);
            }
            int max = Math.max(Math.min(i10, Math.min(rect2.width(), rect2.height()) / 5), 1);
            j jVar = this.Q;
            float width = rect2.width();
            float height = rect2.height();
            float[] fArr = cVar.c;
            jVar.a(width, height, fArr[0], fArr[2], fArr[4], fArr[6], max, cVar.g, cVar.h, this.g);
        }
        this.H.y(beginRecording, f11, f12, f13, f14);
        beginRecording.save();
        this.L.endRecording();
        RecordingCanvas beginRecording2 = this.K.beginRecording();
        if (Color.alpha(this.g) == 255) {
            beginRecording2.drawColor(this.g);
        } else {
            beginRecording2.drawRenderNode(this.L);
            if (this.Q == null && Color.alpha(this.g) != 0) {
                beginRecording2.drawColor(this.g);
            }
        }
        if (this.h != 0) {
            d.p(beginRecording2, rect2.width(), rect2.height(), cVar.b, cVar.i, true, this.N);
        }
        if (this.i != 0) {
            d.p(beginRecording2, rect2.width(), rect2.height(), cVar.b, cVar.j, false, this.O);
        }
        this.K.endRecording();
    }

    @Override // ch.d, li.e
    public final void a() {
        D();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        c cVar = this.l;
        if (cVar.m.isEmpty()) {
            return;
        }
        boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
        fh.a aVar = this.H;
        if (!isHardwareAccelerated) {
            n(canvas, aVar);
            return;
        }
        if (!this.K.hasDisplayList()) {
            aVar.b();
            D();
        } else if (this.P) {
            D();
        }
        this.P = false;
        int l1 = i6.l1(this.K.getAlpha() * this.q, this.f);
        if (Color.alpha(l1) != 0) {
            float f7 = this.o;
            float f10 = this.p;
            Paint paint = this.M;
            paint.setShadowLayer(f7, 0.0f, f10, l1);
            cVar.c(canvas, paint, this.n);
        }
        canvas.save();
        Rect rect = cVar.m;
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.K);
        canvas.restore();
    }

    @Override // ch.d, li.e
    public final boolean e() {
        return this.K.hasDisplayList();
    }

    @Override // li.e
    public final void f(int i10, int i11) {
        this.K.setAlpha(i11 / 255.0f);
        this.P = true;
        if (i10 != 0 || i11 <= 0) {
            return;
        }
        this.H.b();
    }

    @Override // ch.d, li.e
    public final void h() {
        m();
        this.P = true;
    }

    @Override // ch.d, li.e
    public final void k() {
        super.k();
        this.M.setShadowLayer(this.o, 0.0f, this.p, this.f);
        this.N.setColor(this.h);
        this.O.setColor(this.i);
        this.P = true;
    }

    @Override // ch.d
    public final fh.a t() {
        return this.H;
    }

    @Override // ch.d
    public final void u() {
        m();
        c cVar = this.l;
        this.N.setStrokeWidth(cVar.i);
        this.O.setStrokeWidth(cVar.j);
        int width = cVar.m.width();
        int height = cVar.m.height();
        Rect rect = this.J;
        rect.set(0, 0, width, height);
        float[] fArr = cVar.b;
        Outline outline = this.I;
        d.s(outline, rect, fArr);
        outline.setAlpha(1.0f);
        if (cVar.m.isEmpty()) {
            return;
        }
        this.L.setPosition(0, 0, cVar.m.width(), cVar.m.height());
        this.K.setPosition(0, 0, cVar.m.width(), cVar.m.height());
        this.K.setOutline(outline);
        this.P = true;
    }

    @Override // ch.d
    public final void v() {
        this.H.b();
    }

    @Override // ch.d
    public final d w() {
        this.K.setClipToOutline(false);
        return this;
    }
}
