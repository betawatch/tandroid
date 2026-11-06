package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class jx extends org.telegram.ui.ActionBar.f2 {
    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        org.telegram.ui.Components.rt0 rt0Var = new org.telegram.ui.Components.rt0(context, null);
        this.fragmentView = rt0Var;
        return rt0Var;
    }
}
