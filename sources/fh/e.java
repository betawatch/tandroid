package fh;

import a8.ca;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e extends ca {
    public final float a = g0.N(0.55f);
    public final Outline b = new Outline();
    public final Rect c = new Rect();
    public final RenderNode d;
    public final RenderNode e;
    public final Paint f;
    public dh.h g;
    public boolean h;
    public boolean i;
    public final RectF j;
    public final /* synthetic */ g k;

    public e(g gVar) {
        this.k = gVar;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.d = renderNode;
        this.e = new RenderNode("BlurredFill");
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = true;
        this.i = true;
        this.j = new RectF();
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        paint.setColor(0);
    }

    @Override // a8.ca
    public final void a() {
        this.d.discardDisplayList();
        this.e.discardDisplayList();
        this.h = true;
    }

    @Override // a8.ca
    public final void b(Canvas canvas, ui.a aVar) {
        g gVar = this.k;
        f fVar = gVar.R;
        if (!this.d.hasDisplayList() || this.h) {
            e();
        }
        int r12 = j6.r1(this.d.getAlpha() * gVar.W, gVar.x);
        int alpha = Color.alpha(r12);
        Paint paint = this.f;
        if (alpha != 0) {
            paint.setShadowLayer(gVar.U, 0.0f, gVar.V, r12);
            fVar.d(canvas, paint, gVar.T);
        }
        int r13 = j6.r1(this.d.getAlpha() * gVar.W, gVar.G);
        if (Color.alpha(r13) != 0) {
            paint.setShadowLayer(this.a, 0.0f, 0.0f, r13);
            fVar.d(canvas, paint, gVar.T);
        }
        Rect rect = fVar.m;
        canvas.save();
        if (fVar.e()) {
            canvas.clipPath(fVar.k);
        }
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.d);
        canvas.restore();
    }

    public final boolean c() {
        return this.d.hasDisplayList();
    }

    public final void d() {
        f fVar = this.k.R;
        Rect rect = fVar.m;
        int width = rect.width();
        int height = rect.height();
        Rect rect2 = this.c;
        boolean z10 = false;
        rect2.set(0, 0, width, height);
        float[] fArr = fVar.b;
        Outline outline = this.b;
        g.l(outline, rect2, fArr);
        outline.setAlpha(1.0f);
        if (rect.isEmpty()) {
            return;
        }
        this.e.setPosition(0, 0, rect.width(), rect.height());
        this.d.setPosition(0, 0, rect.width(), rect.height());
        this.d.setOutline(outline);
        RenderNode renderNode = this.d;
        if (this.i && !fVar.e()) {
            z10 = true;
        }
        renderNode.setClipToOutline(z10);
        this.h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        int i7;
        g gVar;
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        g gVar2;
        int i11;
        float f14;
        this.h = false;
        g gVar3 = this.k;
        f fVar = gVar3.R;
        Rect rect = fVar.m;
        float f15 = rect.left;
        float f16 = gVar3.d;
        float f17 = f15 + f16;
        float f18 = rect.top;
        float f19 = gVar3.e;
        float f20 = f18 + f19;
        float f21 = rect.right + f16;
        float f22 = rect.bottom + f19;
        if (this.g != null && Build.VERSION.SDK_INT >= 33) {
            ui.a aVar = gVar3.r;
            if (aVar instanceof si.a) {
                si.a aVar2 = (si.a) aVar;
                if (aVar2.g()) {
                    i7 = Math.max(aVar2.e(), 1);
                    if (i7 <= 1) {
                        si.a aVar3 = (si.a) gVar3.r;
                        float f23 = i7;
                        float l10 = si.f.l(f17, aVar3.f(), i7) - f23;
                        f11 = si.f.l(f20, aVar3.a(), i7) - f23;
                        i10 = 1;
                        gVar = gVar3;
                        this.e.setPosition(0, 0, ((int) Math.ceil((f21 - l10) / f23)) + 1, ((int) Math.ceil((f22 - f11) / f23)) + 1);
                        f10 = l10;
                    } else {
                        gVar = gVar3;
                        i10 = 1;
                        this.e.setPosition(0, 0, rect.width(), rect.height());
                        f10 = f17;
                        f11 = f20;
                    }
                    this.e.setPivotX(0.0f);
                    this.e.setPivotY(0.0f);
                    float f24 = i7;
                    this.e.setScaleX(f24);
                    this.e.setScaleY(f24);
                    float f25 = f10 - f17;
                    this.e.setTranslationX(f25);
                    float f26 = f11 - f20;
                    this.e.setTranslationY(f26);
                    if (this.g != null || Build.VERSION.SDK_INT < 33) {
                        f12 = f10;
                        f13 = f11;
                        gVar2 = gVar;
                    } else {
                        RectF rectF = fVar.s;
                        int i12 = fVar.f;
                        if (i12 <= 0) {
                            i12 = g0.L(11.0f);
                        }
                        int max = Math.max(Math.min(i12, (int) (Math.min(rectF.width(), rectF.height()) / 5.0f)), i10);
                        if (fVar.e()) {
                            float f27 = fVar.u;
                            f12 = f10;
                            f13 = f11;
                            float max2 = Math.max(f27, Math.min(max + f27 + 1.0f, Math.min(fVar.v, fVar.w)));
                            dh.h hVar = this.g;
                            RectF rectF2 = fVar.s;
                            int i13 = fVar.n;
                            float centerX = (i13 != 0 ? i13 != 1 ? i13 != 2 ? rectF2.right - fVar.t : rectF2.right : rectF2.left + fVar.t : rectF2.left) - rectF.centerX();
                            RectF rectF3 = fVar.s;
                            int i14 = fVar.n;
                            float centerY = (i14 != 1 ? i14 != 2 ? i14 != 3 ? rectF3.bottom - fVar.t : rectF3.bottom : rectF3.top + fVar.t : rectF3.top) - rectF.centerY();
                            int i15 = fVar.n;
                            if (i15 == 0) {
                                f14 = -1.0f;
                            } else if (i15 == 2) {
                                f14 = 1.0f;
                            } else {
                                i11 = 1;
                                f14 = 0.0f;
                                float f28 = i15 != i11 ? -1.0f : i15 == 3 ? 1.0f : 0.0f;
                                float f29 = fVar.p;
                                hVar.a(centerX, centerY, f14, f28, f29, Math.min(fVar.q, f29), fVar.r, max2);
                            }
                            i11 = 1;
                            if (i15 != i11) {
                            }
                            float f292 = fVar.p;
                            hVar.a(centerX, centerY, f14, f28, f292, Math.min(fVar.q, f292), fVar.r, max2);
                        } else {
                            f12 = f10;
                            f13 = f11;
                            this.g.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        dh.h hVar2 = this.g;
                        float width = rectF.width();
                        float height = rectF.height();
                        float f30 = rectF.left - rect.left;
                        float f31 = rectF.top - rect.top;
                        float[] fArr = fVar.c;
                        gVar2 = gVar;
                        int i16 = i7;
                        hVar2.b(width, height, f30, f31, fArr[0], fArr[2], fArr[4], fArr[6], max, fVar.g, fVar.h, gVar2.y, f25, f26, i16);
                        i7 = i16;
                    }
                    RecordingCanvas beginRecording = this.e.beginRecording();
                    if (i7 <= 1) {
                        RectF rectF4 = this.j;
                        rectF4.set(f17, f20, f21, f22);
                        ((si.a) gVar2.r).d(f12, f13, i7, beginRecording, rectF4);
                    } else {
                        beginRecording.save();
                        beginRecording.translate(-f17, -f20);
                        gVar2.r.b0(f17, f20, f21, f22, beginRecording);
                        beginRecording.restore();
                    }
                    this.e.endRecording();
                    RecordingCanvas beginRecording2 = this.d.beginRecording();
                    if (Color.alpha(gVar2.y) != 255) {
                        beginRecording2.drawColor(gVar2.y);
                    } else {
                        beginRecording2.drawRenderNode(this.e);
                        if (this.g == null && Color.alpha(gVar2.y) != 0) {
                            beginRecording2.drawColor(gVar2.y);
                        }
                    }
                    this.d.endRecording();
                }
            }
        }
        i7 = 1;
        if (i7 <= 1) {
        }
        this.e.setPivotX(0.0f);
        this.e.setPivotY(0.0f);
        float f242 = i7;
        this.e.setScaleX(f242);
        this.e.setScaleY(f242);
        float f252 = f10 - f17;
        this.e.setTranslationX(f252);
        float f262 = f11 - f20;
        this.e.setTranslationY(f262);
        if (this.g != null) {
        }
        f12 = f10;
        f13 = f11;
        gVar2 = gVar;
        RecordingCanvas beginRecording3 = this.e.beginRecording();
        if (i7 <= 1) {
        }
        this.e.endRecording();
        RecordingCanvas beginRecording22 = this.d.beginRecording();
        if (Color.alpha(gVar2.y) != 255) {
        }
        this.d.endRecording();
    }

    public final void f(float f10) {
        this.d.setAlpha(f10);
    }

    public final void g(boolean z10) {
        this.i = z10;
        this.d.setClipToOutline(z10 && !this.k.R.e());
    }

    public final void h(boolean z10) {
        if (z10 == (this.g != null) || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (z10) {
            this.g = new dh.h(this.e);
        } else {
            this.g = null;
            this.e.setRenderEffect(null);
        }
        this.h = true;
    }
}
