package ag;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.hp;
import org.telegram.messenger.o5;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.u70;
import org.telegram.ui.a50;
import org.telegram.ui.bd1;
import org.telegram.ui.e40;
import org.telegram.ui.h00;
import org.telegram.ui.mk;
import org.telegram.ui.un;
import org.telegram.ui.y6;
import th.e5;
import th.m5;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements bd1, m4.h1, e2.j, nh.m, org.telegram.ui.ActionBar.u1, rf.l, hp, m5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.hp
    public boolean a(TLRPC.TL_error tL_error) {
        u70 u70Var = (u70) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            u70Var.setOnDismissListener(new o70(0, u70Var, this.b));
        }
        u70Var.dismiss();
        return false;
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((m4.n1) obj).N0((b2.f) this.c, this.b);
    }

    @Override // th.m5
    public void c(boolean z10) {
        th.m mVar = (th.m) this.c;
        if (!this.b && z10) {
            boolean z11 = mVar.b == 1;
            e5 e5Var = mVar.s;
            if (z11) {
                if (!e5Var.z) {
                    return;
                }
            } else if (!e5Var.p) {
                return;
            }
            e5Var.T(z11);
        }
    }

    @Override // org.telegram.ui.bd1
    public void e(int i10, ArrayList arrayList) {
        switch (this.a) {
            case 0:
                x0 x0Var = (x0) this.c;
                ArrayList arrayList2 = x0Var.k;
                ArrayList arrayList3 = x0Var.j;
                int i11 = 0;
                if (this.b) {
                    x0Var.f = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i11 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i11));
                        i11++;
                    }
                } else {
                    x0Var.g = i10;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i11 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i11));
                        i11++;
                    }
                }
                x0Var.e.run();
                break;
            default:
                h00 h00Var = (h00) this.c;
                LongSparseIntArray longSparseIntArray = h00Var.H;
                h00Var.D = i10;
                if (this.b) {
                    h00Var.u0(h00Var.F, arrayList, true);
                    h00Var.F = arrayList;
                    for (int i12 = 0; i12 < h00Var.F.size(); i12++) {
                        h00Var.G.remove(h00Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!o5.C(keyAt) && !h00Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    h00Var.u0(h00Var.G, arrayList, false);
                    h00Var.G = arrayList;
                    for (int i15 = 0; i15 < h00Var.G.size(); i15++) {
                        Long l4 = (Long) h00Var.G.get(i15);
                        h00Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                h00Var.p0();
                h00Var.o0(false);
                h00Var.C0();
                break;
        }
    }

    @Override // m4.h1
    public Object f(m4.f0 f0Var, m4.w wVar, int i10) {
        switch (this.a) {
            case 1:
                e9.x1 y3 = e9.n0.y((b2.p0) this.c);
                boolean z10 = this.b;
                return f0Var.q(wVar, y3, z10 ? -1 : f0Var.t.m0(), z10 ? -9223372036854775807L : f0Var.t.M0());
            default:
                List list = (List) this.c;
                boolean z11 = this.b;
                return f0Var.q(wVar, list, z11 ? -1 : f0Var.t.m0(), z11 ? -9223372036854775807L : f0Var.t.M0());
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 5:
                y6.d0((y6) this.c, this.b);
                break;
            case 6:
            default:
                a50 a50Var = ((e40) this.c).b;
                a50Var.R2.A(0, null);
                a50Var.m1().j(this.b ? 101 : 40, 0L, null);
                break;
            case 7:
                un unVar = (un) this.c;
                mk mkVar = unVar.Z;
                if (mkVar != null) {
                    if (!this.b) {
                        mkVar.x();
                        break;
                    } else {
                        unVar.finishFragment();
                        break;
                    }
                }
                break;
            case 8:
                Activity activity = (Activity) this.c;
                if (activity != null) {
                    if (this.b && mf.b.a(activity) == -2) {
                        try {
                            activity.startActivity(new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + activity.getPackageName())));
                            break;
                        } catch (Exception e) {
                            f8.g(e, true);
                        }
                    }
                    try {
                        activity.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName())));
                        break;
                    } catch (Exception e7) {
                        f8.g(e7, true);
                        return;
                    }
                }
                break;
        }
    }

    @Override // rf.l
    public void l(long j10) {
        e6 e6Var = ((org.telegram.ui.Cells.w1) this.c).a.x3;
        if (e6Var != null) {
            e6Var.t(dd.M((int) j10, this.b), true, true);
        }
    }

    @Override // nh.m
    public void m(nh.i iVar, float f7, float f10) {
        nh.p pVar = (nh.p) this.c;
        if (pVar.d || pVar.e || pVar.f || !this.b) {
            return;
        }
        pVar.c(f7, f10);
    }
}
