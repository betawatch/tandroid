package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class o6 extends k6 {
    public final /* synthetic */ z6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(z6 z6Var, Context context) {
        super(context);
        this.d = z6Var;
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.a.setOnClickListener(new a(this, 6));
    }
}
