package ki;

import android.content.Context;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements w10 {
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TLRPC.TL_messages_preparedInlineMessage e;
    public final /* synthetic */ i6 f;
    public final /* synthetic */ org.telegram.ui.web.q g;
    public final /* synthetic */ bi.h0 h;

    public /* synthetic */ x0(org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, i6 i6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.a = t1Var;
        this.b = context;
        this.c = i7;
        this.d = j3;
        this.e = tL_messages_preparedInlineMessage;
        this.f = i6Var;
        this.g = qVar;
        this.h = h0Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        this.a.dismiss();
        new g1(this.b, this.c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f, this.g, this.h).show();
    }
}
