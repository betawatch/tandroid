package fh;

import ah.f;
import ah.i;
import ah.k;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class d implements a {
    public final a a;
    public final RenderNode b = f.c();
    public k c;
    public i d;
    public int e;
    public a f;
    public li.c h;
    public boolean n;
    public boolean r;
    public RecordingCanvas s;

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

    @Override // fh.a
    public final ch.d b() {
        return new ch.e(this);
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

    public final void e(float f7) {
        this.b.setRenderEffect(f7 > 0.0f ? RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP) : null);
    }

    public final void f(float f7, RenderEffect renderEffect) {
        this.b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void g(int i10, int i11) {
        this.b.setPosition(0, 0, i10, i11);
    }

    @Override // oi.a
    public final void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        i iVar;
        li.c cVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.v(canvas, f7, f10, f11, f12);
                return;
            }
            return;
        }
        if (this.r) {
            throw new IllegalStateException();
        }
        a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.v(canvas, f7, f10, f11, f12);
        }
        canvas.save();
        if (!this.n) {
            canvas.clipRect(f7, f10, f11, f12);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && (cVar = this.h) != null) {
            cVar.v(canvas, f7, f10, f11, f12);
        } else if (i10 < 31 || (iVar = this.d) == null) {
            canvas.drawRenderNode(this.b);
        } else {
            iVar.c(canvas, this.e);
        }
        canvas.restore();
    }
}
