package li;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.widget.FrameLayout;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class d {
    public int b;
    public bh.a c;
    public FrameLayout d;
    public boolean i;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public final ArrayList a = new ArrayList();
    public final RenderNode e = ah.f.m();
    public final c f = new c(this, 1);
    public final c g = new c(this, 2);
    public final c h = new c(this, 3);
    public int j = 1;
    public int k = 1;
    public int l = 1;

    public static void a(d dVar, Canvas canvas, int i10, float f7, float f10, float f11, float f12) {
        for (int i11 = 0; i11 < dVar.b; i11++) {
            b bVar = (b) dVar.a.get(i11);
            if (bVar.a.intersects(f7, f10, f11, f12)) {
                RectF rectF = i10 == 3 ? bVar.d : bVar.c;
                int i12 = i10 == 3 ? bVar.m : bVar.l;
                RenderNode a2 = bVar.a(i10);
                canvas.save();
                canvas.clipRect(bVar.a);
                canvas.translate(rectF.left, rectF.top);
                float f13 = i12;
                canvas.scale(f13, f13);
                canvas.drawRenderNode(a2);
                canvas.restore();
            }
        }
    }

    public static void b(d dVar, int i10, Canvas canvas, RectF rectF, int i11, float f7, float f10) {
        for (int i12 = 0; i12 < dVar.b; i12++) {
            b bVar = (b) dVar.a.get(i12);
            if (RectF.intersects(bVar.a, rectF)) {
                RectF rectF2 = i10 == 3 ? bVar.d : bVar.c;
                int i13 = i10 == 3 ? bVar.m : bVar.l;
                canvas.save();
                float f11 = i11;
                canvas.translate((rectF2.left - f7) / f11, (rectF2.top - f10) / f11);
                if (i13 != i11) {
                    float f12 = i13 / f11;
                    canvas.scale(f12, f12);
                }
                canvas.drawRenderNode(bVar.a(i10));
                canvas.restore();
            }
        }
    }

    public static int c(int i10, int i11) {
        int i12 = i10 % i11;
        return i12 > i11 / 2 ? i12 - i11 : i12 < (-i11) / 2 ? i12 + i11 : i12;
    }

    public final c d(int i10) {
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
        throw new IllegalArgumentException("Unknown source index: ".concat(hg.c.D(i10)));
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            int i11 = this.b;
            ArrayList arrayList = this.a;
            if (i10 >= i11) {
                this.e.setPosition(0, 0, this.d.getWidth(), this.d.getHeight());
                RecordingCanvas beginRecording = this.e.beginRecording();
                for (int i12 = 0; i12 < this.b; i12++) {
                    b bVar = (b) arrayList.get(i12);
                    beginRecording.save();
                    RectF rectF = bVar.a;
                    RectF rectF2 = bVar.c;
                    beginRecording.clipRect(rectF);
                    beginRecording.translate(rectF2.left, rectF2.top);
                    float f7 = bVar.l;
                    beginRecording.scale(f7, f7);
                    beginRecording.drawRenderNode(bVar.e);
                    beginRecording.restore();
                    beginRecording.drawRect(bVar.a, i6.Nl);
                    beginRecording.drawRect(rectF2, i6.Ml);
                }
                this.e.endRecording();
                return;
            }
            b bVar2 = (b) arrayList.get(i10);
            bh.a aVar = this.c;
            RectF rectF3 = bVar2.d;
            RectF rectF4 = bVar2.c;
            int ceil = (bVar2.n / 2) + (bVar2.q <= 0.0f ? 0 : ((int) Math.ceil(e2.B(r7, 0.57735f, 0.5f, 3.0f))) * bVar2.m) + (bVar2.p <= 0.0f ? 0 : ((int) Math.ceil(e2.B(r6, 0.57735f, 0.5f, 3.0f))) * bVar2.l) + 1;
            RectF rectF5 = bVar2.o;
            rectF5.set(bVar2.a);
            float f10 = -ceil;
            rectF5.inset(f10, f10);
            Rect rect = bVar2.b;
            int i13 = bVar2.n;
            if (i13 <= 0) {
                throw new IllegalArgumentException("n must be positive");
            }
            float f11 = i13;
            rect.left = ((int) Math.floor(rectF5.left / f11)) * i13;
            rect.top = ((int) Math.floor(rectF5.top / f11)) * i13;
            rect.right = ((int) Math.ceil(rectF5.right / f11)) * i13;
            rect.bottom = ((int) Math.ceil(rectF5.bottom / f11)) * i13;
            rectF4.set(rect);
            rectF4.offset(bVar2.r, bVar2.s);
            rectF3.set(rect);
            rectF3.offset(bVar2.t, bVar2.u);
            bVar2.h = rect.width() / bVar2.l;
            bVar2.i = rect.height() / bVar2.l;
            bVar2.j = rect.width() / bVar2.m;
            bVar2.k = rect.height() / bVar2.m;
            bVar2.e.setPosition(0, 0, bVar2.h, bVar2.i);
            RecordingCanvas beginRecording2 = bVar2.e.beginRecording();
            beginRecording2.save();
            float f12 = 1.0f / bVar2.l;
            beginRecording2.scale(f12, f12, 0.0f, 0.0f);
            beginRecording2.translate(-rectF4.left, -rectF4.top);
            aVar.f(beginRecording2, rectF4);
            beginRecording2.restore();
            bVar2.e.endRecording();
            bVar2.f.setPosition(0, 0, bVar2.h, bVar2.i);
            bVar2.f.beginRecording().drawRenderNode(bVar2.e);
            bVar2.f.endRecording();
            bVar2.g.setPosition(0, 0, bVar2.j, bVar2.k);
            RecordingCanvas beginRecording3 = bVar2.g.beginRecording();
            float f13 = rectF4.left - rectF3.left;
            float f14 = bVar2.m;
            beginRecording3.translate(f13 / f14, (rectF4.top - rectF3.top) / f14);
            int i14 = bVar2.l;
            int i15 = bVar2.m;
            if (i14 != i15) {
                float f15 = i14 / i15;
                beginRecording3.scale(f15, f15);
            }
            beginRecording3.drawRenderNode(bVar2.f);
            bVar2.g.endRecording();
            i10++;
        }
    }

    public final void f() {
        this.m = -c(this.q, this.j);
        this.n = -c(this.r, this.j);
        this.o = -c(this.q, this.k);
        this.p = -c(this.r, this.k);
        for (int i10 = 0; i10 < this.b; i10++) {
            b bVar = (b) this.a.get(i10);
            int i11 = this.m;
            int i12 = this.n;
            int i13 = this.o;
            int i14 = this.p;
            bVar.r = i11;
            bVar.s = i12;
            bVar.t = i13;
            bVar.u = i14;
        }
    }
}
