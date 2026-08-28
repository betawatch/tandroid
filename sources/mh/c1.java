package mh;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements Utilities.Callback {
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TLRPC.TL_messages_preparedInlineMessage e;
    public final /* synthetic */ b6 f;
    public final /* synthetic */ org.telegram.ui.web.t g;
    public final /* synthetic */ bg.y0 h;

    public /* synthetic */ c1(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i9, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, b6 b6Var, org.telegram.ui.web.t tVar, bg.y0 y0Var) {
        this.a = c2Var;
        this.b = context;
        this.c = i9;
        this.d = j10;
        this.e = tL_messages_preparedInlineMessage;
        this.f = b6Var;
        this.g = tVar;
        this.h = y0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        this.a.dismiss();
        new l1(this.b, this.c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f, this.g, this.h).show();
    }
}
