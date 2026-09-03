package ng;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class p extends f0 {
    public final /* synthetic */ s h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, Context context, g6 g6Var, int i10) {
        super(context, i10, g6Var);
        this.h = sVar;
    }

    @Override // org.telegram.ui.Components.xt
    public final void onLineCountChanged(int i10, int i11) {
        if (i11 > i10) {
            this.h.y.smoothScrollBy(0, AndroidUtilities.dp(30.0f));
        }
    }

    @Override // org.telegram.ui.Components.xt, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        if (i10 == R.id.menu_delete || i10 == 16908320) {
            return this.h.a0();
        }
        if (i10 == 16908322 || i10 == 16908321) {
            return false;
        }
        return super.onTextContextMenuItem(i10);
    }
}
