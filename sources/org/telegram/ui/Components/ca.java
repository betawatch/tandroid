package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class ca extends ja {
    public final LinearLayout T1;
    public FrameLayout U1;
    public hi.d V1;

    public ca(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, e6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        return new di.i4(this, 2);
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.p1.setTitle(charSequence);
    }
}
