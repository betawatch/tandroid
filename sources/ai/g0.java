package ai;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import ci.e9;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.m9;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ma;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g0(d7 d7Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.a = 3;
        this.f = d7Var;
        this.b = j10;
        this.c = context;
        this.e = runnable;
        this.d = starGift;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        m9 m9Var;
        ArrayList arrayList;
        int i3 = this.a;
        TLObject tLObject = null;
        Context context = this.c;
        long j10 = this.b;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.f;
        final int i10 = 1;
        switch (i3) {
            case 0:
                s0 s0Var = (s0) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                Runnable runnable = (Runnable) obj2;
                m9 m9Var2 = s0Var.f2;
                if (m9Var2 != null && !m9Var2.f()) {
                    long j11 = this.b;
                    Context context2 = this.c;
                    if ((j11 == 0 || j11 == h10.i(s0Var.a).e()) && (arrayList = (m9Var = s0Var.f2).h) != null) {
                        new z0(context2, e6Var, j11, m9Var.d, arrayList, runnable, false).show();
                    } else {
                        new p0(context2, s0Var.a, s0Var.f2.d, null, j11, runnable, false, false).show();
                    }
                }
                s0Var.dismiss();
                break;
            case 1:
                z0 z0Var = (z0) obj3;
                z0Var.getClass();
                e0 e0Var = new e0(context, (org.telegram.ui.ActionBar.e6) obj, new d0(j10, true, null), z0Var.W1);
                e0Var.show();
                e0Var.g2 = (Runnable) obj2;
                z0Var.dismiss();
                break;
            case 2:
                new z0(this.c, (org.telegram.ui.ActionBar.e6) obj, this.b, (TL_stars.StarGift) obj3, (ArrayList) obj2, null, true).show();
                break;
            default:
                final d7 d7Var = (d7) obj3;
                Runnable runnable2 = (Runnable) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                int i11 = d7Var.R1;
                x6 x6Var = d7Var.m2;
                gi.d dVar = d7Var.h2;
                if (!dVar.R) {
                    if (d7Var.W1 != null) {
                        e0 e0Var2 = new e0(context, d7Var.J0, new d0(j10, d7Var.j2, d7Var.d1()), d7Var.W1);
                        e0Var2.show();
                        e0Var2.g2 = runnable2;
                        org.telegram.messenger.g0.v1(x6Var);
                        d7Var.dismiss();
                        if (!d7Var.q2) {
                            org.telegram.messenger.g0.i3(new p6(d7Var, 5), 500L);
                            break;
                        }
                    } else {
                        dVar.setLoading(true);
                        org.telegram.ui.Cells.f3 f3Var = x6Var.b;
                        if (f3Var.getEmojiPadding() > 0) {
                            f3Var.k(true);
                        } else if (f3Var.w) {
                            f3Var.d();
                        }
                        final int i12 = 0;
                        if (starGift != null) {
                            e9.y(i11, false).i(d7Var.V1, d7Var.j2, d7Var.k2, d7Var.S1, d7Var.d1(), new n6(d7Var, i10));
                            break;
                        } else {
                            vg.j jVar = d7Var.X1;
                            final TLRPC.User a22 = hp.s1(i11).a2(Long.valueOf(d7Var.S1));
                            if (a22 == null) {
                                dVar.setLoading(false);
                                break;
                            } else {
                                if (d7Var.l2) {
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
                                                xg.s.k(new ArrayList(Arrays.asList(a22)), tL_premiumGiftCodeOption, null, d7Var.d1(), new c7(d7Var, 0), new o1(3, d7Var, a22), new v2(d7Var, 3));
                                                break;
                                            } else {
                                                e9.y(i11, false).g(d7Var.S1, tL_premiumGiftCodeOption, d7Var.d1(), new n10() { // from class: ai.o6
                                                    @Override // org.telegram.messenger.n10
                                                    public final void a(Object obj4, Object obj5) {
                                                        int i13 = i10;
                                                        TLRPC.User user = a22;
                                                        d7 d7Var2 = d7Var;
                                                        Boolean bool = (Boolean) obj4;
                                                        String str = (String) obj5;
                                                        switch (i13) {
                                                            case 0:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable3 = d7Var2.Z1;
                                                                    if (runnable3 != null) {
                                                                        runnable3.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(d7Var2.m2);
                                                                    d7Var2.dismiss();
                                                                    org.telegram.messenger.g0.i3(new s6(1, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new fc(d7Var2.F, d7Var2.J0).Q(R.raw.error, 36, bd.a0(null, null, 2131743888, str)).j();
                                                                }
                                                                d7Var2.h2.setLoading(false);
                                                                break;
                                                            default:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable4 = d7Var2.Z1;
                                                                    if (runnable4 != null) {
                                                                        runnable4.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(d7Var2.m2);
                                                                    d7Var2.dismiss();
                                                                    org.telegram.messenger.g0.i3(new s6(2, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new fc(d7Var2.F, d7Var2.J0).Q(R.raw.error, 36, bd.a0(null, null, 2131743888, str)).j();
                                                                }
                                                                d7Var2.h2.setLoading(false);
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            }
                                        } else if (tLObject instanceof TLRPC.TL_premiumGiftOption) {
                                            TLRPC.TL_premiumGiftOption tL_premiumGiftOption = (TLRPC.TL_premiumGiftOption) tLObject;
                                            if (!"XTR".equalsIgnoreCase(tL_premiumGiftOption.currency)) {
                                                if (!org.telegram.messenger.r2.b()) {
                                                    if (org.telegram.messenger.r1.i().k() && jVar.h != null) {
                                                        TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = new TLRPC.TL_inputStorePaymentGiftPremium();
                                                        tL_inputStorePaymentGiftPremium.user_id = hp.s1(i11).q1(a22);
                                                        tL_inputStorePaymentGiftPremium.currency = jVar.h.a().c;
                                                        tL_inputStorePaymentGiftPremium.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_inputStorePaymentGiftPremium.currency)) * (r5.b / Math.pow(10.0d, 6.0d)));
                                                        org.telegram.messenger.r1.i().d(jVar.a.store_product, new q6(d7Var, i12));
                                                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                                                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
                                                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_canPurchaseStore, new r6(d7Var, tL_inputStorePaymentGiftPremium, tL_payments_canPurchaseStore, i12));
                                                        break;
                                                    }
                                                } else {
                                                    LaunchActivity launchActivity = LaunchActivity.K1;
                                                    if (launchActivity != null) {
                                                        Uri parse = Uri.parse(tL_premiumGiftOption.bot_url);
                                                        if (parse.getHost().equals("t.me")) {
                                                            if (parse.getPath().startsWith("/$") || parse.getPath().startsWith("/invoice/")) {
                                                                launchActivity.a1 = new p6(d7Var, i12);
                                                            } else {
                                                                launchActivity.Z0 = true;
                                                            }
                                                        }
                                                        sf.c.t(launchActivity, jVar.a.bot_url);
                                                        d7Var.dismiss();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                e9.y(i11, false).g(d7Var.S1, tL_premiumGiftOption, d7Var.d1(), new n10() { // from class: ai.o6
                                                    @Override // org.telegram.messenger.n10
                                                    public final void a(Object obj4, Object obj5) {
                                                        int i13 = i12;
                                                        TLRPC.User user = a22;
                                                        d7 d7Var2 = d7Var;
                                                        Boolean bool = (Boolean) obj4;
                                                        String str = (String) obj5;
                                                        switch (i13) {
                                                            case 0:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable3 = d7Var2.Z1;
                                                                    if (runnable3 != null) {
                                                                        runnable3.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(d7Var2.m2);
                                                                    d7Var2.dismiss();
                                                                    org.telegram.messenger.g0.i3(new s6(1, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new fc(d7Var2.F, d7Var2.J0).Q(R.raw.error, 36, bd.a0(null, null, 2131743888, str)).j();
                                                                }
                                                                d7Var2.h2.setLoading(false);
                                                                break;
                                                            default:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable4 = d7Var2.Z1;
                                                                    if (runnable4 != null) {
                                                                        runnable4.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(d7Var2.m2);
                                                                    d7Var2.dismiss();
                                                                    org.telegram.messenger.g0.i3(new s6(2, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new fc(d7Var2.F, d7Var2.J0).Q(R.raw.error, 36, bd.a0(null, null, 2131743888, str)).j();
                                                                }
                                                                d7Var2.h2.setLoading(false);
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

    public /* synthetic */ g0(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = 2;
        this.c = context;
        this.d = e6Var;
        this.b = j10;
        this.f = starGift;
        this.e = arrayList;
    }

    public /* synthetic */ g0(ma maVar, long j10, Context context, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, int i3) {
        this.a = i3;
        this.f = maVar;
        this.b = j10;
        this.c = context;
        this.d = e6Var;
        this.e = runnable;
    }
}
