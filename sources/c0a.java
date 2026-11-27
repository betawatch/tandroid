// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class c0a extends j1a {
    public final /* synthetic */ View R;
    public final /* synthetic */ TL_stars.TL_starGiftUnique S;
    public final /* synthetic */ d0a T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0a(d0a d0aVar, Context context, c1a c1aVar, View view, w0a w0aVar, vnb vnbVar, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(d0aVar.e, context, c1aVar, view, w0aVar, vnbVar);
        this.T = d0aVar;
        this.R = view2;
        this.S = tL_starGiftUnique;
    }

    @Override // j1a, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.T.e.Y0 = null;
    }
}
