package lh;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        ph.r rVar;
        switch (this.a) {
            case 0:
                ((g5) this.b).o2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                break;
            case 1:
                g5.u0((g5) this.b, (ArrayList) obj, (Utilities.Callback2) obj2, (Runnable) obj3);
                break;
            default:
                ph.da daVar = (ph.da) this.b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (daVar.c0 == 0 && arrayList != null && !arrayList.isEmpty() && daVar.m2 == null && !daVar.T && daVar.J()) {
                    daVar.E1 = null;
                    daVar.F1 = null;
                    daVar.G1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + daVar.x0.getFilledCount() > daVar.x0.getTotalCount()) {
                            int size = arrayList.size() + daVar.x0.getFilledCount();
                            ArrayList a2 = ph.r.a();
                            int size2 = a2.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 < size2) {
                                    Object obj4 = a2.get(i11);
                                    i11++;
                                    rVar = (ph.r) obj4;
                                    if (rVar.e.size() >= size) {
                                    }
                                } else {
                                    rVar = null;
                                }
                            }
                            if (rVar == null) {
                                daVar.x0.o(null);
                                daVar.x0.e();
                                daVar.F0.setSelected((ph.r) null);
                                ph.i9 i9Var = daVar.y0;
                                if (i9Var != null) {
                                    i9Var.recordHevc = !daVar.x0.j();
                                }
                                daVar.F0.a(false, true);
                                daVar.m0(true);
                                break;
                            } else {
                                ph.r9 r9Var = daVar.x0;
                                daVar.w0 = rVar;
                                r9Var.o(rVar);
                                daVar.F0.setSelected(rVar);
                                int indexOf = ph.r.a().indexOf(rVar);
                                if (indexOf >= 0) {
                                    daVar.F0.a.u0(indexOf);
                                }
                                ph.i9 i9Var2 = daVar.y0;
                                if (i9Var2 != null) {
                                    i9Var2.recordHevc = !daVar.x0.j();
                                }
                                daVar.D0.setDrawable(new kc0(rVar, false));
                                daVar.c0(daVar.E0, daVar.F0.e, true);
                                daVar.L0.e(daVar.x0.j() ? daVar.x0.getFilledProgress() : 0.0f, true);
                            }
                        }
                    }
                    daVar.I1 = true;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            ph.t6 l10 = ph.t6.l((MediaController.PhotoEntry) arrayList.get(i12));
                            l10.M0 = (Bitmap) arrayList2.get(i12);
                            l10.J0 = daVar.s0;
                            l10.K0 = daVar.t0;
                            l10.A();
                            if (!bool.booleanValue()) {
                                if (daVar.H1 == null) {
                                    daVar.H1 = l10;
                                } else {
                                    if (daVar.E1 == null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        daVar.E1 = arrayList3;
                                        arrayList3.add(daVar.H1);
                                    }
                                    if (daVar.E1.size() < 10) {
                                        daVar.E1.add(l10);
                                    }
                                }
                                i12++;
                            } else if (daVar.x0.l(l10)) {
                                daVar.H1 = ph.t6.a(daVar.x0.getLayout(), daVar.x0.getContent());
                            } else {
                                i12++;
                            }
                        }
                    }
                    if (daVar.E1 != null) {
                        daVar.i0(false, true);
                        daVar.N0.a(daVar.L1);
                        ph.s5 s5Var = daVar.L0;
                        boolean z4 = daVar.L1 == 1;
                        s5Var.k0 = -1.0f;
                        s5Var.l0 = z4;
                        s5Var.invalidate();
                        daVar.F1 = new ArrayList();
                        daVar.G1 = new ArrayList();
                        for (int i13 = 0; i13 < daVar.E1.size(); i13 = ai.d(i13, i13, 1, daVar.G1)) {
                            daVar.F1.add(Integer.valueOf(i13));
                        }
                        daVar.x0.n(null);
                        daVar.F0.a(false, true);
                        daVar.m0(true);
                        daVar.f(false);
                        daVar.K(1, true);
                        ph.v8 v8Var = daVar.a1;
                        if (v8Var != null) {
                            org.telegram.ui.web.q0 q0Var = v8Var.h;
                            if (!v8Var.F && !v8Var.J && (i10 = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) < 3) {
                                MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i10 + 1).apply();
                                AndroidUtilities.cancelRunOnUIThread(q0Var);
                                v8Var.F = true;
                                v8Var.invalidate();
                                AndroidUtilities.runOnUIThread(q0Var, 5500L);
                            }
                        }
                        ph.e9 e9Var = daVar.J0;
                        if (e9Var != null) {
                            daVar.i2 = e9Var.e.e0();
                            daVar.j2 = daVar.J0.getSelectedAlbum();
                            break;
                        }
                    } else {
                        ph.t6 t6Var = daVar.H1;
                        if (t6Var != null) {
                            t6Var.B();
                        }
                        daVar.F0.a(false, true);
                        daVar.m0(true);
                        daVar.f(false);
                        ph.e9 e9Var2 = daVar.J0;
                        if (e9Var2 != null) {
                            daVar.i2 = e9Var2.e.e0();
                            daVar.j2 = daVar.J0.getSelectedAlbum();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
