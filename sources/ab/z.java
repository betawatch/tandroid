package ab;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnSuccessListener;
import fi.p6;
import fi.x6;
import h9.t1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.gd;
import org.telegram.messenger.n5;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.xo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.p70;
import org.telegram.ui.bn;
import org.telegram.ui.f40;
import org.telegram.ui.k30;
import org.telegram.ui.kb1;
import org.telegram.ui.kz;
import org.telegram.ui.rj;
import p4.c1;
import p4.i1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements OnSuccessListener, x6, kb1, r1, bg.q, xo, c1, h2.j, xh.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // xh.j
    public void a(xh.f fVar, float f10, float f11) {
        xh.l lVar = (xh.l) this.c;
        if (lVar.d || lVar.e || lVar.f || !this.b) {
            return;
        }
        lVar.c(f10, f11);
    }

    @Override // h2.j
    public void accept(Object obj) {
        ((i1) obj).D((e2.e) this.c, this.b);
    }

    @Override // fi.x6
    public void b(boolean z10) {
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

    @Override // org.telegram.ui.kb1
    public void c(int i7, ArrayList arrayList) {
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
                kz kzVar = (kz) this.c;
                LongSparseIntArray longSparseIntArray = kzVar.I;
                kzVar.E = i7;
                if (this.b) {
                    kzVar.u0(kzVar.G, arrayList, true);
                    kzVar.G = arrayList;
                    for (int i11 = 0; i11 < kzVar.G.size(); i11++) {
                        kzVar.H.remove(kzVar.G.get(i11));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!n5.C(keyAt) && !kzVar.G.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i13)).longValue());
                    }
                } else {
                    kzVar.u0(kzVar.H, arrayList, false);
                    kzVar.H = arrayList;
                    for (int i14 = 0; i14 < kzVar.H.size(); i14++) {
                        Long l10 = (Long) kzVar.H.get(i14);
                        kzVar.G.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                kzVar.p0();
                kzVar.o0(false);
                kzVar.C0();
                break;
        }
    }

    @Override // org.telegram.messenger.xo
    public boolean e(TLRPC.TL_error tL_error) {
        p70 p70Var = (p70) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            p70Var.setOnDismissListener(new l70(0, p70Var, this.b));
        }
        p70Var.dismiss();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(u1 u1Var, int i7) {
        switch (this.a) {
            case 3:
                org.telegram.ui.x6.d0((org.telegram.ui.x6) this.c, this.b);
                break;
            case 4:
            default:
                f40 f40Var = ((k30) this.c).b;
                f40Var.V2.A(0, null);
                f40Var.o1().j(this.b ? 101 : 40, 0L, null);
                break;
            case 5:
                bn bnVar = (bn) this.c;
                rj rjVar = bnVar.a0;
                if (rjVar != null) {
                    if (!this.b) {
                        rjVar.G();
                        break;
                    } else {
                        bnVar.finishFragment();
                        break;
                    }
                }
                break;
        }
    }

    @Override // bg.q
    public void i(long j3) {
        m6 m6Var = ((x1) this.c).a.z3;
        if (m6Var != null) {
            m6Var.t(gd.M((int) j3, this.b), true, true);
        }
    }

    @Override // p4.c1
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.a) {
            case 9:
                t1 u10 = h9.i0.u((e2.l0) this.c);
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
        SharedPreferences.Editor edit = a8.c1.a((Context) this.c).edit();
        edit.putBoolean("proxy_retention", this.b);
        edit.apply();
    }
}
