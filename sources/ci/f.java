package ci;

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
import org.telegram.ui.Components.w80;
import org.telegram.ui.fk;
import org.telegram.ui.ig1;
import org.telegram.ui.n00;
import org.telegram.ui.q50;
import org.telegram.ui.qn;
import org.telegram.ui.t40;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements q7, ig1, m4.g1, e2.j, org.telegram.ui.ActionBar.a2, zf.m, MessagesController.ErrorDelegate, wh.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.ui.ig1
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
                n00 n00Var = (n00) this.c;
                LongSparseIntArray longSparseIntArray = n00Var.H;
                n00Var.y = i10;
                if (this.b) {
                    n00Var.o0(n00Var.F, arrayList, true);
                    n00Var.F = arrayList;
                    for (int i12 = 0; i12 < n00Var.F.size(); i12++) {
                        n00Var.G.remove(n00Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !n00Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    n00Var.o0(n00Var.G, arrayList, false);
                    n00Var.G = arrayList;
                    for (int i15 = 0; i15 < n00Var.G.size(); i15++) {
                        Long l4 = (Long) n00Var.G.get(i15);
                        n00Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                n00Var.j0();
                n00Var.i0(false);
                n00Var.w0();
                break;
        }
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((m4.m1) obj).N0((b2.f) this.c, this.b);
    }

    @Override // ci.q7
    public void b(boolean z10) {
        r rVar = (r) this.c;
        if (!this.b && z10) {
            boolean z11 = rVar.b == 1;
            i7 i7Var = rVar.s;
            if (z11) {
                if (!i7Var.z) {
                    return;
                }
            } else if (!i7Var.p) {
                return;
            }
            i7Var.Q(z11);
        }
    }

    @Override // m4.g1
    public Object e(m4.f0 f0Var, m4.v vVar, int i10) {
        switch (this.a) {
            case 2:
                e9.x1 y3 = e9.n0.y((b2.o0) this.c);
                boolean z10 = this.b;
                return f0Var.q(vVar, y3, z10 ? -1 : f0Var.t.n0(), z10 ? -9223372036854775807L : f0Var.t.M0());
            default:
                List list = (List) this.c;
                boolean z11 = this.b;
                return f0Var.q(vVar, list, z11 ? -1 : f0Var.t.n0(), z11 ? -9223372036854775807L : f0Var.t.M0());
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 5:
                org.telegram.ui.c7.V((org.telegram.ui.c7) this.c, this.b);
                break;
            case 6:
            default:
                q50 q50Var = ((t40) this.c).b;
                q50Var.a1.toggleRecord(null, 0);
                q50Var.l1().j(this.b ? 101 : 40, 0L, null);
                break;
            case 7:
                qn qnVar = (qn) this.c;
                fk fkVar = qnVar.Y;
                if (fkVar != null) {
                    if (!this.b) {
                        fkVar.z();
                        break;
                    } else {
                        qnVar.finishFragment();
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

    @Override // zf.m
    public void i(long j10) {
        org.telegram.ui.Components.p6 p6Var = ((org.telegram.ui.Cells.u1) this.c).w4;
        if (p6Var != null) {
            p6Var.t(LocaleController.formatPollEndTime((int) j10, this.b), true, true);
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
        a90 a90Var = (a90) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            a90Var.setOnDismissListener(new w80(0, a90Var, this.b));
        }
        a90Var.dismiss();
        return false;
    }
}
