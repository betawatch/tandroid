package ah;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class i {
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

    public i(boolean z10) {
        boolean isEnabled = LiteMode.isEnabled(262144);
        this.a = isEnabled;
        this.c = true;
        this.d = (isEnabled || z10) ? 1 : 8;
        this.b = z10;
        this.f = new RenderNode[isEnabled ? 2 : 1];
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, int i10) {
        int i11;
        boolean z10 = this.a;
        if (z10 || !this.c) {
            if (i10 == -2) {
                i11 = !z10 ? 1 : 0;
            } else if (i10 != -4) {
                if (i10 != -3) {
                    return;
                } else {
                    i11 = 1;
                }
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
        i11 = 0;
        while (i12 < this.k) {
        }
    }

    public final RenderNode d(int i10, int i11) {
        g gVar;
        h hVar = (h) this.j.get(i11);
        if (this.a && (gVar = hVar.c) != null) {
            return i10 == 0 ? gVar.c[0] : hVar.b.c[0];
        }
        return hVar.b.c[Math.min(i10, r4.length - 1)];
    }

    public final boolean e(bh.a aVar, int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.k;
            ArrayList arrayList = this.j;
            if (i12 >= i14) {
                if (i13 > 0) {
                    long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(0L, i10), i11);
                    int i15 = 0;
                    boolean z10 = false;
                    while (true) {
                        RenderNode[] renderNodeArr = this.f;
                        if (i15 >= renderNodeArr.length) {
                            break;
                        }
                        RenderNode renderNode = renderNodeArr[i15];
                        calcHash = MediaDataController.calcHash(calcHash, renderNode.getUniqueId());
                        for (int i16 = 0; i16 < this.k; i16++) {
                            h hVar = (h) arrayList.get(i16);
                            RenderNode d = d(i15, i16);
                            Rect rect = hVar.d;
                            calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(calcHash, rect.left), rect.top), rect.right), rect.bottom), d.getUniqueId());
                        }
                        if (!renderNode.hasDisplayList()) {
                            z10 = true;
                        }
                        i15++;
                    }
                    if (calcHash != this.g || z10) {
                        this.g = calcHash;
                        int i17 = 0;
                        while (true) {
                            RenderNode[] renderNodeArr2 = this.f;
                            if (i17 >= renderNodeArr2.length) {
                                return true;
                            }
                            RenderNode renderNode2 = renderNodeArr2[i17];
                            renderNode2.setPosition(0, 0, i10, i11);
                            RecordingCanvas beginRecording = renderNode2.beginRecording(i10, i11);
                            for (int i18 = 0; i18 < this.k; i18++) {
                                h hVar2 = (h) arrayList.get(i18);
                                beginRecording.save();
                                Rect rect2 = hVar2.d;
                                beginRecording.translate(rect2.left, rect2.top);
                                beginRecording.drawRenderNode(d(i17, i18));
                                beginRecording.restore();
                            }
                            renderNode2.endRecording();
                            i17++;
                        }
                    }
                }
                return false;
            }
            h hVar3 = (h) arrayList.get(i12);
            Rect rect3 = hVar3.d;
            RectF rectF = this.h;
            rectF.set(rect3);
            a aVar2 = this.i;
            aVar2.b = 0L;
            aVar2.a = false;
            aVar.b(aVar2, rectF);
            boolean z11 = aVar2.a;
            long j3 = z11 ? -1L : aVar2.b;
            if (z11 || hVar3.e != j3 || !hVar3.a.hasDisplayList()) {
                hVar3.e = j3;
                if (this.m != null) {
                    throw new IllegalStateException();
                }
                h hVar4 = (h) arrayList.get(i12);
                Rect rect4 = hVar4.d;
                this.m = rect4;
                this.l = i12;
                int width = rect4.width();
                int i19 = this.d;
                int i20 = width / i19;
                int height = rect4.height() / i19;
                hVar4.a.setPosition(0, 0, i20, height);
                RecordingCanvas beginRecording2 = hVar4.a.beginRecording(i20, height);
                float f7 = 1.0f / i19;
                beginRecording2.scale(f7, f7);
                beginRecording2.save();
                beginRecording2.translate(-rect3.left, -rect3.top);
                aVar.f(beginRecording2, rectF);
                beginRecording2.restore();
                if (this.m == null) {
                    throw new IllegalStateException();
                }
                h hVar5 = (h) arrayList.get(this.l);
                hVar5.a.endRecording();
                g gVar = hVar5.b;
                g gVar2 = hVar5.c;
                if (gVar2 != null) {
                    gVar2.a(hVar5.a);
                    gVar.a(gVar2.c[0]);
                } else {
                    gVar.a(hVar5.a);
                }
                this.m = null;
                i13++;
            }
            i12++;
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

    public final void g(int i10, List list) {
        ArrayList arrayList;
        this.k = i10;
        while (true) {
            int i11 = this.k;
            arrayList = this.j;
            if (i11 <= arrayList.size()) {
                break;
            } else {
                arrayList.add(new h(this));
            }
        }
        for (int i12 = 0; i12 < this.k; i12++) {
            h.a((h) arrayList.get(i12), (RectF) list.get(i12));
        }
    }

    public final void h(mi.a aVar) {
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
}
