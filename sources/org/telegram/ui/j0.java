package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ j0(m4 m4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = m4Var;
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
                AndroidUtilities.runOnUIThread(new z((m4) this.d, tLObject, this.b, (TLRPC.WebPage) this.e, (MessageObject) this.f, this.c, (String) this.g));
                break;
            default:
                AndroidUtilities.runOnUIThread(new z((ye.c) this.d, (org.telegram.ui.ActionBar.c2[]) this.e, tLObject, this.b, (Uri) this.f, (Context) this.g, this.c));
                break;
        }
    }

    public /* synthetic */ j0(ye.c cVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = cVar;
        this.e = c2VarArr;
        this.b = i10;
        this.f = uri;
        this.g = context;
        this.c = z10;
    }
}
