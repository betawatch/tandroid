package eh;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import jh.a7;
import jh.s6;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.t70;
import org.telegram.ui.ck;
import org.telegram.ui.mg1;
import org.telegram.ui.q00;
import org.telegram.ui.rn;
import org.telegram.ui.s50;
import org.telegram.ui.v40;
import org.telegram.ui.z6;
import qf.x;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements o, a7, a2, gf.p, MessagesController.ErrorDelegate, mg1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.ui.mg1
    public void a(int i10, ArrayList arrayList) {
        switch (this.a) {
            case 7:
                q00 q00Var = (q00) this.c;
                LongSparseIntArray longSparseIntArray = q00Var.D;
                q00Var.y = i10;
                if (this.b) {
                    q00Var.o0(q00Var.B, arrayList, true);
                    q00Var.B = arrayList;
                    for (int i11 = 0; i11 < q00Var.B.size(); i11++) {
                        q00Var.C.remove(q00Var.B.get(i11));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !q00Var.B.contains(valueOf)) {
                            arrayList2.add(valueOf);
                        }
                    }
                    int size2 = arrayList2.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList2.get(i13)).longValue());
                    }
                } else {
                    q00Var.o0(q00Var.C, arrayList, false);
                    q00Var.C = arrayList;
                    for (int i14 = 0; i14 < q00Var.C.size(); i14++) {
                        Long l10 = (Long) q00Var.C.get(i14);
                        q00Var.B.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                q00Var.j0();
                q00Var.i0(false);
                q00Var.w0();
                break;
            default:
                x xVar = (x) this.c;
                ArrayList arrayList3 = xVar.k;
                ArrayList arrayList4 = xVar.j;
                int i15 = 0;
                if (this.b) {
                    xVar.f = i10;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    while (i15 < arrayList4.size()) {
                        arrayList3.remove(arrayList4.get(i15));
                        i15++;
                    }
                } else {
                    xVar.g = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i15 < arrayList3.size()) {
                        arrayList4.remove(arrayList3.get(i15));
                        i15++;
                    }
                }
                xVar.e.run();
                break;
        }
    }

    @Override // jh.a7
    public void e(boolean z10) {
        jh.p pVar = (jh.p) this.c;
        if (!this.b && z10) {
            boolean z11 = pVar.b == 1;
            s6 s6Var = pVar.s;
            if (z11) {
                if (!s6Var.z) {
                    return;
                }
            } else if (!s6Var.p) {
                return;
            }
            s6Var.Q(z11);
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                z6.V((z6) this.c, this.b);
                break;
            case 3:
            default:
                s50 s50Var = ((v40) this.c).b;
                s50Var.W0.toggleRecord(null, 0);
                s50Var.k1().j(this.b ? 101 : 40, 0L, null);
                break;
            case 4:
                rn rnVar = (rn) this.c;
                ck ckVar = rnVar.U;
                if (ckVar != null) {
                    if (!this.b) {
                        ckVar.C();
                        break;
                    } else {
                        rnVar.finishFragment();
                        break;
                    }
                }
                break;
            case 5:
                Activity activity = (Activity) this.c;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.b && bf.d.a(activity) == -2) {
                        try {
                            activity.startActivity(new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + activity.getPackageName())));
                            break;
                        } catch (Exception e9) {
                            FileLog.e(e9);
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

    @Override // gf.p
    public void g(long j10) {
        i6 i6Var = ((s1) this.c).s4;
        if (i6Var != null) {
            i6Var.q(LocaleController.formatPollEndTime((int) j10, this.b), true, true);
        }
    }

    @Override // eh.o
    public void i(k kVar, float f10, float f11) {
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
        t70 t70Var = (t70) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            t70Var.setOnDismissListener(new p70(0, t70Var, this.b));
        }
        t70Var.dismiss();
        return false;
    }
}
