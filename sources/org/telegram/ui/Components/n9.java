package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class n9 implements oe.h, re.a {
    public final ImageReceiver a;
    public final j9 b;
    public long c;
    public boolean d;
    public final /* synthetic */ o9 e;

    public n9(o9 o9Var, ViewGroup viewGroup) {
        this.e = o9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.a = imageReceiver;
        imageReceiver.setRoundRadius(o9Var.e / 2);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.u6) null);
        this.b = j9Var;
        j9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override // re.a
    public final void a() {
        if (this.d) {
            this.d = false;
            this.a.onDetachedFromWindow();
        }
        this.c = 0L;
    }

    @Override // oe.h
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.e.f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n9) && this.c == ((n9) obj).c;
    }

    @Override // oe.h
    public final int getHeight() {
        return this.e.e;
    }

    @Override // oe.h
    public final int getWidth() {
        return this.e.e;
    }
}
