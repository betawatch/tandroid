package ki;

import android.content.Context;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements x10 {
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TLRPC.TL_messages_preparedInlineMessage e;
    public final /* synthetic */ i6 f;
    public final /* synthetic */ org.telegram.ui.web.q g;
    public final /* synthetic */ bi.h0 h;

    public /* synthetic */ y0(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, i6 i6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.a = u1Var;
        this.b = context;
        this.c = i7;
        this.d = j3;
        this.e = tL_messages_preparedInlineMessage;
        this.f = i6Var;
        this.g = qVar;
        this.h = h0Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        this.a.dismiss();
        new h1(this.b, this.c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f, this.g, this.h).show();
    }
}
