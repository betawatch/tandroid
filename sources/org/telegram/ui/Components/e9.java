package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e9 implements te.f, we.a {
    public final ImageReceiver a;
    public final a9 b;
    public long c;
    public boolean d;
    public final /* synthetic */ f9 e;

    public e9(f9 f9Var, View view) {
        this.e = f9Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.K0(f9Var.e / 2);
        a9 a9Var = new a9((org.telegram.ui.ActionBar.i6) null);
        this.b = a9Var;
        a9Var.u(org.telegram.messenger.g0.L(22.0f));
    }

    @Override // we.a
    public final void a() {
        if (this.d) {
            this.d = false;
            this.a.S();
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
        return (obj instanceof e9) && this.c == ((e9) obj).c;
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
