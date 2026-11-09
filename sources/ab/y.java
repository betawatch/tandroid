package ab;

import a8.c1;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnSuccessListener;
import di.h7;
import di.z6;
import h9.t1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.bp;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.w1;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.y60;
import org.telegram.ui.cn;
import org.telegram.ui.e40;
import org.telegram.ui.iz;
import org.telegram.ui.j30;
import org.telegram.ui.kb1;
import org.telegram.ui.sj;
import org.telegram.ui.y6;
import p4.a1;
import p4.g1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements OnSuccessListener, h7, kb1, r1, bg.p, bp, a1, h2.j, xh.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y(int i7, Object obj, boolean z9) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
    }

    @Override // org.telegram.messenger.bp
    public boolean a(TLRPC.TL_error tL_error) {
        c70 c70Var = (c70) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            c70Var.setOnDismissListener(new y60(0, c70Var, this.b));
        }
        c70Var.dismiss();
        return false;
    }

    @Override // h2.j
    public void accept(Object obj) {
        ((g1) obj).D((e2.e) this.c, this.b);
    }

    @Override // di.h7
    public void b(boolean z9) {
        di.q qVar = (di.q) this.c;
        if (!this.b && z9) {
            boolean z10 = qVar.b == 1;
            z6 z6Var = qVar.s;
            if (z10) {
                if (!z6Var.z) {
                    return;
                }
            } else if (!z6Var.p) {
                return;
            }
            z6Var.T(z10);
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
                iz izVar = (iz) this.c;
                LongSparseIntArray longSparseIntArray = izVar.H;
                izVar.D = i7;
                if (this.b) {
                    izVar.u0(izVar.F, arrayList, true);
                    izVar.F = arrayList;
                    for (int i11 = 0; i11 < izVar.F.size(); i11++) {
                        izVar.G.remove(izVar.F.get(i11));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!m5.C(keyAt) && !izVar.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i13)).longValue());
                    }
                } else {
                    izVar.u0(izVar.G, arrayList, false);
                    izVar.G = arrayList;
                    for (int i14 = 0; i14 < izVar.G.size(); i14++) {
                        Long l10 = (Long) izVar.G.get(i14);
                        izVar.F.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                izVar.p0();
                izVar.o0(false);
                izVar.C0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        switch (this.a) {
            case 3:
                y6.d0((y6) this.c, this.b);
                break;
            case 4:
            default:
                e40 e40Var = ((j30) this.c).b;
                e40Var.R2.A(0, null);
                e40Var.n1().j(this.b ? 101 : 40, 0L, null);
                break;
            case 5:
                cn cnVar = (cn) this.c;
                sj sjVar = cnVar.Z;
                if (sjVar != null) {
                    if (!this.b) {
                        sjVar.x();
                        break;
                    } else {
                        cnVar.finishFragment();
                        break;
                    }
                }
                break;
        }
    }

    @Override // bg.p
    public void j(long j3) {
        i6 i6Var = ((w1) this.c).a.y3;
        if (i6Var != null) {
            i6Var.t(id.M((int) j3, this.b), true, true);
        }
    }

    @Override // p4.a1
    public Object l(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.a) {
            case 9:
                t1 u10 = h9.i0.u((e2.l0) this.c);
                boolean z9 = this.b;
                return d0Var.q(vVar, u10, z9 ? -1 : d0Var.t.o0(), z9 ? -9223372036854775807L : d0Var.t.l());
            default:
                List list = (List) this.c;
                boolean z10 = this.b;
                return d0Var.q(vVar, list, z10 ? -1 : d0Var.t.o0(), z10 ? -9223372036854775807L : d0Var.t.l());
        }
    }

    @Override // xh.j
    public void m(xh.f fVar, float f10, float f11) {
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
