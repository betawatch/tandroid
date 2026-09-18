package nh;

import ai.s1;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public abstract class a extends t61 {
    public a(Context context, int i10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, e6 e6Var) {
        super(context, i10, -1, false, callback2, callback5, null, e6Var, -1, 0);
        this.z2 = true;
        setOverScrollMode(2);
    }

    public final void J1(View view) {
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
