package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AppGlobalConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class u60 extends FrameLayout {
    public q60 a;
    public t60 b;
    public s60 c;
    public boolean d;

    public static boolean d(int i10) {
        wi.a aVar = wi.e.d;
        aVar.a();
        if (!aVar.c) {
            return !AppGlobalConfig.getInstance(i10).roundVideoRecorderV2Disabled.get();
        }
        aVar.a();
        return aVar.d;
    }

    public abstract void a(boolean z10);

    public abstract void b(float f7, int i10);

    public abstract void c(boolean z10);

    public abstract boolean e();

    public abstract void f(float f7);

    public abstract void g(int i10, int i11, int i12, long j10, long j11, boolean z10);

    public abstract View getButtonsLayout();

    public abstract r60 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(ch.b bVar, org.telegram.ui.fj fjVar);

    public abstract void i(boolean z10);

    public abstract void j();

    public final void setAnimationCallback(q60 q60Var) {
        this.a = q60Var;
    }

    public abstract void setInternalPadding(int i10);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(s60 s60Var) {
        this.c = s60Var;
        if (s60Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.jk jkVar = ((org.telegram.ui.nj) s60Var).a.Y;
            if (jkVar != null) {
                jkVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(t60 t60Var) {
        this.b = t60Var;
    }
}
