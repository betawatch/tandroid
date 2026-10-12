package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class o9 implements ne.h, qe.a {
    public final ImageReceiver a;
    public final k9 b;
    public long c;
    public boolean d;
    public final /* synthetic */ p9 e;

    public o9(p9 p9Var, ViewGroup viewGroup) {
        this.e = p9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.a = imageReceiver;
        imageReceiver.setRoundRadius(p9Var.e / 2);
        k9 k9Var = new k9((org.telegram.ui.ActionBar.c6) null);
        this.b = k9Var;
        k9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override // qe.a
    public final void a() {
        if (this.d) {
            this.d = false;
            this.a.onDetachedFromWindow();
        }
        this.c = 0L;
    }

    @Override // ne.h
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.e.f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o9) && this.c == ((o9) obj).c;
    }

    @Override // ne.h
    public final int getHeight() {
        return this.e.e;
    }

    @Override // ne.h
    public final int getWidth() {
        return this.e.e;
    }
}
