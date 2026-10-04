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
import yh.k0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
    public k0 v;

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
    public final void b() {
        k0 k0Var = this.v;
        if (k0Var != null) {
            k0Var.run();
        }
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

    @Override // fh.a
    public final ch.d f() {
        return new ch.e(this);
    }

    public final void g(float f7, RenderEffect renderEffect) {
        this.b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void h(int i10, int i11) {
        this.b.setPosition(0, 0, i10, i11);
    }

    @Override // oi.a
    public final void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        i iVar;
        li.c cVar;
        if (!canvas.isHardwareAccelerated()) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.y(canvas, f7, f10, f11, f12);
                return;
            }
            return;
        }
        if (this.r) {
            throw new IllegalStateException();
        }
        a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.y(canvas, f7, f10, f11, f12);
        }
        canvas.save();
        if (!this.n) {
            canvas.clipRect(f7, f10, f11, f12);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && (cVar = this.h) != null) {
            cVar.y(canvas, f7, f10, f11, f12);
        } else if (i10 < 31 || (iVar = this.d) == null) {
            canvas.drawRenderNode(this.b);
        } else {
            iVar.c(canvas, this.e);
        }
        canvas.restore();
    }
}
