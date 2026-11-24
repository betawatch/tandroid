// default package

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nz4 implements iz4, jm0, ty4 {
    public final iz4 a;
    public v89 c;
    public mr3 d;
    public int e;
    public iz4 f;
    public fy4 h;
    public boolean n;
    public boolean r;
    public RecordingCanvas s;
    public final g79 w = new g79(0, false);
    public final RenderNode b = ul1.k();

    public nz4(iz4 iz4Var) {
        this.a = iz4Var;
    }

    @Override // ty4
    public final int a() {
        fy4 fy4Var = this.h;
        if (fy4Var == null) {
            fy4Var = null;
        }
        if (fy4Var != null) {
            return fy4Var.a();
        }
        return 0;
    }

    @Override // jm0
    public final im0 b() {
        im0 im0Var = new im0(this, this, this);
        c(im0Var);
        return im0Var;
    }

    @Override // jm0
    public final void c(im0 im0Var) {
        this.w.add(im0Var);
    }

    @Override // ty4
    public final void d(float f, float f2, int i, Canvas canvas, RectF rectF) {
        mr3 mr3Var;
        fy4 fy4Var = this.h;
        if (fy4Var == null) {
            fy4Var = null;
        }
        if (this.f != null || fy4Var == null) {
            canvas.save();
            float f3 = 1.0f / i;
            canvas.scale(f3, f3);
            canvas.translate(-f, -f2);
            iz4 iz4Var = this.f;
            if (iz4Var != null) {
                float f4 = i << 1;
                iz4Var.e(rectF.left - f4, rectF.top - f4, rectF.right + f4, rectF.bottom + f4, canvas);
            }
            if (fy4Var == null && Build.VERSION.SDK_INT >= 31 && (mr3Var = this.d) != null) {
                mr3Var.c(canvas, this.e);
            }
            canvas.restore();
        }
        if (fy4Var != null) {
            fy4Var.d(f, f2, i, canvas, rectF);
        }
    }

    @Override // iz4
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        if (!canvas.isHardwareAccelerated()) {
            iz4 iz4Var = this.a;
            if (iz4Var != null) {
                iz4Var.e(f, f2, f3, f4, canvas);
                return;
            }
            return;
        }
        if (this.r) {
            rjb.h();
            return;
        }
        iz4 iz4Var2 = this.f;
        if (iz4Var2 != null) {
            iz4Var2.e(f, f2, f3, f4, canvas);
        }
        canvas.save();
        if (!this.n) {
            canvas.clipRect(f, f2, f3, f4);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            fy4 fy4Var = this.h;
            if (fy4Var != null) {
                fy4Var.e(f, f2, f3, f4, canvas);
            } else {
                mr3 mr3Var = this.d;
                if (mr3Var != null) {
                    mr3Var.c(canvas, this.e);
                }
            }
            canvas.restore();
        }
        canvas.drawRenderNode(this.b);
        canvas.restore();
    }

    @Override // ty4
    public final int f() {
        mr3 mr3Var;
        kr3 kr3Var;
        fy4 fy4Var = this.h;
        if (fy4Var == null) {
            fy4Var = null;
        }
        if (fy4Var != null) {
            return fy4Var.f();
        }
        if (Build.VERSION.SDK_INT < 31 || (mr3Var = this.d) == null) {
            return 1;
        }
        int i = this.e;
        if (!mr3Var.a || mr3Var.k == 0) {
            return 1;
        }
        lr3 lr3Var = (lr3) mr3Var.j.get(0);
        return ((i == -2 || i == -4) && (kr3Var = lr3Var.c) != null) ? kr3Var.e : lr3Var.b.e;
    }

    @Override // ty4
    public final int g() {
        fy4 fy4Var = this.h;
        if (fy4Var == null) {
            fy4Var = null;
        }
        if (fy4Var != null) {
            return fy4Var.g();
        }
        return 0;
    }

    @Override // ty4
    public final boolean h() {
        return f() > 1;
    }

    public final RecordingCanvas i(int i, int i2) {
        if (this.r) {
            rjb.h();
            return null;
        }
        this.r = true;
        this.b.setPosition(0, 0, i, i2);
        RecordingCanvas beginRecording = this.b.beginRecording(i, i2);
        this.s = beginRecording;
        return beginRecording;
    }

    public final void j() {
        if (!this.r) {
            rjb.h();
            return;
        }
        this.b.endRecording();
        this.r = false;
        this.s = null;
    }

    public final boolean k(int i, int i2) {
        return (this.b.hasDisplayList() && this.b.getWidth() == i && this.b.getHeight() == i2) ? false : true;
    }

    public final void l(float f) {
        this.b.setRenderEffect(f > 0.0f ? RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP) : null);
    }

    public final void m(float f, RenderEffect renderEffect) {
        this.b.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP), renderEffect));
    }

    public final void n(int i, int i2) {
        this.b.setPosition(0, 0, i, i2);
    }
}
