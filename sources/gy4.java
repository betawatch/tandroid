// default package

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class gy4 {
    public static final ColorMatrixColorFilter v = new ColorMatrixColorFilter(new ColorMatrix());
    public int b;
    public vi5 c;
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
    public final RenderNode e = ul1.m();
    public final fy4 f = new fy4(this, 1);
    public final fy4 g = new fy4(this, 2);
    public final fy4 h = new fy4(this, 3);
    public final fy4 i = new fy4(this, 4);
    public byte m = 1;
    public byte n = 1;
    public int o = 1;

    public static int a(int i, int i2) {
        int i3 = i % i2;
        return i3 > i2 / 2 ? i3 - i2 : i3 < (-i2) / 2 ? i3 + i2 : i3;
    }

    public final void b(int i, Canvas canvas, RectF rectF, int i2, float f, float f2) {
        for (int i3 = 0; i3 < this.b; i3++) {
            ey4 ey4Var = (ey4) this.a.get(i3);
            if (RectF.intersects(ey4Var.a, rectF)) {
                RectF rectF2 = td4.c(i) ? ey4Var.d : ey4Var.c;
                byte b = td4.c(i) ? ey4Var.p : ey4Var.o;
                canvas.save();
                float f3 = i2 << 1;
                RectF rectF3 = ey4Var.a;
                float f4 = i2;
                canvas.clipRect(((rectF3.left - f3) - f) / f4, ((rectF3.top - f3) - f2) / f4, ((rectF3.right + f3) - f) / f4, ((rectF3.bottom + f3) - f2) / f4);
                canvas.translate((rectF2.left - f) / f4, (rectF2.top - f2) / f4);
                if (b != i2) {
                    float f5 = b / f4;
                    canvas.scale(f5, f5);
                }
                canvas.drawRenderNode(ey4Var.a(i));
                canvas.restore();
            }
        }
    }

    public final void c(Canvas canvas, int i, float f, float f2, float f3, float f4) {
        for (int i2 = 0; i2 < this.b; i2++) {
            ey4 ey4Var = (ey4) this.a.get(i2);
            if (ey4Var.a.intersects(f, f2, f3, f4)) {
                RectF rectF = td4.c(i) ? ey4Var.d : ey4Var.c;
                byte b = td4.c(i) ? ey4Var.p : ey4Var.o;
                RenderNode a = ey4Var.a(i);
                canvas.save();
                canvas.clipRect(ey4Var.a);
                canvas.translate(rectF.left, rectF.top);
                float f5 = b;
                canvas.scale(f5, f5);
                canvas.drawRenderNode(a);
                canvas.restore();
            }
        }
    }

    public final fy4 d(int i) {
        int F = wi8.F(i);
        if (F == 0) {
            return this.f;
        }
        if (F == 1) {
            return this.g;
        }
        if (F == 2) {
            return this.h;
        }
        if (F == 3) {
            this.j = true;
            return this.i;
        }
        u36.j("Unknown source index: ".concat(td4.B(i)));
        return null;
    }

    public final void e() {
        int i;
        int ceil;
        ey4 ey4Var;
        int i2 = 0;
        while (true) {
            int i3 = this.b;
            ArrayList arrayList = this.a;
            if (i2 >= i3) {
                this.e.setPosition(0, 0, this.d.getWidth(), this.d.getHeight());
                RecordingCanvas beginRecording = this.e.beginRecording();
                for (int i4 = 0; i4 < this.b; i4++) {
                    ey4 ey4Var2 = (ey4) arrayList.get(i4);
                    beginRecording.save();
                    RectF rectF = ey4Var2.a;
                    RectF rectF2 = ey4Var2.c;
                    beginRecording.clipRect(rectF);
                    beginRecording.translate(rectF2.left, rectF2.top);
                    float f = ey4Var2.o;
                    beginRecording.scale(f, f);
                    beginRecording.drawRenderNode(ey4Var2.e);
                    beginRecording.restore();
                    beginRecording.drawRect(ey4Var2.a, cmb.Im);
                    beginRecording.drawRect(rectF2, cmb.Hm);
                }
                this.e.endRecording();
                return;
            }
            ey4 ey4Var3 = (ey4) arrayList.get(i2);
            vi5 vi5Var = this.c;
            boolean z = this.j;
            int width = this.d.getWidth();
            int height = this.d.getHeight();
            RectF rectF3 = ey4Var3.c;
            RectF rectF4 = ey4Var3.d;
            float f2 = ey4Var3.s;
            byte b = ey4Var3.o;
            if (f2 <= 0.0f) {
                i = i2;
                ceil = 0;
            } else {
                i = i2;
                ceil = ((int) Math.ceil(mlb.A(f2, 0.57735f, 0.5f, 3.0f))) * b;
            }
            int ceil2 = (ey4Var3.q / 2) + (ey4Var3.t <= 0.0f ? 0 : ((int) Math.ceil(mlb.A(r2, 0.57735f, 0.5f, 3.0f))) * ey4Var3.p) + ceil + 1;
            RectF rectF5 = ey4Var3.r;
            rectF5.set(ey4Var3.a);
            float f3 = -ceil2;
            rectF5.inset(f3, f3);
            Rect rect = ey4Var3.b;
            int i5 = ey4Var3.q;
            if (i5 <= 0) {
                u36.j("n must be positive");
                return;
            }
            float f4 = i5;
            rect.left = ((int) Math.floor(rectF5.left / f4)) * i5;
            rect.top = ((int) Math.floor(rectF5.top / f4)) * i5;
            rect.right = ((int) Math.ceil(rectF5.right / f4)) * i5;
            rect.bottom = ((int) Math.ceil(rectF5.bottom / f4)) * i5;
            rectF3.set(rect);
            rectF3.offset(ey4Var3.u, ey4Var3.v);
            rectF4.set(rect);
            rectF4.offset(ey4Var3.w, ey4Var3.x);
            byte b2 = ey4Var3.p;
            float f5 = rectF4.left;
            if (f5 < 0.0f) {
                ey4Var = ey4Var3;
                rectF4.left = (((float) Math.ceil((-f5) / r13)) * b2) + f5;
            } else {
                ey4Var = ey4Var3;
            }
            float f6 = rectF4.top;
            if (f6 < 0.0f) {
                rectF4.top = (((float) Math.ceil((-f6) / r11)) * b2) + f6;
            }
            if (width > 0) {
                float f7 = rectF4.right;
                if (f7 > width) {
                    rectF4.right = f7 - (((float) Math.ceil((f7 - r3) / r6)) * b2);
                }
            }
            if (height > 0) {
                float f8 = rectF4.bottom;
                if (f8 > height) {
                    rectF4.bottom = f8 - (((float) Math.ceil((f8 - r3) / r6)) * b2);
                }
            }
            ey4Var.k = rect.width() / ey4Var.o;
            ey4Var.l = rect.height() / ey4Var.o;
            ey4Var.m = Math.max(1, Math.round(rectF4.width() / ey4Var.p));
            ey4Var.n = Math.max(1, Math.round(rectF4.height() / ey4Var.p));
            ey4Var.e.setPosition(0, 0, ey4Var.k, ey4Var.l);
            RecordingCanvas beginRecording2 = ey4Var.e.beginRecording();
            beginRecording2.save();
            float f9 = 1.0f / ey4Var.o;
            beginRecording2.scale(f9, f9, 0.0f, 0.0f);
            beginRecording2.translate(-rectF3.left, -rectF3.top);
            vi5Var.g(beginRecording2, rectF3);
            beginRecording2.restore();
            ey4Var.e.endRecording();
            ey4Var.f.setPosition(0, 0, ey4Var.k, ey4Var.l);
            ey4Var.f.beginRecording().drawRenderNode(ey4Var.e);
            ey4Var.f.endRecording();
            ey4Var.g.setPosition(0, 0, ey4Var.m, ey4Var.n);
            RecordingCanvas beginRecording3 = ey4Var.g.beginRecording();
            float f10 = rectF3.left - rectF4.left;
            float f11 = ey4Var.p;
            beginRecording3.translate(f10 / f11, (rectF3.top - rectF4.top) / f11);
            byte b3 = ey4Var.o;
            byte b4 = ey4Var.p;
            if (b3 != b4) {
                float f12 = b3 / b4;
                beginRecording3.scale(f12, f12);
            }
            beginRecording3.drawRenderNode(ey4Var.f);
            ey4Var.g.endRecording();
            if (z) {
                ey4Var.h.setPosition(0, 0, ey4Var.k, ey4Var.l);
                ey4Var.h.beginRecording().drawRenderNode(ey4Var.e);
                ey4Var.h.endRecording();
                ey4Var.i.setPosition(0, 0, ey4Var.m, ey4Var.n);
                RecordingCanvas beginRecording4 = ey4Var.i.beginRecording();
                float f13 = rectF3.left - rectF4.left;
                float f14 = ey4Var.p;
                beginRecording4.translate(f13 / f14, (rectF3.top - rectF4.top) / f14);
                byte b5 = ey4Var.o;
                byte b6 = ey4Var.p;
                if (b5 != b6) {
                    float f15 = b5 / b6;
                    beginRecording4.scale(f15, f15);
                }
                beginRecording4.drawRenderNode(ey4Var.h);
                ey4Var.i.endRecording();
            }
            i2 = i + 1;
        }
    }

    public final void f() {
        this.p = -a(this.t, this.m);
        this.q = -a(this.u, this.m);
        this.r = -a(this.t, this.n);
        this.s = -a(this.u, this.n);
        for (int i = 0; i < this.b; i++) {
            ey4 ey4Var = (ey4) this.a.get(i);
            int i2 = this.p;
            int i3 = this.q;
            int i4 = this.r;
            int i5 = this.s;
            ey4Var.u = i2;
            ey4Var.v = i3;
            ey4Var.w = i4;
            ey4Var.x = i5;
        }
    }
}
