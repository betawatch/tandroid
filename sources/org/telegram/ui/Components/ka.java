package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class ka extends sa {
    public final LinearLayout T1;
    public FrameLayout U1;
    public hi.d V1;

    public ka(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, false, false, i6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        return new di.l4(this, 2);
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.p1.setTitle(charSequence);
    }
}
