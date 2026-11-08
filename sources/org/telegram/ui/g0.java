package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ g0(g4 g4Var, int i7, TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar, boolean z9, String str) {
        this.d = g4Var;
        this.b = i7;
        this.e = webPage;
        this.f = ijVar;
        this.c = z9;
        this.g = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new w((g4) this.d, tLObject, this.b, (TLRPC.WebPage) this.e, (org.telegram.messenger.ij) this.f, this.c, (String) this.g));
                break;
            default:
                org.telegram.messenger.g0.h3(new w((vf.b) this.d, (org.telegram.ui.ActionBar.u1[]) this.e, tLObject, this.b, (Uri) this.f, (Context) this.g, this.c));
                break;
        }
    }

    public /* synthetic */ g0(vf.b bVar, org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, Uri uri, Context context, boolean z9) {
        this.d = bVar;
        this.e = u1VarArr;
        this.b = i7;
        this.f = uri;
        this.g = context;
        this.c = z9;
    }
}
