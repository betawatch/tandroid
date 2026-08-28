package ng;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.z;
import ig.g;
import ig.h;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d implements a {
    public final a a;
    public h c;
    public ig.e d;
    public int e;
    public a f;
    public boolean h;
    public boolean n;
    public RecordingCanvas r;
    public Runnable v;
    public final xd.b s = new xd.b(true);
    public final RenderNode b = z.c();

    public d(a aVar) {
        this.a = aVar;
    }

    @Override // ng.a
    public final void T0(Canvas canvas, float f10, float f11, float f12, float f13) {
        ig.e eVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.T0(canvas, f10, f11, f12, f13);
                return;
            }
            return;
        }
        if (this.n) {
            throw new IllegalStateException();
        }
        a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.T0(canvas, f10, f11, f12, f13);
        }
        canvas.save();
        if (!this.h) {
            canvas.clipRect(f10, f11, f12, f13);
        }
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.d) == null) {
            canvas.drawRenderNode(this.b);
        } else {
            eVar.c(canvas, this.e);
        }
        canvas.restore();
    }

    public final RecordingCanvas a(int i9, int i10) {
        if (this.n) {
            throw new IllegalStateException();
        }
        this.n = true;
        this.b.setPosition(0, 0, i9, i10);
        RecordingCanvas beginRecording = this.b.beginRecording(i9, i10);
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

    public final int c(List list, int i9, int i10) {
        RectF rectF;
        Iterator it = this.s.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            kg.e eVar = (kg.e) it.next();
            boolean v = eVar.v();
            kg.c cVar = eVar.h;
            if (v && eVar.j > 0 && !cVar.m.isEmpty()) {
                if (i9 < list.size()) {
                    rectF = (RectF) list.get(i9);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(cVar.m);
                rectF.offset(eVar.a, eVar.b);
                float f10 = -i10;
                rectF.inset(f10, f10);
                i9++;
                i11++;
            }
        }
        return i11;
    }

    public final void d() {
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((kg.e) it.next()).M = true;
        }
    }

    public final boolean e(int i9, int i10) {
        return (this.b.hasDisplayList() && this.b.getWidth() == i9 && this.b.getHeight() == i10) ? false : true;
    }

    public final void f(float f10) {
        this.b.setRenderEffect(f10 > 0.0f ? RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP) : null);
    }

    public final void g(float f10, RenderEffect renderEffect) {
        this.b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void h(int i9, int i10) {
        this.b.setPosition(0, 0, i9, i10);
    }

    public final void i(g gVar) {
        if (this.c == null) {
            this.c = new h(this.b, gVar);
        }
    }

    public final void j() {
        this.c.a();
    }

    @Override // ng.a
    public final void t() {
        Runnable runnable = this.v;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // ng.a
    public final kg.d y() {
        kg.e eVar = new kg.e(this);
        this.s.add(eVar);
        return eVar;
    }
}
