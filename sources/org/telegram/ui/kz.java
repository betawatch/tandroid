package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kz(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        u50 u50Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i10 = this.a;
        int i11 = 2;
        Object obj = this.b;
        switch (i10) {
            case 0:
                b00 b00Var = (b00) obj;
                org.telegram.messenger.g0.r(b00Var.o0);
                b00Var.a.a(false, true);
                break;
            case 1:
                b00 b00Var2 = ((qz) obj).a;
                b00Var2.h(b00Var2.F, b00Var2.G, b00Var2.I, b00Var2.H, b00Var2.E, b00Var2.K, b00Var2.x, false);
                break;
            case 2:
                ((FiltersSetupActivity) ((dt) obj).g3).getMessagesController().p3();
                break;
            case 3:
                e00 e00Var = (e00) obj;
                e00Var.s.a();
                e00Var.n.invalidate();
                e00Var.I.g0(true);
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((org.telegram.ui.Components.nz) obj).f;
                if (!org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).q()) {
                    ArrayList V0 = filtersSetupActivity.getMessagesController().V0();
                    int i12 = 0;
                    while (true) {
                        if (i12 < V0.size()) {
                            if (!((org.telegram.messenger.ro) V0.get(i12)).d() || i12 == 0) {
                                i12++;
                            } else {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.b.e;
                                ArrayList arrayList = filtersSetupActivity2.getMessagesController().Q0;
                                if (i12 < 0 || i12 >= arrayList.size()) {
                                    i7 = 1;
                                } else {
                                    arrayList.add(0, (org.telegram.messenger.ro) arrayList.remove(i12));
                                    for (int i13 = 0; i13 <= i12; i13++) {
                                        ((org.telegram.messenger.ro) arrayList.get(i13)).f = i13;
                                    }
                                    i7 = 1;
                                    filtersSetupActivity2.e = true;
                                    filtersSetupActivity2.g0(true);
                                }
                                filtersSetupActivity.a.v0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i7);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(filtersSetupActivity);
                                Object[] objArr = new Object[i7];
                                objArr[0] = org.telegram.messenger.gd.N0(2131750795, null);
                                b02.J(R.raw.filter_reorder, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("LimitReachedReorderFolder", null, 2131748751, objArr)), org.telegram.messenger.gd.N0(2131746839, null), 5000, false, new c00(filtersSetupActivity, i11)).j();
                            }
                        }
                    }
                }
                filtersSetupActivity.f0(null);
                break;
            case 5:
                e40 e40Var = ((q10) obj).b;
                e40Var.i4 = null;
                e40Var.R1(e40Var.E3, true);
                break;
            case 6:
                ((k30) obj).requestLayout();
                break;
            case 7:
                n30 n30Var = (n30) obj;
                e40 e40Var2 = n30Var.f;
                c20 c20Var = e40Var2.m1;
                org.telegram.messenger.fc fcVar = n30Var.d;
                if (fcVar != null) {
                    c20Var.L0 = fcVar;
                    c20Var.r1 = null;
                    c20Var.s1 = null;
                    n30Var.d = null;
                }
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(e40Var2.o1.a).O0(Long.valueOf(-n30Var.e));
                org.telegram.messenger.fc a10 = org.telegram.messenger.fc.a(0, O0);
                org.telegram.messenger.fc a11 = org.telegram.messenger.fc.a(1, O0);
                if (org.telegram.messenger.fc.e(n30Var.b) == null) {
                    a11 = org.telegram.messenger.fc.e(n30Var.c);
                }
                c20Var.setCreateThumbFromParent(false);
                c20Var.H(null, a10, a11, true);
                n30Var.c = null;
                n30Var.b = null;
                org.telegram.messenger.g0.Z3(e40Var2.L1);
                n30Var.a(1.0f);
                break;
            case 8:
                tv tvVar = (tv) ((g.b) obj).i;
                if (tvVar != null) {
                    tvVar.invalidate();
                    break;
                }
                break;
            case 9:
                e50 e50Var = (e50) obj;
                e50Var.E = null;
                e50Var.F = null;
                e50Var.G = null;
                e50Var.H = null;
                e50Var.J = null;
                e50Var.I = null;
                e50Var.K = 0.0d;
                e50Var.e0(false, true);
                e50Var.d.j(null, null, e50Var.r, null);
                e50Var.f.setAnimation(e50Var.S);
                e50Var.S.M(0);
                break;
            case 10:
                org.telegram.messenger.f3.n(null, 2131749185, org.telegram.ui.Components.kc.b0(((h50) obj).c), R.raw.done, 36);
                break;
            case 11:
                v50 v50Var = (v50) obj;
                u50 u50Var2 = v50Var.J;
                int i14 = org.telegram.ui.ActionBar.n6.d6;
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, i14, false);
                int i15 = u50.E;
                u50Var2.a(R.drawable.intro_powerful_mask, 17, x02, true);
                v50Var.J.c();
                u50 u50Var3 = v50Var.J;
                u50Var3.b(u50Var3.w, 23, true);
                v50Var.J.d();
                Intro.a(org.telegram.ui.ActionBar.n6.x0(null, i14, false));
                break;
            case 12:
                t50 t50Var = (t50) obj;
                t50Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                v50 v50Var2 = (v50) t50Var.b;
                Intro.setPage(v50Var2.I);
                Intro.setDate((currentTimeMillis - v50Var2.K) / 1000.0f);
                Intro.onDrawFrame(0);
                u50 u50Var4 = v50Var2.J;
                if (u50Var4 != null && u50Var4.isAlive() && (eGLDisplay = (u50Var = v50Var2.J).c) != null && (eGLSurface = u50Var.f) != null) {
                    try {
                        u50Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 13:
                v50 v50Var3 = (v50) ((org.telegram.messenger.js) obj).c;
                v50Var3.presentFragment(new de0(), true);
                v50Var3.N = true;
                break;
            case 14:
                ((u50) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 15:
                z50 z50Var = (z50) obj;
                z50Var.f.e.smoothScrollTo(0, z50Var.getHeight());
                break;
            case 16:
                ((vf.b) obj).b();
                break;
            case 17:
                ((m80) obj).a.B0.setVisibility(8);
                break;
            case 18:
                x80 x80Var = (x80) obj;
                LaunchActivity launchActivity = x80Var.c;
                launchActivity.O0 = false;
                boolean z10 = launchActivity.N0;
                launchActivity.E();
                if (z10 != launchActivity.N0) {
                    x80Var.requestLayout();
                    break;
                }
                break;
            case 19:
                p90 p90Var = (p90) obj;
                ci.z0 z0Var = p90Var.d;
                if (z0Var != null) {
                    p90Var.i0(z0Var.getCurrentLink());
                    break;
                }
                break;
            case 20:
                try {
                    org.telegram.ui.Components.ek0 currentListView = ((pa0) ((oa0) obj).j0).R0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 21:
                EditTextBoldCursor[] editTextBoldCursorArr = ((tb0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.I3(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 22:
                wb0 wb0Var = (wb0) obj;
                org.telegram.ui.Components.qh0 qh0Var = wb0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = wb0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    de0.b1(wb0Var.E, editTextBoldCursor2);
                    qh0Var.getAnimatedDrawable().N(0, false, false);
                    qh0Var.d();
                    break;
                }
                break;
            case 23:
                ((org.telegram.ui.Components.qh0) obj).d();
                break;
            case 24:
                ((dc0) ((ah.i) obj).N1).getClass();
                break;
            case 25:
                double currentTimeMillis2 = System.currentTimeMillis();
                dc0 dc0Var = (dc0) ((h6.s) obj).b;
                double d = dc0Var.R;
                ed0 ed0Var = dc0Var.w;
                dc0Var.R = currentTimeMillis2;
                int i16 = (int) (dc0Var.Q - (currentTimeMillis2 - d));
                dc0Var.Q = i16;
                if (i16 >= 1000) {
                    int i17 = i16 / 1000;
                    int i18 = i17 / 60;
                    int i19 = i17 - (i18 * 60);
                    ed0Var.setTextSize(1, 13.0f);
                    int i20 = dc0Var.F;
                    if (i20 != 4 && i20 != 3 && i20 != 11) {
                        if (i20 == 2) {
                            ed0Var.setText(org.telegram.messenger.gd.a0(null, null, 2131745100, Integer.valueOf(i18), Integer.valueOf(i19)));
                            break;
                        }
                    } else {
                        ed0Var.setText(org.telegram.messenger.gd.a0(null, null, 2131752617, Integer.valueOf(i18), Integer.valueOf(i19)));
                        break;
                    }
                } else {
                    dc0Var.q();
                    int i21 = dc0Var.F;
                    if (i21 == 3 || i21 == 4 || i21 == 2 || i21 == 11) {
                        ed0Var.setTextSize(1, 15.0f);
                        int i22 = dc0Var.F;
                        if (i22 == 4) {
                            ed0Var.setText(org.telegram.messenger.gd.N0(2131745981, null));
                        } else if (i22 == 15) {
                            ed0Var.setText(org.telegram.messenger.gd.N0(2131751435, null));
                        } else if (i22 == 11 || i22 == 3) {
                            ed0Var.setText(org.telegram.messenger.gd.N0(2131745980, null));
                        } else {
                            ed0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.gd.N0(2131745982, null), true, 0.0f, 0.0f));
                        }
                        int i23 = org.telegram.ui.ActionBar.n6.P9;
                        org.telegram.ui.ActionBar.u6.U(ed0Var, i23, null);
                        ed0Var.setTag(R.id.color_key_tag, Integer.valueOf(i23));
                        break;
                    }
                }
                break;
            case 26:
                double currentTimeMillis3 = System.currentTimeMillis();
                gd0 gd0Var = ((fd0) obj).b;
                double d2 = currentTimeMillis3 - gd0Var.e0;
                gd0Var.e0 = currentTimeMillis3;
                int i24 = (int) (gd0Var.c0 - d2);
                gd0Var.c0 = i24;
                if (i24 <= 1000) {
                    gd0Var.setProblemTextVisible(true);
                    gd0Var.w.setVisibility(8);
                    ed0 ed0Var2 = gd0Var.y;
                    if (ed0Var2 != null) {
                        ed0Var2.setVisibility(0);
                    }
                    gd0Var.t();
                    break;
                }
                break;
            case 27:
                double currentTimeMillis4 = System.currentTimeMillis();
                gd0 gd0Var2 = ((fd0) obj).b;
                double d10 = gd0Var2.d0;
                ed0 ed0Var3 = gd0Var2.w;
                gd0Var2.d0 = currentTimeMillis4;
                int i25 = (int) (gd0Var2.b0 - (currentTimeMillis4 - d10));
                gd0Var2.b0 = i25;
                if (i25 >= 1000) {
                    int i26 = i25 / 1000;
                    int i27 = i26 / 60;
                    int i28 = i26 - (i27 * 60);
                    int i29 = gd0Var2.j0;
                    if (i29 != 4 && i29 != 3 && i29 != 11) {
                        if (gd0Var2.i0 != 2 || (i29 != 2 && i29 != 17 && i29 != 16)) {
                            if (i29 == 2 || i29 == 17 || i29 == 16) {
                                ed0Var3.setText(org.telegram.messenger.gd.a0("SmsAvailableIn", null, 2131745101, Integer.valueOf(i27), Integer.valueOf(i28)));
                                break;
                            }
                        } else {
                            ed0Var3.setText(org.telegram.messenger.gd.a0("ResendSmsAvailableIn", null, 2131745923, Integer.valueOf(i27), Integer.valueOf(i28)));
                            break;
                        }
                    } else {
                        ed0Var3.setText(org.telegram.messenger.gd.a0("CallAvailableIn", null, 2131752618, Integer.valueOf(i27), Integer.valueOf(i28)));
                        break;
                    }
                } else {
                    gd0Var2.u();
                    int i30 = gd0Var2.j0;
                    if (i30 == 3 || i30 == 4 || i30 == 2 || i30 == 17 || i30 == 16 || i30 == 11) {
                        if (i30 == 4) {
                            ed0Var3.setText(org.telegram.messenger.gd.N0(2131745981, "RequestCallButton"));
                        } else if (i30 == 11 || i30 == 3) {
                            ed0Var3.setText(org.telegram.messenger.gd.N0(2131745980, null));
                        } else {
                            ed0Var3.setText(org.telegram.messenger.gd.N0(2131745979, "RequestSmsButton"));
                        }
                        int i31 = org.telegram.ui.ActionBar.n6.P9;
                        org.telegram.ui.ActionBar.u6.U(ed0Var3, i31, null);
                        ed0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i31));
                        break;
                    }
                }
            case 28:
                ((org.telegram.ui.Components.xz) obj).run();
                break;
            default:
                ((ne0) obj).setSkipDrawSelector(false);
                break;
        }
    }
}
