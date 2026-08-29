package ih;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public final org.telegram.ui.ActionBar.c6 a;
    public final int b;

    public c(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.b = i10;
        this.a = c6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
