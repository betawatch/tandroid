package bh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class q extends l0 {
    public final /* synthetic */ u h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u uVar, Context context, u6 u6Var, int i10) {
        super(context, i10, u6Var);
        this.h = uVar;
    }

    @Override // org.telegram.ui.Components.ju
    public final void onLineCountChanged(int i10, int i11) {
        if (i11 > i10) {
            this.h.E.w0(0, AndroidUtilities.dp(30.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.ju, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        if (i10 == R.id.menu_delete || i10 == 16908320) {
            return this.h.c0();
        }
        if (i10 == 16908322 || i10 == 16908321) {
            return false;
        }
        return super.onTextContextMenuItem(i10);
    }
}
