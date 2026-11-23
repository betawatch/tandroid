package bi;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.messenger.ys;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.lc;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l4 implements y10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ l4(TL_stars.TL_starGiftUnique tL_starGiftUnique, String str, di.f2 f2Var, int i7, long j3, long j10) {
        this.e = tL_starGiftUnique;
        this.f = str;
        this.g = f2Var;
        this.b = i7;
        this.c = j3;
        this.d = j10;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        int i7 = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        int i10 = this.b;
        Object obj4 = this.e;
        switch (i7) {
            case 0:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj4;
                String str = (String) obj3;
                di.f2 f2Var = (di.f2) obj2;
                if (((Boolean) obj).booleanValue()) {
                    f2Var.run();
                    di.y8 y10 = di.y8.y(i10, false);
                    String str2 = tL_starGiftUnique.slug;
                    LongSparseArray longSparseArray = y10.L;
                    LongSparseArray longSparseArray2 = y10.K;
                    if (!TextUtils.isEmpty(str2)) {
                        ArrayList arrayList = new ArrayList();
                        for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                            if (((di.p8) longSparseArray.valueAt(i11)).j(str2)) {
                                arrayList.add(Long.valueOf(longSparseArray.keyAt(i11)));
                            }
                        }
                        for (int i12 = 0; i12 < longSparseArray2.size(); i12++) {
                            di.n8 n8Var = (di.n8) longSparseArray2.valueAt(i12);
                            di.p8 p8Var = n8Var.g;
                            boolean z10 = p8Var != null && p8Var.j(str2);
                            Iterator it = n8Var.h.values().iterator();
                            while (it.hasNext()) {
                                z10 = z10 || ((di.p8) it.next()).j(str2);
                            }
                            if (z10 && !arrayList.contains(Long.valueOf(longSparseArray2.keyAt(i12)))) {
                                arrayList.add(Long.valueOf(longSparseArray2.keyAt(i12)));
                            }
                        }
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            y10.O(((Long) arrayList.get(i13)).longValue());
                        }
                    }
                    long j3 = this.c;
                    if (j3 != 0) {
                        di.y8.y(i10, false).O(j3);
                        x4.s(tL_starGiftUnique, hd.a0(null, null, 2131749661, str, org.telegram.messenger.n5.s(i10, j3)));
                        break;
                    } else {
                        di.y8.y(i10, false).O(this.d);
                        org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(i10);
                        String str3 = tL_starGiftUnique.gift_address;
                        org.telegram.ui.Wallet.h hVar = D.B;
                        org.telegram.messenger.g0.r(hVar);
                        D.y = str3;
                        D.z = null;
                        D.A = 0;
                        D.B().e();
                        D.H().g();
                        D.K();
                        int i14 = D.A;
                        long[] jArr = org.telegram.ui.Wallet.u0.S;
                        if (i14 < 7) {
                            D.A = i14 + 1;
                            org.telegram.messenger.g0.h3(hVar, jArr[i14]);
                        }
                        x4.s(tL_starGiftUnique, hd.a0(null, null, 2131749662, str));
                        break;
                    }
                } else {
                    x4.s(tL_starGiftUnique, hd.a0(null, null, 2131749619, str));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj3;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                Integer num = (Integer) obj;
                ((a70) obj4).v();
                int intValue = num.intValue();
                long j10 = this.c;
                long j11 = this.d;
                if (intValue == 0) {
                    if (np.u1(i10).u2(j10, j11, null)) {
                        ys.t(i10).G(j10, j11, false);
                    }
                    if (lc.a(g2Var)) {
                        lc.z(g2Var, 4, num.intValue(), h6Var).j();
                        break;
                    }
                } else {
                    ys.t(i10).H(j10, num.intValue(), j11);
                    if (lc.a(g2Var)) {
                        lc.z(g2Var, 5, num.intValue(), h6Var).j();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ l4(a70 a70Var, int i7, long j3, long j10, bn bnVar, org.telegram.ui.ActionBar.h6 h6Var) {
        this.e = a70Var;
        this.b = i7;
        this.c = j3;
        this.d = j10;
        this.f = bnVar;
        this.g = h6Var;
    }
}
