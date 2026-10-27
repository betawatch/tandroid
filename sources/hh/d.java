package hh;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.x;
import ch.f;
import ch.h;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class d implements a {
    public final a a;
    public h c;
    public f d;
    public int e;
    public a f;
    public oi.c h;
    public boolean n;
    public boolean r;
    public RecordingCanvas s;
    public final se.b v = new se.b();
    public final RenderNode b = x.c();

    public d(a aVar) {
        this.a = aVar;
    }

    public final RecordingCanvas a(int i10, int i11) {
        if (this.r) {
            throw new IllegalStateException();
        }
        this.r = true;
        this.b.setPosition(0, 0, i10, i11);
        RecordingCanvas beginRecording = this.b.beginRecording(i10, i11);
        this.s = beginRecording;
        return beginRecording;
    }

    public final void b() {
        if (!this.r) {
            throw new IllegalStateException();
        }
        this.b.endRecording();
        this.r = false;
        this.s = null;
    }

    public final boolean c(int i10, int i11) {
        return (this.b.hasDisplayList() && this.b.getWidth() == i10 && this.b.getHeight() == i11) ? false : true;
    }

    public final void d(float f7) {
        this.b.setRenderEffect(f7 > 0.0f ? RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP) : null);
    }

    public final void e(float f7, RenderEffect renderEffect) {
        this.b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    @Override // hh.a
    public final eh.d f() {
        eh.e eVar = new eh.e(this);
        this.v.add(eVar);
        return eVar;
    }

    public final void g(int i10, int i11) {
        this.b.setPosition(0, 0, i10, i11);
    }

    @Override // ri.a
    public final void w(Canvas canvas, float f7, float f10, float f11, float f12) {
        f fVar;
        oi.c cVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.w(canvas, f7, f10, f11, f12);
                return;
            }
            return;
        }
        if (this.r) {
            throw new IllegalStateException();
        }
        a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.w(canvas, f7, f10, f11, f12);
        }
        canvas.save();
        if (!this.n) {
            canvas.clipRect(f7, f10, f11, f12);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && (cVar = this.h) != null) {
            cVar.w(canvas, f7, f10, f11, f12);
        } else if (i10 < 31 || (fVar = this.d) == null) {
            canvas.drawRenderNode(this.b);
        } else {
            fVar.c(canvas, this.e);
        }
        canvas.restore();
    }
}
