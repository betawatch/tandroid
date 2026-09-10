package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class k9 implements le.h, oe.a {
    public final ImageReceiver a;
    public final g9 b;
    public long c;
    public boolean d;
    public final /* synthetic */ l9 e;

    public k9(l9 l9Var, ViewGroup viewGroup) {
        this.e = l9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.a = imageReceiver;
        imageReceiver.setRoundRadius(l9Var.e / 2);
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        this.b = g9Var;
        g9Var.u(AndroidUtilities.dp(22.0f));
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
        return (obj instanceof k9) && this.c == ((k9) obj).c;
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
