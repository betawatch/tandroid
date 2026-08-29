package gh;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import lh.a7;
import lh.s6;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.y70;
import org.telegram.ui.dk;
import org.telegram.ui.p00;
import org.telegram.ui.pg1;
import org.telegram.ui.r50;
import org.telegram.ui.tn;
import org.telegram.ui.u40;
import org.telegram.ui.x6;
import sf.w;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements o, a7, b2, jf.o, MessagesController.ErrorDelegate, pg1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // org.telegram.ui.pg1
    public void a(int i10, ArrayList arrayList) {
        switch (this.a) {
            case 7:
                p00 p00Var = (p00) this.c;
                LongSparseIntArray longSparseIntArray = p00Var.D;
                p00Var.y = i10;
                if (this.b) {
                    p00Var.o0(p00Var.B, arrayList, true);
                    p00Var.B = arrayList;
                    for (int i11 = 0; i11 < p00Var.B.size(); i11++) {
                        p00Var.C.remove(p00Var.B.get(i11));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = longSparseIntArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Long valueOf = Long.valueOf(keyAt);
                        if (!DialogObject.isEncryptedDialog(keyAt) && !p00Var.B.contains(valueOf)) {
                            arrayList2.add(valueOf);
                        }
                    }
                    int size2 = arrayList2.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        longSparseIntArray.delete(((Long) arrayList2.get(i13)).longValue());
                    }
                } else {
                    p00Var.o0(p00Var.C, arrayList, false);
                    p00Var.C = arrayList;
                    for (int i14 = 0; i14 < p00Var.C.size(); i14++) {
                        Long l10 = (Long) p00Var.C.get(i14);
                        p00Var.B.remove(l10);
                        longSparseIntArray.delete(l10.longValue());
                    }
                }
                p00Var.j0();
                p00Var.i0(false);
                p00Var.w0();
                break;
            default:
                w wVar = (w) this.c;
                ArrayList arrayList3 = wVar.k;
                ArrayList arrayList4 = wVar.j;
                int i15 = 0;
                if (this.b) {
                    wVar.f = i10;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList);
                    while (i15 < arrayList4.size()) {
                        arrayList3.remove(arrayList4.get(i15));
                        i15++;
                    }
                } else {
                    wVar.g = i10;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    while (i15 < arrayList3.size()) {
                        arrayList4.remove(arrayList3.get(i15));
                        i15++;
                    }
                }
                wVar.e.run();
                break;
        }
    }

    @Override // lh.a7
    public void d(boolean z10) {
        lh.p pVar = (lh.p) this.c;
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

    @Override // jf.o
    public void e(long j10) {
        n6 n6Var = ((s1) this.c).s4;
        if (n6Var != null) {
            n6Var.q(LocaleController.formatPollEndTime((int) j10, this.b), true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(c2 c2Var, int i10) {
        switch (this.a) {
            case 2:
                x6.V((x6) this.c, this.b);
                break;
            case 3:
            default:
                r50 r50Var = ((u40) this.c).b;
                r50Var.W0.toggleRecord(null, 0);
                r50Var.k1().j(this.b ? 101 : 40, 0L, null);
                break;
            case 4:
                tn tnVar = (tn) this.c;
                dk dkVar = tnVar.U;
                if (dkVar != null) {
                    if (!this.b) {
                        dkVar.B();
                        break;
                    } else {
                        tnVar.finishFragment();
                        break;
                    }
                }
                break;
            case 5:
                Activity activity = (Activity) this.c;
                if (activity != null && Build.VERSION.SDK_INT >= 23) {
                    if (this.b && df.d.a(activity) == -2) {
                        try {
                            activity.startActivity(new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + activity.getPackageName())));
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    try {
                        activity.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName())));
                        break;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        return;
                    }
                }
                break;
        }
    }

    @Override // gh.o
    public void m(k kVar, float f9, float f10) {
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
            ((k) obj).j(f9, f10, sqrt, false);
        }
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        c80 c80Var = (c80) this.c;
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            c80Var.setOnDismissListener(new y70(0, c80Var, this.b));
        }
        c80Var.dismiss();
        return false;
    }
}
