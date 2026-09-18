package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class j9 implements le.h, oe.a {
    public final ImageReceiver a;
    public final f9 b;
    public long c;
    public boolean d;
    public final /* synthetic */ k9 e;

    public j9(k9 k9Var, ViewGroup viewGroup) {
        this.e = k9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.a = imageReceiver;
        imageReceiver.setRoundRadius(k9Var.e / 2);
        f9 f9Var = new f9((org.telegram.ui.ActionBar.f6) null);
        this.b = f9Var;
        f9Var.u(AndroidUtilities.dp(22.0f));
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
        return (obj instanceof j9) && this.c == ((j9) obj).c;
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
