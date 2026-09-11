package gh;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.y;
import bh.f;
import bh.h;
import bh.i;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class d implements a {
    public final a a;
    public i c;
    public f d;
    public int e;
    public a f;
    public boolean h;
    public boolean n;
    public RecordingCanvas r;
    public Runnable v;
    public final pe.b s = new pe.b(true);
    public final RenderNode b = y.c();

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

    public final void b() {
        if (!this.n) {
            throw new IllegalStateException();
        }
        this.b.endRecording();
        this.n = false;
        this.r = null;
    }

    public final int c(int i10, int i11, List list) {
        RectF rectF;
        Iterator it = this.s.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            dh.e eVar = (dh.e) it.next();
            boolean v = eVar.v();
            dh.c cVar = eVar.h;
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

    public final void d() {
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((dh.e) it.next()).M = true;
        }
    }

    @Override // gh.a
    public final void e() {
        Runnable runnable = this.v;
        if (runnable != null) {
            runnable.run();
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

    public final void j(h hVar) {
        if (this.c == null) {
            this.c = new i(this.b, hVar);
        }
    }

    @Override // gh.a
    public final dh.d k() {
        dh.e eVar = new dh.e(this);
        this.s.add(eVar);
        return eVar;
    }

    public final void l() {
        this.c.a();
    }

    @Override // gh.a
    public final void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        f fVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.v(canvas, f7, f10, f11, f12);
                return;
            }
            return;
        }
        if (this.n) {
            throw new IllegalStateException();
        }
        a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.v(canvas, f7, f10, f11, f12);
        }
        canvas.save();
        if (!this.h) {
            canvas.clipRect(f7, f10, f11, f12);
        }
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.d) == null) {
            canvas.drawRenderNode(this.b);
        } else {
            fVar.c(canvas, this.e);
        }
        canvas.restore();
    }
}
