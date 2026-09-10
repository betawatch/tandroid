package eh;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import zg.g;
import zg.h;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d implements a {
    public final a a;
    public h c;
    public zg.e d;
    public int e;
    public a f;
    public boolean h;
    public boolean n;
    public RecordingCanvas r;
    public Runnable v;
    public final pe.b s = new pe.b(true);
    public final RenderNode b = ah.b.k();

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

    @Override // eh.a
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

    public final int d(int i10, int i11, List list) {
        RectF rectF;
        Iterator it = this.s.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            bh.e eVar = (bh.e) it.next();
            boolean v = eVar.v();
            bh.c cVar = eVar.h;
            if (v && eVar.j > 0 && !cVar.m.isEmpty()) {
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

    public final void e() {
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((bh.e) it.next()).M = true;
        }
    }

    public final boolean f(int i10, int i11) {
        return (this.b.hasDisplayList() && this.b.getWidth() == i10 && this.b.getHeight() == i11) ? false : true;
    }

    public final void g(float f7) {
        this.b.setRenderEffect(f7 > 0.0f ? RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP) : null);
    }

    public final void h(float f7, RenderEffect renderEffect) {
        this.b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void i(int i10, int i11) {
        this.b.setPosition(0, 0, i10, i11);
    }

    public final void j(g gVar) {
        if (this.c == null) {
            this.c = new h(this.b, gVar);
        }
    }

    @Override // eh.a
    public final bh.d k() {
        bh.e eVar = new bh.e(this);
        this.s.add(eVar);
        return eVar;
    }

    public final void l() {
        this.c.a();
    }

    @Override // eh.a
    public final void u(Canvas canvas, float f7, float f10, float f11, float f12) {
        zg.e eVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.u(canvas, f7, f10, f11, f12);
                return;
            }
            return;
        }
        if (this.n) {
            throw new IllegalStateException();
        }
        a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.u(canvas, f7, f10, f11, f12);
        }
        canvas.save();
        if (!this.h) {
            canvas.clipRect(f7, f10, f11, f12);
        }
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.d) == null) {
            canvas.drawRenderNode(this.b);
        } else {
            eVar.c(canvas, this.e);
        }
        canvas.restore();
    }
}
