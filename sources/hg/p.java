package hg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p extends g0 {
    public final /* synthetic */ s h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, Context context, b6 b6Var, int i9) {
        super(context, i9, b6Var);
        this.h = sVar;
    }

    @Override // org.telegram.ui.Components.mt
    public final void onLineCountChanged(int i9, int i10) {
        if (i10 > i9) {
            this.h.y.smoothScrollBy(0, AndroidUtilities.dp(30.0f));
        }
    }

    @Override // org.telegram.ui.Components.mt, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i9) {
        if (i9 == R.id.menu_delete || i9 == 16908320) {
            return this.h.Z();
        }
        if (i9 == 16908322 || i9 == 16908321) {
            return false;
        }
        return super.onTextContextMenuItem(i9);
    }
}
