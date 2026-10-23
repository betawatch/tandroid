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
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.x80;
import org.telegram.ui.gk;
import org.telegram.ui.og1;
import org.telegram.ui.q00;
import org.telegram.ui.sn;
import org.telegram.ui.u50;
import org.telegram.ui.w40;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements p7, og1, m4.g1, e2.j, org.telegram.ui.ActionBar.z1, zf.m, MessagesController.ErrorDelegate, wh.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // m4.g1
    public Object a(m4.f0 f0Var, m4.v vVar, int i10) {
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

    @Override // e2.j
    public void accept(Object obj) {
        ((m4.m1) obj).N0((b2.f) this.c, this.b);
    }

    @Override // ci.p7
    public void b(boolean z10) {
        r rVar = (r) this.c;
        if (!this.b && z10) {
            boolean z11 = rVar.b == 1;
            h7 h7Var = rVar.s;
            if (z11) {
                if (!h7Var.z) {
                    return;
                }
            } else if (!h7Var.p) {
                return;
            }
            h7Var.Q(z11);
        }
    }

    @Override // org.telegram.ui.og1
    public void d(int i10, ArrayList arrayList) {
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
                q00 q00Var = (q00) this.c;
                LongSparseIntArray longSparseIntArray = q00Var.H;
                q00Var.y = i10;
                if (this.b) {
                    q00Var.o0(q00Var.F, arrayList, true);
                    q00Var.F = arrayList;
                    for (int i12 = 0; i12 < q00Var.F.size(); i12++) {
                        q00Var.G.remove(q00Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !q00Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    q00Var.o0(q00Var.G, arrayList, false);
                    q00Var.G = arrayList;
                    for (int i15 = 0; i15 < q00Var.G.size(); i15++) {
                        Long l4 = (Long) q00Var.G.get(i15);
                        q00Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                q00Var.j0();
                q00Var.i0(false);
                q00Var.w0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 5:
                org.telegram.ui.c7.V((org.telegram.ui.c7) this.c, this.b);
                break;
            case 6:
            default:
                u50 u50Var = ((w40) this.c).b;
                u50Var.a1.toggleRecord(null, 0);
                u50Var.k1().j(this.b ? 101 : 40, 0L, null);
                break;
            case 7:
                sn snVar = (sn) this.c;
                gk gkVar = snVar.Y;
                if (gkVar != null) {
                    if (!this.b) {
                        gkVar.y();
                        break;
                    } else {
                        snVar.finishFragment();
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
        org.telegram.ui.Components.p6 p6Var = ((org.telegram.ui.Cells.t1) this.c).w4;
        if (p6Var != null) {
            p6Var.t(LocaleController.formatPollEndTime((int) j10, this.b), true, true);
        }
    }

    @Override // wh.k
    public void l(wh.g gVar, float f7, float f10) {
        wh.n nVar = (wh.n) this.c;
        if (nVar.d || nVar.e || nVar.f || !this.b) {
            return;
        }
        nVar.c(f7, f10);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        b90 b90Var = (b90) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            b90Var.setOnDismissListener(new x80(0, b90Var, this.b));
        }
        b90Var.dismiss();
        return false;
    }
}
