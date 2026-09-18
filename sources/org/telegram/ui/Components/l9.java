package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class l9 implements le.h, oe.a {
    public final ImageReceiver a;
    public final h9 b;
    public long c;
    public boolean d;
    public final /* synthetic */ m9 e;

    public l9(m9 m9Var, ViewGroup viewGroup) {
        this.e = m9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.a = imageReceiver;
        imageReceiver.setRoundRadius(m9Var.e / 2);
        h9 h9Var = new h9((org.telegram.ui.ActionBar.e6) null);
        this.b = h9Var;
        h9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override // oe.a
    public final void a() {
        if (this.d) {
            this.d = false;
            this.a.onDetachedFromWindow();
        }
        this.c = 0L;
    }

    @Override // le.h
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.e.f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l9) && this.c == ((l9) obj).c;
    }

    @Override // le.h
    public final int getHeight() {
        return this.e.e;
    }

    @Override // le.h
    public final int getWidth() {
        return this.e.e;
    }
}
