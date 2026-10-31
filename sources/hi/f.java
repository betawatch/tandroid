package hi;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.support.v4.media.session.w;
import tg.h;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class f implements a, tg.a {
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

    @Override // tg.a
    public final vg.f a() {
        vg.f fVar = new vg.f(this);
        this.w.add(fVar);
        return fVar;
    }

    public final RecordingCanvas b(int i10, int i11) {
        if (this.r) {
            throw new IllegalStateException();
        }
        this.r = true;
        this.b.setPosition(0, 0, i10, i11);
        RecordingCanvas beginRecording = this.b.beginRecording(i10, i11);
        this.s = beginRecording;
        return beginRecording;
    }

    public final void c() {
        if (!this.r) {
            throw new IllegalStateException();
        }
        this.b.endRecording();
        this.r = false;
        this.s = null;
    }

    public final boolean d(int i10, int i11) {
        return (this.b.hasDisplayList() && this.b.getWidth() == i10 && this.b.getHeight() == i11) ? false : true;
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

    public final void f(float f7) {
        this.b.setRenderEffect(f7 > 0.0f ? RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP) : null);
    }

    public final void g(float f7, RenderEffect renderEffect) {
        this.b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void h(int i10, int i11) {
        this.b.setPosition(0, 0, i10, i11);
    }
}
