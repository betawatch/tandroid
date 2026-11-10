package hi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z0 implements c20 {
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TLRPC.TL_messages_preparedInlineMessage e;
    public final /* synthetic */ h6 f;
    public final /* synthetic */ org.telegram.ui.web.p g;
    public final /* synthetic */ bi.t0 h;

    public /* synthetic */ z0(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, h6 h6Var, org.telegram.ui.web.p pVar, bi.t0 t0Var) {
        this.a = u1Var;
        this.b = context;
        this.c = i7;
        this.d = j3;
        this.e = tL_messages_preparedInlineMessage;
        this.f = h6Var;
        this.g = pVar;
        this.h = t0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        this.a.dismiss();
        new i1(this.b, this.c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f, this.g, this.h).show();
    }
}
