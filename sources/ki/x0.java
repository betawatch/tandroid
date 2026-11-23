package ki;

import android.content.Context;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements y10 {
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TLRPC.TL_messages_preparedInlineMessage e;
    public final /* synthetic */ h6 f;
    public final /* synthetic */ org.telegram.ui.web.q g;
    public final /* synthetic */ bi.h0 h;

    public /* synthetic */ x0(org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, h6 h6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.a = t1Var;
        this.b = context;
        this.c = i7;
        this.d = j3;
        this.e = tL_messages_preparedInlineMessage;
        this.f = h6Var;
        this.g = qVar;
        this.h = h0Var;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        this.a.dismiss();
        new g1(this.b, this.c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f, this.g, this.h).show();
    }
}
