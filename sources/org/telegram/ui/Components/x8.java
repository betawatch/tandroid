package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x8 implements te.f, we.a {
    public final ImageReceiver a;
    public final t8 b;
    public long c;
    public boolean d;
    public final /* synthetic */ y8 e;

    public x8(y8 y8Var, View view) {
        this.e = y8Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.J0(y8Var.e / 2);
        t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
        this.b = t8Var;
        t8Var.u(org.telegram.messenger.g0.L(22.0f));
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
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.e.f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x8) && this.c == ((x8) obj).c;
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
