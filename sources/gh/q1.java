package gh;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import kh.wb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements Utilities.Callback3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ q1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        this.a = i9;
        this.b = notificationCenterDelegate;
    }

    @Override // org.telegram.messenger.Utilities.Callback3
    public final void run(Object obj, Object obj2, Object obj3) {
        int i9;
        kh.u uVar;
        switch (this.a) {
            case 0:
                ((k5) this.b).o2((View) obj2, (CharSequence) obj, ((Boolean) obj3).booleanValue());
                break;
            case 1:
                k5.t0((k5) this.b, (ArrayList) obj, (Utilities.Callback2) obj2, (Runnable) obj3);
                break;
            default:
                wb wbVar = (wb) this.b;
                Boolean bool = (Boolean) obj;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj3;
                if (wbVar.b0 == 0 && arrayList != null && !arrayList.isEmpty() && wbVar.l2 == null && !wbVar.S && wbVar.J()) {
                    wbVar.D1 = null;
                    wbVar.E1 = null;
                    wbVar.F1 = null;
                    if (bool.booleanValue()) {
                        if (arrayList.size() + wbVar.w0.getFilledCount() > wbVar.w0.getTotalCount()) {
                            int size = arrayList.size() + wbVar.w0.getFilledCount();
                            ArrayList a2 = kh.u.a();
                            int size2 = a2.size();
                            int i10 = 0;
                            while (true) {
                                if (i10 < size2) {
                                    Object obj4 = a2.get(i10);
                                    i10++;
                                    uVar = (kh.u) obj4;
                                    if (uVar.e.size() >= size) {
                                    }
                                } else {
                                    uVar = null;
                                }
                            }
                            if (uVar == null) {
                                wbVar.w0.o(null);
                                wbVar.w0.e();
                                wbVar.E0.setSelected((kh.u) null);
                                kh.za zaVar = wbVar.x0;
                                if (zaVar != null) {
                                    zaVar.recordHevc = !wbVar.w0.j();
                                }
                                wbVar.E0.a(false, true);
                                wbVar.m0(true);
                                break;
                            } else {
                                kh.jb jbVar = wbVar.w0;
                                wbVar.v0 = uVar;
                                jbVar.o(uVar);
                                wbVar.E0.setSelected(uVar);
                                int indexOf = kh.u.a().indexOf(uVar);
                                if (indexOf >= 0) {
                                    wbVar.E0.a.u0(indexOf);
                                }
                                kh.za zaVar2 = wbVar.x0;
                                if (zaVar2 != null) {
                                    zaVar2.recordHevc = !wbVar.w0.j();
                                }
                                wbVar.C0.setDrawable(new kh.v(uVar, false));
                                wbVar.c0(wbVar.D0, wbVar.E0.e, true);
                                wbVar.K0.e(wbVar.w0.j() ? wbVar.w0.getFilledProgress() : 0.0f, true);
                            }
                        }
                    }
                    wbVar.H1 = true;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList.size()) {
                            kh.a8 l10 = kh.a8.l((MediaController.PhotoEntry) arrayList.get(i11));
                            l10.M0 = (Bitmap) arrayList2.get(i11);
                            l10.J0 = wbVar.r0;
                            l10.K0 = wbVar.s0;
                            l10.A();
                            if (!bool.booleanValue()) {
                                if (wbVar.G1 == null) {
                                    wbVar.G1 = l10;
                                } else {
                                    if (wbVar.D1 == null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        wbVar.D1 = arrayList3;
                                        arrayList3.add(wbVar.G1);
                                    }
                                    if (wbVar.D1.size() < 10) {
                                        wbVar.D1.add(l10);
                                    }
                                }
                                i11++;
                            } else if (wbVar.w0.l(l10)) {
                                wbVar.G1 = kh.a8.a(wbVar.w0.getLayout(), wbVar.w0.getContent());
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (wbVar.D1 != null) {
                        wbVar.i0(false, true);
                        wbVar.M0.a(wbVar.K1);
                        kh.z6 z6Var = wbVar.K0;
                        boolean z10 = wbVar.K1 == 1;
                        z6Var.j0 = -1.0f;
                        z6Var.k0 = z10;
                        z6Var.invalidate();
                        wbVar.E1 = new ArrayList();
                        wbVar.F1 = new ArrayList();
                        for (int i12 = 0; i12 < wbVar.D1.size(); i12 = j3.r0.e(i12, i12, 1, wbVar.F1)) {
                            wbVar.E1.add(Integer.valueOf(i12));
                        }
                        wbVar.w0.n(null);
                        wbVar.E0.a(false, true);
                        wbVar.m0(true);
                        wbVar.f(false);
                        wbVar.K(1, true);
                        kh.na naVar = wbVar.Z0;
                        if (naVar != null) {
                            kh.f1 f1Var = naVar.h;
                            if (!naVar.E && !naVar.I && (i9 = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) < 3) {
                                MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i9 + 1).apply();
                                AndroidUtilities.cancelRunOnUIThread(f1Var);
                                naVar.E = true;
                                naVar.invalidate();
                                AndroidUtilities.runOnUIThread(f1Var, 5500L);
                            }
                        }
                        kh.va vaVar = wbVar.I0;
                        if (vaVar != null) {
                            wbVar.h2 = vaVar.e.e0();
                            wbVar.i2 = wbVar.I0.getSelectedAlbum();
                            break;
                        }
                    } else {
                        kh.a8 a8Var = wbVar.G1;
                        if (a8Var != null) {
                            a8Var.B();
                        }
                        wbVar.E0.a(false, true);
                        wbVar.m0(true);
                        wbVar.f(false);
                        kh.va vaVar2 = wbVar.I0;
                        if (vaVar2 != null) {
                            wbVar.h2 = vaVar2.e.e0();
                            wbVar.i2 = wbVar.I0.getSelectedAlbum();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
