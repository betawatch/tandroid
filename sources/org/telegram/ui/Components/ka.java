package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class ka extends sa {
    public final LinearLayout T1;
    public FrameLayout U1;
    public hi.e V1;

    public ka(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, false, false, h6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        return new di.l4(this, 2);
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.p1.setTitle(charSequence);
    }
}
