package ab;

import a8.c1;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnSuccessListener;
import fi.a7;
import fi.s6;
import h9.s1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.yo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Cells.w1;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.g6;
import org.telegram.ui.an;
import org.telegram.ui.c40;
import org.telegram.ui.gb1;
import org.telegram.ui.h30;
import org.telegram.ui.hz;
import org.telegram.ui.qj;
import org.telegram.ui.y6;
import p4.a1;
import p4.g1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements OnSuccessListener, a7, gb1, q1, bg.p, yo, a1, h2.j, xh.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.ui.gb1
    public void a(int i7, ArrayList arrayList) {
        switch (this.a) {
            case 2:
                kg.a0 a0Var = (kg.a0) this.c;
                ArrayList arrayList2 = a0Var.k;
                ArrayList arrayList3 = a0Var.j;
                int i10 = 0;
                if (this.b) {
                    a0Var.f = i7;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i10 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i10));
                        i10++;
                    }
                } else {
                    a0Var.g = i7;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i10 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i10));
                        i10++;
                    }
                }
                a0Var.e.run();
                break;
            default:
                hz hzVar = (hz) this.c;
                LongSparseIntArray longSparseIntArray = hzVar.I;
                hzVar.E = i7;
                if (this.b) {
                    hzVar.u0(hzVar.G, arrayList, true);
                    hzVar.G = arrayList;
                    for (int i11 = 0; i11 < hzVar.G.size(); i11++) {
                        hzVar.H.remove(hzVar.G.get(i11));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!m5.C(keyAt) && !hzVar.G.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i13)).longValue());
                    }
                } else {
                    hzVar.u0(hzVar.H, arrayList, false);
                    hzVar.H = arrayList;
                    for (int i14 = 0; i14 < hzVar.H.size(); i14++) {
                        Long l10 = (Long) hzVar.H.get(i14);
                        hzVar.G.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                hzVar.p0();
                hzVar.o0(false);
                hzVar.C0();
                break;
        }
    }

    @Override // h2.j
    public void accept(Object obj) {
        ((g1) obj).D((e2.e) this.c, this.b);
    }

    @Override // fi.a7
    public void c(boolean z10) {
        fi.q qVar = (fi.q) this.c;
        if (!this.b && z10) {
            boolean z11 = qVar.b == 1;
            s6 s6Var = qVar.s;
            if (z11) {
                if (!s6Var.z) {
                    return;
                }
            } else if (!s6Var.p) {
                return;
            }
            s6Var.T(z11);
        }
    }

    @Override // org.telegram.messenger.yo
    public boolean d(TLRPC.TL_error tL_error) {
        e70 e70Var = (e70) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            e70Var.setOnDismissListener(new a70(0, e70Var, this.b));
        }
        e70Var.dismiss();
        return false;
    }

    @Override // bg.p
    public void g(long j3) {
        g6 g6Var = ((w1) this.c).a.z3;
        if (g6Var != null) {
            g6Var.t(hd.M((int) j3, this.b), true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(t1 t1Var, int i7) {
        switch (this.a) {
            case 3:
                y6.d0((y6) this.c, this.b);
                break;
            case 4:
            default:
                c40 c40Var = ((h30) this.c).b;
                c40Var.V2.A(0, null);
                c40Var.n1().j(this.b ? 101 : 40, 0L, null);
                break;
            case 5:
                an anVar = (an) this.c;
                qj qjVar = anVar.a0;
                if (qjVar != null) {
                    if (!this.b) {
                        qjVar.D();
                        break;
                    } else {
                        anVar.finishFragment();
                        break;
                    }
                }
                break;
        }
    }

    @Override // xh.j
    public void j(xh.f fVar, float f10, float f11) {
        xh.l lVar = (xh.l) this.c;
        if (lVar.d || lVar.e || lVar.f || !this.b) {
            return;
        }
        lVar.c(f10, f11);
    }

    @Override // p4.a1
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.a) {
            case 9:
                s1 u10 = h9.i0.u((e2.l0) this.c);
                boolean z10 = this.b;
                return d0Var.q(vVar, u10, z10 ? -1 : d0Var.t.o0(), z10 ? -9223372036854775807L : d0Var.t.l());
            default:
                List list = (List) this.c;
                boolean z11 = this.b;
                return d0Var.q(vVar, list, z11 ? -1 : d0Var.t.o0(), z11 ? -9223372036854775807L : d0Var.t.l());
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        SharedPreferences.Editor edit = c1.a((Context) this.c).edit();
        edit.putBoolean("proxy_retention", this.b);
        edit.apply();
    }
}
