package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ g0(k4 k4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = k4Var;
        this.b = i10;
        this.e = webPage;
        this.f = messageObject;
        this.c = z10;
        this.g = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w((k4) this.d, tLObject, this.b, (TLRPC.WebPage) this.e, (MessageObject) this.f, this.c, (String) this.g));
                break;
            default:
                AndroidUtilities.runOnUIThread(new w((pf.c) this.d, (org.telegram.ui.ActionBar.c2[]) this.e, tLObject, this.b, (Uri) this.f, (Context) this.g, this.c));
                break;
        }
    }

    public /* synthetic */ g0(pf.c cVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = cVar;
        this.e = c2VarArr;
        this.b = i10;
        this.f = uri;
        this.g = context;
        this.c = z10;
    }
}
