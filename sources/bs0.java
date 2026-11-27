// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bs0 implements pcc {
    public final /* synthetic */ id a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TLRPC.TL_messages_preparedInlineMessage e;
    public final /* synthetic */ vnb f;
    public final /* synthetic */ bu0 g;
    public final /* synthetic */ p h;

    public /* synthetic */ bs0(id idVar, Context context, int i, long j, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, vnb vnbVar, bu0 bu0Var, p pVar) {
        this.a = idVar;
        this.b = context;
        this.c = i;
        this.d = j;
        this.e = tL_messages_preparedInlineMessage;
        this.f = vnbVar;
        this.g = bu0Var;
        this.h = pVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        this.a.dismiss();
        new ls0(this.b, this.c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f, this.g, this.h).show();
    }
}
