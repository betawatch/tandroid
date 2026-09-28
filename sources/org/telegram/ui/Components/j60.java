package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public abstract class j60 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public f60 a;
    public i60 b;
    public h60 c;
    public boolean d;

    public static void setUseCamera2Implementation(boolean z10) {
        pi.a aVar = pi.e.b;
        synchronized (aVar) {
            aVar.c = z10;
            aVar.b = true;
            pi.d.a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
        }
    }

    public abstract void a(boolean z10);

    public abstract void b(float f7, int i10);

    public abstract void c(boolean z10);

    public abstract boolean d();

    public abstract void e(float f7);

    public abstract void f(int i10, int i11, int i12, long j3, long j10, boolean z10);

    public abstract void g(ah.c cVar, org.telegram.ui.gj gjVar);

    public abstract View getButtonsLayout();

    public abstract g60 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(boolean z10);

    public abstract void i();

    public final void setAnimationCallback(f60 f60Var) {
        this.a = f60Var;
    }

    public abstract void setInternalPadding(int i10);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(h60 h60Var) {
        this.c = h60Var;
        if (h60Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.jk jkVar = ((org.telegram.ui.nj) h60Var).a.Y;
            if (jkVar != null) {
                jkVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(i60 i60Var) {
        this.b = i60Var;
    }
}
