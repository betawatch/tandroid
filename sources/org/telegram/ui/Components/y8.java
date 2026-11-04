package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y8 implements qe.f, te.a {
    public final ImageReceiver a;
    public final u8 b;
    public long c;
    public boolean d;
    public final /* synthetic */ z8 e;

    public y8(z8 z8Var, View view) {
        this.e = z8Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.J0(z8Var.e / 2);
        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
        this.b = u8Var;
        u8Var.u(org.telegram.messenger.g0.L(22.0f));
    }

    @Override // te.a
    public final void a() {
        if (this.d) {
            this.d = false;
            this.a.R();
        }
        this.c = 0L;
    }

    @Override // qe.f
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.e.f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y8) && this.c == ((y8) obj).c;
    }

    @Override // qe.f
    public final int getHeight() {
        return this.e.e;
    }

    @Override // qe.f
    public final int getWidth() {
        return this.e.e;
    }
}
