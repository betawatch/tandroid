package bi;

import android.content.Context;
import org.telegram.messenger.hd;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u4 implements r10 {
    public final /* synthetic */ ai.y1 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 f;
    public final /* synthetic */ TL_stars.TL_starGiftUnique g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLRPC.TL_textWithEntities i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ lc k;
    public final /* synthetic */ c1.a l;
    public final /* synthetic */ di.f2 m;

    public /* synthetic */ u4(ai.y1 y1Var, long j3, long j10, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j11, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, lc lcVar, c1.a aVar, di.f2 f2Var) {
        this.a = y1Var;
        this.b = j3;
        this.c = j10;
        this.d = context;
        this.e = i7;
        this.f = h6Var;
        this.g = tL_starGiftUnique;
        this.h = j11;
        this.i = tL_textWithEntities;
        this.j = z10;
        this.k = lcVar;
        this.l = aVar;
        this.m = f2Var;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        Boolean bool = Boolean.FALSE;
        ai.y1 y1Var = this.a;
        y1Var.a(bool);
        long longValue = l10.longValue();
        long j3 = this.c;
        Context context = this.d;
        int i7 = this.e;
        org.telegram.ui.ActionBar.h6 h6Var = this.f;
        if (longValue <= 0 || l10.longValue() + this.b < 100000000 + j3) {
            s3.e1(context, i7, h6Var, j3, 2131749613);
            return;
        }
        long longValue2 = l10.longValue();
        w4 w4Var = new w4(context, i7, this.g, this.h, this.i, this.j, h6Var, y1Var, this.k, this.l, this.m);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        String N0 = hd.N0(2131749330, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749331, hd.a0(null, null, 2131749618, org.telegram.ui.Wallet.u0.t(longValue2, false))));
        alertDialog$Builder.h(hd.N0(2131752577, null), null);
        alertDialog$Builder.k(hd.N0(2131746549, null), new ii.h(longValue2, y1Var, i7, j3, w4Var));
        alertDialog$Builder.p();
    }
}
