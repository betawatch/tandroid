package mh;

import android.content.Context;
import android.view.View;
import bi.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.r61;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class a extends r61 {
    public a(Context context, int i10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, f6 f6Var) {
        super(context, i10, -1, false, callback2, callback5, null, f6Var, -1, 0);
        this.z2 = true;
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
            AndroidUtilities.doOnLayout(this, new g3(this, view, i10, 13));
        }
    }
}
