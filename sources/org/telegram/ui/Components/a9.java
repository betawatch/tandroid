package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class a9 implements te.f, we.a {
    public final ImageReceiver a;
    public final w8 b;
    public long c;
    public boolean d;
    public final /* synthetic */ b9 e;

    public a9(b9 b9Var, View view) {
        this.e = b9Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.J0(b9Var.e / 2);
        w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
        this.b = w8Var;
        w8Var.u(org.telegram.messenger.g0.L(22.0f));
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
        return (obj instanceof a9) && this.c == ((a9) obj).c;
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
