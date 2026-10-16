package bi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.f90;
import org.telegram.ui.ci1;
import org.telegram.ui.fo;
import org.telegram.ui.k10;
import org.telegram.ui.n60;
import org.telegram.ui.q50;
import org.telegram.ui.sk;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements f9, ci1, m4.g1, e2.j, org.telegram.ui.ActionBar.z1, zf.n, MessagesController.ErrorDelegate, wh.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.ui.ci1
    public void a(int i10, ArrayList arrayList) {
        switch (this.a) {
            case 1:
                ig.a0 a0Var = (ig.a0) this.c;
                ArrayList arrayList2 = a0Var.k;
                ArrayList arrayList3 = a0Var.j;
                int i11 = 0;
                if (this.b) {
                    a0Var.f = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i11 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i11));
                        i11++;
                    }
                } else {
                    a0Var.g = i10;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i11 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i11));
                        i11++;
                    }
                }
                a0Var.e.run();
                break;
            default:
                k10 k10Var = (k10) this.c;
                LongSparseIntArray longSparseIntArray = k10Var.H;
                k10Var.y = i10;
                if (this.b) {
                    k10Var.o0(k10Var.F, arrayList, true);
                    k10Var.F = arrayList;
                    for (int i12 = 0; i12 < k10Var.F.size(); i12++) {
                        k10Var.G.remove(k10Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !k10Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    k10Var.o0(k10Var.G, arrayList, false);
                    k10Var.G = arrayList;
                    for (int i15 = 0; i15 < k10Var.G.size(); i15++) {
                        Long l4 = (Long) k10Var.G.get(i15);
                        k10Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                k10Var.j0();
                k10Var.i0(false);
                k10Var.w0();
                break;
        }
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((m4.m1) obj).N0((b2.f) this.c, this.b);
    }

    @Override // bi.f9
    public void b(boolean z10) {
        v vVar = (v) this.c;
        if (!this.b && z10) {
            boolean z11 = vVar.b == 1;
            x8 x8Var = vVar.s;
            if (z11) {
                if (!x8Var.z) {
                    return;
                }
            } else if (!x8Var.p) {
                return;
            }
            x8Var.Q(z11);
        }
    }

    @Override // m4.g1
    public Object c(m4.e0 e0Var, m4.v vVar, int i10) {
        switch (this.a) {
            case 2:
                e9.x1 y3 = e9.n0.y((b2.p0) this.c);
                boolean z10 = this.b;
                return e0Var.q(vVar, y3, z10 ? -1 : e0Var.t.n0(), z10 ? -9223372036854775807L : e0Var.t.M0());
            default:
                List list = (List) this.c;
                boolean z11 = this.b;
                return e0Var.q(vVar, list, z11 ? -1 : e0Var.t.n0(), z11 ? -9223372036854775807L : e0Var.t.M0());
        }
    }

    @Override // zf.n
    public void e(long j10) {
        org.telegram.ui.Components.r6 r6Var = ((org.telegram.ui.Cells.u1) this.c).w4;
        if (r6Var != null) {
            r6Var.t(LocaleController.formatPollEndTime((int) j10, this.b), true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 5:
                org.telegram.ui.d7.V((org.telegram.ui.d7) this.c, this.b);
                break;
            case 6:
            default:
                n60 n60Var = ((q50) this.c).b;
                n60Var.a1.toggleRecord(null, 0);
                n60Var.l1().j(this.b ? 101 : 40, 0L, null);
                break;
            case 7:
                fo foVar = (fo) this.c;
                sk skVar = foVar.Y;
                if (skVar != null) {
                    if (!this.b) {
                        skVar.z();
                        break;
                    } else {
                        foVar.finishFragment();
                        break;
                    }
                }
                break;
            case 8:
                Activity activity = (Activity) this.c;
                if (activity != null) {
                    if (this.b && uf.b.a(activity) == -2) {
                        try {
                            activity.startActivity(new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + activity.getPackageName())));
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    try {
                        activity.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName())));
                        break;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                break;
        }
    }

    @Override // wh.k
    public void o(wh.g gVar, float f7, float f10) {
        wh.n nVar = (wh.n) this.c;
        if (nVar.d || nVar.e || nVar.f || !this.b) {
            return;
        }
        nVar.c(f7, f10);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        f90 f90Var = (f90) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            f90Var.setOnDismissListener(new a90(0, f90Var, this.b));
        }
        f90Var.dismiss();
        return false;
    }
}
