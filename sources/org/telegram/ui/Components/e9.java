package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e9 implements xd.f, ae.a {
    public final ImageReceiver a;
    public final z8 b;
    public long c;
    public boolean d;
    public final /* synthetic */ f9 e;

    public e9(f9 f9Var, ViewGroup viewGroup) {
        this.e = f9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.a = imageReceiver;
        imageReceiver.setRoundRadius(f9Var.e / 2);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.g6) null);
        this.b = z8Var;
        z8Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override // ae.a
    public final void a() {
        if (this.d) {
            this.d = false;
            this.a.onDetachedFromWindow();
        }
        this.c = 0L;
    }

    @Override // xd.f
    public final int b(boolean z4) {
        if (z4) {
            return 0;
        }
        return -this.e.f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e9) && this.c == ((e9) obj).c;
    }

    @Override // xd.f
    public final int getHeight() {
        return this.e.e;
    }

    @Override // xd.f
    public final int getWidth() {
        return this.e.e;
    }
}
