package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class p40 extends FrameLayout {
    public l40 a;
    public o40 b;
    public n40 c;
    public boolean d;

    public static boolean d(int i3) {
        xi.a aVar = xi.e.d;
        aVar.a();
        if (!aVar.c) {
            return !((org.telegram.messenger.h0) org.telegram.messenger.hp.s1(i3).x7.g0.b).c;
        }
        aVar.a();
        return aVar.d;
    }

    public abstract void a(boolean z10);

    public abstract void b(float f10, int i3);

    public abstract void c(boolean z10);

    public abstract boolean e();

    public abstract void f(float f10);

    public abstract void g(int i3, int i10, int i11, long j10, long j11, boolean z10);

    public abstract View getButtonsLayout();

    public abstract m40 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(eh.c cVar, org.telegram.ui.ki kiVar);

    public abstract void i(boolean z10);

    public abstract void j();

    public final void setAnimationCallback(l40 l40Var) {
        this.a = l40Var;
    }

    public abstract void setInternalPadding(int i3);

    public abstract void setIsMessageTransition(boolean z10);

    public final void setRecordingUiFrameCallback(n40 n40Var) {
        this.c = n40Var;
        if (n40Var != null) {
            boolean z10 = this.d;
            org.telegram.ui.mj mjVar = ((org.telegram.ui.si) n40Var).a.a0;
            if (mjVar != null) {
                mjVar.setRoundVideoUiFrameClockActive(z10);
            }
        }
    }

    public final void setTrimCallback(o40 o40Var) {
        this.b = o40Var;
    }
}
