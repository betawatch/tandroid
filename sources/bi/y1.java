package bi;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class y1 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new y1());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        ah.r rVar = (ah.r) view;
        TLRPC.Chat chat = (TLRPC.Chat) o41Var.H;
        rVar.h(chat.participants_count, chat);
        rVar.setDivider(z10);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        ah.r rVar = new ah.r(context, false, false, h6Var, false);
        rVar.setCellBackgroundVisible(false);
        return rVar;
    }
}
