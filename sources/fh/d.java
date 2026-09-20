package fh;

import ah.f;
import ah.i;
import ah.k;
import ah.l;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class d implements a {
    public final a a;
    public l c;
    public i d;
    public int e;
    public a f;
    public boolean h;
    public boolean n;
    public RecordingCanvas r;
    public Runnable v;
    public final pe.b s = new pe.b(true);
    public final RenderNode b = f.c();

    public d(a aVar) {
        this.a = aVar;
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (this.n) {
            throw new IllegalStateException();
        }
        this.n = true;
        this.b.setPosition(0, 0, i10, i11);
        RecordingCanvas beginRecording = this.b.beginRecording(i10, i11);
        this.r = beginRecording;
        return beginRecording;
    }

    @Override // fh.a
    public final void b() {
        Runnable runnable = this.v;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c() {
        if (!this.n) {
            throw new IllegalStateException();
        }
        this.b.endRecording();
        this.n = false;
        this.r = null;
    }

    @Override // fh.a
    public final ch.d d() {
        ch.e eVar = new ch.e(this);
        this.s.add(eVar);
        return eVar;
    }

    public final int e(int i10, int i11, List list) {
        RectF rectF;
        Iterator it = this.s.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            ch.e eVar = (ch.e) it.next();
            boolean j3 = eVar.j();
            ch.c cVar = eVar.j;
            if (j3 && eVar.l > 0 && !cVar.m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(cVar.m);
                rectF.offset(eVar.a, eVar.b);
                float f7 = -i11;
                rectF.inset(f7, f7);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    public final void f() {
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((ch.e) it.next()).O = true;
        }
    }

    public final boolean g(int i10, int i11) {
        return (this.b.hasDisplayList() && this.b.getWidth() == i10 && this.b.getHeight() == i11) ? false : true;
    }

    public final void h(float f7) {
        this.b.setRenderEffect(f7 > 0.0f ? RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP) : null);
    }

    public final void i(float f7, RenderEffect renderEffect) {
        this.b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void j(int i10, int i11) {
        this.b.setPosition(0, 0, i10, i11);
    }

    public final void k(k kVar) {
        if (this.c == null) {
            this.c = new l(this.b, kVar);
        }
    }

    public final void l() {
        this.c.a();
    }

    @Override // fh.a
    public final void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        i iVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.y(canvas, f7, f10, f11, f12);
                return;
            }
            return;
        }
        if (this.n) {
            throw new IllegalStateException();
        }
        a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.y(canvas, f7, f10, f11, f12);
        }
        canvas.save();
        if (!this.h) {
            canvas.clipRect(f7, f10, f11, f12);
        }
        if (Build.VERSION.SDK_INT < 31 || (iVar = this.d) == null) {
            canvas.drawRenderNode(this.b);
        } else {
            iVar.c(canvas, this.e);
        }
        canvas.restore();
    }
}
