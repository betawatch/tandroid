package hi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements Utilities.Callback {
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TLRPC.TL_messages_preparedInlineMessage e;
    public final /* synthetic */ u6 f;
    public final /* synthetic */ org.telegram.ui.web.t g;
    public final /* synthetic */ bi.t0 h;

    public /* synthetic */ j1(org.telegram.ui.ActionBar.e2 e2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, u6 u6Var, org.telegram.ui.web.t tVar, bi.t0 t0Var) {
        this.a = e2Var;
        this.b = context;
        this.c = i10;
        this.d = j10;
        this.e = tL_messages_preparedInlineMessage;
        this.f = u6Var;
        this.g = tVar;
        this.h = t0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        this.a.dismiss();
        new s1(this.b, this.c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f, this.g, this.h).show();
    }
}
