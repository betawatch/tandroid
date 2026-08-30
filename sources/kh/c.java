package kh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public final org.telegram.ui.ActionBar.f6 a;
    public final int b;

    public c(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.b = i10;
        this.a = f6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
