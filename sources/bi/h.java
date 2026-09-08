package bi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.g80;
import org.telegram.ui.co;
import org.telegram.ui.f10;
import org.telegram.ui.j60;
import org.telegram.ui.m50;
import org.telegram.ui.mk;
import org.telegram.ui.vh1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements c9, vh1, m4.e1, org.telegram.ui.ActionBar.a2, yf.m, MessagesController.ErrorDelegate, wh.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.ui.vh1
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
                f10 f10Var = (f10) this.c;
                LongSparseIntArray longSparseIntArray = f10Var.H;
                f10Var.y = i10;
                if (this.b) {
                    f10Var.o0(f10Var.F, arrayList, true);
                    f10Var.F = arrayList;
                    for (int i12 = 0; i12 < f10Var.F.size(); i12++) {
                        f10Var.G.remove(f10Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !f10Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    f10Var.o0(f10Var.G, arrayList, false);
                    f10Var.G = arrayList;
                    for (int i15 = 0; i15 < f10Var.G.size(); i15++) {
                        Long l4 = (Long) f10Var.G.get(i15);
                        f10Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                f10Var.j0();
                f10Var.i0(false);
                f10Var.w0();
                break;
        }
    }

    @Override // yf.m
    public void c(long j3) {
        org.telegram.ui.Components.p6 p6Var = ((org.telegram.ui.Cells.t1) this.c).w4;
        if (p6Var != null) {
            p6Var.q(LocaleController.formatPollEndTime((int) j3, this.b), true, true);
        }
    }

    @Override // bi.c9
    public void e(boolean z10) {
        v vVar = (v) this.c;
        if (!this.b && z10) {
            boolean z11 = vVar.b == 1;
            u8 u8Var = vVar.s;
            if (z11) {
                if (!u8Var.z) {
                    return;
                }
            } else if (!u8Var.p) {
                return;
            }
            u8Var.Q(z11);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 4:
                org.telegram.ui.z6.V((org.telegram.ui.z6) this.c, this.b);
                break;
            case 5:
            default:
                j60 j60Var = ((m50) this.c).b;
                j60Var.a1.toggleRecord(null, 0);
                j60Var.k1().j(this.b ? 101 : 40, 0L, null);
                break;
            case 6:
                co coVar = (co) this.c;
                mk mkVar = coVar.Y;
                if (mkVar != null) {
                    if (!this.b) {
                        mkVar.B();
                        break;
                    } else {
                        coVar.finishFragment();
                        break;
                    }
                }
                break;
            case 7:
                Activity activity = (Activity) this.c;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.b && tf.c.a(activity) == -2) {
                        try {
                            activity.startActivity(new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + activity.getPackageName())));
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
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

    @Override // m4.e1
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        switch (this.a) {
            case 2:
                e9.a1 z10 = e9.i0.z((b2.k0) this.c);
                boolean z11 = this.b;
                return a0Var.q(rVar, z10, z11 ? -1 : a0Var.t.l0(), z11 ? -9223372036854775807L : a0Var.t.J0());
            default:
                List list = (List) this.c;
                boolean z12 = this.b;
                return a0Var.q(rVar, list, z12 ? -1 : a0Var.t.l0(), z12 ? -9223372036854775807L : a0Var.t.J0());
        }
    }

    @Override // wh.l
    public void o(wh.h hVar, float f7, float f10) {
        wh.p pVar = (wh.p) this.c;
        if (pVar.d || !this.b) {
            return;
        }
        hVar.q = new wh.o(pVar, 0);
        float sqrt = (float) Math.sqrt(Math.pow(pVar.getHeight(), 2.0d) + Math.pow(pVar.getWidth(), 2.0d));
        ArrayList arrayList = pVar.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((wh.h) obj).j(f7, f10, sqrt, false);
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        g80 g80Var = (g80) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            g80Var.setOnDismissListener(new b80(0, g80Var, this.b));
        }
        g80Var.dismiss();
        return false;
    }
}
