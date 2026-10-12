package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class u60 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public q60 a;
    public t60 b;
    public s60 c;
    public boolean d;

    public abstract void a(boolean z10);

    public abstract void b(float f7, int i10);

    public abstract void c(boolean z10);

    public abstract boolean d();

    public abstract void e(float f7);

    public abstract void f(int i10, int i11, int i12, long j10, long j11, boolean z10);

    public abstract void g(bh.b bVar, org.telegram.ui.oj ojVar);

    public abstract View getButtonsLayout();

    public abstract r60 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(boolean z10);

    public abstract void i();

    public final void setAnimationCallback(q60 q60Var) {
        this.a = q60Var;
    }

    public abstract void setInternalPadding(int i10);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(s60 s60Var) {
        this.c = s60Var;
        if (s60Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.sk skVar = ((org.telegram.ui.wj) s60Var).a.Y;
            if (skVar != null) {
                skVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(t60 t60Var) {
        this.b = t60Var;
    }
}
