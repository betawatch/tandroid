package ei;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.so;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.x60;
import org.telegram.ui.ab1;
import org.telegram.ui.c30;
import org.telegram.ui.ez;
import org.telegram.ui.mj;
import org.telegram.ui.wm;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements h7, ab1, o4.f1, g2.k, org.telegram.ui.ActionBar.p1, cg.o, so, yh.j, OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i3, Object obj, boolean z10) {
        this.a = i3;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.messenger.so
    public boolean a(TLRPC.TL_error tL_error) {
        x60 x60Var = (x60) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            x60Var.setOnDismissListener(new s60(0, x60Var, this.b));
        }
        x60Var.dismiss();
        return false;
    }

    @Override // g2.k
    public void accept(Object obj) {
        ((o4.l1) obj).A0((d2.f) this.c, this.b);
    }

    @Override // ei.h7
    public void c(boolean z10) {
        r rVar = (r) this.c;
        if (!this.b && z10) {
            boolean z11 = rVar.b == 1;
            z6 z6Var = rVar.s;
            if (z11) {
                if (!z6Var.z) {
                    return;
                }
            } else if (!z6Var.p) {
                return;
            }
            z6Var.T(z11);
        }
    }

    @Override // org.telegram.ui.ab1
    public void e(int i3, ArrayList arrayList) {
        switch (this.a) {
            case 1:
                lg.b0 b0Var = (lg.b0) this.c;
                ArrayList arrayList2 = b0Var.k;
                ArrayList arrayList3 = b0Var.j;
                int i10 = 0;
                if (this.b) {
                    b0Var.f = i3;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i10 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i10));
                        i10++;
                    }
                } else {
                    b0Var.g = i3;
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
                ez ezVar = (ez) this.c;
                LongSparseIntArray longSparseIntArray = ezVar.I;
                ezVar.E = i3;
                if (this.b) {
                    ezVar.u0(ezVar.G, arrayList, true);
                    ezVar.G = arrayList;
                    for (int i11 = 0; i11 < ezVar.G.size(); i11++) {
                        ezVar.H.remove(ezVar.G.get(i11));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!org.telegram.messenger.m5.C(keyAt) && !ezVar.G.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i13)).longValue());
                    }
                } else {
                    ezVar.u0(ezVar.H, arrayList, false);
                    ezVar.H = arrayList;
                    for (int i14 = 0; i14 < ezVar.H.size(); i14++) {
                        Long l10 = (Long) ezVar.H.get(i14);
                        ezVar.G.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                ezVar.p0();
                ezVar.o0(false);
                ezVar.C0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 5:
                org.telegram.ui.z6.d0((org.telegram.ui.z6) this.c, this.b);
                break;
            case 6:
            default:
                x30 x30Var = ((c30) this.c).b;
                x30Var.S2.A(0, null);
                x30Var.m1().j(this.b ? 101 : 40, 0L, null);
                break;
            case 7:
                wm wmVar = (wm) this.c;
                mj mjVar = wmVar.a0;
                if (mjVar != null) {
                    if (!this.b) {
                        mjVar.x();
                        break;
                    } else {
                        wmVar.finishFragment();
                        break;
                    }
                }
                break;
            case 8:
                Activity activity = (Activity) this.c;
                if (activity != null) {
                    if (this.b && xf.b.a(activity) == -2) {
                        try {
                            activity.startActivity(new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + activity.getPackageName())));
                            break;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                    try {
                        activity.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName())));
                        break;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                }
                break;
        }
    }

    @Override // cg.o
    public void h(long j10) {
        org.telegram.ui.Components.g6 g6Var = ((org.telegram.ui.Cells.w1) this.c).a.y3;
        if (g6Var != null) {
            g6Var.t(bd.M((int) j10, this.b), true, true);
        }
    }

    @Override // o4.f1
    public Object i(o4.e0 e0Var, o4.v vVar, int i3) {
        switch (this.a) {
            case 2:
                g9.s1 u10 = g9.i0.u((d2.n0) this.c);
                boolean z10 = this.b;
                return e0Var.q(vVar, u10, z10 ? -1 : e0Var.t.l0(), z10 ? -9223372036854775807L : e0Var.t.N0());
            default:
                List list = (List) this.c;
                boolean z11 = this.b;
                return e0Var.q(vVar, list, z11 ? -1 : e0Var.t.l0(), z11 ? -9223372036854775807L : e0Var.t.N0());
        }
    }

    @Override // yh.j
    public void l(yh.f fVar, float f10, float f11) {
        yh.l lVar = (yh.l) this.c;
        if (lVar.d || lVar.e || lVar.f || !this.b) {
            return;
        }
        lVar.c(f10, f11);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        SharedPreferences.Editor edit = x7.b7.a((Context) this.c).edit();
        edit.putBoolean("proxy_retention", this.b);
        edit.apply();
    }
}
