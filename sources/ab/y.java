package ab;

import a8.c1;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnSuccessListener;
import di.g7;
import di.y6;
import h9.t1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.bp;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.w1;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.x60;
import org.telegram.ui.an;
import org.telegram.ui.c40;
import org.telegram.ui.gz;
import org.telegram.ui.h30;
import org.telegram.ui.hb1;
import org.telegram.ui.qj;
import p4.a1;
import p4.g1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements OnSuccessListener, g7, hb1, r1, bg.p, bp, a1, h2.j, xh.j {
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
        b70 b70Var = (b70) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            b70Var.setOnDismissListener(new x60(0, b70Var, this.b));
        }
        b70Var.dismiss();
        return false;
    }

    @Override // h2.j
    public void accept(Object obj) {
        ((g1) obj).D((e2.e) this.c, this.b);
    }

    @Override // di.g7
    public void b(boolean z9) {
        di.q qVar = (di.q) this.c;
        if (!this.b && z9) {
            boolean z10 = qVar.b == 1;
            y6 y6Var = qVar.s;
            if (z10) {
                if (!y6Var.z) {
                    return;
                }
            } else if (!y6Var.p) {
                return;
            }
            y6Var.T(z10);
        }
    }

    @Override // org.telegram.ui.hb1
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
                gz gzVar = (gz) this.c;
                LongSparseIntArray longSparseIntArray = gzVar.H;
                gzVar.D = i7;
                if (this.b) {
                    gzVar.u0(gzVar.F, arrayList, true);
                    gzVar.F = arrayList;
                    for (int i11 = 0; i11 < gzVar.F.size(); i11++) {
                        gzVar.G.remove(gzVar.F.get(i11));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!m5.C(keyAt) && !gzVar.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i13)).longValue());
                    }
                } else {
                    gzVar.u0(gzVar.G, arrayList, false);
                    gzVar.G = arrayList;
                    for (int i14 = 0; i14 < gzVar.G.size(); i14++) {
                        Long l10 = (Long) gzVar.G.get(i14);
                        gzVar.F.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                gzVar.p0();
                gzVar.o0(false);
                gzVar.C0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        switch (this.a) {
            case 3:
                org.telegram.ui.y6.d0((org.telegram.ui.y6) this.c, this.b);
                break;
            case 4:
            default:
                c40 c40Var = ((h30) this.c).b;
                c40Var.R2.A(0, null);
                c40Var.n1().j(this.b ? 101 : 40, 0L, null);
                break;
            case 5:
                an anVar = (an) this.c;
                qj qjVar = anVar.Z;
                if (qjVar != null) {
                    if (!this.b) {
                        qjVar.x();
                        break;
                    } else {
                        anVar.finishFragment();
                        break;
                    }
                }
                break;
        }
    }

    @Override // p4.a1
    public Object i(p4.d0 d0Var, p4.v vVar, int i7) {
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

    @Override // bg.p
    public void j(long j3) {
        i6 i6Var = ((w1) this.c).a.y3;
        if (i6Var != null) {
            i6Var.t(hd.M((int) j3, this.b), true, true);
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
