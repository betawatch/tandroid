package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class q6 extends m6 {
    public final /* synthetic */ a7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(a7 a7Var, Context context) {
        super(context);
        this.d = a7Var;
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = AndroidUtilities.dp(5.0f);
        this.a.setOnClickListener(new a(this, 6));
    }
}
