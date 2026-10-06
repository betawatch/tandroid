package ai;

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
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.u80;
import org.telegram.ui.f10;
import org.telegram.ui.h60;
import org.telegram.ui.jk;
import org.telegram.ui.l50;
import org.telegram.ui.lh1;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements t9, lh1, m4.z0, e2.h, org.telegram.ui.ActionBar.a2, yf.m, MessagesController.ErrorDelegate, vh.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.ui.lh1
    public void a(int i10, ArrayList arrayList) {
        switch (this.a) {
            case 1:
                hg.b0 b0Var = (hg.b0) this.c;
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

    @Override // e2.h
    public void accept(Object obj) {
        ((m4.e1) obj).K0((b2.e) this.c, this.b);
    }

    @Override // vh.k
    public void b(vh.g gVar, float f7, float f10) {
        vh.n nVar = (vh.n) this.c;
        if (nVar.d || !this.b) {
            return;
        }
        gVar.q = new vh.m(nVar, 0);
        float sqrt = (float) Math.sqrt(Math.pow(nVar.getHeight(), 2.0d) + Math.pow(nVar.getWidth(), 2.0d));
        ArrayList arrayList = nVar.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((vh.g) obj).j(f7, f10, sqrt, false);
        }
    }

    @Override // yf.m
    public void e(long j3) {
        org.telegram.ui.Components.o6 o6Var = ((org.telegram.ui.Cells.u1) this.c).w4;
        if (o6Var != null) {
            o6Var.q(LocaleController.formatPollEndTime((int) j3, this.b), true, true);
        }
    }

    @Override // ai.t9
    public void f(boolean z10) {
        b0 b0Var = (b0) this.c;
        if (!this.b && z10) {
            boolean z11 = b0Var.b == 1;
            l9 l9Var = b0Var.s;
            if (z11) {
                if (!l9Var.z) {
                    return;
                }
            } else if (!l9Var.p) {
                return;
            }
            l9Var.Q(z11);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 5:
                org.telegram.ui.a7.S((org.telegram.ui.a7) this.c, this.b);
                break;
            case 6:
            default:
                h60 h60Var = ((l50) this.c).b;
                h60Var.a1.toggleRecord(null, 0);
                h60Var.k1().j(this.b ? 101 : 40, 0L, null);
                break;
            case 7:
                yn ynVar = (yn) this.c;
                jk jkVar = ynVar.W;
                if (jkVar != null) {
                    if (!this.b) {
                        jkVar.A();
                        break;
                    } else {
                        ynVar.finishFragment();
                        break;
                    }
                }
                break;
            case 8:
                Activity activity = (Activity) this.c;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.b && sf.c.a(activity) == -2) {
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

    @Override // m4.z0
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

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        u80 u80Var = (u80) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            u80Var.setOnDismissListener(new p80(0, u80Var, this.b));
        }
        u80Var.dismiss();
        return false;
    }
}
