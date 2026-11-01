package hi;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.w;
import tg.h;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class f implements a, tg.a, fi.a {
    public final a a;
    public h c;
    public tg.f d;
    public int e;
    public a f;
    public ei.d h;
    public boolean n;
    public boolean r;
    public RecordingCanvas s;
    public final je.b w = new je.b();
    public final RenderNode b = w.n();

    public f(a aVar) {
        this.a = aVar;
    }

    @Override // fi.a
    public final int a() {
        ei.d dVar = this.h;
        if (dVar == null) {
            dVar = null;
        }
        if (dVar != null) {
            return dVar.a();
        }
        return 0;
    }

    @Override // tg.a
    public final vg.f b() {
        vg.f fVar = new vg.f(this, this, this);
        c(fVar);
        return fVar;
    }

    @Override // tg.a
    public final void c(vg.f fVar) {
        this.w.add(fVar);
    }

    @Override // fi.a
    public final void d(float f7, float f10, int i10, Canvas canvas, RectF rectF) {
        Canvas canvas2;
        tg.f fVar;
        ei.d dVar = this.h;
        if (dVar == null) {
            dVar = null;
        }
        ei.d dVar2 = dVar;
        if (this.f != null || dVar2 == null) {
            canvas.save();
            float f11 = 1.0f / i10;
            canvas.scale(f11, f11);
            canvas.translate(-f7, -f10);
            a aVar = this.f;
            if (aVar != null) {
                float f12 = i10 * 2;
                canvas2 = canvas;
                aVar.e(canvas2, rectF.left - f12, rectF.top - f12, rectF.right + f12, rectF.bottom + f12);
            } else {
                canvas2 = canvas;
            }
            if (dVar2 == null && Build.VERSION.SDK_INT >= 31 && (fVar = this.d) != null) {
                fVar.c(canvas2, this.e);
            }
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (dVar2 != null) {
            dVar2.d(f7, f10, i10, canvas2, rectF);
        }
    }

    @Override // hi.a
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        tg.f fVar;
        ei.d dVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.e(canvas, f7, f10, f11, f12);
                return;
            }
            return;
        }
        if (this.r) {
            throw new IllegalStateException();
        }
        a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.e(canvas, f7, f10, f11, f12);
        }
        canvas.save();
        if (!this.n) {
            canvas.clipRect(f7, f10, f11, f12);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && (dVar = this.h) != null) {
            dVar.e(canvas, f7, f10, f11, f12);
        } else if (i10 < 31 || (fVar = this.d) == null) {
            canvas.drawRenderNode(this.b);
        } else {
            fVar.c(canvas, this.e);
        }
        canvas.restore();
    }

    @Override // fi.a
    public final int f() {
        tg.f fVar;
        tg.d dVar;
        ei.d dVar2 = this.h;
        if (dVar2 == null) {
            dVar2 = null;
        }
        if (dVar2 != null) {
            return dVar2.f();
        }
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.d) == null) {
            return 1;
        }
        int i10 = this.e;
        if (!fVar.a || fVar.k == 0) {
            return 1;
        }
        tg.e eVar = (tg.e) fVar.j.get(0);
        return ((i10 == -2 || i10 == -4) && (dVar = eVar.c) != null) ? dVar.e : eVar.b.e;
    }

    @Override // fi.a
    public final int g() {
        ei.d dVar = this.h;
        if (dVar == null) {
            dVar = null;
        }
        if (dVar != null) {
            return dVar.g();
        }
        return 0;
    }

    @Override // fi.a
    public final boolean h() {
        return f() > 1;
    }

    public final RecordingCanvas i(int i10, int i11) {
        if (this.r) {
            throw new IllegalStateException();
        }
        this.r = true;
        this.b.setPosition(0, 0, i10, i11);
        RecordingCanvas beginRecording = this.b.beginRecording(i10, i11);
        this.s = beginRecording;
        return beginRecording;
    }

    public final void j() {
        if (!this.r) {
            throw new IllegalStateException();
        }
        this.b.endRecording();
        this.r = false;
        this.s = null;
    }

    public final boolean k(int i10, int i11) {
        return (this.b.hasDisplayList() && this.b.getWidth() == i10 && this.b.getHeight() == i11) ? false : true;
    }

    public final void l(float f7) {
        this.b.setRenderEffect(f7 > 0.0f ? RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP) : null);
    }

    public final void m(float f7, RenderEffect renderEffect) {
        this.b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void n(int i10, int i11) {
        this.b.setPosition(0, 0, i10, i11);
    }
}
