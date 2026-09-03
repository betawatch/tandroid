package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ j0(n4 n4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z4, String str) {
        this.d = n4Var;
        this.b = i10;
        this.e = webPage;
        this.f = messageObject;
        this.c = z4;
        this.g = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new z((n4) this.d, tLObject, this.b, (TLRPC.WebPage) this.e, (MessageObject) this.f, this.c, (String) this.g));
                break;
            default:
                AndroidUtilities.runOnUIThread(new z((ze.c) this.d, (org.telegram.ui.ActionBar.d2[]) this.e, tLObject, this.b, (Uri) this.f, (Context) this.g, this.c));
                break;
        }
    }

    public /* synthetic */ j0(ze.c cVar, org.telegram.ui.ActionBar.d2[] d2VarArr, int i10, Uri uri, Context context, boolean z4) {
        this.d = cVar;
        this.e = d2VarArr;
        this.b = i10;
        this.f = uri;
        this.g = context;
        this.c = z4;
    }
}
