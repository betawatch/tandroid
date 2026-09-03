package og;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.y;
import g.x;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final RenderNode[] e;
    public long f;
    public final RectF g = new RectF();
    public final x h = new x();
    public final ArrayList i = new ArrayList();
    public int j;
    public int k;
    public Rect l;

    public e(boolean z4) {
        boolean isEnabled = LiteMode.isEnabled(262144);
        this.a = isEnabled;
        this.c = true;
        this.d = (isEnabled || z4) ? 1 : 8;
        this.b = z4;
        this.e = new RenderNode[isEnabled ? 2 : 1];
        int i10 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.e;
            if (i10 >= renderNodeArr.length) {
                return;
            }
            renderNodeArr[i10] = y.c();
            i10++;
        }
    }

    public static float a(float f10, float f11) {
        float f12 = (f10 > 0.0f ? (f10 * 0.57735f) + 0.5f : 0.0f) / f11;
        return Math.max(1.0f, f12 > 0.5f ? (f12 - 0.5f) / 0.57735f : 0.0f);
    }

    public final void b(Canvas canvas, int i10) {
        if (!canvas.isHardwareAccelerated()) {
            throw new IllegalStateException();
        }
        boolean z4 = this.a;
        if (!z4 && this.c) {
            canvas.drawRenderNode(this.e[0]);
            return;
        }
        if (i10 == -2) {
            canvas.drawRenderNode(this.e[!z4 ? 1 : 0]);
        } else if (i10 == -4) {
            canvas.drawRenderNode(this.e[0]);
        } else if (i10 == -3) {
            canvas.drawRenderNode(this.e[1]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, int i10) {
        int i11;
        boolean z4 = this.a;
        if (z4 || !this.c) {
            i11 = 1;
            if (i10 == -2) {
                i11 = 1 ^ (z4 ? 1 : 0);
            } else if (i10 != -4) {
                if (i10 != -3) {
                    return;
                }
            }
            for (int i12 = 0; i12 < this.j; i12++) {
                d dVar = (d) this.i.get(i12);
                Rect rect = dVar.d;
                if (!canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom)) {
                    canvas.save();
                    Rect rect2 = dVar.d;
                    canvas.translate(rect2.left, rect2.top);
                    canvas.drawRenderNode(d(i11, i12));
                    canvas.restore();
                }
            }
        }
        i11 = 0;
        while (i12 < this.j) {
        }
    }

    public final RenderNode d(int i10, int i11) {
        c cVar;
        d dVar = (d) this.i.get(i11);
        if (this.a && (cVar = dVar.c) != null) {
            return i10 == 0 ? cVar.c[0] : dVar.b.c[0];
        }
        return dVar.b.c[Math.min(i10, r4.length - 1)];
    }

    public final boolean e(pg.a aVar, int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.j;
            ArrayList arrayList = this.i;
            if (i12 >= i14) {
                if (i13 > 0) {
                    long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(0L, i10), i11);
                    int i15 = 0;
                    boolean z4 = false;
                    while (true) {
                        RenderNode[] renderNodeArr = this.e;
                        if (i15 >= renderNodeArr.length) {
                            break;
                        }
                        RenderNode renderNode = renderNodeArr[i15];
                        calcHash = MediaDataController.calcHash(calcHash, renderNode.getUniqueId());
                        for (int i16 = 0; i16 < this.j; i16++) {
                            d dVar = (d) arrayList.get(i16);
                            RenderNode d = d(i15, i16);
                            Rect rect = dVar.d;
                            calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(calcHash, rect.left), rect.top), rect.right), rect.bottom), d.getUniqueId());
                        }
                        if (!renderNode.hasDisplayList()) {
                            z4 = true;
                        }
                        i15++;
                    }
                    if (calcHash != this.f || z4) {
                        this.f = calcHash;
                        int i17 = 0;
                        while (true) {
                            RenderNode[] renderNodeArr2 = this.e;
                            if (i17 >= renderNodeArr2.length) {
                                return true;
                            }
                            RenderNode renderNode2 = renderNodeArr2[i17];
                            renderNode2.setPosition(0, 0, i10, i11);
                            RecordingCanvas beginRecording = renderNode2.beginRecording(i10, i11);
                            for (int i18 = 0; i18 < this.j; i18++) {
                                d dVar2 = (d) arrayList.get(i18);
                                beginRecording.save();
                                Rect rect2 = dVar2.d;
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
            d dVar3 = (d) arrayList.get(i12);
            Rect rect3 = dVar3.d;
            RectF rectF = this.g;
            rectF.set(rect3);
            x xVar = this.h;
            xVar.a = 0L;
            xVar.b = false;
            aVar.g(xVar, rectF);
            boolean z10 = xVar.b;
            long j10 = z10 ? -1L : xVar.a;
            if (z10 || dVar3.e != j10 || !dVar3.a.hasDisplayList()) {
                dVar3.e = j10;
                if (this.l != null) {
                    throw new IllegalStateException();
                }
                d dVar4 = (d) arrayList.get(i12);
                Rect rect4 = dVar4.d;
                this.l = rect4;
                this.k = i12;
                int width = rect4.width();
                int i19 = this.d;
                int i20 = width / i19;
                int height = rect4.height() / i19;
                dVar4.a.setPosition(0, 0, i20, height);
                RecordingCanvas beginRecording2 = dVar4.a.beginRecording(i20, height);
                float f10 = 1.0f / i19;
                beginRecording2.scale(f10, f10);
                beginRecording2.save();
                beginRecording2.translate(-rect3.left, -rect3.top);
                aVar.e(beginRecording2, rectF);
                beginRecording2.restore();
                if (this.l == null) {
                    throw new IllegalStateException();
                }
                d dVar5 = (d) arrayList.get(this.k);
                dVar5.a.endRecording();
                c cVar = dVar5.b;
                c cVar2 = dVar5.c;
                if (cVar2 != null) {
                    cVar2.a(dVar5.a);
                    cVar.a(cVar2.c[0]);
                } else {
                    cVar.a(dVar5.a);
                }
                this.l = null;
                i13++;
            }
            i12++;
        }
    }

    public final void f(float f10, float f11) {
        for (int i10 = 0; i10 < this.j; i10++) {
            d dVar = (d) this.i.get(i10);
            dVar.b.b(f10, f11);
            c cVar = dVar.c;
            if (cVar != null) {
                cVar.b(f10, f11);
            }
        }
    }

    public final void g(int i10, List list) {
        ArrayList arrayList;
        this.j = i10;
        while (true) {
            int i11 = this.j;
            arrayList = this.i;
            if (i11 <= arrayList.size()) {
                break;
            } else {
                arrayList.add(new d(this));
            }
        }
        for (int i12 = 0; i12 < this.j; i12++) {
            d dVar = (d) arrayList.get(i12);
            RectF rectF = (RectF) list.get(i12);
            Rect rect = dVar.d;
            float f10 = rectF.left;
            float f11 = 16;
            rect.left = Math.round(f10 - (f10 % f11));
            float f12 = rectF.top;
            rect.top = Math.round(f12 - (f12 % f11));
            float f13 = rectF.right;
            rect.right = Math.round((f11 - (f13 % f11)) + f13);
            float f14 = rectF.bottom;
            rect.bottom = Math.round((f11 - (f14 % f11)) + f14);
        }
    }
}
