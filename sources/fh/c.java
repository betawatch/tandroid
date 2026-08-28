package fh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public final org.telegram.ui.ActionBar.b6 a;
    public final int b;

    public c(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.b = i9;
        this.a = b6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
