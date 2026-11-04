package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h0(i4 i4Var, int i3, TLRPC.WebPage webPage, org.telegram.messenger.zi ziVar, boolean z10, String str) {
        this.d = i4Var;
        this.b = i3;
        this.e = webPage;
        this.f = ziVar;
        this.c = z10;
        this.g = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new x((i4) this.d, tLObject, this.b, (TLRPC.WebPage) this.e, (org.telegram.messenger.zi) this.f, this.c, (String) this.g));
                break;
            default:
                org.telegram.messenger.g0.h3(new x((sf.b) this.d, (org.telegram.ui.ActionBar.s1[]) this.e, tLObject, this.b, (Uri) this.f, (Context) this.g, this.c));
                break;
        }
    }

    public /* synthetic */ h0(sf.b bVar, org.telegram.ui.ActionBar.s1[] s1VarArr, int i3, Uri uri, Context context, boolean z10) {
        this.d = bVar;
        this.e = s1VarArr;
        this.b = i3;
        this.f = uri;
        this.g = context;
        this.c = z10;
    }
}
