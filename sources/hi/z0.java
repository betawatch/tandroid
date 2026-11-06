package hi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z0 implements c20 {
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TLRPC.TL_messages_preparedInlineMessage e;
    public final /* synthetic */ f6 f;
    public final /* synthetic */ org.telegram.ui.web.p g;
    public final /* synthetic */ bi.t0 h;

    public /* synthetic */ z0(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, f6 f6Var, org.telegram.ui.web.p pVar, bi.t0 t0Var) {
        this.a = u1Var;
        this.b = context;
        this.c = i7;
        this.d = j3;
        this.e = tL_messages_preparedInlineMessage;
        this.f = f6Var;
        this.g = pVar;
        this.h = t0Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        this.a.dismiss();
        new i1(this.b, this.c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f, this.g, this.h).show();
    }
}
