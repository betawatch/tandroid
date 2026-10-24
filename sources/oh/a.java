package oh;

import ah.o;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.j71;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public abstract class a extends j71 {
    public a(Context context, int i10, Utilities.Callback2 callback2, Utilities.Callback5 callback5, g6 g6Var) {
        super(context, i10, -1, false, callback2, callback5, null, g6Var, -1, 0);
        this.y2 = true;
        setOverScrollMode(2);
    }

    public final void O1(View view) {
        if (view == null) {
            return;
        }
        float dp = AndroidUtilities.dp(92.0f);
        float width = getWidth() - dp;
        float x10 = view.getX();
        float width2 = view.getWidth() + x10;
        int i10 = x10 < dp ? (int) (x10 - dp) : width2 > width ? (int) (width2 - width) : 0;
        if (i10 != 0) {
            AndroidUtilities.doOnLayout(this, new o(this, view, i10, 22));
        }
    }
}
