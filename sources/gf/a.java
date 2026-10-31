package gf;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.h4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a(e eVar, x1[] x1VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = eVar;
        this.e = x1VarArr;
        this.b = i10;
        this.f = uri;
        this.g = context;
        this.c = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i0.g3(new c((e) this.d, (x1[]) this.e, tLObject, this.b, (Uri) this.f, (Context) this.g, this.c));
                break;
            default:
                i0.g3(new c((h4) this.d, tLObject, this.b, (TLRPC.WebPage) this.e, (jj) this.f, this.c, (String) this.g));
                break;
        }
    }

    public /* synthetic */ a(h4 h4Var, int i10, TLRPC.WebPage webPage, jj jjVar, boolean z10, String str) {
        this.d = h4Var;
        this.b = i10;
        this.e = webPage;
        this.f = jjVar;
        this.c = z10;
        this.g = str;
    }
}
