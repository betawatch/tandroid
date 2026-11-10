package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class z8 implements te.f, we.a {
    public final ImageReceiver a;
    public final v8 b;
    public long c;
    public boolean d;
    public final /* synthetic */ a9 e;

    public z8(a9 a9Var, View view) {
        this.e = a9Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.J0(a9Var.e / 2);
        v8 v8Var = new v8((org.telegram.ui.ActionBar.h6) null);
        this.b = v8Var;
        v8Var.u(org.telegram.messenger.g0.L(22.0f));
    }

    @Override // we.a
    public final void a() {
        if (this.d) {
            this.d = false;
            this.a.R();
        }
        this.c = 0L;
    }

    @Override // te.f
    public final int b(boolean z9) {
        if (z9) {
            return 0;
        }
        return -this.e.f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z8) && this.c == ((z8) obj).c;
    }

    @Override // te.f
    public final int getHeight() {
        return this.e.e;
    }

    @Override // te.f
    public final int getWidth() {
        return this.e.e;
    }
}
