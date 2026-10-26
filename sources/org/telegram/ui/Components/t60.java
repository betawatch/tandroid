package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class t60 extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public p60 a;
    public s60 b;
    public r60 c;
    public boolean d;

    public abstract void a(boolean z10);

    public abstract void b(float f7, int i10);

    public abstract void c(boolean z10);

    public abstract boolean d();

    public abstract void e(float f7);

    public abstract void f(int i10, int i11, int i12, long j10, long j11, boolean z10);

    public abstract void g(ch.b bVar, org.telegram.ui.cj cjVar);

    public abstract View getButtonsLayout();

    public abstract q60 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(boolean z10);

    public abstract void i();

    public final void setAnimationCallback(p60 p60Var) {
        this.a = p60Var;
    }

    public abstract void setInternalPadding(int i10);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(r60 r60Var) {
        this.c = r60Var;
        if (r60Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.hk hkVar = ((org.telegram.ui.kj) r60Var).a.Y;
            if (hkVar != null) {
                hkVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(s60 s60Var) {
        this.b = s60Var;
    }
}
