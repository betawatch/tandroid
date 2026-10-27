package di;

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
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.z80;
import org.telegram.ui.a50;
import org.telegram.ui.jk;
import org.telegram.ui.q00;
import org.telegram.ui.qg1;
import org.telegram.ui.wn;
import org.telegram.ui.x50;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements p7, qg1, m4.h1, e2.j, org.telegram.ui.ActionBar.b2, ag.s, MessagesController.ErrorDelegate, xh.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.ui.qg1
    public void a(int i10, ArrayList arrayList) {
        switch (this.a) {
            case 1:
                jg.b0 b0Var = (jg.b0) this.c;
                ArrayList arrayList2 = b0Var.k;
                ArrayList arrayList3 = b0Var.j;
                int i11 = 0;
                if (this.b) {
                    b0Var.f = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i11 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i11));
                        i11++;
                    }
                } else {
                    b0Var.g = i10;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i11 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i11));
                        i11++;
                    }
                }
                b0Var.e.run();
                break;
            default:
                q00 q00Var = (q00) this.c;
                LongSparseIntArray longSparseIntArray = q00Var.H;
                q00Var.y = i10;
                if (this.b) {
                    q00Var.q0(q00Var.F, arrayList, true);
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
                    q00Var.q0(q00Var.G, arrayList, false);
                    q00Var.G = arrayList;
                    for (int i15 = 0; i15 < q00Var.G.size(); i15++) {
                        Long l4 = (Long) q00Var.G.get(i15);
                        q00Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                q00Var.l0();
                q00Var.k0(false);
                q00Var.y0();
                break;
        }
    }

    @Override // e2.j
    public void accept(Object obj) {
        ((m4.n1) obj).N0((b2.f) this.c, this.b);
    }

    @Override // di.p7
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
            h7Var.T(z11);
        }
    }

    @Override // m4.h1
    public Object c(m4.f0 f0Var, m4.w wVar, int i10) {
        switch (this.a) {
            case 2:
                f9.s1 y3 = f9.i0.y((b2.p0) this.c);
                boolean z10 = this.b;
                return f0Var.q(wVar, y3, z10 ? -1 : f0Var.t.n0(), z10 ? -9223372036854775807L : f0Var.t.M0());
            default:
                List list = (List) this.c;
                boolean z11 = this.b;
                return f0Var.q(wVar, list, z11 ? -1 : f0Var.t.n0(), z11 ? -9223372036854775807L : f0Var.t.M0());
        }
    }

    @Override // ag.s
    public void f(long j10) {
        org.telegram.ui.Components.r6 r6Var = ((org.telegram.ui.Cells.s1) this.c).w4;
        if (r6Var != null) {
            r6Var.t(LocaleController.formatPollEndTime((int) j10, this.b), true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 5:
                org.telegram.ui.c7.Z((org.telegram.ui.c7) this.c, this.b);
                break;
            case 6:
            default:
                x50 x50Var = ((a50) this.c).b;
                x50Var.a1.toggleRecord(null, 0);
                x50Var.k1().j(this.b ? 101 : 40, 0L, null);
                break;
            case 7:
                wn wnVar = (wn) this.c;
                jk jkVar = wnVar.Y;
                if (jkVar != null) {
                    if (!this.b) {
                        jkVar.w();
                        break;
                    } else {
                        wnVar.finishFragment();
                        break;
                    }
                }
                break;
            case 8:
                Activity activity = (Activity) this.c;
                if (activity != null) {
                    if (this.b && vf.b.a(activity) == -2) {
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
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                break;
        }
    }

    @Override // xh.k
    public void o(xh.g gVar, float f7, float f10) {
        xh.n nVar = (xh.n) this.c;
        if (nVar.d || nVar.e || nVar.f || !this.b) {
            return;
        }
        nVar.c(f7, f10);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        d90 d90Var = (d90) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            d90Var.setOnDismissListener(new z80(0, d90Var, this.b));
        }
        d90Var.dismiss();
        return false;
    }
}
