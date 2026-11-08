package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hz(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        t50 t50Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i10 = this.a;
        int i11 = 2;
        Object obj = this.b;
        switch (i10) {
            case 0:
                yz yzVar = (yz) obj;
                org.telegram.messenger.g0.r(yzVar.n0);
                yzVar.a.a(false, true);
                break;
            case 1:
                yz yzVar2 = ((nz) obj).a;
                yzVar2.h(yzVar2.E, yzVar2.F, yzVar2.H, yzVar2.G, yzVar2.D, yzVar2.J, yzVar2.x, false);
                break;
            case 2:
                ((FiltersSetupActivity) ((zs) obj).f3).getMessagesController().i3();
                break;
            case 3:
                a00 a00Var = (a00) obj;
                a00Var.s.a();
                a00Var.n.invalidate();
                a00Var.H.g0(true);
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((org.telegram.ui.Components.ez) obj).f;
                if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q()) {
                    ArrayList T0 = filtersSetupActivity.getMessagesController().T0();
                    int i12 = 0;
                    while (true) {
                        if (i12 < T0.size()) {
                            if (!((org.telegram.messenger.vo) T0.get(i12)).e() || i12 == 0) {
                                i12++;
                            } else {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.b.e;
                                ArrayList arrayList = filtersSetupActivity2.getMessagesController().P0;
                                if (i12 < 0 || i12 >= arrayList.size()) {
                                    i7 = 1;
                                } else {
                                    arrayList.add(0, (org.telegram.messenger.vo) arrayList.remove(i12));
                                    for (int i13 = 0; i13 <= i12; i13++) {
                                        ((org.telegram.messenger.vo) arrayList.get(i13)).f = i13;
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
                                org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(filtersSetupActivity);
                                Object[] objArr = new Object[i7];
                                objArr[0] = org.telegram.messenger.id.M0(2131750808, null);
                                a02.J(R.raw.filter_reorder, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("LimitReachedReorderFolder", null, 2131748945, objArr)), org.telegram.messenger.id.M0(2131747034, null), 5000, false, new zz(filtersSetupActivity, i11)).j();
                            }
                        }
                    }
                }
                filtersSetupActivity.f0(null);
                break;
            case 5:
                c40 c40Var = ((o10) obj).b;
                c40Var.a4 = null;
                c40Var.P1(c40Var.w3, true);
                break;
            case 6:
                ((i30) obj).requestLayout();
                break;
            case 7:
                l30 l30Var = (l30) obj;
                c40 c40Var2 = l30Var.f;
                b20 b20Var = c40Var2.i1;
                org.telegram.messenger.hc hcVar = l30Var.d;
                if (hcVar != null) {
                    b20Var.K0 = hcVar;
                    b20Var.q1 = null;
                    b20Var.r1 = null;
                    l30Var.d = null;
                }
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(c40Var2.k1.a).M0(Long.valueOf(-l30Var.e));
                org.telegram.messenger.hc a10 = org.telegram.messenger.hc.a(0, M0);
                org.telegram.messenger.hc a11 = org.telegram.messenger.hc.a(1, M0);
                if (org.telegram.messenger.hc.e(l30Var.b) == null) {
                    a11 = org.telegram.messenger.hc.e(l30Var.c);
                }
                b20Var.setCreateThumbFromParent(false);
                b20Var.H(null, a10, a11, true);
                l30Var.c = null;
                l30Var.b = null;
                org.telegram.messenger.g0.b4(c40Var2.H1);
                l30Var.a(1.0f);
                break;
            case 8:
                l00 l00Var = (l00) ((g.b) obj).i;
                if (l00Var != null) {
                    l00Var.invalidate();
                    break;
                }
                break;
            case 9:
                d50 d50Var = (d50) obj;
                d50Var.D = null;
                d50Var.E = null;
                d50Var.F = null;
                d50Var.G = null;
                d50Var.I = null;
                d50Var.H = null;
                d50Var.J = 0.0d;
                d50Var.e0(false, true);
                d50Var.d.j(null, null, d50Var.r, null);
                d50Var.f.setAnimation(d50Var.R);
                d50Var.R.M(0);
                break;
            case 10:
                org.telegram.messenger.k5.o(null, 2131749379, org.telegram.ui.Components.hc.a0(((g50) obj).c), R.raw.done, 36);
                break;
            case 11:
                u50 u50Var = (u50) obj;
                t50 t50Var2 = u50Var.I;
                int i14 = org.telegram.ui.ActionBar.k6.d6;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
                int i15 = t50.D;
                t50Var2.a(R.drawable.intro_powerful_mask, 17, x02, true);
                u50Var.I.c();
                t50 t50Var3 = u50Var.I;
                t50Var3.b(t50Var3.w, 23, true);
                u50Var.I.d();
                Intro.a(org.telegram.ui.ActionBar.k6.x0(null, i14, false));
                break;
            case 12:
                s50 s50Var = (s50) obj;
                s50Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                u50 u50Var2 = (u50) s50Var.b;
                Intro.setPage(u50Var2.H);
                Intro.setDate((currentTimeMillis - u50Var2.J) / 1000.0f);
                Intro.onDrawFrame(0);
                t50 t50Var4 = u50Var2.I;
                if (t50Var4 != null && t50Var4.isAlive() && (eGLDisplay = (t50Var = u50Var2.I).c) != null && (eGLSurface = t50Var.f) != null) {
                    try {
                        t50Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 13:
                u50 u50Var3 = (u50) ((org.telegram.messenger.ps) obj).c;
                u50Var3.presentFragment(new ce0(), true);
                u50Var3.M = true;
                break;
            case 14:
                ((t50) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 15:
                y50 y50Var = (y50) obj;
                y50Var.f.e.smoothScrollTo(0, y50Var.getHeight());
                break;
            case 16:
                ((vf.b) obj).b();
                break;
            case 17:
                ((k80) obj).a.A0.setVisibility(8);
                break;
            case 18:
                v80 v80Var = (v80) obj;
                LaunchActivity launchActivity = v80Var.c;
                launchActivity.N0 = false;
                boolean z9 = launchActivity.M0;
                launchActivity.E();
                if (z9 != launchActivity.M0) {
                    v80Var.requestLayout();
                    break;
                }
                break;
            case 19:
                n90 n90Var = (n90) obj;
                ai.l1 l1Var = n90Var.d;
                if (l1Var != null) {
                    n90Var.i0(l1Var.getCurrentLink());
                    break;
                }
                break;
            case 20:
                try {
                    org.telegram.ui.Components.pj0 currentListView = ((pa0) ((oa0) obj).i0).L0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 21:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ub0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.K3(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 22:
                xb0 xb0Var = (xb0) obj;
                org.telegram.ui.Components.ch0 ch0Var = xb0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = xb0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    ce0.b1(xb0Var.D, editTextBoldCursor2);
                    ch0Var.getAnimatedDrawable().N(0, false, false);
                    ch0Var.d();
                    break;
                }
                break;
            case 23:
                ((org.telegram.ui.Components.ch0) obj).d();
                break;
            case 24:
                ((ec0) ((ah.i) obj).H1).getClass();
                break;
            case 25:
                double currentTimeMillis2 = System.currentTimeMillis();
                ec0 ec0Var = (ec0) ((fi.h2) obj).b;
                double d = ec0Var.Q;
                ed0 ed0Var = ec0Var.w;
                ec0Var.Q = currentTimeMillis2;
                int i16 = (int) (ec0Var.P - (currentTimeMillis2 - d));
                ec0Var.P = i16;
                if (i16 >= 1000) {
                    int i17 = i16 / 1000;
                    int i18 = i17 / 60;
                    int i19 = i17 - (i18 * 60);
                    ed0Var.setTextSize(1, 13.0f);
                    int i20 = ec0Var.E;
                    if (i20 != 4 && i20 != 3 && i20 != 11) {
                        if (i20 == 2) {
                            ed0Var.setText(org.telegram.messenger.id.a0(null, null, 2131745299, Integer.valueOf(i18), Integer.valueOf(i19)));
                            break;
                        }
                    } else {
                        ed0Var.setText(org.telegram.messenger.id.a0(null, null, 2131752629, Integer.valueOf(i18), Integer.valueOf(i19)));
                        break;
                    }
                } else {
                    ec0Var.q();
                    int i21 = ec0Var.E;
                    if (i21 == 3 || i21 == 4 || i21 == 2 || i21 == 11) {
                        ed0Var.setTextSize(1, 15.0f);
                        int i22 = ec0Var.E;
                        if (i22 == 4) {
                            ed0Var.setText(org.telegram.messenger.id.M0(2131746180, null));
                        } else if (i22 == 15) {
                            ed0Var.setText(org.telegram.messenger.id.M0(2131751448, null));
                        } else if (i22 == 11 || i22 == 3) {
                            ed0Var.setText(org.telegram.messenger.id.M0(2131746179, null));
                        } else {
                            ed0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.id.M0(2131746181, null), true, 0.0f, 0.0f));
                        }
                        int i23 = org.telegram.ui.ActionBar.k6.P9;
                        org.telegram.ui.ActionBar.r6.V(ed0Var, i23, null);
                        ed0Var.setTag(R.id.color_key_tag, Integer.valueOf(i23));
                        break;
                    }
                }
                break;
            case 26:
                double currentTimeMillis3 = System.currentTimeMillis();
                gd0 gd0Var = ((fd0) obj).b;
                double d2 = currentTimeMillis3 - gd0Var.d0;
                gd0Var.d0 = currentTimeMillis3;
                int i24 = (int) (gd0Var.b0 - d2);
                gd0Var.b0 = i24;
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
                double d10 = gd0Var2.c0;
                ed0 ed0Var3 = gd0Var2.w;
                gd0Var2.c0 = currentTimeMillis4;
                int i25 = (int) (gd0Var2.a0 - (currentTimeMillis4 - d10));
                gd0Var2.a0 = i25;
                if (i25 >= 1000) {
                    int i26 = i25 / 1000;
                    int i27 = i26 / 60;
                    int i28 = i26 - (i27 * 60);
                    int i29 = gd0Var2.i0;
                    if (i29 != 4 && i29 != 3 && i29 != 11) {
                        if (gd0Var2.h0 != 2 || (i29 != 2 && i29 != 17 && i29 != 16)) {
                            if (i29 == 2 || i29 == 17 || i29 == 16) {
                                ed0Var3.setText(org.telegram.messenger.id.a0("SmsAvailableIn", null, 2131745300, Integer.valueOf(i27), Integer.valueOf(i28)));
                                break;
                            }
                        } else {
                            ed0Var3.setText(org.telegram.messenger.id.a0("ResendSmsAvailableIn", null, 2131746122, Integer.valueOf(i27), Integer.valueOf(i28)));
                            break;
                        }
                    } else {
                        ed0Var3.setText(org.telegram.messenger.id.a0("CallAvailableIn", null, 2131752630, Integer.valueOf(i27), Integer.valueOf(i28)));
                        break;
                    }
                } else {
                    gd0Var2.u();
                    int i30 = gd0Var2.i0;
                    if (i30 == 3 || i30 == 4 || i30 == 2 || i30 == 17 || i30 == 16 || i30 == 11) {
                        if (i30 == 4) {
                            ed0Var3.setText(org.telegram.messenger.id.M0(2131746180, "RequestCallButton"));
                        } else if (i30 == 11 || i30 == 3) {
                            ed0Var3.setText(org.telegram.messenger.id.M0(2131746179, null));
                        } else {
                            ed0Var3.setText(org.telegram.messenger.id.M0(2131746178, "RequestSmsButton"));
                        }
                        int i31 = org.telegram.ui.ActionBar.k6.P9;
                        org.telegram.ui.ActionBar.r6.V(ed0Var3, i31, null);
                        ed0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i31));
                        break;
                    }
                }
            case 28:
                ((org.telegram.ui.Components.kn0) obj).run();
                break;
            default:
                ((le0) obj).setSkipDrawSelector(false);
                break;
        }
    }
}
