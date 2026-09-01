package af;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.l4;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a(f fVar, d2[] d2VarArr, int i10, Uri uri, Context context, boolean z4) {
        this.d = fVar;
        this.e = d2VarArr;
        this.b = i10;
        this.f = uri;
        this.g = context;
        this.c = z4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d((f) this.d, (d2[]) this.e, tLObject, this.b, (Uri) this.f, (Context) this.g, this.c));
                break;
            default:
                AndroidUtilities.runOnUIThread(new d((l4) this.d, tLObject, this.b, (TLRPC.WebPage) this.e, (MessageObject) this.f, this.c, (String) this.g));
                break;
        }
    }

    public /* synthetic */ a(l4 l4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z4, String str) {
        this.d = l4Var;
        this.b = i10;
        this.e = webPage;
        this.f = messageObject;
        this.c = z4;
        this.g = str;
    }
}
