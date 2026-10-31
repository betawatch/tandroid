package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v8 implements fe.i, ie.a {
    public final ImageReceiver a;
    public final r8 b;
    public long c;
    public boolean d;
    public final /* synthetic */ w8 e;

    public v8(w8 w8Var, View view) {
        this.e = w8Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.J0(w8Var.e / 2);
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        this.b = r8Var;
        r8Var.u(org.telegram.messenger.i0.L(22.0f));
    }

    @Override // ie.a
    public final void a() {
        if (this.d) {
            this.d = false;
            this.a.R();
        }
        this.c = 0L;
    }

    @Override // fe.i
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.e.f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v8) && this.c == ((v8) obj).c;
    }

    @Override // fe.i
    public final int getHeight() {
        return this.e.e;
    }

    @Override // fe.i
    public final int getWidth() {
        return this.e.e;
    }
}
