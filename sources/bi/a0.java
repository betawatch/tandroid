package bi;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import di.u8;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.r9;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ja;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a0(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = 2;
        this.c = context;
        this.d = e6Var;
        this.b = j3;
        this.f = starGift;
        this.e = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0115  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        r9 r9Var;
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
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                Runnable runnable = (Runnable) obj2;
                r9 r9Var2 = m0Var.i2;
                if (r9Var2 != null && !r9Var2.f()) {
                    long j10 = this.b;
                    Context context2 = this.c;
                    if ((j10 == 0 || j10 == m10.i(m0Var.a).e()) && (arrayList = (r9Var = m0Var.i2).h) != null) {
                        new t0(context2, e6Var, j10, r9Var.d, arrayList, runnable, false).show();
                    } else {
                        new j0(context2, m0Var.a, m0Var.i2.d, null, j10, runnable, false, false).show();
                    }
                }
                m0Var.dismiss();
                break;
            case 1:
                t0 t0Var = (t0) obj3;
                t0Var.getClass();
                y yVar = new y(context, (org.telegram.ui.ActionBar.e6) obj, new x(j3, true, null), t0Var.Z1);
                yVar.show();
                yVar.j2 = (Runnable) obj2;
                t0Var.dismiss();
                break;
            case 2:
                new t0(this.c, (org.telegram.ui.ActionBar.e6) obj, this.b, (TL_stars.StarGift) obj3, (ArrayList) obj2, null, true).show();
                break;
            default:
                final u6 u6Var = (u6) obj3;
                Runnable runnable2 = (Runnable) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                int i11 = u6Var.U1;
                o6 o6Var = u6Var.p2;
                hi.d dVar = u6Var.k2;
                if (!dVar.R) {
                    if (u6Var.Z1 != null) {
                        y yVar2 = new y(context, u6Var.J0, new x(j3, u6Var.m2, u6Var.d1()), u6Var.Z1);
                        yVar2.show();
                        yVar2.j2 = runnable2;
                        org.telegram.messenger.g0.v1(o6Var);
                        u6Var.dismiss();
                        if (!u6Var.t2) {
                            org.telegram.messenger.g0.i3(new h6(u6Var, 5), 500L);
                            break;
                        }
                    } else {
                        dVar.setLoading(true);
                        org.telegram.ui.Cells.f3 f3Var = o6Var.b;
                        if (f3Var.getEmojiPadding() > 0) {
                            f3Var.k(true);
                        } else if (f3Var.w) {
                            f3Var.d();
                        }
                        final int i12 = 0;
                        if (starGift != null) {
                            u8.y(i11, false).i(u6Var.Y1, u6Var.m2, u6Var.n2, u6Var.V1, u6Var.d1(), new f6(u6Var, i10));
                            break;
                        } else {
                            ug.j jVar = u6Var.a2;
                            final TLRPC.User a22 = np.s1(i11).a2(Long.valueOf(u6Var.V1));
                            if (a22 == null) {
                                dVar.setLoading(false);
                                break;
                            } else {
                                if (u6Var.o2) {
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
                                                wg.q.k(new ArrayList(Arrays.asList(a22)), tL_premiumGiftCodeOption, null, u6Var.d1(), new t6(u6Var, 0), new ai.v1(4, u6Var, a22), new ai.g0(u6Var, 3));
                                                break;
                                            } else {
                                                u8.y(i11, false).g(u6Var.V1, tL_premiumGiftCodeOption, u6Var.d1(), new s10() { // from class: bi.g6
                                                    @Override // org.telegram.messenger.s10
                                                    public final void a(Object obj4, Object obj5) {
                                                        int i13 = i10;
                                                        TLRPC.User user = a22;
                                                        u6 u6Var2 = u6Var;
                                                        Boolean bool = (Boolean) obj4;
                                                        String str = (String) obj5;
                                                        switch (i13) {
                                                            case 0:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable3 = u6Var2.c2;
                                                                    if (runnable3 != null) {
                                                                        runnable3.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(u6Var2.p2);
                                                                    u6Var2.dismiss();
                                                                    org.telegram.messenger.g0.i3(new k6(1, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new cc(u6Var2.F, u6Var2.J0).Q(R.raw.error, 36, hd.a0(null, null, 2131743878, str)).j();
                                                                }
                                                                u6Var2.k2.setLoading(false);
                                                                break;
                                                            default:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable4 = u6Var2.c2;
                                                                    if (runnable4 != null) {
                                                                        runnable4.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(u6Var2.p2);
                                                                    u6Var2.dismiss();
                                                                    org.telegram.messenger.g0.i3(new k6(2, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new cc(u6Var2.F, u6Var2.J0).Q(R.raw.error, 36, hd.a0(null, null, 2131743878, str)).j();
                                                                }
                                                                u6Var2.k2.setLoading(false);
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
                                                        tL_inputStorePaymentGiftPremium.user_id = np.s1(i11).q1(a22);
                                                        tL_inputStorePaymentGiftPremium.currency = jVar.h.a().c;
                                                        tL_inputStorePaymentGiftPremium.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_inputStorePaymentGiftPremium.currency)) * (r5.b / Math.pow(10.0d, 6.0d)));
                                                        org.telegram.messenger.r1.i().d(jVar.a.store_product, new i6(u6Var, i12));
                                                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                                                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
                                                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_canPurchaseStore, new j6(u6Var, tL_inputStorePaymentGiftPremium, tL_payments_canPurchaseStore, i12));
                                                        break;
                                                    }
                                                } else {
                                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                                    if (launchActivity != null) {
                                                        Uri parse = Uri.parse(tL_premiumGiftOption.bot_url);
                                                        if (parse.getHost().equals("t.me")) {
                                                            if (parse.getPath().startsWith("/$") || parse.getPath().startsWith("/invoice/")) {
                                                                launchActivity.Y0 = new h6(u6Var, i12);
                                                            } else {
                                                                launchActivity.X0 = true;
                                                            }
                                                        }
                                                        vf.c.t(launchActivity, jVar.a.bot_url);
                                                        u6Var.dismiss();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                u8.y(i11, false).g(u6Var.V1, tL_premiumGiftOption, u6Var.d1(), new s10() { // from class: bi.g6
                                                    @Override // org.telegram.messenger.s10
                                                    public final void a(Object obj4, Object obj5) {
                                                        int i13 = i12;
                                                        TLRPC.User user = a22;
                                                        u6 u6Var2 = u6Var;
                                                        Boolean bool = (Boolean) obj4;
                                                        String str = (String) obj5;
                                                        switch (i13) {
                                                            case 0:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable3 = u6Var2.c2;
                                                                    if (runnable3 != null) {
                                                                        runnable3.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(u6Var2.p2);
                                                                    u6Var2.dismiss();
                                                                    org.telegram.messenger.g0.i3(new k6(1, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new cc(u6Var2.F, u6Var2.J0).Q(R.raw.error, 36, hd.a0(null, null, 2131743878, str)).j();
                                                                }
                                                                u6Var2.k2.setLoading(false);
                                                                break;
                                                            default:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable4 = u6Var2.c2;
                                                                    if (runnable4 != null) {
                                                                        runnable4.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(u6Var2.p2);
                                                                    u6Var2.dismiss();
                                                                    org.telegram.messenger.g0.i3(new k6(2, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new cc(u6Var2.F, u6Var2.J0).Q(R.raw.error, 36, hd.a0(null, null, 2131743878, str)).j();
                                                                }
                                                                u6Var2.k2.setLoading(false);
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

    public /* synthetic */ a0(u6 u6Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.a = 3;
        this.f = u6Var;
        this.b = j3;
        this.c = context;
        this.e = runnable;
        this.d = starGift;
    }

    public /* synthetic */ a0(ja jaVar, long j3, Context context, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable, int i7) {
        this.a = i7;
        this.f = jaVar;
        this.b = j3;
        this.c = context;
        this.d = e6Var;
        this.e = runnable;
    }
}
