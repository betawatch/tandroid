package ih;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import nh.b7;
import nh.t6;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.j6;
import org.telegram.ui.b10;
import org.telegram.ui.bh1;
import org.telegram.ui.c60;
import org.telegram.ui.g50;
import org.telegram.ui.jk;
import org.telegram.ui.xn;
import uf.v;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements o, b7, c2, lf.o, MessagesController.ErrorDelegate, bh1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    @Override // org.telegram.ui.bh1
    public void a(int i10, ArrayList arrayList) {
        switch (this.a) {
            case 7:
                b10 b10Var = (b10) this.c;
                LongSparseIntArray longSparseIntArray = b10Var.E;
                b10Var.y = i10;
                if (this.b) {
                    b10Var.o0(b10Var.C, arrayList, true);
                    b10Var.C = arrayList;
                    for (int i11 = 0; i11 < b10Var.C.size(); i11++) {
                        b10Var.D.remove(b10Var.C.get(i11));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !b10Var.C.contains(valueOf)) {
                            arrayList2.add(valueOf);
                        }
                    }
                    int size2 = arrayList2.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList2.get(i13)).longValue());
                    }
                } else {
                    b10Var.o0(b10Var.D, arrayList, false);
                    b10Var.D = arrayList;
                    for (int i14 = 0; i14 < b10Var.D.size(); i14++) {
                        Long l10 = (Long) b10Var.D.get(i14);
                        b10Var.C.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                b10Var.j0();
                b10Var.i0(false);
                b10Var.w0();
                break;
            default:
                v vVar = (v) this.c;
                ArrayList arrayList3 = vVar.k;
                ArrayList arrayList4 = vVar.j;
                int i15 = 0;
                if (this.b) {
                    vVar.f = i10;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    while (i15 < arrayList4.size()) {
                        arrayList3.remove(arrayList4.get(i15));
                        i15++;
                    }
                } else {
                    vVar.g = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i15 < arrayList3.size()) {
                        arrayList4.remove(arrayList3.get(i15));
                        i15++;
                    }
                }
                vVar.e.run();
                break;
        }
    }

    @Override // nh.b7
    public void b(boolean z4) {
        nh.q qVar = (nh.q) this.c;
        if (!this.b && z4) {
            boolean z10 = qVar.b == 1;
            t6 t6Var = qVar.s;
            if (z10) {
                if (!t6Var.z) {
                    return;
                }
            } else if (!t6Var.p) {
                return;
            }
            t6Var.Q(z10);
        }
    }

    @Override // lf.o
    public void d(long j10) {
        j6 j6Var = ((t1) this.c).t4;
        if (j6Var != null) {
            j6Var.q(LocaleController.formatPollEndTime((int) j10, this.b), true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(d2 d2Var, int i10) {
        switch (this.a) {
            case 2:
                org.telegram.ui.b7.V((org.telegram.ui.b7) this.c, this.b);
                break;
            case 3:
            default:
                c60 c60Var = ((g50) this.c).b;
                c60Var.X0.toggleRecord(null, 0);
                c60Var.k1().j(this.b ? 101 : 40, 0L, null);
                break;
            case 4:
                xn xnVar = (xn) this.c;
                jk jkVar = xnVar.V;
                if (jkVar != null) {
                    if (!this.b) {
                        jkVar.B();
                        break;
                    } else {
                        xnVar.finishFragment();
                        break;
                    }
                }
                break;
            case 5:
                Activity activity = (Activity) this.c;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.b && ff.d.a(activity) == -2) {
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
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
                break;
        }
    }

    @Override // ih.o
    public void o(k kVar, float f10, float f11) {
        s sVar = (s) this.c;
        if (sVar.d || !this.b) {
            return;
        }
        kVar.q = new r(sVar, 0);
        float sqrt = (float) Math.sqrt(Math.pow(sVar.getHeight(), 2.0d) + Math.pow(sVar.getWidth(), 2.0d));
        ArrayList arrayList = sVar.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((k) obj).j(f10, f11, sqrt, false);
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        h80 h80Var = (h80) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            h80Var.setOnDismissListener(new d80(0, h80Var, this.b));
        }
        h80Var.dismiss();
        return false;
    }
}
