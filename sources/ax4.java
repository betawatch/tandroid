// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ax4 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new ax4());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        e3a e3aVar = (e3a) view;
        e3aVar.setUser((TLRPC.User) b8cVar.H);
        CharSequence charSequence = b8cVar.n;
        if (charSequence != null) {
            e3aVar.setSubtitle(charSequence);
            e3aVar.setSubtitleColorKey(aob.r5);
        }
        e3aVar.setOptions(b8cVar.E);
        e3aVar.setDivider(z);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        e3a e3aVar = new e3a(context, false, false, vnbVar, false);
        e3aVar.setCellBackgroundVisible(false);
        return e3aVar;
    }
}
