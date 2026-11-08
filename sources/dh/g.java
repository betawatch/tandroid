package dh;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import java.util.ArrayList;
import org.telegram.messenger.sc;
import org.telegram.messenger.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class g {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public boolean e;
    public final RenderNode[] f;
    public long g;
    public final RectF h = new RectF();
    public final a i = new a();
    public final ArrayList j = new ArrayList();
    public int k;
    public int l;
    public Rect m;

    public g(boolean z9) {
        boolean e10 = sc.e(262144);
        this.a = e10;
        this.c = true;
        this.d = (e10 || z9) ? 1 : 8;
        this.b = z9;
        this.f = new RenderNode[e10 ? 2 : 1];
        int i7 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.f;
            if (i7 >= renderNodeArr.length) {
                return;
            }
            renderNodeArr[i7] = w.c();
            i7++;
        }
    }

    public static float a(float f10, float f11) {
        float f12 = (f10 > 0.0f ? (f10 * 0.57735f) + 0.5f : 0.0f) / f11;
        return Math.max(1.0f, f12 > 0.5f ? (f12 - 0.5f) / 0.57735f : 0.0f);
    }

    public final void b(Canvas canvas, int i7) {
        if (!canvas.isHardwareAccelerated()) {
            throw new IllegalStateException();
        }
        boolean z9 = this.a;
        if (!z9 && this.c) {
            canvas.drawRenderNode(this.f[0]);
            return;
        }
        if (i7 == -2) {
            canvas.drawRenderNode(this.f[!z9 ? 1 : 0]);
        } else if (i7 == -4) {
            canvas.drawRenderNode(this.f[0]);
        } else if (i7 == -3) {
            canvas.drawRenderNode(this.f[1]);
        }
    }

    public final void c(Canvas canvas, int i7) {
        int i10;
        boolean z9 = this.a;
        if (!z9 && this.c) {
            i10 = 0;
        } else if (i7 == -2) {
            i10 = !z9 ? 1 : 0;
        } else if (i7 == -4) {
            i10 = 3;
        } else if (i7 != -3) {
            return;
        } else {
            i10 = 1;
        }
        for (int i11 = 0; i11 < this.k; i11++) {
            f fVar = (f) this.j.get(i11);
            Rect rect = fVar.d;
            if (!canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom)) {
                canvas.save();
                Rect rect2 = fVar.d;
                canvas.translate(rect2.left, rect2.top);
                RenderNode d = d(i10, i11);
                if (!d.hasDisplayList()) {
                    this.e = true;
                }
                canvas.drawRenderNode(d);
                canvas.restore();
            }
        }
    }

    public final RenderNode d(int i7, int i10) {
        e eVar;
        f fVar = (f) this.j.get(i10);
        if (!this.a || (eVar = fVar.c) == null) {
            return fVar.b.c[Math.min(i7, r5.length - 1)];
        }
        if (i7 == 3) {
            return eVar.c[0];
        }
        if (i7 != 0) {
            return fVar.b.c[0];
        }
        return eVar.c[r4.length - 1];
    }

    public final void e(eh.a aVar, int i7, int i10) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.k;
            ArrayList arrayList = this.j;
            if (i11 < i13) {
                f fVar = (f) arrayList.get(i11);
                Rect rect = fVar.d;
                RectF rectF = this.h;
                rectF.set(rect);
                a aVar2 = this.i;
                aVar2.b = 0L;
                aVar2.a = false;
                aVar.c(aVar2, rectF);
                boolean z9 = aVar2.a;
                long j3 = z9 ? -1L : aVar2.b;
                if (z9 || fVar.e != j3 || !fVar.a.hasDisplayList()) {
                    fVar.e = j3;
                    if (this.m != null) {
                        throw new IllegalStateException();
                    }
                    f fVar2 = (f) arrayList.get(i11);
                    Rect rect2 = fVar2.d;
                    this.m = rect2;
                    this.l = i11;
                    int width = rect2.width();
                    int i14 = this.d;
                    int i15 = width / i14;
                    int height = rect2.height() / i14;
                    fVar2.a.setPosition(0, 0, i15, height);
                    RecordingCanvas beginRecording = fVar2.a.beginRecording(i15, height);
                    float f10 = 1.0f / i14;
                    beginRecording.scale(f10, f10);
                    beginRecording.save();
                    beginRecording.translate(-rect.left, -rect.top);
                    aVar.d(beginRecording, rectF);
                    beginRecording.restore();
                    if (this.m == null) {
                        throw new IllegalStateException();
                    }
                    f fVar3 = (f) arrayList.get(this.l);
                    fVar3.a.endRecording();
                    e eVar = fVar3.b;
                    e eVar2 = fVar3.c;
                    if (eVar2 != null) {
                        eVar2.a(fVar3.a);
                        eVar.a(eVar2.c[0]);
                    } else {
                        eVar.a(fVar3.a);
                    }
                    this.m = null;
                    i12++;
                }
                i11++;
            } else {
                if (i12 <= 0) {
                    return;
                }
                long p10 = ui.p(ui.p(0L, i7), i10);
                int i16 = 0;
                boolean z10 = false;
                while (true) {
                    RenderNode[] renderNodeArr = this.f;
                    if (i16 >= renderNodeArr.length) {
                        break;
                    }
                    RenderNode renderNode = renderNodeArr[i16];
                    p10 = ui.p(p10, renderNode.getUniqueId());
                    for (int i17 = 0; i17 < this.k; i17++) {
                        f fVar4 = (f) arrayList.get(i17);
                        RenderNode d = d(i16, i17);
                        Rect rect3 = fVar4.d;
                        p10 = ui.p(ui.p(ui.p(ui.p(ui.p(p10, rect3.left), rect3.top), rect3.right), rect3.bottom), d.getUniqueId());
                    }
                    if (!renderNode.hasDisplayList()) {
                        z10 = true;
                    }
                    i16++;
                }
                if (p10 == this.g && !z10) {
                    return;
                }
                this.g = p10;
                int i18 = 0;
                while (true) {
                    RenderNode[] renderNodeArr2 = this.f;
                    if (i18 >= renderNodeArr2.length) {
                        return;
                    }
                    RenderNode renderNode2 = renderNodeArr2[i18];
                    renderNode2.setPosition(0, 0, i7, i10);
                    RecordingCanvas beginRecording2 = renderNode2.beginRecording(i7, i10);
                    for (int i19 = 0; i19 < this.k; i19++) {
                        f fVar5 = (f) arrayList.get(i19);
                        beginRecording2.save();
                        Rect rect4 = fVar5.d;
                        beginRecording2.translate(rect4.left, rect4.top);
                        beginRecording2.drawRenderNode(d(i18, i19));
                        beginRecording2.restore();
                    }
                    renderNode2.endRecording();
                    i18++;
                }
            }
        }
    }

    public final void f(float f10, float f11) {
        for (int i7 = 0; i7 < this.k; i7++) {
            f fVar = (f) this.j.get(i7);
            fVar.b.b(f10, f11);
            e eVar = fVar.c;
            if (eVar != null) {
                eVar.b(f10, f11);
            }
        }
    }

    public final void g(int i7, ArrayList arrayList) {
        ArrayList arrayList2;
        this.k = i7;
        while (true) {
            int i10 = this.k;
            arrayList2 = this.j;
            if (i10 <= arrayList2.size()) {
                break;
            } else {
                arrayList2.add(new f(this));
            }
        }
        for (int i11 = 0; i11 < this.k; i11++) {
            f.a((f) arrayList2.get(i11), (RectF) arrayList.get(i11));
        }
    }

    public final void h(qi.a aVar) {
        ArrayList arrayList;
        this.k = aVar.b;
        while (true) {
            int i7 = this.k;
            arrayList = this.j;
            if (i7 <= arrayList.size()) {
                break;
            } else {
                arrayList.add(new f(this));
            }
        }
        for (int i10 = 0; i10 < this.k; i10++) {
            f.a((f) arrayList.get(i10), aVar.c(i10));
        }
    }
}
