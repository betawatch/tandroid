package oi;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class d {
    public static final ColorMatrixColorFilter v = new ColorMatrixColorFilter(new ColorMatrix());
    public int b;
    public eh.a c;
    public FrameLayout d;
    public boolean j;
    public ColorMatrixColorFilter k;
    public boolean l;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public final ArrayList a = new ArrayList();
    public final RenderNode e = w.m();
    public final c f = new c(this, 1);
    public final c g = new c(this, 2);
    public final c h = new c(this, 3);
    public final c i = new c(this, 4);
    public int m = 1;
    public int n = 1;
    public int o = 1;

    public static void a(d dVar, Canvas canvas, int i7, float f10, float f11, float f12, float f13) {
        for (int i10 = 0; i10 < dVar.b; i10++) {
            b bVar = (b) dVar.a.get(i10);
            if (bVar.a.intersects(f10, f11, f12, f13)) {
                RectF rectF = jg.g.a(i7) ? bVar.d : bVar.c;
                int i11 = jg.g.a(i7) ? bVar.p : bVar.o;
                RenderNode a10 = bVar.a(i7);
                canvas.save();
                canvas.clipRect(bVar.a);
                canvas.translate(rectF.left, rectF.top);
                float f14 = i11;
                canvas.scale(f14, f14);
                canvas.drawRenderNode(a10);
                canvas.restore();
            }
        }
    }

    public static void b(d dVar, int i7, Canvas canvas, RectF rectF, int i10, float f10, float f11) {
        for (int i11 = 0; i11 < dVar.b; i11++) {
            b bVar = (b) dVar.a.get(i11);
            if (RectF.intersects(bVar.a, rectF)) {
                RectF rectF2 = jg.g.a(i7) ? bVar.d : bVar.c;
                int i12 = jg.g.a(i7) ? bVar.p : bVar.o;
                canvas.save();
                float f12 = i10 * 2;
                RectF rectF3 = bVar.a;
                float f13 = i10;
                canvas.clipRect(((rectF3.left - f12) - f10) / f13, ((rectF3.top - f12) - f11) / f13, ((rectF3.right + f12) - f10) / f13, ((rectF3.bottom + f12) - f11) / f13);
                canvas.translate((rectF2.left - f10) / f13, (rectF2.top - f11) / f13);
                if (i12 != i10) {
                    float f14 = i12 / f13;
                    canvas.scale(f14, f14);
                }
                canvas.drawRenderNode(bVar.a(i7));
                canvas.restore();
            }
        }
    }

    public static int c(int i7, int i10) {
        int i11 = i7 % i10;
        return i11 > i10 / 2 ? i11 - i10 : i11 < (-i10) / 2 ? i11 + i10 : i11;
    }

    public final c d(int i7) {
        int c10 = p1.g.c(i7);
        if (c10 == 0) {
            return this.f;
        }
        if (c10 == 1) {
            return this.g;
        }
        if (c10 == 2) {
            return this.h;
        }
        if (c10 != 3) {
            throw new IllegalArgumentException("Unknown source index: ".concat(jg.g.E(i7)));
        }
        this.j = true;
        return this.i;
    }

    public final void e() {
        int i7;
        int ceil;
        b bVar;
        int i10 = 0;
        while (true) {
            int i11 = this.b;
            ArrayList arrayList = this.a;
            if (i10 >= i11) {
                this.e.setPosition(0, 0, this.d.getWidth(), this.d.getHeight());
                RecordingCanvas beginRecording = this.e.beginRecording();
                for (int i12 = 0; i12 < this.b; i12++) {
                    b bVar2 = (b) arrayList.get(i12);
                    beginRecording.save();
                    RectF rectF = bVar2.a;
                    RectF rectF2 = bVar2.c;
                    beginRecording.clipRect(rectF);
                    beginRecording.translate(rectF2.left, rectF2.top);
                    float f10 = bVar2.o;
                    beginRecording.scale(f10, f10);
                    beginRecording.drawRenderNode(bVar2.e);
                    beginRecording.restore();
                    beginRecording.drawRect(bVar2.a, k6.Gm);
                    beginRecording.drawRect(rectF2, k6.Fm);
                }
                this.e.endRecording();
                return;
            }
            b bVar3 = (b) arrayList.get(i10);
            eh.a aVar = this.c;
            boolean z9 = this.j;
            int width = this.d.getWidth();
            int height = this.d.getHeight();
            RectF rectF3 = bVar3.c;
            RectF rectF4 = bVar3.d;
            float f11 = bVar3.s;
            int i13 = bVar3.o;
            if (f11 <= 0.0f) {
                i7 = i10;
                ceil = 0;
            } else {
                i7 = i10;
                ceil = ((int) Math.ceil(com.google.android.recaptcha.internal.a.B(f11, 0.57735f, 0.5f, 3.0f))) * i13;
            }
            int ceil2 = (bVar3.q / 2) + (bVar3.t <= 0.0f ? 0 : ((int) Math.ceil(com.google.android.recaptcha.internal.a.B(r2, 0.57735f, 0.5f, 3.0f))) * bVar3.p) + ceil + 1;
            RectF rectF5 = bVar3.r;
            rectF5.set(bVar3.a);
            float f12 = -ceil2;
            rectF5.inset(f12, f12);
            Rect rect = bVar3.b;
            int i14 = bVar3.q;
            if (i14 <= 0) {
                throw new IllegalArgumentException("n must be positive");
            }
            float f13 = i14;
            rect.left = ((int) Math.floor(rectF5.left / f13)) * i14;
            rect.top = ((int) Math.floor(rectF5.top / f13)) * i14;
            rect.right = ((int) Math.ceil(rectF5.right / f13)) * i14;
            rect.bottom = ((int) Math.ceil(rectF5.bottom / f13)) * i14;
            rectF3.set(rect);
            rectF3.offset(bVar3.u, bVar3.v);
            rectF4.set(rect);
            rectF4.offset(bVar3.w, bVar3.x);
            int i15 = bVar3.p;
            float f14 = rectF4.left;
            if (f14 < 0.0f) {
                bVar = bVar3;
                rectF4.left = (((float) Math.ceil((-f14) / r13)) * i15) + f14;
            } else {
                bVar = bVar3;
            }
            float f15 = rectF4.top;
            if (f15 < 0.0f) {
                rectF4.top = (((float) Math.ceil((-f15) / r11)) * i15) + f15;
            }
            if (width > 0) {
                float f16 = rectF4.right;
                if (f16 > width) {
                    rectF4.right = f16 - (((float) Math.ceil((f16 - r3) / r6)) * i15);
                }
            }
            if (height > 0) {
                float f17 = rectF4.bottom;
                if (f17 > height) {
                    rectF4.bottom = f17 - (((float) Math.ceil((f17 - r3) / r6)) * i15);
                }
            }
            bVar.k = rect.width() / bVar.o;
            bVar.l = rect.height() / bVar.o;
            bVar.m = Math.max(1, Math.round(rectF4.width() / bVar.p));
            bVar.n = Math.max(1, Math.round(rectF4.height() / bVar.p));
            bVar.e.setPosition(0, 0, bVar.k, bVar.l);
            RecordingCanvas beginRecording2 = bVar.e.beginRecording();
            beginRecording2.save();
            float f18 = 1.0f / bVar.o;
            beginRecording2.scale(f18, f18, 0.0f, 0.0f);
            beginRecording2.translate(-rectF3.left, -rectF3.top);
            aVar.d(beginRecording2, rectF3);
            beginRecording2.restore();
            bVar.e.endRecording();
            bVar.f.setPosition(0, 0, bVar.k, bVar.l);
            bVar.f.beginRecording().drawRenderNode(bVar.e);
            bVar.f.endRecording();
            bVar.g.setPosition(0, 0, bVar.m, bVar.n);
            RecordingCanvas beginRecording3 = bVar.g.beginRecording();
            float f19 = rectF3.left - rectF4.left;
            float f20 = bVar.p;
            beginRecording3.translate(f19 / f20, (rectF3.top - rectF4.top) / f20);
            int i16 = bVar.o;
            int i17 = bVar.p;
            if (i16 != i17) {
                float f21 = i16 / i17;
                beginRecording3.scale(f21, f21);
            }
            beginRecording3.drawRenderNode(bVar.f);
            bVar.g.endRecording();
            if (z9) {
                bVar.h.setPosition(0, 0, bVar.k, bVar.l);
                bVar.h.beginRecording().drawRenderNode(bVar.e);
                bVar.h.endRecording();
                bVar.i.setPosition(0, 0, bVar.m, bVar.n);
                RecordingCanvas beginRecording4 = bVar.i.beginRecording();
                float f22 = rectF3.left - rectF4.left;
                float f23 = bVar.p;
                beginRecording4.translate(f22 / f23, (rectF3.top - rectF4.top) / f23);
                int i18 = bVar.o;
                int i19 = bVar.p;
                if (i18 != i19) {
                    float f24 = i18 / i19;
                    beginRecording4.scale(f24, f24);
                }
                beginRecording4.drawRenderNode(bVar.h);
                bVar.i.endRecording();
            }
            i10 = i7 + 1;
        }
    }

    public final void f() {
        this.p = -c(this.t, this.m);
        this.q = -c(this.u, this.m);
        this.r = -c(this.t, this.n);
        this.s = -c(this.u, this.n);
        for (int i7 = 0; i7 < this.b; i7++) {
            b bVar = (b) this.a.get(i7);
            int i10 = this.p;
            int i11 = this.q;
            int i12 = this.r;
            int i13 = this.s;
            bVar.u = i10;
            bVar.v = i11;
            bVar.w = i12;
            bVar.x = i13;
        }
    }
}
