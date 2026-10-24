package gi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements Utilities.Callback {
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TLRPC.TL_messages_preparedInlineMessage e;
    public final /* synthetic */ g6 f;
    public final /* synthetic */ org.telegram.ui.web.t g;
    public final /* synthetic */ ai.s0 h;

    public /* synthetic */ c1(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, g6 g6Var, org.telegram.ui.web.t tVar, ai.s0 s0Var) {
        this.a = c2Var;
        this.b = context;
        this.c = i10;
        this.d = j10;
        this.e = tL_messages_preparedInlineMessage;
        this.f = g6Var;
        this.g = tVar;
        this.h = s0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        this.a.dismiss();
        new l1(this.b, this.c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f, this.g, this.h).show();
    }
}
