package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jz(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        v50 v50Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i10 = this.a;
        int i11 = 2;
        Object obj = this.b;
        switch (i10) {
            case 0:
                a00 a00Var = (a00) obj;
                org.telegram.messenger.g0.r(a00Var.n0);
                a00Var.a.a(false, true);
                break;
            case 1:
                a00 a00Var2 = ((pz) obj).a;
                a00Var2.h(a00Var2.E, a00Var2.F, a00Var2.H, a00Var2.G, a00Var2.D, a00Var2.J, a00Var2.x, false);
                break;
            case 2:
                ((FiltersSetupActivity) ((bt) obj).f3).getMessagesController().i3();
                break;
            case 3:
                c00 c00Var = (c00) obj;
                c00Var.s.a();
                c00Var.n.invalidate();
                c00Var.H.g0(true);
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
                                objArr[0] = org.telegram.messenger.id.M0(2131750807, null);
                                a02.J(R.raw.filter_reorder, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("LimitReachedReorderFolder", null, 2131748944, objArr)), org.telegram.messenger.id.M0(2131747033, null), 5000, false, new b00(filtersSetupActivity, i11)).j();
                            }
                        }
                    }
                }
                filtersSetupActivity.f0(null);
                break;
            case 5:
                e40 e40Var = ((q10) obj).b;
                e40Var.a4 = null;
                e40Var.P1(e40Var.w3, true);
                break;
            case 6:
                ((k30) obj).requestLayout();
                break;
            case 7:
                n30 n30Var = (n30) obj;
                e40 e40Var2 = n30Var.f;
                d20 d20Var = e40Var2.i1;
                org.telegram.messenger.hc hcVar = n30Var.d;
                if (hcVar != null) {
                    d20Var.K0 = hcVar;
                    d20Var.q1 = null;
                    d20Var.r1 = null;
                    n30Var.d = null;
                }
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(e40Var2.k1.a).M0(Long.valueOf(-n30Var.e));
                org.telegram.messenger.hc a10 = org.telegram.messenger.hc.a(0, M0);
                org.telegram.messenger.hc a11 = org.telegram.messenger.hc.a(1, M0);
                if (org.telegram.messenger.hc.e(n30Var.b) == null) {
                    a11 = org.telegram.messenger.hc.e(n30Var.c);
                }
                d20Var.setCreateThumbFromParent(false);
                d20Var.H(null, a10, a11, true);
                n30Var.c = null;
                n30Var.b = null;
                org.telegram.messenger.g0.b4(e40Var2.H1);
                n30Var.a(1.0f);
                break;
            case 8:
                n00 n00Var = (n00) ((g.b) obj).i;
                if (n00Var != null) {
                    n00Var.invalidate();
                    break;
                }
                break;
            case 9:
                f50 f50Var = (f50) obj;
                f50Var.D = null;
                f50Var.E = null;
                f50Var.F = null;
                f50Var.G = null;
                f50Var.I = null;
                f50Var.H = null;
                f50Var.J = 0.0d;
                f50Var.e0(false, true);
                f50Var.d.j(null, null, f50Var.r, null);
                f50Var.f.setAnimation(f50Var.R);
                f50Var.R.M(0);
                break;
            case 10:
                org.telegram.messenger.k5.o(null, 2131749378, org.telegram.ui.Components.hc.a0(((i50) obj).c), R.raw.done, 36);
                break;
            case 11:
                w50 w50Var = (w50) obj;
                v50 v50Var2 = w50Var.I;
                int i14 = org.telegram.ui.ActionBar.l6.d6;
                int x02 = org.telegram.ui.ActionBar.l6.x0(null, i14, false);
                int i15 = v50.D;
                v50Var2.a(R.drawable.intro_powerful_mask, 17, x02, true);
                w50Var.I.c();
                v50 v50Var3 = w50Var.I;
                v50Var3.b(v50Var3.w, 23, true);
                w50Var.I.d();
                Intro.a(org.telegram.ui.ActionBar.l6.x0(null, i14, false));
                break;
            case 12:
                u50 u50Var = (u50) obj;
                u50Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                w50 w50Var2 = (w50) u50Var.b;
                Intro.setPage(w50Var2.H);
                Intro.setDate((currentTimeMillis - w50Var2.J) / 1000.0f);
                Intro.onDrawFrame(0);
                v50 v50Var4 = w50Var2.I;
                if (v50Var4 != null && v50Var4.isAlive() && (eGLDisplay = (v50Var = w50Var2.I).c) != null && (eGLSurface = v50Var.f) != null) {
                    try {
                        v50Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 13:
                w50 w50Var3 = (w50) ((org.telegram.messenger.ps) obj).c;
                w50Var3.presentFragment(new ee0(), true);
                w50Var3.M = true;
                break;
            case 14:
                ((v50) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 15:
                a60 a60Var = (a60) obj;
                a60Var.f.e.smoothScrollTo(0, a60Var.getHeight());
                break;
            case 16:
                ((vf.b) obj).b();
                break;
            case 17:
                ((m80) obj).a.A0.setVisibility(8);
                break;
            case 18:
                x80 x80Var = (x80) obj;
                LaunchActivity launchActivity = x80Var.c;
                launchActivity.N0 = false;
                boolean z9 = launchActivity.M0;
                launchActivity.E();
                if (z9 != launchActivity.M0) {
                    x80Var.requestLayout();
                    break;
                }
                break;
            case 19:
                p90 p90Var = (p90) obj;
                ai.l1 l1Var = p90Var.d;
                if (l1Var != null) {
                    p90Var.i0(l1Var.getCurrentLink());
                    break;
                }
                break;
            case 20:
                try {
                    org.telegram.ui.Components.qj0 currentListView = ((ra0) ((qa0) obj).i0).L0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 21:
                EditTextBoldCursor[] editTextBoldCursorArr = ((wb0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.K3(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 22:
                zb0 zb0Var = (zb0) obj;
                org.telegram.ui.Components.dh0 dh0Var = zb0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = zb0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    ee0.b1(zb0Var.D, editTextBoldCursor2);
                    dh0Var.getAnimatedDrawable().N(0, false, false);
                    dh0Var.d();
                    break;
                }
                break;
            case 23:
                ((org.telegram.ui.Components.dh0) obj).d();
                break;
            case 24:
                ((gc0) ((ah.i) obj).H1).getClass();
                break;
            case 25:
                double currentTimeMillis2 = System.currentTimeMillis();
                gc0 gc0Var = (gc0) ((fi.h2) obj).b;
                double d = gc0Var.Q;
                gd0 gd0Var = gc0Var.w;
                gc0Var.Q = currentTimeMillis2;
                int i16 = (int) (gc0Var.P - (currentTimeMillis2 - d));
                gc0Var.P = i16;
                if (i16 >= 1000) {
                    int i17 = i16 / 1000;
                    int i18 = i17 / 60;
                    int i19 = i17 - (i18 * 60);
                    gd0Var.setTextSize(1, 13.0f);
                    int i20 = gc0Var.E;
                    if (i20 != 4 && i20 != 3 && i20 != 11) {
                        if (i20 == 2) {
                            gd0Var.setText(org.telegram.messenger.id.a0(null, null, 2131745296, Integer.valueOf(i18), Integer.valueOf(i19)));
                            break;
                        }
                    } else {
                        gd0Var.setText(org.telegram.messenger.id.a0(null, null, 2131752629, Integer.valueOf(i18), Integer.valueOf(i19)));
                        break;
                    }
                } else {
                    gc0Var.q();
                    int i21 = gc0Var.E;
                    if (i21 == 3 || i21 == 4 || i21 == 2 || i21 == 11) {
                        gd0Var.setTextSize(1, 15.0f);
                        int i22 = gc0Var.E;
                        if (i22 == 4) {
                            gd0Var.setText(org.telegram.messenger.id.M0(2131746177, null));
                        } else if (i22 == 15) {
                            gd0Var.setText(org.telegram.messenger.id.M0(2131751447, null));
                        } else if (i22 == 11 || i22 == 3) {
                            gd0Var.setText(org.telegram.messenger.id.M0(2131746176, null));
                        } else {
                            gd0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.id.M0(2131746178, null), true, 0.0f, 0.0f));
                        }
                        int i23 = org.telegram.ui.ActionBar.l6.P9;
                        org.telegram.ui.ActionBar.s6.U(gd0Var, i23, null);
                        gd0Var.setTag(R.id.color_key_tag, Integer.valueOf(i23));
                        break;
                    }
                }
                break;
            case 26:
                double currentTimeMillis3 = System.currentTimeMillis();
                id0 id0Var = ((hd0) obj).b;
                double d2 = currentTimeMillis3 - id0Var.d0;
                id0Var.d0 = currentTimeMillis3;
                int i24 = (int) (id0Var.b0 - d2);
                id0Var.b0 = i24;
                if (i24 <= 1000) {
                    id0Var.setProblemTextVisible(true);
                    id0Var.w.setVisibility(8);
                    gd0 gd0Var2 = id0Var.y;
                    if (gd0Var2 != null) {
                        gd0Var2.setVisibility(0);
                    }
                    id0Var.t();
                    break;
                }
                break;
            case 27:
                double currentTimeMillis4 = System.currentTimeMillis();
                id0 id0Var2 = ((hd0) obj).b;
                double d10 = id0Var2.c0;
                gd0 gd0Var3 = id0Var2.w;
                id0Var2.c0 = currentTimeMillis4;
                int i25 = (int) (id0Var2.a0 - (currentTimeMillis4 - d10));
                id0Var2.a0 = i25;
                if (i25 >= 1000) {
                    int i26 = i25 / 1000;
                    int i27 = i26 / 60;
                    int i28 = i26 - (i27 * 60);
                    int i29 = id0Var2.i0;
                    if (i29 != 4 && i29 != 3 && i29 != 11) {
                        if (id0Var2.h0 != 2 || (i29 != 2 && i29 != 17 && i29 != 16)) {
                            if (i29 == 2 || i29 == 17 || i29 == 16) {
                                gd0Var3.setText(org.telegram.messenger.id.a0("SmsAvailableIn", null, 2131745297, Integer.valueOf(i27), Integer.valueOf(i28)));
                                break;
                            }
                        } else {
                            gd0Var3.setText(org.telegram.messenger.id.a0("ResendSmsAvailableIn", null, 2131746119, Integer.valueOf(i27), Integer.valueOf(i28)));
                            break;
                        }
                    } else {
                        gd0Var3.setText(org.telegram.messenger.id.a0("CallAvailableIn", null, 2131752630, Integer.valueOf(i27), Integer.valueOf(i28)));
                        break;
                    }
                } else {
                    id0Var2.u();
                    int i30 = id0Var2.i0;
                    if (i30 == 3 || i30 == 4 || i30 == 2 || i30 == 17 || i30 == 16 || i30 == 11) {
                        if (i30 == 4) {
                            gd0Var3.setText(org.telegram.messenger.id.M0(2131746177, "RequestCallButton"));
                        } else if (i30 == 11 || i30 == 3) {
                            gd0Var3.setText(org.telegram.messenger.id.M0(2131746176, null));
                        } else {
                            gd0Var3.setText(org.telegram.messenger.id.M0(2131746175, "RequestSmsButton"));
                        }
                        int i31 = org.telegram.ui.ActionBar.l6.P9;
                        org.telegram.ui.ActionBar.s6.U(gd0Var3, i31, null);
                        gd0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i31));
                        break;
                    }
                }
            case 28:
                ((org.telegram.ui.Components.ln0) obj).run();
                break;
            default:
                ((ne0) obj).setSkipDrawSelector(false);
                break;
        }
    }
}
