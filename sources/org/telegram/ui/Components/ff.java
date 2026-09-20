package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ qv0 a;
    public final /* synthetic */ hp0 b;

    public ff(qv0 qv0Var, hp0 hp0Var) {
        this.a = qv0Var;
        this.b = hp0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        qv0 qv0Var = this.a;
        qv0Var.post(new org.telegram.messenger.video.o(this, qv0Var, this.b, 11));
    }
}
