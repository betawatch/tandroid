package hh;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import lh.sb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ q1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        int i10;
        lh.u uVar;
        switch (this.a) {
            case 0:
                ((i5) this.b).o2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                break;
            case 1:
                i5.u0((i5) this.b, (ArrayList) obj, (Utilities.Callback2) obj2, (Runnable) obj3);
                break;
            default:
                sb sbVar = (sb) this.b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (sbVar.b0 == 0 && arrayList != null && !arrayList.isEmpty() && sbVar.l2 == null && !sbVar.S && sbVar.J()) {
                    sbVar.D1 = null;
                    sbVar.E1 = null;
                    sbVar.F1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + sbVar.w0.getFilledCount() > sbVar.w0.getTotalCount()) {
                            int size = arrayList.size() + sbVar.w0.getFilledCount();
                            ArrayList a2 = lh.u.a();
                            int size2 = a2.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size2) {
                                    Object obj4 = a2.get(i11);
                                    i11++;
                                    uVar = (lh.u) obj4;
                                    if (uVar.e.size() >= size) {
                                    }
                                } else {
                                    uVar = null;
                                }
                            }
                            if (uVar == null) {
                                sbVar.w0.o(null);
                                sbVar.w0.e();
                                sbVar.E0.setSelected((lh.u) null);
                                lh.wa waVar = sbVar.x0;
                                if (waVar != null) {
                                    waVar.recordHevc = !sbVar.w0.j();
                                }
                                sbVar.E0.a(false, true);
                                sbVar.m0(true);
                                break;
                            } else {
                                lh.gb gbVar = sbVar.w0;
                                sbVar.v0 = uVar;
                                gbVar.o(uVar);
                                sbVar.E0.setSelected(uVar);
                                int indexOf = lh.u.a().indexOf(uVar);
                                if (indexOf >= 0) {
                                    sbVar.E0.a.u0(indexOf);
                                }
                                lh.wa waVar2 = sbVar.x0;
                                if (waVar2 != null) {
                                    waVar2.recordHevc = !sbVar.w0.j();
                                }
                                sbVar.C0.setDrawable(new lh.v(uVar, false));
                                sbVar.c0(sbVar.D0, sbVar.E0.e, true);
                                sbVar.K0.e(sbVar.w0.j() ? sbVar.w0.getFilledProgress() : 0.0f, true);
                            }
                        }
                    }
                    sbVar.H1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            lh.z7 l10 = lh.z7.l((MediaController.PhotoEntry) arrayList.get(i12));
                            l10.M0 = (Bitmap) arrayList2.get(i12);
                            l10.J0 = sbVar.r0;
                            l10.K0 = sbVar.s0;
                            l10.A();
                            if (!bool.booleanValue()) {
                                if (sbVar.G1 == null) {
                                    sbVar.G1 = l10;
                                } else {
                                    if (sbVar.D1 == null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        sbVar.D1 = arrayList3;
                                        arrayList3.add(sbVar.G1);
                                    }
                                    if (sbVar.D1.size() < 10) {
                                        sbVar.D1.add(l10);
                                    }
                                }
                                i12++;
                            } else if (sbVar.w0.l(l10)) {
                                sbVar.G1 = lh.z7.a(sbVar.w0.getLayout(), sbVar.w0.getContent());
                            } else {
                                i12++;
                            }
                        }
                    }
                    if (sbVar.D1 != null) {
                        sbVar.i0(false, true);
                        sbVar.M0.a(sbVar.K1);
                        lh.y6 y6Var = sbVar.K0;
                        boolean z10 = sbVar.K1 == 1;
                        y6Var.j0 = -1.0f;
                        y6Var.k0 = z10;
                        y6Var.invalidate();
                        sbVar.E1 = new ArrayList();
                        sbVar.F1 = new ArrayList();
                        for (int i13 = 0; i13 < sbVar.D1.size(); i13 = i0.a.f(i13, i13, 1, sbVar.F1)) {
                            sbVar.E1.add(Integer.valueOf(i13));
                        }
                        sbVar.w0.n(null);
                        sbVar.E0.a(false, true);
                        sbVar.m0(true);
                        sbVar.f(false);
                        sbVar.K(1, true);
                        lh.ka kaVar = sbVar.Z0;
                        if (kaVar != null) {
                            kh.c cVar = kaVar.h;
                            if (!kaVar.E && !kaVar.I && (i10 = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) < 3) {
                                MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i10 + 1).apply();
                                AndroidUtilities.cancelRunOnUIThread(cVar);
                                kaVar.E = true;
                                kaVar.invalidate();
                                AndroidUtilities.runOnUIThread(cVar, 5500L);
                            }
                        }
                        lh.sa saVar = sbVar.I0;
                        if (saVar != null) {
                            sbVar.h2 = saVar.e.e0();
                            sbVar.i2 = sbVar.I0.getSelectedAlbum();
                            break;
                        }
                    } else {
                        lh.z7 z7Var = sbVar.G1;
                        if (z7Var != null) {
                            z7Var.B();
                        }
                        sbVar.E0.a(false, true);
                        sbVar.m0(true);
                        sbVar.f(false);
                        lh.sa saVar2 = sbVar.I0;
                        if (saVar2 != null) {
                            sbVar.h2 = saVar2.e.e0();
                            sbVar.i2 = sbVar.I0.getSelectedAlbum();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
