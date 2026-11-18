package bi;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.q9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a0(Context context, org.telegram.ui.ActionBar.i6 i6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = 2;
        this.c = context;
        this.d = i6Var;
        this.b = j3;
        this.f = starGift;
        this.e = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011f  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        q9 q9Var;
        ArrayList arrayList;
        int i7 = this.a;
        TLObject tLObject = null;
        Context context = this.c;
        long j3 = this.b;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.f;
        final int i10 = 1;
        switch (i7) {
            case 0:
                m0 m0Var = (m0) obj3;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                Runnable runnable = (Runnable) obj2;
                q9 q9Var2 = m0Var.i2;
                if (q9Var2 != null && !q9Var2.f()) {
                    long j10 = this.b;
                    Context context2 = this.c;
                    if ((j10 == 0 || j10 == j10.i(m0Var.a).e()) && (arrayList = (q9Var = m0Var.i2).h) != null) {
                        new t0(context2, i6Var, j10, q9Var.d, arrayList, runnable, false).show();
                    } else {
                        new j0(context2, m0Var.a, m0Var.i2.d, null, j10, runnable, false, false).show();
                    }
                }
                m0Var.dismiss();
                break;
            case 1:
                t0 t0Var = (t0) obj3;
                t0Var.getClass();
                y yVar = new y(context, (org.telegram.ui.ActionBar.i6) obj, new x(j3, true, null), t0Var.Z1);
                yVar.show();
                yVar.j2 = (Runnable) obj2;
                t0Var.dismiss();
                break;
            case 2:
                new t0(this.c, (org.telegram.ui.ActionBar.i6) obj, this.b, (TL_stars.StarGift) obj3, (ArrayList) obj2, null, true).show();
                break;
            default:
                final a9 a9Var = (a9) obj3;
                Runnable runnable2 = (Runnable) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                int i11 = a9Var.U1;
                u8 u8Var = a9Var.p2;
                hi.d dVar = a9Var.k2;
                if (!dVar.R) {
                    int i12 = 5;
                    if (a9Var.Z1 != null) {
                        y yVar2 = new y(context, a9Var.J0, new x(j3, a9Var.m2, a9Var.e1()), a9Var.Z1);
                        yVar2.show();
                        yVar2.j2 = runnable2;
                        org.telegram.messenger.g0.v1(u8Var);
                        a9Var.dismiss();
                        if (!a9Var.t2) {
                            org.telegram.messenger.g0.h3(new o8(a9Var, i12), 500L);
                            break;
                        }
                    } else {
                        dVar.setLoading(true);
                        org.telegram.ui.Cells.f3 f3Var = u8Var.b;
                        if (f3Var.getEmojiPadding() > 0) {
                            f3Var.k(true);
                        } else if (f3Var.w) {
                            f3Var.d();
                        }
                        final int i13 = 0;
                        if (starGift != null) {
                            di.x8.y(i11, false).i(a9Var.Y1, a9Var.m2, a9Var.n2, a9Var.V1, a9Var.e1(), new m8(a9Var, i10));
                            break;
                        } else {
                            ug.j jVar = a9Var.a2;
                            final TLRPC.User c22 = mp.u1(i11).c2(Long.valueOf(a9Var.V1));
                            if (c22 == null) {
                                dVar.setLoading(false);
                                break;
                            } else {
                                if (a9Var.o2) {
                                    TLObject tLObject2 = jVar.c;
                                    TLObject tLObject3 = jVar.d;
                                    if (tLObject2 != null || tLObject3 != null) {
                                        if (tLObject2 != null) {
                                            tLObject = tLObject2;
                                        } else if (tLObject3 != null) {
                                            tLObject = tLObject3;
                                        }
                                        if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) tLObject;
                                            if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency)) {
                                                wg.s.k(new ArrayList(Arrays.asList(c22)), tL_premiumGiftCodeOption, null, a9Var.e1(), new z8(a9Var, 0), new ai.v1(i12, a9Var, c22), new ai.g0(a9Var, 5));
                                                break;
                                            } else {
                                                di.x8.y(i11, false).g(a9Var.V1, tL_premiumGiftCodeOption, a9Var.e1(), new q10() { // from class: bi.n8
                                                    @Override // org.telegram.messenger.q10
                                                    public final void a(Object obj4, Object obj5) {
                                                        int i14 = i10;
                                                        TLRPC.User user = c22;
                                                        a9 a9Var2 = a9Var;
                                                        Boolean bool = (Boolean) obj4;
                                                        String str = (String) obj5;
                                                        switch (i14) {
                                                            case 0:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable3 = a9Var2.c2;
                                                                    if (runnable3 != null) {
                                                                        runnable3.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(a9Var2.p2);
                                                                    a9Var2.dismiss();
                                                                    org.telegram.messenger.g0.h3(new q8(1, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new lc(a9Var2.F, a9Var2.J0).Q(R.raw.error, 36, gd.a0(null, null, 2131743641, str)).j();
                                                                }
                                                                a9Var2.k2.setLoading(false);
                                                                break;
                                                            default:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable4 = a9Var2.c2;
                                                                    if (runnable4 != null) {
                                                                        runnable4.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(a9Var2.p2);
                                                                    a9Var2.dismiss();
                                                                    org.telegram.messenger.g0.h3(new q8(2, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new lc(a9Var2.F, a9Var2.J0).Q(R.raw.error, 36, gd.a0(null, null, 2131743641, str)).j();
                                                                }
                                                                a9Var2.k2.setLoading(false);
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            }
                                        } else if (tLObject instanceof TLRPC.TL_premiumGiftOption) {
                                            TLRPC.TL_premiumGiftOption tL_premiumGiftOption = (TLRPC.TL_premiumGiftOption) tLObject;
                                            if (!"XTR".equalsIgnoreCase(tL_premiumGiftOption.currency)) {
                                                if (!org.telegram.messenger.s2.b()) {
                                                    if (org.telegram.messenger.r1.i().k() && jVar.h != null) {
                                                        TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = new TLRPC.TL_inputStorePaymentGiftPremium();
                                                        tL_inputStorePaymentGiftPremium.user_id = mp.u1(i11).s1(c22);
                                                        tL_inputStorePaymentGiftPremium.currency = jVar.h.a().c;
                                                        tL_inputStorePaymentGiftPremium.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_inputStorePaymentGiftPremium.currency)) * (r5.b / Math.pow(10.0d, 6.0d)));
                                                        org.telegram.messenger.r1.i().d(jVar.a.store_product, new p8(a9Var, i13));
                                                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                                                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
                                                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_canPurchaseStore, new m1(a9Var, tL_inputStorePaymentGiftPremium, tL_payments_canPurchaseStore, i10));
                                                        break;
                                                    }
                                                } else {
                                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                                    if (launchActivity != null) {
                                                        Uri parse = Uri.parse(tL_premiumGiftOption.bot_url);
                                                        if (parse.getHost().equals("t.me")) {
                                                            if (parse.getPath().startsWith("/$") || parse.getPath().startsWith("/invoice/")) {
                                                                launchActivity.Y0 = new o8(a9Var, i13);
                                                            } else {
                                                                launchActivity.X0 = true;
                                                            }
                                                        }
                                                        vf.c.t(launchActivity, jVar.a.bot_url);
                                                        a9Var.dismiss();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                di.x8.y(i11, false).g(a9Var.V1, tL_premiumGiftOption, a9Var.e1(), new q10() { // from class: bi.n8
                                                    @Override // org.telegram.messenger.q10
                                                    public final void a(Object obj4, Object obj5) {
                                                        int i14 = i13;
                                                        TLRPC.User user = c22;
                                                        a9 a9Var2 = a9Var;
                                                        Boolean bool = (Boolean) obj4;
                                                        String str = (String) obj5;
                                                        switch (i14) {
                                                            case 0:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable3 = a9Var2.c2;
                                                                    if (runnable3 != null) {
                                                                        runnable3.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(a9Var2.p2);
                                                                    a9Var2.dismiss();
                                                                    org.telegram.messenger.g0.h3(new q8(1, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new lc(a9Var2.F, a9Var2.J0).Q(R.raw.error, 36, gd.a0(null, null, 2131743641, str)).j();
                                                                }
                                                                a9Var2.k2.setLoading(false);
                                                                break;
                                                            default:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable4 = a9Var2.c2;
                                                                    if (runnable4 != null) {
                                                                        runnable4.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(a9Var2.p2);
                                                                    a9Var2.dismiss();
                                                                    org.telegram.messenger.g0.h3(new q8(2, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new lc(a9Var2.F, a9Var2.J0).Q(R.raw.error, 36, gd.a0(null, null, 2131743641, str)).j();
                                                                }
                                                                a9Var2.k2.setLoading(false);
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            }
                                        }
                                    }
                                }
                                tLObject = jVar.b;
                                if (tLObject == null && (tLObject = jVar.a) == null) {
                                    dVar.setLoading(false);
                                    break;
                                }
                                if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ a0(a9 a9Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.a = 3;
        this.f = a9Var;
        this.b = j3;
        this.c = context;
        this.e = runnable;
        this.d = starGift;
    }

    public /* synthetic */ a0(sa saVar, long j3, Context context, org.telegram.ui.ActionBar.i6 i6Var, Runnable runnable, int i7) {
        this.a = i7;
        this.f = saVar;
        this.b = j3;
        this.c = context;
        this.d = i6Var;
        this.e = runnable;
    }
}
