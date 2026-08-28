package gh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class g6 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ v7 b;
    public final /* synthetic */ Utilities.Callback2 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLObject i;
    public final /* synthetic */ TLObject j;

    public /* synthetic */ g6(v7 v7Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = v7Var;
        this.c = callback2;
        this.d = context;
        this.e = b6Var;
        this.f = j10;
        this.g = str;
        this.h = j11;
        this.i = tLObject;
        this.j = tL_textWithEntities;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h6(this.b, tLObject, tL_error, this.c, this.d, this.e, this.f, this.g, (TLRPC.TL_payments_paymentFormStarGift) this.i, (TL_stars.StarGift) this.j, this.h));
                break;
            default:
                AndroidUtilities.runOnUIThread(new h6(this.b, tLObject, tL_error, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (TLRPC.TL_textWithEntities) this.j));
                break;
        }
    }

    public /* synthetic */ g6(v7 v7Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.b = v7Var;
        this.c = callback2;
        this.d = context;
        this.e = b6Var;
        this.f = j10;
        this.g = str;
        this.i = tL_payments_paymentFormStarGift;
        this.j = starGift;
        this.h = j11;
    }
}
