// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l41 implements z7c, ed, gx2, o2b, x56, z97, lx6, us2, OnSuccessListener, ula {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l41(yb8 yb8Var, int i) {
        this.a = (byte) 5;
        this.c = yb8Var;
        this.b = i;
    }

    @Override // z7c
    public final void a(int i, ArrayList arrayList) {
        byte b = this.a;
        int i2 = 0;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                m41 m41Var = (m41) obj;
                ArrayList arrayList2 = m41Var.k;
                ArrayList arrayList3 = m41Var.j;
                if (z) {
                    m41Var.f = i;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i2 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i2));
                        i2++;
                    }
                } else {
                    m41Var.g = i;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i2 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i2));
                        i2++;
                    }
                }
                m41Var.e.run();
                break;
            default:
                pd4 pd4Var = (pd4) obj;
                LongSparseIntArray longSparseIntArray = pd4Var.I;
                pd4Var.E = i;
                if (z) {
                    pd4Var.t0(pd4Var.G, arrayList, true);
                    pd4Var.G = arrayList;
                    for (int i3 = 0; i3 < pd4Var.G.size(); i3++) {
                        pd4Var.H.remove(pd4Var.G.get(i3));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        long keyAt = longSparseIntArray.keyAt(i4);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!cf3.B(keyAt) && !pd4Var.G.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i5)).longValue());
                    }
                } else {
                    pd4Var.t0(pd4Var.H, arrayList, false);
                    pd4Var.H = arrayList;
                    for (int i6 = 0; i6 < pd4Var.H.size(); i6++) {
                        Long l = (Long) pd4Var.H.get(i6);
                        pd4Var.G.remove(l);
                        longSparseIntArray.delete(l.longValue());
                    }
                }
                pd4Var.l0();
                pd4Var.k0(false);
                pd4Var.B0();
                break;
        }
    }

    @Override // us2
    public final void accept(Object obj) {
        ((ad8) obj).i0((nz) this.c, this.b);
    }

    @Override // z97
    public final boolean b(TLRPC.TL_error tL_error) {
        fu5 fu5Var = (fu5) this.c;
        byte b = 0;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            fu5Var.setOnDismissListener(new bu5(b, fu5Var, this.b));
        }
        fu5Var.dismiss();
        return false;
    }

    @Override // ula
    public final void e(qla qlaVar, float f, float f2) {
        wla wlaVar = (wla) this.c;
        if (wlaVar.d || wlaVar.e || wlaVar.f || !this.b) {
            return;
        }
        wlaVar.c(f, f2);
    }

    @Override // o2b
    public final void i(boolean z) {
        vf3 vf3Var = (vf3) this.c;
        if (this.b || !z) {
            return;
        }
        boolean z2 = vf3Var.b == 1;
        g2b g2bVar = vf3Var.s;
        if (z2) {
            if (!g2bVar.z) {
                return;
            }
        } else if (!g2bVar.p) {
            return;
        }
        g2bVar.S(z2);
    }

    @Override // x56
    public final void invoke(Object obj) {
        ((mc8) obj).D(((yb8) this.c).a, this.b ? 1 : 0);
    }

    @Override // gx2
    public final void o(long j) {
        gn gnVar = ((mb2) this.c).a.z3;
        if (gnVar != null) {
            gnVar.t(k96.M((int) j, this.b), true, true);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        SharedPreferences.Editor edit = sre.a((Context) this.c).edit();
        edit.putBoolean("proxy_retention", this.b);
        edit.apply();
    }

    @Override // lx6
    public final Object p(tv6 tv6Var, su6 su6Var, int i) {
        long m;
        int i2;
        byte b = this.a;
        long j = -9223372036854775807L;
        int i3 = -1;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 9:
                try {
                    w59 u = mm5.u(br6.a(su6Var.c, (Bundle) obj));
                    if (z) {
                        m = -9223372036854775807L;
                        i2 = -1;
                    } else {
                        tv6Var.t();
                        int l0 = tv6Var.t.l0();
                        tv6Var.t();
                        m = tv6Var.t.m();
                        i2 = l0;
                    }
                    return tv6Var.o(su6Var, u, i2, m);
                } catch (RuntimeException e) {
                    lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e);
                    return jie.b(e);
                }
            default:
                try {
                    mm5 a = w21.a((IBinder) obj);
                    jm5 p = mm5.p();
                    for (int i4 = 0; i4 < a.size(); i4++) {
                        Bundle bundle = (Bundle) a.get(i4);
                        bundle.getClass();
                        p.c(br6.a(su6Var.c, bundle));
                    }
                    w59 f = p.f();
                    if (!z) {
                        tv6Var.t();
                        i3 = tv6Var.t.l0();
                        tv6Var.t();
                        j = tv6Var.t.m();
                    }
                    return tv6Var.o(su6Var, f, i3, j);
                } catch (RuntimeException e2) {
                    lad.g("MediaSessionStub", "Ignoring malformed Bundle for MediaItem", e2);
                    return jie.b(e2);
                }
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 1:
                ((r61) obj).q0(z);
                break;
            case 2:
                mu1 mu1Var = (mu1) obj;
                ar1 ar1Var = mu1Var.a0;
                if (ar1Var != null) {
                    if (!z) {
                        ar1Var.F();
                        break;
                    } else {
                        mu1Var.finishFragment();
                        break;
                    }
                }
                break;
            case 7:
                h75 h75Var = ((k65) obj).b;
                h75Var.T2.C(0, null);
                h75Var.c1().j(z ? 101 : 40, 0L, null);
                break;
            default:
                on9 on9Var = (on9) obj;
                on9Var.c.C(0, null);
                on9Var.J.j(z ? 101 : 40, 0L, null);
                break;
        }
    }

    public /* synthetic */ l41(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }
}
