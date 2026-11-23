package bi;

import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x3 implements r10 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ x3(int i7, org.telegram.ui.Wallet.u0 u0Var, org.telegram.ui.Wallet.d3 d3Var, org.telegram.ui.Wallet.y2 y2Var, String str, byte[] bArr, byte[] bArr2, org.telegram.ui.ActionBar.h6 h6Var) {
        this.c = i7;
        this.f = u0Var;
        this.b = y2Var;
        this.e = str;
        this.d = bArr;
        this.g = bArr2;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        Object obj3 = this.g;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.f;
        switch (i7) {
            case 0:
                Runnable runnable = (Runnable) obj6;
                Context context = (Context) obj5;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                lc lcVar = (lc) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                HashMap hashMap = i4.c;
                String str = this.e;
                int i10 = this.c;
                if (updates == null) {
                    hashMap.remove(str);
                    i4.c();
                    x4.r(context, i10, h6Var, lcVar, tL_error, null);
                    break;
                } else {
                    hashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime() + 60000));
                    i4.c();
                    np.u1(i10).V3(updates, false);
                    if (runnable != null) {
                        runnable.run();
                    }
                    gc Q = i4.h().Q(R.raw.contact_check, 36, hd.N0(2131749601, null));
                    Q.t = true;
                    Q.j();
                    break;
                }
            case 1:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj6;
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj4;
                di.k1 k1Var = (di.k1) obj3;
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj;
                Boolean bool = (Boolean) obj2;
                p0Var.h = new TL_wallet.walletOnchainGiftActionDelist();
                p0Var.i = tL_starGiftUnique;
                int i11 = this.c;
                s3 s3Var = new s3(i11, context2, tL_starGiftUnique, h6Var2);
                String str2 = this.e;
                s3Var.k1(hd.N0(bool.booleanValue() ? 2131749512 : 2131749513, null), hd.a0(null, null, 2131749869, str2));
                s3Var.Z1.e(hd.N0(2131749539, null), x4.i(p0Var.b), null, null);
                s3Var.d2.i(hd.N0(2131750415, null), false, true);
                s3Var.q2 = 2131749614;
                s3Var.j1(p0Var);
                s3Var.i1(new ai.b1(k1Var, tL_starGiftUnique, str2, i11, 1), new ai.y1(3, tL_starGiftUnique, str2), new k4(context2, i11, h6Var2, s3Var, bool, 0));
                s3Var.show();
                break;
            default:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj6;
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj5;
                byte[] bArr = (byte[]) obj4;
                byte[] bArr2 = (byte[]) obj3;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str3 = (String) obj2;
                if (!y2Var.e || y2Var.d) {
                    if (sendtransfer != null) {
                        int i12 = this.c;
                        ConnectionsManager.getInstance(i12).sendRequestTyped(sendtransfer, new d3.b(1), new m4(i12, u0Var, this.e, bArr, bArr2, sendtransfer, y2Var));
                        break;
                    } else {
                        if (str3 == null) {
                            str3 = hd.N0(2131742720, null);
                        }
                        lc.c0(str3);
                        y2Var.d = false;
                        if (!y2Var.f) {
                            y2Var.f = true;
                            y2Var.b.a();
                        }
                        if (!y2Var.e) {
                            y2Var.a.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ x3(String str, int i7, Runnable runnable, Context context, org.telegram.ui.ActionBar.h6 h6Var, lc lcVar) {
        this.e = str;
        this.c = i7;
        this.f = runnable;
        this.b = context;
        this.d = h6Var;
        this.g = lcVar;
    }

    public /* synthetic */ x3(TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, String str, di.k1 k1Var) {
        this.f = tL_starGiftUnique;
        this.b = context;
        this.c = i7;
        this.d = h6Var;
        this.e = str;
        this.g = k1Var;
    }
}
