package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class m9 implements le.h, oe.a {
    public final ImageReceiver a;
    public final i9 b;
    public long c;
    public boolean d;
    public final /* synthetic */ n9 e;

    public m9(n9 n9Var, ViewGroup viewGroup) {
        this.e = n9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.a = imageReceiver;
        imageReceiver.setRoundRadius(n9Var.e / 2);
        i9 i9Var = new i9((org.telegram.ui.ActionBar.f6) null);
        this.b = i9Var;
        i9Var.u(AndroidUtilities.dp(22.0f));
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
        return (obj instanceof m9) && this.c == ((m9) obj).c;
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
