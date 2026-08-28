package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ i0(l4 l4Var, int i9, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = l4Var;
        this.b = i9;
        this.e = webPage;
        this.f = messageObject;
        this.c = z10;
        this.g = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y((l4) this.d, tLObject, this.b, (TLRPC.WebPage) this.e, (MessageObject) this.f, this.c, (String) this.g));
                break;
            default:
                AndroidUtilities.runOnUIThread(new y((ve.d) this.d, (org.telegram.ui.ActionBar.c2[]) this.e, tLObject, this.b, (Uri) this.f, (Context) this.g, this.c));
                break;
        }
    }

    public /* synthetic */ i0(ve.d dVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i9, Uri uri, Context context, boolean z10) {
        this.d = dVar;
        this.e = c2VarArr;
        this.b = i9;
        this.f = uri;
        this.g = context;
        this.c = z10;
    }
}
