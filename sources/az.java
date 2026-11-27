// default package

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class az implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ az(Context context, vnb vnbVar, long j, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = (byte) 2;
        this.c = context;
        this.d = vnbVar;
        this.b = j;
        this.f = starGift;
        this.e = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        kv4 kv4Var;
        ArrayList arrayList;
        byte b = this.a;
        TLObject tLObject = null;
        Context context = this.c;
        long j = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f;
        final byte b2 = 1;
        switch (b) {
            case 0:
                fz fzVar = (fz) obj3;
                vnb vnbVar = (vnb) obj2;
                ex4 ex4Var = (ex4) obj;
                kv4 kv4Var2 = fzVar.h2;
                if (kv4Var2 != null && !kv4Var2.f()) {
                    long j2 = this.b;
                    Context context2 = this.c;
                    if ((j2 == 0 || j2 == yac.h(fzVar.a).e()) && (arrayList = (kv4Var = fzVar.h2).h) != null) {
                        new mz(context2, vnbVar, j2, kv4Var.d, arrayList, ex4Var, false).show();
                    } else {
                        new cz(context2, fzVar.a, fzVar.h2.d, null, j2, ex4Var, false, false).show();
                    }
                }
                fzVar.dismiss();
                break;
            case 1:
                mz mzVar = (mz) obj3;
                uy uyVar = new uy(context, (vnb) obj2, new ty(j, true, null), mzVar.Y1);
                uyVar.show();
                uyVar.i2 = (ex4) obj;
                mzVar.dismiss();
                break;
            case 2:
                new mz(this.c, (vnb) obj2, this.b, (TL_stars.StarGift) obj3, (ArrayList) obj, null, true).show();
                break;
            default:
                final a5a a5aVar = (a5a) obj3;
                Runnable runnable = (Runnable) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                int i = a5aVar.T1;
                v4a v4aVar = a5aVar.o2;
                c51 c51Var = a5aVar.j2;
                if (!c51Var.R) {
                    if (a5aVar.Y1 != null) {
                        uy uyVar2 = new uy(context, a5aVar.J0, new ty(j, a5aVar.l2, a5aVar.Z0()), a5aVar.Y1);
                        uyVar2.show();
                        uyVar2.i2 = runnable;
                        hl.t1(v4aVar);
                        a5aVar.dismiss();
                        if (!a5aVar.s2) {
                            hl.d3(new r4a(a5aVar, (byte) 5), 500L);
                            break;
                        }
                    } else {
                        c51Var.setLoading(true);
                        int emojiPadding = v4aVar.b.getEmojiPadding();
                        lt3 lt3Var = v4aVar.b;
                        if (emojiPadding > 0) {
                            lt3Var.k(true);
                        } else if (lt3Var.w) {
                            lt3Var.d();
                        }
                        final byte b3 = 0;
                        if (starGift != null) {
                            jxa.v(i, false).g(a5aVar.X1, a5aVar.l2, a5aVar.m2, a5aVar.U1, a5aVar.Z0(), new p4a(a5aVar, b2));
                            break;
                        } else {
                            pw4 pw4Var = a5aVar.Z1;
                            final TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(a5aVar.U1));
                            if (X1 == null) {
                                c51Var.setLoading(false);
                                break;
                            } else {
                                if (a5aVar.n2) {
                                    TLObject tLObject2 = pw4Var.c;
                                    TLObject tLObject3 = pw4Var.d;
                                    if (tLObject2 != null || tLObject3 != null) {
                                        if (tLObject2 != null) {
                                            tLObject = tLObject2;
                                        } else if (tLObject3 != null) {
                                            tLObject = tLObject3;
                                        }
                                        if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) tLObject;
                                            if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency)) {
                                                on0.m(new ArrayList(Arrays.asList(X1)), tL_premiumGiftCodeOption, null, a5aVar.Z0(), new qu0(a5aVar, (byte) 12), new ku9(a5aVar, X1, (byte) 2), new sh9(a5aVar, (byte) 6));
                                                break;
                                            } else {
                                                jxa.v(i, false).e(a5aVar.U1, tL_premiumGiftCodeOption, a5aVar.Z0(), new icc() { // from class: q4a
                                                    @Override // icc
                                                    public final void a(Object obj4, Object obj5) {
                                                        byte b4 = b2;
                                                        TLRPC.User user = X1;
                                                        a5a a5aVar2 = a5aVar;
                                                        Boolean bool = (Boolean) obj4;
                                                        String str = (String) obj5;
                                                        switch (b4) {
                                                            case 0:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable2 = a5aVar2.b2;
                                                                    if (runnable2 != null) {
                                                                        runnable2.run();
                                                                    }
                                                                    hl.t1(a5aVar2.o2);
                                                                    a5aVar2.dismiss();
                                                                    hl.d3(new xp8(user, (byte) 2), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new d31(a5aVar2.F, a5aVar2.J0).Q(R.raw.error, 36, ob6.a0(null, null, 2131743533, str)).j();
                                                                }
                                                                a5aVar2.j2.setLoading(false);
                                                                break;
                                                            default:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable3 = a5aVar2.b2;
                                                                    if (runnable3 != null) {
                                                                        runnable3.run();
                                                                    }
                                                                    hl.t1(a5aVar2.o2);
                                                                    a5aVar2.dismiss();
                                                                    hl.d3(new xp8(user, (byte) 3), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new d31(a5aVar2.F, a5aVar2.J0).Q(R.raw.error, 36, ob6.a0(null, null, 2131743533, str)).j();
                                                                }
                                                                a5aVar2.j2.setLoading(false);
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            }
                                        } else if (tLObject instanceof TLRPC.TL_premiumGiftOption) {
                                            TLRPC.TL_premiumGiftOption tL_premiumGiftOption = (TLRPC.TL_premiumGiftOption) tLObject;
                                            if (!"XTR".equalsIgnoreCase(tL_premiumGiftOption.currency)) {
                                                if (!f11.b()) {
                                                    if (di0.h().j() && pw4Var.h != null) {
                                                        TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = new TLRPC.TL_inputStorePaymentGiftPremium();
                                                        tL_inputStorePaymentGiftPremium.user_id = uc7.s1(i).q1(X1);
                                                        tL_inputStorePaymentGiftPremium.currency = pw4Var.h.a().c;
                                                        tL_inputStorePaymentGiftPremium.amount = (long) (Math.pow(10.0d, di0.h().g(tL_inputStorePaymentGiftPremium.currency)) * (r2.b / 1000000.0d));
                                                        di0.h().c(pw4Var.a.store_product, new hw(a5aVar, (byte) 16));
                                                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                                                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
                                                        ConnectionsManager.getInstance(i).sendRequest(tL_payments_canPurchaseStore, new qn8((Object) a5aVar, (Object) tL_inputStorePaymentGiftPremium, (Object) tL_payments_canPurchaseStore, (byte) 7));
                                                        break;
                                                    }
                                                } else {
                                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                                    if (launchActivity != null) {
                                                        Uri parse = Uri.parse(tL_premiumGiftOption.bot_url);
                                                        if (parse.getHost().equals("t.me")) {
                                                            if (parse.getPath().startsWith("/$") || parse.getPath().startsWith("/invoice/")) {
                                                                launchActivity.Y0 = new r4a(a5aVar, b3);
                                                            } else {
                                                                launchActivity.X0 = true;
                                                            }
                                                        }
                                                        m01.u(launchActivity, pw4Var.a.bot_url);
                                                        a5aVar.dismiss();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                jxa.v(i, false).e(a5aVar.U1, tL_premiumGiftOption, a5aVar.Z0(), new icc() { // from class: q4a
                                                    @Override // icc
                                                    public final void a(Object obj4, Object obj5) {
                                                        byte b4 = b3;
                                                        TLRPC.User user = X1;
                                                        a5a a5aVar2 = a5aVar;
                                                        Boolean bool = (Boolean) obj4;
                                                        String str = (String) obj5;
                                                        switch (b4) {
                                                            case 0:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable2 = a5aVar2.b2;
                                                                    if (runnable2 != null) {
                                                                        runnable2.run();
                                                                    }
                                                                    hl.t1(a5aVar2.o2);
                                                                    a5aVar2.dismiss();
                                                                    hl.d3(new xp8(user, (byte) 2), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new d31(a5aVar2.F, a5aVar2.J0).Q(R.raw.error, 36, ob6.a0(null, null, 2131743533, str)).j();
                                                                }
                                                                a5aVar2.j2.setLoading(false);
                                                                break;
                                                            default:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable3 = a5aVar2.b2;
                                                                    if (runnable3 != null) {
                                                                        runnable3.run();
                                                                    }
                                                                    hl.t1(a5aVar2.o2);
                                                                    a5aVar2.dismiss();
                                                                    hl.d3(new xp8(user, (byte) 3), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new d31(a5aVar2.F, a5aVar2.J0).Q(R.raw.error, 36, ob6.a0(null, null, 2131743533, str)).j();
                                                                }
                                                                a5aVar2.j2.setLoading(false);
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            }
                                        }
                                    }
                                }
                                tLObject = pw4Var.b;
                                if (tLObject == null && (tLObject = pw4Var.a) == null) {
                                    c51Var.setLoading(false);
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

    public /* synthetic */ az(ny0 ny0Var, long j, Context context, Object obj, Object obj2, byte b) {
        this.a = b;
        this.f = ny0Var;
        this.b = j;
        this.c = context;
        this.d = obj;
        this.e = obj2;
    }
}
