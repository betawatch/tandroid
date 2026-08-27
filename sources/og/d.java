package og;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.z;
import java.util.Iterator;
import java.util.List;
import jg.g;
import jg.h;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d implements a {
    public final a a;
    public h c;
    public jg.e d;
    public int e;
    public a f;
    public boolean h;
    public boolean n;
    public RecordingCanvas r;
    public Runnable v;
    public final yd.b s = new yd.b(true);
    public final RenderNode b = z.c();

    public d(a aVar) {
        this.a = aVar;
    }

    @Override // og.a
    public final void T0(Canvas canvas, float f10, float f11, float f12, float f13) {
        jg.e eVar;
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

    public final int c(List list, int i10, int i11) {
        RectF rectF;
        Iterator it = this.s.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            lg.e eVar = (lg.e) it.next();
            boolean v = eVar.v();
            lg.c cVar = eVar.h;
            if (v && eVar.j > 0 && !cVar.m.isEmpty()) {
                if (i10 < list.size()) {
                    rectF = (RectF) list.get(i10);
                } else {
                    rectF = new RectF();
                    list.add(rectF);
                }
                rectF.set(cVar.m);
                rectF.offset(eVar.a, eVar.b);
                float f10 = -i11;
                rectF.inset(f10, f10);
                i10++;
                i12++;
            }
        }
        return i12;
    }

    public final void d() {
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((lg.e) it.next()).M = true;
        }
    }

    public final boolean e(int i10, int i11) {
        return (this.b.hasDisplayList() && this.b.getWidth() == i10 && this.b.getHeight() == i11) ? false : true;
    }

    public final void f(float f10) {
        this.b.setRenderEffect(f10 > 0.0f ? RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP) : null);
    }

    public final void g(float f10, RenderEffect renderEffect) {
        this.b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void h(int i10, int i11) {
        this.b.setPosition(0, 0, i10, i11);
    }

    public final void i(g gVar) {
        if (this.c == null) {
            this.c = new h(this.b, gVar);
        }
    }

    public final void j() {
        this.c.a();
    }

    @Override // og.a
    public final void r() {
        Runnable runnable = this.v;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // og.a
    public final lg.d w() {
        lg.e eVar = new lg.e(this);
        this.s.add(eVar);
        return eVar;
    }
}
