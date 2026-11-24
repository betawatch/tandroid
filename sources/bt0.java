// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bt0 implements qac {
    public final /* synthetic */ he a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TLRPC.TL_messages_preparedInlineMessage e;
    public final /* synthetic */ ylb f;
    public final /* synthetic */ bv0 g;
    public final /* synthetic */ p h;

    public /* synthetic */ bt0(he heVar, Context context, int i, long j, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, ylb ylbVar, bv0 bv0Var, p pVar) {
        this.a = heVar;
        this.b = context;
        this.c = i;
        this.d = j;
        this.e = tL_messages_preparedInlineMessage;
        this.f = ylbVar;
        this.g = bv0Var;
        this.h = pVar;
    }

    @Override // qac
    public final void a(Object obj) {
        this.a.dismiss();
        new lt0(this.b, this.c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f, this.g, this.h).show();
    }
}
