package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class t40 extends FrameLayout {
    public p40 a;
    public s40 b;
    public r40 c;
    public boolean d;

    public static boolean e(int i7) {
        xi.a aVar = xi.e.d;
        aVar.a();
        if (!aVar.c) {
            return !((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(i7).x7.g0.b).c;
        }
        aVar.a();
        return aVar.d;
    }

    public abstract void a(boolean z9);

    public abstract void b(float f10, int i7);

    public abstract void c(boolean z9);

    public abstract void d(boolean z9);

    public abstract boolean f();

    public abstract void g(float f10);

    public abstract View getButtonsLayout();

    public abstract q40 getCameraContainer();

    public abstract RectF getCameraRect();

    public abstract View getMuteImageView();

    public abstract Paint getPaint();

    public abstract TextureView getTextureView();

    public abstract void h(int i7, int i10, int i11, long j3, long j10, boolean z9);

    public abstract void i(dh.c cVar, org.telegram.ui.qi qiVar);

    public abstract void j(boolean z9);

    public abstract void k();

    public final void setAnimationCallback(p40 p40Var) {
        this.a = p40Var;
    }

    public abstract void setInternalPadding(int i7);

    public abstract void setIsMessageTransition(boolean z9);

    public final void setRecordingUiFrameCallback(r40 r40Var) {
        this.c = r40Var;
        if (r40Var != null) {
            boolean z9 = this.d;
            org.telegram.ui.sj sjVar = ((org.telegram.ui.yi) r40Var).a.Z;
            if (sjVar != null) {
                sjVar.setRoundVideoUiFrameClockActive(z9);
            }
        }
    }

    public final void setTrimCallback(s40 s40Var) {
        this.b = s40Var;
    }
}
