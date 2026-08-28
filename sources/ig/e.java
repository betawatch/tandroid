package ig;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.z;
import g.x;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public e(boolean z10) {
        boolean isEnabled = LiteMode.isEnabled(262144);
        this.a = isEnabled;
        this.c = true;
        this.d = (isEnabled || z10) ? 1 : 8;
        this.b = z10;
        this.e = new RenderNode[isEnabled ? 2 : 1];
        int i9 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.e;
            if (i9 >= renderNodeArr.length) {
                return;
            }
            renderNodeArr[i9] = z.c();
            i9++;
        }
    }

    public static float a(float f10, float f11) {
        float f12 = (f10 > 0.0f ? (f10 * 0.57735f) + 0.5f : 0.0f) / f11;
        return Math.max(1.0f, f12 > 0.5f ? (f12 - 0.5f) / 0.57735f : 0.0f);
    }

    public final void b(Canvas canvas, int i9) {
        if (!canvas.isHardwareAccelerated()) {
            throw new IllegalStateException();
        }
        boolean z10 = this.a;
        if (!z10 && this.c) {
            canvas.drawRenderNode(this.e[0]);
            return;
        }
        if (i9 == -2) {
            canvas.drawRenderNode(this.e[!z10 ? 1 : 0]);
        } else if (i9 == -4) {
            canvas.drawRenderNode(this.e[0]);
        } else if (i9 == -3) {
            canvas.drawRenderNode(this.e[1]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, int i9) {
        int i10;
        boolean z10 = this.a;
        if (z10 || !this.c) {
            i10 = 1;
            if (i9 == -2) {
                i10 = 1 ^ (z10 ? 1 : 0);
            } else if (i9 != -4) {
                if (i9 != -3) {
                    return;
                }
            }
            for (int i11 = 0; i11 < this.j; i11++) {
                d dVar = (d) this.i.get(i11);
                Rect rect = dVar.d;
                if (!canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom)) {
                    canvas.save();
                    Rect rect2 = dVar.d;
                    canvas.translate(rect2.left, rect2.top);
                    canvas.drawRenderNode(d(i10, i11));
                    canvas.restore();
                }
            }
        }
        i10 = 0;
        while (i11 < this.j) {
        }
    }

    public final RenderNode d(int i9, int i10) {
        c cVar;
        d dVar = (d) this.i.get(i10);
        if (this.a && (cVar = dVar.c) != null) {
            return i9 == 0 ? cVar.c[0] : dVar.b.c[0];
        }
        return dVar.b.c[Math.min(i9, r4.length - 1)];
    }

    public final boolean e(jg.a aVar, int i9, int i10) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.j;
            ArrayList arrayList = this.i;
            if (i11 >= i13) {
                if (i12 > 0) {
                    long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(0L, i9), i10);
                    int i14 = 0;
                    boolean z10 = false;
                    while (true) {
                        RenderNode[] renderNodeArr = this.e;
                        if (i14 >= renderNodeArr.length) {
                            break;
                        }
                        RenderNode renderNode = renderNodeArr[i14];
                        calcHash = MediaDataController.calcHash(calcHash, renderNode.getUniqueId());
                        for (int i15 = 0; i15 < this.j; i15++) {
                            d dVar = (d) arrayList.get(i15);
                            RenderNode d = d(i14, i15);
                            Rect rect = dVar.d;
                            calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(calcHash, rect.left), rect.top), rect.right), rect.bottom), d.getUniqueId());
                        }
                        if (!renderNode.hasDisplayList()) {
                            z10 = true;
                        }
                        i14++;
                    }
                    if (calcHash != this.f || z10) {
                        this.f = calcHash;
                        int i16 = 0;
                        while (true) {
                            RenderNode[] renderNodeArr2 = this.e;
                            if (i16 >= renderNodeArr2.length) {
                                return true;
                            }
                            RenderNode renderNode2 = renderNodeArr2[i16];
                            renderNode2.setPosition(0, 0, i9, i10);
                            RecordingCanvas beginRecording = renderNode2.beginRecording(i9, i10);
                            for (int i17 = 0; i17 < this.j; i17++) {
                                d dVar2 = (d) arrayList.get(i17);
                                beginRecording.save();
                                Rect rect2 = dVar2.d;
                                beginRecording.translate(rect2.left, rect2.top);
                                beginRecording.drawRenderNode(d(i16, i17));
                                beginRecording.restore();
                            }
                            renderNode2.endRecording();
                            i16++;
                        }
                    }
                }
                return false;
            }
            d dVar3 = (d) arrayList.get(i11);
            Rect rect3 = dVar3.d;
            RectF rectF = this.g;
            rectF.set(rect3);
            x xVar = this.h;
            xVar.a = 0L;
            xVar.b = false;
            aVar.g(xVar, rectF);
            boolean z11 = xVar.b;
            long j10 = z11 ? -1L : xVar.a;
            if (z11 || dVar3.e != j10 || !dVar3.a.hasDisplayList()) {
                dVar3.e = j10;
                if (this.l != null) {
                    throw new IllegalStateException();
                }
                d dVar4 = (d) arrayList.get(i11);
                Rect rect4 = dVar4.d;
                this.l = rect4;
                this.k = i11;
                int width = rect4.width();
                int i18 = this.d;
                int i19 = width / i18;
                int height = rect4.height() / i18;
                dVar4.a.setPosition(0, 0, i19, height);
                RecordingCanvas beginRecording2 = dVar4.a.beginRecording(i19, height);
                float f10 = 1.0f / i18;
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
                i12++;
            }
            i11++;
        }
    }

    public final void f(float f10, float f11) {
        for (int i9 = 0; i9 < this.j; i9++) {
            d dVar = (d) this.i.get(i9);
            dVar.b.b(f10, f11);
            c cVar = dVar.c;
            if (cVar != null) {
                cVar.b(f10, f11);
            }
        }
    }

    public final void g(int i9, List list) {
        ArrayList arrayList;
        this.j = i9;
        while (true) {
            int i10 = this.j;
            arrayList = this.i;
            if (i10 <= arrayList.size()) {
                break;
            } else {
                arrayList.add(new d(this));
            }
        }
        for (int i11 = 0; i11 < this.j; i11++) {
            d dVar = (d) arrayList.get(i11);
            RectF rectF = (RectF) list.get(i11);
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
