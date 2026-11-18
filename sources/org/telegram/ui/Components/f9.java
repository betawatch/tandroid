package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class f9 implements te.f, we.a {
    public final ImageReceiver a;
    public final b9 b;
    public long c;
    public boolean d;
    public final /* synthetic */ g9 e;

    public f9(g9 g9Var, View view) {
        this.e = g9Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.J0(g9Var.e / 2);
        b9 b9Var = new b9((org.telegram.ui.ActionBar.i6) null);
        this.b = b9Var;
        b9Var.u(org.telegram.messenger.g0.L(22.0f));
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
        return (obj instanceof f9) && this.c == ((f9) obj).c;
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
