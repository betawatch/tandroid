package ei;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import android.widget.FrameLayout;
import c3.i0;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class e {
    public static final ColorMatrixColorFilter v = new ColorMatrixColorFilter(new ColorMatrix());
    public int b;
    public ug.a c;
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
    public final RenderNode e = w.c();
    public final d f = new d(this, 1);
    public final d g = new d(this, 2);
    public final d h = new d(this, 3);
    public final d i = new d(this, 4);
    public int m = 1;
    public int n = 1;
    public int o = 1;

    public static void a(e eVar, Canvas canvas, int i10, float f7, float f10, float f11, float f12) {
        for (int i11 = 0; i11 < eVar.b; i11++) {
            c cVar = (c) eVar.a.get(i11);
            if (cVar.a.intersects(f7, f10, f11, f12)) {
                RectF rectF = i0.b(i10) ? cVar.d : cVar.c;
                int i12 = i0.b(i10) ? cVar.p : cVar.o;
                RenderNode a2 = cVar.a(i10);
                canvas.save();
                canvas.clipRect(cVar.a);
                canvas.translate(rectF.left, rectF.top);
                float f13 = i12;
                canvas.scale(f13, f13);
                canvas.drawRenderNode(a2);
                canvas.restore();
            }
        }
    }

    public static void b(e eVar, int i10, Canvas canvas, RectF rectF, int i11, float f7, float f10) {
        for (int i12 = 0; i12 < eVar.b; i12++) {
            c cVar = (c) eVar.a.get(i12);
            if (RectF.intersects(cVar.a, rectF)) {
                RectF rectF2 = i0.b(i10) ? cVar.d : cVar.c;
                int i13 = i0.b(i10) ? cVar.p : cVar.o;
                canvas.save();
                float f11 = i11;
                canvas.translate((rectF2.left - f7) / f11, (rectF2.top - f10) / f11);
                if (i13 != i11) {
                    float f12 = i13 / f11;
                    canvas.scale(f12, f12);
                }
                canvas.drawRenderNode(cVar.a(i10));
                canvas.restore();
            }
        }
    }

    public static int c(int i10, int i11) {
        int i12 = i10 % i11;
        return i12 > i11 / 2 ? i12 - i11 : i12 < (-i11) / 2 ? i12 + i11 : i12;
    }

    public final d d(int i10) {
        int c10 = m1.j.c(i10);
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
            throw new IllegalArgumentException("Unknown source index: ".concat(i0.F(i10)));
        }
        this.j = true;
        return this.i;
    }

    public final void e() {
        int i10;
        int ceil;
        c cVar;
        int i11 = 0;
        while (true) {
            int i12 = this.b;
            ArrayList arrayList = this.a;
            if (i11 >= i12) {
                this.e.setPosition(0, 0, this.d.getWidth(), this.d.getHeight());
                RecordingCanvas beginRecording = this.e.beginRecording();
                for (int i13 = 0; i13 < this.b; i13++) {
                    c cVar2 = (c) arrayList.get(i13);
                    beginRecording.save();
                    RectF rectF = cVar2.a;
                    RectF rectF2 = cVar2.c;
                    beginRecording.clipRect(rectF);
                    beginRecording.translate(rectF2.left, rectF2.top);
                    float f7 = cVar2.o;
                    beginRecording.scale(f7, f7);
                    beginRecording.drawRenderNode(cVar2.e);
                    beginRecording.restore();
                    beginRecording.drawRect(cVar2.a, t6.Gm);
                    beginRecording.drawRect(rectF2, t6.Fm);
                }
                this.e.endRecording();
                return;
            }
            c cVar3 = (c) arrayList.get(i11);
            ug.a aVar = this.c;
            boolean z10 = this.j;
            int width = this.d.getWidth();
            int height = this.d.getHeight();
            RectF rectF3 = cVar3.c;
            RectF rectF4 = cVar3.d;
            float f10 = cVar3.s;
            int i14 = cVar3.o;
            if (f10 <= 0.0f) {
                i10 = i11;
                ceil = 0;
            } else {
                i10 = i11;
                ceil = ((int) Math.ceil(i0.C(f10, 0.57735f, 0.5f, 3.0f))) * i14;
            }
            int ceil2 = (cVar3.q / 2) + (cVar3.t <= 0.0f ? 0 : ((int) Math.ceil(i0.C(r2, 0.57735f, 0.5f, 3.0f))) * cVar3.p) + ceil + 1;
            RectF rectF5 = cVar3.r;
            rectF5.set(cVar3.a);
            float f11 = -ceil2;
            rectF5.inset(f11, f11);
            Rect rect = cVar3.b;
            int i15 = cVar3.q;
            if (i15 <= 0) {
                throw new IllegalArgumentException("n must be positive");
            }
            float f12 = i15;
            rect.left = ((int) Math.floor(rectF5.left / f12)) * i15;
            rect.top = ((int) Math.floor(rectF5.top / f12)) * i15;
            rect.right = ((int) Math.ceil(rectF5.right / f12)) * i15;
            rect.bottom = ((int) Math.ceil(rectF5.bottom / f12)) * i15;
            rectF3.set(rect);
            rectF3.offset(cVar3.u, cVar3.v);
            rectF4.set(rect);
            rectF4.offset(cVar3.w, cVar3.x);
            int i16 = cVar3.p;
            float f13 = rectF4.left;
            if (f13 < 0.0f) {
                cVar = cVar3;
                rectF4.left = (((float) Math.ceil((-f13) / r13)) * i16) + f13;
            } else {
                cVar = cVar3;
            }
            float f14 = rectF4.top;
            if (f14 < 0.0f) {
                rectF4.top = (((float) Math.ceil((-f14) / r11)) * i16) + f14;
            }
            if (width > 0) {
                float f15 = rectF4.right;
                if (f15 > width) {
                    rectF4.right = f15 - (((float) Math.ceil((f15 - r3) / r6)) * i16);
                }
            }
            if (height > 0) {
                float f16 = rectF4.bottom;
                if (f16 > height) {
                    rectF4.bottom = f16 - (((float) Math.ceil((f16 - r3) / r6)) * i16);
                }
            }
            cVar.k = rect.width() / cVar.o;
            cVar.l = rect.height() / cVar.o;
            cVar.m = Math.max(1, Math.round(rectF4.width() / cVar.p));
            cVar.n = Math.max(1, Math.round(rectF4.height() / cVar.p));
            cVar.e.setPosition(0, 0, cVar.k, cVar.l);
            RecordingCanvas beginRecording2 = cVar.e.beginRecording();
            beginRecording2.save();
            float f17 = 1.0f / cVar.o;
            beginRecording2.scale(f17, f17, 0.0f, 0.0f);
            beginRecording2.translate(-rectF3.left, -rectF3.top);
            aVar.d(beginRecording2, rectF3);
            beginRecording2.restore();
            cVar.e.endRecording();
            cVar.f.setPosition(0, 0, cVar.k, cVar.l);
            cVar.f.beginRecording().drawRenderNode(cVar.e);
            cVar.f.endRecording();
            cVar.g.setPosition(0, 0, cVar.m, cVar.n);
            RecordingCanvas beginRecording3 = cVar.g.beginRecording();
            float f18 = rectF3.left - rectF4.left;
            float f19 = cVar.p;
            beginRecording3.translate(f18 / f19, (rectF3.top - rectF4.top) / f19);
            int i17 = cVar.o;
            int i18 = cVar.p;
            if (i17 != i18) {
                float f20 = i17 / i18;
                beginRecording3.scale(f20, f20);
            }
            beginRecording3.drawRenderNode(cVar.f);
            cVar.g.endRecording();
            if (z10) {
                cVar.h.setPosition(0, 0, cVar.k, cVar.l);
                cVar.h.beginRecording().drawRenderNode(cVar.e);
                cVar.h.endRecording();
                cVar.i.setPosition(0, 0, cVar.m, cVar.n);
                RecordingCanvas beginRecording4 = cVar.i.beginRecording();
                float f21 = rectF3.left - rectF4.left;
                float f22 = cVar.p;
                beginRecording4.translate(f21 / f22, (rectF3.top - rectF4.top) / f22);
                int i19 = cVar.o;
                int i20 = cVar.p;
                if (i19 != i20) {
                    float f23 = i19 / i20;
                    beginRecording4.scale(f23, f23);
                }
                beginRecording4.drawRenderNode(cVar.h);
                cVar.i.endRecording();
            }
            i11 = i10 + 1;
        }
    }

    public final void f() {
        this.p = -c(this.t, this.m);
        this.q = -c(this.u, this.m);
        this.r = -c(this.t, this.n);
        this.s = -c(this.u, this.n);
        for (int i10 = 0; i10 < this.b; i10++) {
            c cVar = (c) this.a.get(i10);
            int i11 = this.p;
            int i12 = this.q;
            int i13 = this.r;
            int i14 = this.s;
            cVar.u = i11;
            cVar.v = i12;
            cVar.w = i13;
            cVar.x = i14;
        }
    }
}
