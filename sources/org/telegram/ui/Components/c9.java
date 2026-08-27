package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c9 implements ud.f, xd.a {
    public final ImageReceiver a;
    public final y8 b;
    public long c;
    public boolean d;
    public final /* synthetic */ d9 e;

    public c9(d9 d9Var, ViewGroup viewGroup) {
        this.e = d9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.a = imageReceiver;
        imageReceiver.setRoundRadius(d9Var.e / 2);
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        this.b = y8Var;
        y8Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override // xd.a
    public final void a() {
        if (this.d) {
            this.d = false;
            this.a.onDetachedFromWindow();
        }
        this.c = 0L;
    }

    @Override // ud.f
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.e.f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c9) && this.c == ((c9) obj).c;
    }

    @Override // ud.f
    public final int getHeight() {
        return this.e.e;
    }

    @Override // ud.f
    public final int getWidth() {
        return this.e.e;
    }
}
