package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i9 implements vd.g, yd.a {
    public final ImageReceiver a;
    public final e9 b;
    public long c;
    public boolean d;
    public final /* synthetic */ j9 e;

    public i9(j9 j9Var, ViewGroup viewGroup) {
        this.e = j9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.a = imageReceiver;
        imageReceiver.setRoundRadius(j9Var.e / 2);
        e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
        this.b = e9Var;
        e9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override // yd.a
    public final void a() {
        if (this.d) {
            this.d = false;
            this.a.onDetachedFromWindow();
        }
        this.c = 0L;
    }

    @Override // vd.g
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.e.f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i9) && this.c == ((i9) obj).c;
    }

    @Override // vd.g
    public final int getHeight() {
        return this.e.e;
    }

    @Override // vd.g
    public final int getWidth() {
        return this.e.e;
    }
}
