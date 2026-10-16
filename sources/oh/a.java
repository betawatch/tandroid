package oh;

import ah.o;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.i71;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public abstract class a extends i71 {
    public a(Context context, int i10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, c6 c6Var) {
        super(context, i10, -1, false, callback2, callback5, null, c6Var, -1, 0);
        this.x2 = true;
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
            AndroidUtilities.doOnLayout(this, new o(this, view, i10, 18));
        }
    }
}
