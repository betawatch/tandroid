package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public abstract class e60 extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public b60 a;
    public d60 b;

    public static void setUseCamera2Implementation(boolean z10) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("round_video_camera2_enabled", z10).apply();
    }

    public abstract void a(boolean z10);

    public abstract void b(float f7, int i10);

    public abstract void c(boolean z10);

    public abstract boolean d();

    public abstract void e(float f7);

    public abstract void f(int i10, int i11, int i12, long j3, long j10, boolean z10);

    public abstract void g(ah.c cVar, org.telegram.ui.ij ijVar);

    public abstract View getButtonsLayout();

    public abstract c60 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(boolean z10);

    public abstract void i();

    public final void setAnimationCallback(b60 b60Var) {
        this.a = b60Var;
    }

    public abstract void setInternalPadding(int i10);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setTrimCallback(d60 d60Var) {
        this.b = d60Var;
    }
}
