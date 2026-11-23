package ab;

import a8.c1;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnSuccessListener;
import fi.p6;
import fi.x6;
import h9.s1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.gd;
import org.telegram.messenger.n5;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.xo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.o70;
import org.telegram.ui.bn;
import org.telegram.ui.e40;
import org.telegram.ui.ib1;
import org.telegram.ui.j30;
import org.telegram.ui.jz;
import org.telegram.ui.rj;
import org.telegram.ui.y6;
import p4.b1;
import p4.h1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements OnSuccessListener, x6, ib1, q1, bg.q, xo, b1, h2.j, xh.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.ui.ib1
    public void a(int i7, ArrayList arrayList) {
        switch (this.a) {
            case 2:
                kg.b0 b0Var = (kg.b0) this.c;
                ArrayList arrayList2 = b0Var.k;
                ArrayList arrayList3 = b0Var.j;
                int i10 = 0;
                if (this.b) {
                    b0Var.f = i7;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i10 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i10));
                        i10++;
                    }
                } else {
                    b0Var.g = i7;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i10 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i10));
                        i10++;
                    }
                }
                b0Var.e.run();
                break;
            default:
                jz jzVar = (jz) this.c;
                LongSparseIntArray longSparseIntArray = jzVar.I;
                jzVar.E = i7;
                if (this.b) {
                    jzVar.u0(jzVar.G, arrayList, true);
                    jzVar.G = arrayList;
                    for (int i11 = 0; i11 < jzVar.G.size(); i11++) {
                        jzVar.H.remove(jzVar.G.get(i11));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!n5.C(keyAt) && !jzVar.G.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i13)).longValue());
                    }
                } else {
                    jzVar.u0(jzVar.H, arrayList, false);
                    jzVar.H = arrayList;
                    for (int i14 = 0; i14 < jzVar.H.size(); i14++) {
                        Long l10 = (Long) jzVar.H.get(i14);
                        jzVar.G.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                jzVar.p0();
                jzVar.o0(false);
                jzVar.C0();
                break;
        }
    }

    @Override // h2.j
    public void accept(Object obj) {
        ((h1) obj).E((e2.e) this.c, this.b);
    }

    @Override // fi.x6
    public void c(boolean z10) {
        fi.q qVar = (fi.q) this.c;
        if (!this.b && z10) {
            boolean z11 = qVar.b == 1;
            p6 p6Var = qVar.s;
            if (z11) {
                if (!p6Var.z) {
                    return;
                }
            } else if (!p6Var.p) {
                return;
            }
            p6Var.T(z11);
        }
    }

    @Override // org.telegram.messenger.xo
    public boolean d(TLRPC.TL_error tL_error) {
        o70 o70Var = (o70) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            o70Var.setOnDismissListener(new k70(0, o70Var, this.b));
        }
        o70Var.dismiss();
        return false;
    }

    @Override // bg.q
    public void g(long j3) {
        m6 m6Var = ((x1) this.c).a.z3;
        if (m6Var != null) {
            m6Var.t(gd.M((int) j3, this.b), true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(t1 t1Var, int i7) {
        switch (this.a) {
            case 3:
                y6.d0((y6) this.c, this.b);
                break;
            case 4:
            default:
                e40 e40Var = ((j30) this.c).b;
                e40Var.V2.A(0, null);
                e40Var.o1().j(this.b ? 101 : 40, 0L, null);
                break;
            case 5:
                bn bnVar = (bn) this.c;
                rj rjVar = bnVar.a0;
                if (rjVar != null) {
                    if (!this.b) {
                        rjVar.F();
                        break;
                    } else {
                        bnVar.finishFragment();
                        break;
                    }
                }
                break;
        }
    }

    @Override // p4.b1
    public Object j(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.a) {
            case 9:
                s1 u10 = h9.i0.u((e2.l0) this.c);
                boolean z10 = this.b;
                return d0Var.q(vVar, u10, z10 ? -1 : d0Var.t.p0(), z10 ? -9223372036854775807L : d0Var.t.n());
            default:
                List list = (List) this.c;
                boolean z11 = this.b;
                return d0Var.q(vVar, list, z11 ? -1 : d0Var.t.p0(), z11 ? -9223372036854775807L : d0Var.t.n());
        }
    }

    @Override // xh.j
    public void o(xh.f fVar, float f10, float f11) {
        xh.l lVar = (xh.l) this.c;
        if (lVar.d || lVar.e || lVar.f || !this.b) {
            return;
        }
        lVar.c(f10, f11);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        SharedPreferences.Editor edit = c1.a((Context) this.c).edit();
        edit.putBoolean("proxy_retention", this.b);
        edit.apply();
    }
}
