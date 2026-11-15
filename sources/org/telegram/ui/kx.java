package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class kx extends org.telegram.ui.ActionBar.e2 {
    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        org.telegram.ui.Components.st0 st0Var = new org.telegram.ui.Components.st0(context, null);
        this.fragmentView = st0Var;
        return st0Var;
    }
}
