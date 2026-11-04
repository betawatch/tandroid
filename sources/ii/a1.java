package ii;

import android.content.Context;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements u10 {
    public final /* synthetic */ org.telegram.ui.ActionBar.s1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TLRPC.TL_messages_preparedInlineMessage e;
    public final /* synthetic */ e6 f;
    public final /* synthetic */ org.telegram.ui.web.r g;
    public final /* synthetic */ ai.n0 h;

    public /* synthetic */ a1(org.telegram.ui.ActionBar.s1 s1Var, Context context, int i3, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, e6 e6Var, org.telegram.ui.web.r rVar, ai.n0 n0Var) {
        this.a = s1Var;
        this.b = context;
        this.c = i3;
        this.d = j10;
        this.e = tL_messages_preparedInlineMessage;
        this.f = e6Var;
        this.g = rVar;
        this.h = n0Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        this.a.dismiss();
        new j1(this.b, this.c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f, this.g, this.h).show();
    }
}
