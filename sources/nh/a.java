package nh;

import ai.s1;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.d61;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public abstract class a extends d61 {
    public a(Context context, int i10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, d6 d6Var) {
        super(context, i10, -1, false, callback2, callback5, null, d6Var, -1, 0);
        this.z2 = true;
        setOverScrollMode(2);
    }

    public final void I1(View view) {
        if (view == null) {
            return;
        }
        float dp = AndroidUtilities.dp(92.0f);
        float width = getWidth() - dp;
        float x10 = view.getX();
        float width2 = view.getWidth() + x10;
        int i10 = x10 < dp ? (int) (x10 - dp) : width2 > width ? (int) (width2 - width) : 0;
        if (i10 != 0) {
            AndroidUtilities.doOnLayout(this, new s1(this, view, i10, 17));
        }
    }
}
