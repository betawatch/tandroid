package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fz(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        n50 n50Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i10 = this.a;
        int i11 = 2;
        Object obj = this.b;
        switch (i10) {
            case 0:
                wz wzVar = (wz) obj;
                org.telegram.messenger.g0.r(wzVar.o0);
                wzVar.a.a(false, true);
                break;
            case 1:
                wz wzVar2 = ((lz) obj).a;
                wzVar2.h(wzVar2.F, wzVar2.G, wzVar2.I, wzVar2.H, wzVar2.E, wzVar2.K, wzVar2.x, false);
                break;
            case 2:
                ((FiltersSetupActivity) ((xs) obj).g3).getMessagesController().i3();
                break;
            case 3:
                yz yzVar = (yz) obj;
                yzVar.s.a();
                yzVar.n.invalidate();
                yzVar.I.g0(true);
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((org.telegram.ui.Components.az) obj).f;
                if (!org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).q()) {
                    ArrayList T0 = filtersSetupActivity.getMessagesController().T0();
                    int i12 = 0;
                    while (true) {
                        if (i12 < T0.size()) {
                            if (!((org.telegram.messenger.mo) T0.get(i12)).e() || i12 == 0) {
                                i12++;
                            } else {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.b.e;
                                ArrayList arrayList = filtersSetupActivity2.getMessagesController().Q0;
                                if (i12 < 0 || i12 >= arrayList.size()) {
                                    i3 = 1;
                                } else {
                                    arrayList.add(0, (org.telegram.messenger.mo) arrayList.remove(i12));
                                    for (int i13 = 0; i13 <= i12; i13++) {
                                        ((org.telegram.messenger.mo) arrayList.get(i13)).f = i13;
                                    }
                                    i3 = 1;
                                    filtersSetupActivity2.e = true;
                                    filtersSetupActivity2.g0(true);
                                }
                                filtersSetupActivity.a.v0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i3);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(filtersSetupActivity);
                                Object[] objArr = new Object[i3];
                                objArr[0] = org.telegram.messenger.bd.M0(2131750808, null);
                                a02.J(R.raw.filter_reorder, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("LimitReachedReorderFolder", null, 2131748952, objArr)), org.telegram.messenger.bd.M0(2131747041, null), 5000, false, new xz(filtersSetupActivity, i11)).j();
                            }
                        }
                    }
                }
                filtersSetupActivity.f0(null);
                break;
            case 5:
                x30 x30Var = ((k10) obj).b;
                x30Var.b4 = null;
                x30Var.M1(x30Var.x3, true);
                break;
            case 6:
                g30 g30Var = (g30) obj;
                x30 x30Var2 = g30Var.f;
                w10 w10Var = x30Var2.j1;
                org.telegram.messenger.ac acVar = g30Var.d;
                if (acVar != null) {
                    w10Var.L0 = acVar;
                    w10Var.r1 = null;
                    w10Var.s1 = null;
                    g30Var.d = null;
                }
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(x30Var2.l1.a).M0(Long.valueOf(-g30Var.e));
                org.telegram.messenger.ac a10 = org.telegram.messenger.ac.a(0, M0);
                org.telegram.messenger.ac a11 = org.telegram.messenger.ac.a(1, M0);
                if (org.telegram.messenger.ac.e(g30Var.b) == null) {
                    a11 = org.telegram.messenger.ac.e(g30Var.c);
                }
                w10Var.setCreateThumbFromParent(false);
                w10Var.H(null, a10, a11, true);
                g30Var.c = null;
                g30Var.b = null;
                org.telegram.messenger.g0.b4(x30Var2.I1);
                g30Var.a(1.0f);
                break;
            case 7:
                org.telegram.ui.Components.voip.r0 r0Var = (org.telegram.ui.Components.voip.r0) ((g.b) obj).i;
                if (r0Var != null) {
                    r0Var.invalidate();
                    break;
                }
                break;
            case 8:
                y40 y40Var = (y40) obj;
                y40Var.E = null;
                y40Var.F = null;
                y40Var.G = null;
                y40Var.H = null;
                y40Var.J = null;
                y40Var.I = null;
                y40Var.K = 0.0d;
                y40Var.e0(false, true);
                y40Var.d.j(null, null, y40Var.r, null);
                y40Var.f.setAnimation(y40Var.S);
                y40Var.S.M(0);
                break;
            case 9:
                org.telegram.messenger.k5.o(null, 2131749386, org.telegram.ui.Components.fc.a0(((b50) obj).c), R.raw.done, 36);
                break;
            case 10:
                o50 o50Var = (o50) obj;
                n50 n50Var2 = o50Var.J;
                int i14 = org.telegram.ui.ActionBar.k6.d6;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
                int i15 = n50.E;
                n50Var2.a(R.drawable.intro_powerful_mask, 17, x02, true);
                o50Var.J.c();
                n50 n50Var3 = o50Var.J;
                n50Var3.b(n50Var3.w, 23, true);
                o50Var.J.e();
                Intro.a(org.telegram.ui.ActionBar.k6.x0(null, i14, false));
                break;
            case 11:
                m50 m50Var = (m50) obj;
                m50Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                o50 o50Var2 = (o50) m50Var.b;
                Intro.setPage(o50Var2.I);
                Intro.setDate((currentTimeMillis - o50Var2.K) / 1000.0f);
                Intro.onDrawFrame(0);
                n50 n50Var4 = o50Var2.J;
                if (n50Var4 != null && n50Var4.isAlive() && (eGLDisplay = (n50Var = o50Var2.J).c) != null && (eGLSurface = n50Var.f) != null) {
                    try {
                        n50Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 12:
                o50 o50Var3 = (o50) ((org.telegram.messenger.gs) obj).c;
                o50Var3.presentFragment(new xd0(), true);
                o50Var3.N = true;
                break;
            case 13:
                ((n50) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 14:
                s50 s50Var = (s50) obj;
                s50Var.f.e.smoothScrollTo(0, s50Var.getHeight());
                break;
            case 15:
                ((sf.b) obj).b();
                break;
            case 16:
                g80 g80Var = (g80) obj;
                LaunchActivity launchActivity = g80Var.c;
                launchActivity.Q0 = false;
                boolean z10 = launchActivity.P0;
                launchActivity.E();
                if (z10 != launchActivity.P0) {
                    g80Var.requestLayout();
                    break;
                }
                break;
            case 17:
                ((h80) obj).a.D0.setVisibility(8);
                break;
            case 18:
                k90 k90Var = (k90) obj;
                bi.a1 a1Var = k90Var.d;
                if (a1Var != null) {
                    k90Var.i0(a1Var.getCurrentLink());
                    break;
                }
                break;
            case 19:
                try {
                    org.telegram.ui.Components.tj0 currentListView = ((la0) ((ka0) obj).j0).M0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 20:
                EditTextBoldCursor[] editTextBoldCursorArr = ((qb0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.K3(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 21:
                vb0 vb0Var = (vb0) obj;
                org.telegram.ui.Components.fh0 fh0Var = vb0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = vb0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    xd0.a1(vb0Var.E, editTextBoldCursor2);
                    fh0Var.getAnimatedDrawable().N(0, false, false);
                    fh0Var.d();
                    break;
                }
                break;
            case 22:
                ((org.telegram.ui.Components.fh0) obj).d();
                break;
            case 23:
                ((cc0) ((bh.g) obj).I1).getClass();
                break;
            case 24:
                double currentTimeMillis2 = System.currentTimeMillis();
                cc0 cc0Var = (cc0) ((g6.q) obj).b;
                double d = cc0Var.R;
                bd0 bd0Var = cc0Var.w;
                cc0Var.R = currentTimeMillis2;
                int i16 = (int) (cc0Var.Q - (currentTimeMillis2 - d));
                cc0Var.Q = i16;
                if (i16 >= 1000) {
                    int i17 = i16 / 1000;
                    int i18 = i17 / 60;
                    int i19 = i17 - (i18 * 60);
                    bd0Var.setTextSize(1, 13.0f);
                    int i20 = cc0Var.F;
                    if (i20 != 4 && i20 != 3 && i20 != 11) {
                        if (i20 == 2) {
                            bd0Var.setText(org.telegram.messenger.bd.a0(null, null, 2131745306, Integer.valueOf(i18), Integer.valueOf(i19)));
                            break;
                        }
                    } else {
                        bd0Var.setText(org.telegram.messenger.bd.a0(null, null, 2131752629, Integer.valueOf(i18), Integer.valueOf(i19)));
                        break;
                    }
                } else {
                    cc0Var.q();
                    int i21 = cc0Var.F;
                    if (i21 == 3 || i21 == 4 || i21 == 2 || i21 == 11) {
                        bd0Var.setTextSize(1, 15.0f);
                        int i22 = cc0Var.F;
                        if (i22 == 4) {
                            bd0Var.setText(org.telegram.messenger.bd.M0(2131746187, null));
                        } else if (i22 == 15) {
                            bd0Var.setText(org.telegram.messenger.bd.M0(2131751448, null));
                        } else if (i22 == 11 || i22 == 3) {
                            bd0Var.setText(org.telegram.messenger.bd.M0(2131746186, null));
                        } else {
                            bd0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.bd.M0(2131746188, null), true, 0.0f, 0.0f));
                        }
                        int i23 = org.telegram.ui.ActionBar.k6.P9;
                        org.telegram.ui.ActionBar.r6.V(bd0Var, i23, null);
                        bd0Var.setTag(R.id.color_key_tag, Integer.valueOf(i23));
                        break;
                    }
                }
                break;
            case 25:
                double currentTimeMillis3 = System.currentTimeMillis();
                dd0 dd0Var = ((cd0) obj).b;
                double d10 = currentTimeMillis3 - dd0Var.e0;
                dd0Var.e0 = currentTimeMillis3;
                int i24 = (int) (dd0Var.c0 - d10);
                dd0Var.c0 = i24;
                if (i24 <= 1000) {
                    dd0Var.setProblemTextVisible(true);
                    dd0Var.w.setVisibility(8);
                    bd0 bd0Var2 = dd0Var.y;
                    if (bd0Var2 != null) {
                        bd0Var2.setVisibility(0);
                    }
                    dd0Var.t();
                    break;
                }
                break;
            case 26:
                double currentTimeMillis4 = System.currentTimeMillis();
                dd0 dd0Var2 = ((cd0) obj).b;
                double d11 = dd0Var2.d0;
                bd0 bd0Var3 = dd0Var2.w;
                dd0Var2.d0 = currentTimeMillis4;
                int i25 = (int) (dd0Var2.b0 - (currentTimeMillis4 - d11));
                dd0Var2.b0 = i25;
                if (i25 >= 1000) {
                    int i26 = i25 / 1000;
                    int i27 = i26 / 60;
                    int i28 = i26 - (i27 * 60);
                    int i29 = dd0Var2.j0;
                    if (i29 != 4 && i29 != 3 && i29 != 11) {
                        if (dd0Var2.i0 != 2 || (i29 != 2 && i29 != 17 && i29 != 16)) {
                            if (i29 == 2 || i29 == 17 || i29 == 16) {
                                bd0Var3.setText(org.telegram.messenger.bd.a0("SmsAvailableIn", null, 2131745307, Integer.valueOf(i27), Integer.valueOf(i28)));
                                break;
                            }
                        } else {
                            bd0Var3.setText(org.telegram.messenger.bd.a0("ResendSmsAvailableIn", null, 2131746129, Integer.valueOf(i27), Integer.valueOf(i28)));
                            break;
                        }
                    } else {
                        bd0Var3.setText(org.telegram.messenger.bd.a0("CallAvailableIn", null, 2131752630, Integer.valueOf(i27), Integer.valueOf(i28)));
                        break;
                    }
                } else {
                    dd0Var2.u();
                    int i30 = dd0Var2.j0;
                    if (i30 == 3 || i30 == 4 || i30 == 2 || i30 == 17 || i30 == 16 || i30 == 11) {
                        if (i30 == 4) {
                            bd0Var3.setText(org.telegram.messenger.bd.M0(2131746187, "RequestCallButton"));
                        } else if (i30 == 11 || i30 == 3) {
                            bd0Var3.setText(org.telegram.messenger.bd.M0(2131746186, null));
                        } else {
                            bd0Var3.setText(org.telegram.messenger.bd.M0(2131746185, "RequestSmsButton"));
                        }
                        int i31 = org.telegram.ui.ActionBar.k6.P9;
                        org.telegram.ui.ActionBar.r6.V(bd0Var3, i31, null);
                        bd0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i31));
                        break;
                    }
                }
            case 27:
                ((org.telegram.ui.Components.v60) obj).run();
                break;
            case 28:
                ((ge0) obj).setSkipDrawSelector(false);
                break;
            default:
                ((org.telegram.ui.Components.ai) obj).setVisibility(8);
                break;
        }
    }
}
