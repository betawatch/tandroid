package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class h50 extends FrameLayout {
    public d50 a;
    public g50 b;
    public f50 c;
    public boolean d;

    public static boolean e(int i7) {
        aj.a aVar = aj.e.d;
        aVar.a();
        if (!aVar.c) {
            return !((org.telegram.messenger.h0) org.telegram.messenger.mp.u1(i7).A7.m0.b).c;
        }
        aVar.a();
        return aVar.d;
    }

    public abstract void a(boolean z10);

    public abstract void b(float f10, int i7);

    public abstract void c(boolean z10);

    public abstract void d(boolean z10);

    public abstract boolean f();

    public abstract void g(float f10);

    public abstract View getButtonsLayout();

    public abstract e50 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(int i7, int i10, int i11, long j3, long j10, boolean z10);

    public abstract void i(dh.c cVar, org.telegram.ui.pi piVar);

    public abstract void j(boolean z10);

    public abstract void k();

    public final void setAnimationCallback(d50 d50Var) {
        this.a = d50Var;
    }

    public abstract void setInternalPadding(int i7);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(f50 f50Var) {
        this.c = f50Var;
        if (f50Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.rj rjVar = ((org.telegram.ui.xi) f50Var).a.a0;
            if (rjVar != null) {
                rjVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(g50 g50Var) {
        this.b = g50Var;
    }
}
