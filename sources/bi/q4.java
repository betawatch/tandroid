package bi;

import android.content.Context;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q4 implements q10 {
    public final /* synthetic */ ai.v1 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 f;
    public final /* synthetic */ TL_stars.TL_starGiftUnique g;
    public final /* synthetic */ long h;
    public final /* synthetic */ TLRPC.TL_textWithEntities i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ lc k;
    public final /* synthetic */ c1.c l;
    public final /* synthetic */ c1.c m;

    public /* synthetic */ q4(ai.v1 v1Var, long j3, long j10, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j11, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, lc lcVar, c1.c cVar, c1.c cVar2) {
        this.a = v1Var;
        this.b = j3;
        this.c = j10;
        this.d = context;
        this.e = i7;
        this.f = i6Var;
        this.g = tL_starGiftUnique;
        this.h = j11;
        this.i = tL_textWithEntities;
        this.j = z10;
        this.k = lcVar;
        this.l = cVar;
        this.m = cVar2;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        Boolean bool = Boolean.FALSE;
        ai.v1 v1Var = this.a;
        v1Var.a(bool);
        long longValue = l10.longValue();
        long j3 = this.c;
        Context context = this.d;
        int i7 = this.e;
        org.telegram.ui.ActionBar.i6 i6Var = this.f;
        if (longValue <= 0 || l10.longValue() + this.b < 100000000 + j3) {
            o3.e1(context, i7, i6Var, j3, 2131749614);
            return;
        }
        long longValue2 = l10.longValue();
        t4 t4Var = new t4(context, i7, this.g, this.h, this.i, this.j, i6Var, v1Var, this.k, this.l, this.m);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String M0 = gd.M0(2131749331, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749332, gd.a0(null, null, 2131749619, org.telegram.ui.Wallet.u0.t(longValue2, false))));
        alertDialog$Builder.h(gd.M0(2131752578, null), null);
        alertDialog$Builder.k(gd.M0(2131746550, null), new ii.h(longValue2, v1Var, i7, j3, t4Var));
        alertDialog$Builder.p();
    }
}
