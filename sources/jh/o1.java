package jh;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import nh.gb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ o1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        int i10;
        nh.t tVar;
        switch (this.a) {
            case 0:
                ((h5) this.b).o2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                break;
            case 1:
                h5.u0((h5) this.b, (ArrayList) obj, (Utilities.Callback2) obj2, (Runnable) obj3);
                break;
            default:
                gb gbVar = (gb) this.b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (gbVar.b0 == 0 && arrayList != null && !arrayList.isEmpty() && gbVar.l2 == null && !gbVar.S && gbVar.J()) {
                    gbVar.D1 = null;
                    gbVar.E1 = null;
                    gbVar.F1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + gbVar.w0.getFilledCount() > gbVar.w0.getTotalCount()) {
                            int size = arrayList.size() + gbVar.w0.getFilledCount();
                            ArrayList a2 = nh.t.a();
                            int size2 = a2.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size2) {
                                    Object obj4 = a2.get(i11);
                                    i11++;
                                    tVar = (nh.t) obj4;
                                    if (tVar.e.size() >= size) {
                                    }
                                } else {
                                    tVar = null;
                                }
                            }
                            if (tVar == null) {
                                gbVar.w0.o(null);
                                gbVar.w0.e();
                                gbVar.E0.setSelected((nh.t) null);
                                nh.ka kaVar = gbVar.x0;
                                if (kaVar != null) {
                                    kaVar.recordHevc = !gbVar.w0.j();
                                }
                                gbVar.E0.a(false, true);
                                gbVar.m0(true);
                                break;
                            } else {
                                nh.ua uaVar = gbVar.w0;
                                gbVar.v0 = tVar;
                                uaVar.o(tVar);
                                gbVar.E0.setSelected(tVar);
                                int indexOf = nh.t.a().indexOf(tVar);
                                if (indexOf >= 0) {
                                    gbVar.E0.a.u0(indexOf);
                                }
                                nh.ka kaVar2 = gbVar.x0;
                                if (kaVar2 != null) {
                                    kaVar2.recordHevc = !gbVar.w0.j();
                                }
                                gbVar.C0.setDrawable(new nh.u(tVar, false));
                                gbVar.c0(gbVar.D0, gbVar.E0.e, true);
                                gbVar.K0.e(gbVar.w0.j() ? gbVar.w0.getFilledProgress() : 0.0f, true);
                            }
                        }
                    }
                    gbVar.H1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            nh.o7 l10 = nh.o7.l((MediaController.PhotoEntry) arrayList.get(i12));
                            l10.M0 = (Bitmap) arrayList2.get(i12);
                            l10.J0 = gbVar.r0;
                            l10.K0 = gbVar.s0;
                            l10.A();
                            if (!bool.booleanValue()) {
                                if (gbVar.G1 == null) {
                                    gbVar.G1 = l10;
                                } else {
                                    if (gbVar.D1 == null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        gbVar.D1 = arrayList3;
                                        arrayList3.add(gbVar.G1);
                                    }
                                    if (gbVar.D1.size() < 10) {
                                        gbVar.D1.add(l10);
                                    }
                                }
                                i12++;
                            } else if (gbVar.w0.l(l10)) {
                                gbVar.G1 = nh.o7.a(gbVar.w0.getLayout(), gbVar.w0.getContent());
                            } else {
                                i12++;
                            }
                        }
                    }
                    if (gbVar.D1 != null) {
                        gbVar.i0(false, true);
                        gbVar.M0.a(gbVar.K1);
                        nh.o6 o6Var = gbVar.K0;
                        boolean z10 = gbVar.K1 == 1;
                        o6Var.j0 = -1.0f;
                        o6Var.k0 = z10;
                        o6Var.invalidate();
                        gbVar.E1 = new ArrayList();
                        gbVar.F1 = new ArrayList();
                        for (int i13 = 0; i13 < gbVar.D1.size(); i13 = th.d(i13, i13, 1, gbVar.F1)) {
                            gbVar.E1.add(Integer.valueOf(i13));
                        }
                        gbVar.w0.n(null);
                        gbVar.E0.a(false, true);
                        gbVar.m0(true);
                        gbVar.f(false);
                        gbVar.K(1, true);
                        nh.y9 y9Var = gbVar.Z0;
                        if (y9Var != null) {
                            lh.m5 m5Var = y9Var.h;
                            if (!y9Var.E && !y9Var.I && (i10 = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) < 3) {
                                MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i10 + 1).apply();
                                AndroidUtilities.cancelRunOnUIThread(m5Var);
                                y9Var.E = true;
                                y9Var.invalidate();
                                AndroidUtilities.runOnUIThread(m5Var, 5500L);
                            }
                        }
                        nh.ga gaVar = gbVar.I0;
                        if (gaVar != null) {
                            gbVar.h2 = gaVar.e.e0();
                            gbVar.i2 = gbVar.I0.getSelectedAlbum();
                            break;
                        }
                    } else {
                        nh.o7 o7Var = gbVar.G1;
                        if (o7Var != null) {
                            o7Var.B();
                        }
                        gbVar.E0.a(false, true);
                        gbVar.m0(true);
                        gbVar.f(false);
                        nh.ga gaVar2 = gbVar.I0;
                        if (gaVar2 != null) {
                            gbVar.h2 = gaVar2.e.e0();
                            gbVar.i2 = gbVar.I0.getSelectedAlbum();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
