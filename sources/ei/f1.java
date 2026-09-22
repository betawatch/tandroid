package ei;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements Utilities.Callback {
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TLRPC.TL_messages_preparedInlineMessage e;
    public final /* synthetic */ f6 f;
    public final /* synthetic */ org.telegram.ui.web.t g;
    public final /* synthetic */ org.telegram.tgnet.e h;

    public /* synthetic */ f1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, f6 f6Var, org.telegram.ui.web.t tVar, org.telegram.tgnet.e eVar) {
        this.a = b2Var;
        this.b = context;
        this.c = i10;
        this.d = j3;
        this.e = tL_messages_preparedInlineMessage;
        this.f = f6Var;
        this.g = tVar;
        this.h = eVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        this.a.dismiss();
        new p1(this.b, this.c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f, this.g, this.h).show();
    }
}
