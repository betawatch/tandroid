package bh;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.y;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class f {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final RenderNode[] e;
    public long f;
    public final RectF g = new RectF();
    public final a h = new a();
    public final ArrayList i = new ArrayList();
    public int j;
    public int k;
    public Rect l;

    public f(boolean z10) {
        boolean isEnabled = LiteMode.isEnabled(262144);
        this.a = isEnabled;
        this.c = true;
        this.d = (isEnabled || z10) ? 1 : 8;
        this.b = z10;
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
            canvas.drawRenderNode(this.e[0]);
            return;
        }
        if (i10 == -2) {
            canvas.drawRenderNode(this.e[!z10 ? 1 : 0]);
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
        boolean z10 = this.a;
        if (z10 || !this.c) {
            i11 = 1;
            if (i10 == -2) {
                i11 = 1 ^ (z10 ? 1 : 0);
            } else if (i10 != -4) {
                if (i10 != -3) {
                    return;
                }
            }
            for (int i12 = 0; i12 < this.j; i12++) {
                e eVar = (e) this.i.get(i12);
                Rect rect = eVar.d;
                if (!canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom)) {
                    canvas.save();
                    Rect rect2 = eVar.d;
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
        d dVar;
        e eVar = (e) this.i.get(i11);
        if (this.a && (dVar = eVar.c) != null) {
            return i10 == 0 ? dVar.c[0] : eVar.b.c[0];
        }
        return eVar.b.c[Math.min(i10, r4.length - 1)];
    }

    public final boolean e(ch.a aVar, int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.j;
            ArrayList arrayList = this.i;
            if (i12 >= i14) {
                if (i13 > 0) {
                    long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(0L, i10), i11);
                    int i15 = 0;
                    boolean z10 = false;
                    while (true) {
                        RenderNode[] renderNodeArr = this.e;
                        if (i15 >= renderNodeArr.length) {
                            break;
                        }
                        RenderNode renderNode = renderNodeArr[i15];
                        calcHash = MediaDataController.calcHash(calcHash, renderNode.getUniqueId());
                        for (int i16 = 0; i16 < this.j; i16++) {
                            e eVar = (e) arrayList.get(i16);
                            RenderNode d = d(i15, i16);
                            Rect rect = eVar.d;
                            calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(calcHash, rect.left), rect.top), rect.right), rect.bottom), d.getUniqueId());
                        }
                        if (!renderNode.hasDisplayList()) {
                            z10 = true;
                        }
                        i15++;
                    }
                    if (calcHash != this.f || z10) {
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
                                e eVar2 = (e) arrayList.get(i18);
                                beginRecording.save();
                                Rect rect2 = eVar2.d;
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
            e eVar3 = (e) arrayList.get(i12);
            Rect rect3 = eVar3.d;
            RectF rectF = this.g;
            rectF.set(rect3);
            a aVar2 = this.h;
            aVar2.b = 0L;
            aVar2.a = false;
            aVar.e(aVar2, rectF);
            boolean z11 = aVar2.a;
            long j3 = z11 ? -1L : aVar2.b;
            if (z11 || eVar3.e != j3 || !eVar3.a.hasDisplayList()) {
                eVar3.e = j3;
                if (this.l != null) {
                    throw new IllegalStateException();
                }
                e eVar4 = (e) arrayList.get(i12);
                Rect rect4 = eVar4.d;
                this.l = rect4;
                this.k = i12;
                int width = rect4.width();
                int i19 = this.d;
                int i20 = width / i19;
                int height = rect4.height() / i19;
                eVar4.a.setPosition(0, 0, i20, height);
                RecordingCanvas beginRecording2 = eVar4.a.beginRecording(i20, height);
                float f7 = 1.0f / i19;
                beginRecording2.scale(f7, f7);
                beginRecording2.save();
                beginRecording2.translate(-rect3.left, -rect3.top);
                aVar.f(beginRecording2, rectF);
                beginRecording2.restore();
                if (this.l == null) {
                    throw new IllegalStateException();
                }
                e eVar5 = (e) arrayList.get(this.k);
                eVar5.a.endRecording();
                d dVar = eVar5.b;
                d dVar2 = eVar5.c;
                if (dVar2 != null) {
                    dVar2.a(eVar5.a);
                    dVar.a(dVar2.c[0]);
                } else {
                    dVar.a(eVar5.a);
                }
                this.l = null;
                i13++;
            }
            i12++;
        }
    }

    public final void f(float f7, float f10) {
        for (int i10 = 0; i10 < this.j; i10++) {
            e eVar = (e) this.i.get(i10);
            eVar.b.b(f7, f10);
            d dVar = eVar.c;
            if (dVar != null) {
                dVar.b(f7, f10);
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
                arrayList.add(new e(this));
            }
        }
        for (int i12 = 0; i12 < this.j; i12++) {
            e eVar = (e) arrayList.get(i12);
            RectF rectF = (RectF) list.get(i12);
            Rect rect = eVar.d;
            float f7 = rectF.left;
            float f10 = 16;
            rect.left = Math.round(f7 - (f7 % f10));
            float f11 = rectF.top;
            rect.top = Math.round(f11 - (f11 % f10));
            float f12 = rectF.right;
            rect.right = Math.round((f10 - (f12 % f10)) + f12);
            float f13 = rectF.bottom;
            rect.bottom = Math.round((f10 - (f13 % f10)) + f13);
        }
    }
}
