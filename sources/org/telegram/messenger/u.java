package org.telegram.messenger;

import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class u implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ Runnable b;

    public u(View view, Runnable runnable) {
        this.a = view;
        this.b = runnable;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.a.removeOnLayoutChangeListener(this);
        this.b.run();
    }
}
