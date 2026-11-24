// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jw9 extends px9 {
    public final /* synthetic */ View R;
    public final /* synthetic */ TL_stars.TL_starGiftUnique S;
    public final /* synthetic */ kw9 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw9(kw9 kw9Var, Context context, jx9 jx9Var, View view, dx9 dx9Var, wjb wjbVar, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(kw9Var.e, context, jx9Var, view, dx9Var, wjbVar);
        this.T = kw9Var;
        this.R = view2;
        this.S = tL_starGiftUnique;
    }

    @Override // px9, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.T.e.Y0 = null;
    }
}
