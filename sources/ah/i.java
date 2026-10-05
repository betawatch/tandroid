package ah;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import java.util.ArrayList;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class i {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public boolean e;
    public final RenderNode[] f;
    public long g;
    public final RectF h;
    public final a i;
    public final ArrayList j;
    public int k;
    public int l;
    public Rect m;

    public i() {
        this(true, false);
    }

    public static float a(float f7, float f10) {
        float f11 = (f7 > 0.0f ? (f7 * 0.57735f) + 0.5f : 0.0f) / f10;
        return Math.max(1.0f, f11 > 0.5f ? (f11 - 0.5f) / 0.57735f : 0.0f);
    }

    public final void b(Canvas canvas, int i10) {
        if (!canvas.isHardwareAccelerated()) {
            throw new IllegalStateException();
        }
        boolean z10 = this.a;
        if (!z10 && this.c) {
            canvas.drawRenderNode(this.f[0]);
            return;
        }
        if (i10 == -2) {
            canvas.drawRenderNode(this.f[!z10 ? 1 : 0]);
        } else if (i10 == -4) {
            canvas.drawRenderNode(this.f[0]);
        } else if (i10 == -3) {
            canvas.drawRenderNode(this.f[1]);
        }
    }

    public final void c(Canvas canvas, int i10) {
        int i11;
        boolean z10 = this.a;
        if (!z10 && this.c) {
            i11 = 0;
        } else if (i10 == -2) {
            i11 = !z10 ? 1 : 0;
        } else if (i10 == -4) {
            i11 = 3;
        } else if (i10 != -3) {
            return;
        } else {
            i11 = 1;
        }
        for (int i12 = 0; i12 < this.k; i12++) {
            h hVar = (h) this.j.get(i12);
            Rect rect = hVar.d;
            if (!canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom)) {
                canvas.save();
                Rect rect2 = hVar.d;
                canvas.translate(rect2.left, rect2.top);
                RenderNode d = d(i11, i12);
                if (!d.hasDisplayList()) {
                    this.e = true;
                }
                canvas.drawRenderNode(d);
                canvas.restore();
            }
        }
    }

    public final RenderNode d(int i10, int i11) {
        g gVar;
        h hVar = (h) this.j.get(i11);
        if (!this.a || (gVar = hVar.c) == null) {
            return hVar.b.c[Math.min(i10, r5.length - 1)];
        }
        if (i10 == 3) {
            return gVar.c[0];
        }
        if (i10 != 0) {
            return hVar.b.c[0];
        }
        return gVar.c[r4.length - 1];
    }

    public final void e(bh.a aVar, int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.k;
            ArrayList arrayList = this.j;
            if (i12 < i14) {
                h hVar = (h) arrayList.get(i12);
                Rect rect = hVar.d;
                RectF rectF = this.h;
                rectF.set(rect);
                a aVar2 = this.i;
                aVar2.b = 0L;
                aVar2.a = false;
                aVar.b(aVar2, rectF);
                boolean z10 = aVar2.a;
                long j3 = z10 ? -1L : aVar2.b;
                if (z10 || hVar.e != j3 || !hVar.a.hasDisplayList()) {
                    hVar.e = j3;
                    if (this.m != null) {
                        throw new IllegalStateException();
                    }
                    h hVar2 = (h) arrayList.get(i12);
                    Rect rect2 = hVar2.d;
                    this.m = rect2;
                    this.l = i12;
                    int width = rect2.width();
                    int i15 = this.d;
                    int i16 = width / i15;
                    int height = rect2.height() / i15;
                    hVar2.a.setPosition(0, 0, i16, height);
                    RecordingCanvas beginRecording = hVar2.a.beginRecording(i16, height);
                    float f7 = 1.0f / i15;
                    beginRecording.scale(f7, f7);
                    beginRecording.save();
                    beginRecording.translate(-rect.left, -rect.top);
                    aVar.f(beginRecording, rectF);
                    beginRecording.restore();
                    if (this.m == null) {
                        throw new IllegalStateException();
                    }
                    h hVar3 = (h) arrayList.get(this.l);
                    hVar3.a.endRecording();
                    g gVar = hVar3.b;
                    g gVar2 = hVar3.c;
                    if (gVar2 != null) {
                        gVar2.a(hVar3.a);
                        gVar.a(gVar2.c[0]);
                    } else {
                        gVar.a(hVar3.a);
                    }
                    this.m = null;
                    i13++;
                }
                i12++;
            } else {
                if (i13 <= 0) {
                    return;
                }
                long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(0L, i10), i11);
                int i17 = 0;
                boolean z11 = false;
                while (true) {
                    RenderNode[] renderNodeArr = this.f;
                    if (i17 >= renderNodeArr.length) {
                        break;
                    }
                    RenderNode renderNode = renderNodeArr[i17];
                    calcHash = MediaDataController.calcHash(calcHash, renderNode.getUniqueId());
                    for (int i18 = 0; i18 < this.k; i18++) {
                        h hVar4 = (h) arrayList.get(i18);
                        RenderNode d = d(i17, i18);
                        Rect rect3 = hVar4.d;
                        calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(calcHash, rect3.left), rect3.top), rect3.right), rect3.bottom), d.getUniqueId());
                    }
                    if (!renderNode.hasDisplayList()) {
                        z11 = true;
                    }
                    i17++;
                }
                if (calcHash == this.g && !z11) {
                    return;
                }
                this.g = calcHash;
                int i19 = 0;
                while (true) {
                    RenderNode[] renderNodeArr2 = this.f;
                    if (i19 >= renderNodeArr2.length) {
                        return;
                    }
                    RenderNode renderNode2 = renderNodeArr2[i19];
                    renderNode2.setPosition(0, 0, i10, i11);
                    RecordingCanvas beginRecording2 = renderNode2.beginRecording(i10, i11);
                    for (int i20 = 0; i20 < this.k; i20++) {
                        h hVar5 = (h) arrayList.get(i20);
                        beginRecording2.save();
                        Rect rect4 = hVar5.d;
                        beginRecording2.translate(rect4.left, rect4.top);
                        beginRecording2.drawRenderNode(d(i19, i20));
                        beginRecording2.restore();
                    }
                    renderNode2.endRecording();
                    i19++;
                }
            }
        }
    }

    public final void f(float f7, float f10) {
        for (int i10 = 0; i10 < this.k; i10++) {
            h hVar = (h) this.j.get(i10);
            hVar.b.b(f7, f10);
            g gVar = hVar.c;
            if (gVar != null) {
                gVar.b(f7, f10);
            }
        }
    }

    public final void g(int i10, ArrayList arrayList) {
        ArrayList arrayList2;
        this.k = i10;
        while (true) {
            int i11 = this.k;
            arrayList2 = this.j;
            if (i11 <= arrayList2.size()) {
                break;
            } else {
                arrayList2.add(new h(this));
            }
        }
        for (int i12 = 0; i12 < this.k; i12++) {
            h.a((h) arrayList2.get(i12), (RectF) arrayList.get(i12));
        }
    }

    public final void h(ni.a aVar) {
        ArrayList arrayList;
        this.k = aVar.b;
        while (true) {
            int i10 = this.k;
            arrayList = this.j;
            if (i10 <= arrayList.size()) {
                break;
            } else {
                arrayList.add(new h(this));
            }
        }
        for (int i11 = 0; i11 < this.k; i11++) {
            h.a((h) arrayList.get(i11), aVar.c(i11));
        }
    }

    public i(boolean z10, boolean z11) {
        this.h = new RectF();
        this.i = new a();
        this.j = new ArrayList();
        boolean isEnabled = LiteMode.isEnabled(262144);
        this.a = isEnabled;
        this.c = z10;
        this.d = (isEnabled || z11) ? 1 : 8;
        this.b = z11;
        this.f = new RenderNode[(isEnabled || !z10) ? 2 : 1];
        int i10 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.f;
            if (i10 >= renderNodeArr.length) {
                return;
            }
            renderNodeArr[i10] = f.c();
            i10++;
        }
    }
}
