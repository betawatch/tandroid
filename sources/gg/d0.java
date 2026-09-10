package gg;

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
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.q80;
import org.telegram.ui.ai1;
import org.telegram.ui.eo;
import org.telegram.ui.h10;
import org.telegram.ui.j60;
import org.telegram.ui.m50;
import org.telegram.ui.ok;
import org.telegram.ui.y6;
import zh.i5;
import zh.r5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements ai1, m4.g1, org.telegram.ui.ActionBar.c2, xf.m, MessagesController.ErrorDelegate, uh.l, r5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.ui.ai1
    public void a(int i10, ArrayList arrayList) {
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.c;
                ArrayList arrayList2 = e0Var.k;
                ArrayList arrayList3 = e0Var.j;
                int i11 = 0;
                if (this.b) {
                    e0Var.f = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i11 < arrayList3.size()) {
                        arrayList2.remove(arrayList3.get(i11));
                        i11++;
                    }
                } else {
                    e0Var.g = i10;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    while (i11 < arrayList2.size()) {
                        arrayList3.remove(arrayList2.get(i11));
                        i11++;
                    }
                }
                e0Var.e.run();
                break;
            default:
                h10 h10Var = (h10) this.c;
                LongSparseIntArray longSparseIntArray = h10Var.H;
                h10Var.y = i10;
                if (this.b) {
                    h10Var.o0(h10Var.F, arrayList, true);
                    h10Var.F = arrayList;
                    for (int i12 = 0; i12 < h10Var.F.size(); i12++) {
                        h10Var.G.remove(h10Var.F.get(i12));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !h10Var.F.contains(valueOf)) {
                            arrayList4.add(valueOf);
                        }
                    }
                    int size2 = arrayList4.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        longSparseIntArray.delete(((Long) arrayList4.get(i14)).longValue());
                    }
                } else {
                    h10Var.o0(h10Var.G, arrayList, false);
                    h10Var.G = arrayList;
                    for (int i15 = 0; i15 < h10Var.G.size(); i15++) {
                        Long l4 = (Long) h10Var.G.get(i15);
                        h10Var.F.remove(l4);
                        longSparseIntArray.delete(l4.longValue());
                    }
                }
                h10Var.j0();
                h10Var.i0(false);
                h10Var.w0();
                break;
        }
    }

    @Override // zh.r5
    public void b(boolean z10) {
        zh.l lVar = (zh.l) this.c;
        if (!this.b && z10) {
            boolean z11 = lVar.b == 1;
            i5 i5Var = lVar.s;
            if (z11) {
                if (!i5Var.z) {
                    return;
                }
            } else if (!i5Var.p) {
                return;
            }
            i5Var.Q(z11);
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 3:
                y6.V((y6) this.c, this.b);
                break;
            case 4:
            default:
                j60 j60Var = ((m50) this.c).b;
                j60Var.a1.toggleRecord(null, 0);
                j60Var.k1().j(this.b ? 101 : 40, 0L, null);
                break;
            case 5:
                eo eoVar = (eo) this.c;
                ok okVar = eoVar.Y;
                if (okVar != null) {
                    if (!this.b) {
                        okVar.A();
                        break;
                    } else {
                        eoVar.finishFragment();
                        break;
                    }
                }
                break;
            case 6:
                Activity activity = (Activity) this.c;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.b && sf.c.a(activity) == -2) {
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

    @Override // xf.m
    public void h(long j3) {
        n6 n6Var = ((org.telegram.ui.Cells.t1) this.c).w4;
        if (n6Var != null) {
            n6Var.q(LocaleController.formatPollEndTime((int) j3, this.b), true, true);
        }
    }

    @Override // m4.g1
    public Object i(m4.b0 b0Var, m4.r rVar, int i10) {
        switch (this.a) {
            case 1:
                e9.a1 z10 = e9.i0.z((b2.k0) this.c);
                boolean z11 = this.b;
                return b0Var.q(rVar, z10, z11 ? -1 : b0Var.t.l0(), z11 ? -9223372036854775807L : b0Var.t.J0());
            default:
                List list = (List) this.c;
                boolean z12 = this.b;
                return b0Var.q(rVar, list, z12 ? -1 : b0Var.t.l0(), z12 ? -9223372036854775807L : b0Var.t.J0());
        }
    }

    @Override // uh.l
    public void l(uh.h hVar, float f7, float f10) {
        uh.o oVar = (uh.o) this.c;
        if (oVar.d || !this.b) {
            return;
        }
        hVar.q = new uh.n(oVar, 0);
        float sqrt = (float) Math.sqrt(Math.pow(oVar.getHeight(), 2.0d) + Math.pow(oVar.getWidth(), 2.0d));
        ArrayList arrayList = oVar.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((uh.h) obj).j(f7, f10, sqrt, false);
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        q80 q80Var = (q80) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            q80Var.setOnDismissListener(new k80(0, q80Var, this.b));
        }
        q80Var.dismiss();
        return false;
    }
}
