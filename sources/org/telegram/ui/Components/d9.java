package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d9 implements td.f, wd.a {
    public final ImageReceiver a;
    public final z8 b;
    public long c;
    public boolean d;
    public final /* synthetic */ e9 e;

    public d9(e9 e9Var, ViewGroup viewGroup) {
        this.e = e9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.a = imageReceiver;
        imageReceiver.setRoundRadius(e9Var.e / 2);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
        this.b = z8Var;
        z8Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override // wd.a
    public final void a() {
        if (this.d) {
            this.d = false;
            this.a.onDetachedFromWindow();
        }
        this.c = 0L;
    }

    @Override // td.f
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.e.f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d9) && this.c == ((d9) obj).c;
    }

    @Override // td.f
    public final int getHeight() {
        return this.e.e;
    }

    @Override // td.f
    public final int getWidth() {
        return this.e.e;
    }
}
