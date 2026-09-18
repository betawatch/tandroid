package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public abstract class f60 extends FrameLayout {
    public static volatile boolean c = true;
    public c60 a;
    public e60 b;

    public static void setUseCamera2Implementation(boolean z10) {
        c = z10;
    }

    public abstract void a(boolean z10);

    public abstract void b(float f7, int i10);

    public final void c(float f7, float f10) {
        org.telegram.ui.lk lkVar;
        j81 j81Var;
        e60 e60Var = this.b;
        if (e60Var == null || (lkVar = ((org.telegram.ui.qe) e60Var).b.Y) == null || (j81Var = lkVar.f1) == null) {
            return;
        }
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        j81Var.b = max;
        j81Var.c = Math.max(max, Math.min(1.0f, f10));
        j81Var.invalidate();
    }

    public abstract void d(boolean z10);

    public abstract boolean e();

    public abstract void f(float f7);

    public abstract void g(int i10, int i11, int i12, long j3, long j10, boolean z10);

    public abstract View getButtonsLayout();

    public abstract d60 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(ah.c cVar, org.telegram.ui.ij ijVar);

    public abstract void i(boolean z10);

    public abstract void j();

    public final void setAnimationCallback(c60 c60Var) {
        this.a = c60Var;
    }

    public abstract void setInternalPadding(int i10);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setTrimCallback(e60 e60Var) {
        this.b = e60Var;
    }
}
