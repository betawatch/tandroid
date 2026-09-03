package bh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.h61;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class b extends h61 {
    public b(Context context, int i10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, g6 g6Var) {
        super(context, i10, -1, false, callback2, callback5, null, g6Var, -1, 0);
        this.w2 = true;
        setOverScrollMode(2);
    }

    public final void H1(View view) {
        if (view == null) {
            return;
        }
        float dp = AndroidUtilities.dp(92.0f);
        float width = getWidth() - dp;
        float x10 = view.getX();
        float width2 = view.getWidth() + x10;
        int i10 = x10 < dp ? (int) (x10 - dp) : width2 > width ? (int) (width2 - width) : 0;
        if (i10 != 0) {
            AndroidUtilities.doOnLayout(this, new a(this, view, i10, 0));
        }
    }
}
