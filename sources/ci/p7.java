package ci;

import android.content.Context;
import org.telegram.messenger.n10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p7 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e9 b;
    public final /* synthetic */ n10 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLObject i;
    public final /* synthetic */ TLObject j;

    public /* synthetic */ p7(e9 e9Var, n10 n10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = e9Var;
        this.c = n10Var;
        this.d = context;
        this.e = e6Var;
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
                org.telegram.messenger.g0.h3(new t7(this.b, tLObject, tL_error, this.c, this.d, this.e, this.f, this.g, (TLRPC.TL_payments_paymentFormStarGift) this.i, (TL_stars.StarGift) this.j, this.h));
                break;
            default:
                org.telegram.messenger.g0.h3(new t7(this.b, tLObject, tL_error, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (TLRPC.TL_textWithEntities) this.j));
                break;
        }
    }

    public /* synthetic */ p7(e9 e9Var, n10 n10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.b = e9Var;
        this.c = n10Var;
        this.d = context;
        this.e = e6Var;
        this.f = j10;
        this.g = str;
        this.i = tL_payments_paymentFormStarGift;
        this.j = starGift;
        this.h = j11;
    }
}
