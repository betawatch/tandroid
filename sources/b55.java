// default package

import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b55 implements icc {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b55(int i, c cVar, sk7 sk7Var, n55 n55Var, String str, byte[] bArr, byte[] bArr2, vnb vnbVar) {
        this.c = i;
        this.d = cVar;
        this.e = n55Var;
        this.b = str;
        this.f = bArr;
        this.g = bArr2;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                c cVar = (c) obj6;
                n55 n55Var = (n55) obj5;
                byte[] bArr = (byte[]) obj4;
                byte[] bArr2 = (byte[]) obj3;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str = (String) obj2;
                if (!n55Var.e || n55Var.d) {
                    if (sendtransfer != null) {
                        int i = this.c;
                        ConnectionsManager.getInstance(i).sendRequestTyped(sendtransfer, new ic((byte) 0), new bj4(i, cVar, this.b, bArr, bArr2, sendtransfer, n55Var));
                        break;
                    } else {
                        if (str == null) {
                            str = ob6.M0(2131742617, null);
                        }
                        d31.c0(str);
                        n55Var.d = false;
                        if (!n55Var.f) {
                            n55Var.f = true;
                            n55Var.b.a();
                        }
                        if (!n55Var.e) {
                            n55Var.a.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                is7 is7Var = (is7) obj6;
                Context context = (Context) obj5;
                vnb vnbVar = (vnb) obj4;
                d31 d31Var = (d31) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                HashMap hashMap = vs7.c;
                String str2 = this.b;
                int i2 = this.c;
                if (updates == null) {
                    hashMap.remove(str2);
                    vs7.c();
                    it7.u(context, i2, vnbVar, d31Var, tL_error, null);
                    break;
                } else {
                    hashMap.put(str2, Long.valueOf(SystemClock.elapsedRealtime() + 60000));
                    vs7.c();
                    uc7.s1(i2).Y3(updates, false);
                    if (is7Var != null) {
                        is7Var.run();
                    }
                    v21 Q = vs7.h().Q(R.raw.contact_check, 36, ob6.M0(2131749563, null));
                    Q.u = true;
                    Q.j();
                    break;
                }
            default:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj6;
                Context context2 = (Context) obj5;
                vnb vnbVar2 = (vnb) obj4;
                jra jraVar = (jra) obj3;
                a35 a35Var = (a35) obj;
                Boolean bool = (Boolean) obj2;
                a35Var.h = new TL_wallet.walletOnchainGiftActionDelist();
                a35Var.i = tL_starGiftUnique;
                int i3 = this.c;
                ms7 ms7Var = new ms7(context2, i3, tL_starGiftUnique, vnbVar2);
                String str3 = this.b;
                ms7Var.h1(ob6.M0(bool.booleanValue() ? 2131749474 : 2131749475, null), ob6.a0(null, null, 2131749832, str3));
                ms7Var.Y1.f(ob6.M0(2131749501, null), it7.j(a35Var.b), null, null);
                ms7Var.e1(ob6.M0(2131750393, null));
                ms7Var.p2 = 2131749576;
                ms7Var.f1(a35Var);
                ms7Var.d1(new y36((Object) jraVar, (Object) tL_starGiftUnique, (Object) str3, i3, (byte) 16), new v35(tL_starGiftUnique, str3, (byte) 13), new xs7(context2, i3, vnbVar2, ms7Var, bool, (byte) 1));
                ms7Var.show();
                break;
        }
    }

    public /* synthetic */ b55(String str, int i, is7 is7Var, Context context, vnb vnbVar, d31 d31Var) {
        this.b = str;
        this.c = i;
        this.d = is7Var;
        this.e = context;
        this.f = vnbVar;
        this.g = d31Var;
    }

    public /* synthetic */ b55(TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i, vnb vnbVar, String str, jra jraVar) {
        this.d = tL_starGiftUnique;
        this.e = context;
        this.c = i;
        this.f = vnbVar;
        this.b = str;
        this.g = jraVar;
    }
}
