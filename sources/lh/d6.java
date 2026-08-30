package lh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d6 implements RequestDelegate {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ t7 b;
    public final /* synthetic */ Utilities.Callback2 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLObject i;
    public final /* synthetic */ TLObject j;

    public /* synthetic */ d6(t7 t7Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, String str, long j11, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = t7Var;
        this.c = callback2;
        this.d = context;
        this.e = f6Var;
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
                AndroidUtilities.runOnUIThread(new e6(this.b, tLObject, tL_error, this.c, this.d, this.e, this.f, this.g, (TLRPC.TL_payments_paymentFormStarGift) this.i, (TL_stars.StarGift) this.j, this.h));
                break;
            default:
                AndroidUtilities.runOnUIThread(new e6(this.b, tLObject, tL_error, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (TLRPC.TL_textWithEntities) this.j));
                break;
        }
    }

    public /* synthetic */ d6(t7 t7Var, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.b = t7Var;
        this.c = callback2;
        this.d = context;
        this.e = f6Var;
        this.f = j10;
        this.g = str;
        this.i = tL_payments_paymentFormStarGift;
        this.j = starGift;
        this.h = j11;
    }
}
