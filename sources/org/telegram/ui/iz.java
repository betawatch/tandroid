package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class iz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iz(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        s50 s50Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i10 = this.a;
        int i11 = 2;
        Object obj = this.b;
        switch (i10) {
            case 0:
                zz zzVar = (zz) obj;
                org.telegram.messenger.g0.r(zzVar.o0);
                zzVar.a.a(false, true);
                break;
            case 1:
                zz zzVar2 = ((oz) obj).a;
                zzVar2.h(zzVar2.F, zzVar2.G, zzVar2.I, zzVar2.H, zzVar2.E, zzVar2.K, zzVar2.x, false);
                break;
            case 2:
                ((FiltersSetupActivity) ((ct) obj).g3).getMessagesController().i3();
                break;
            case 3:
                c00 c00Var = (c00) obj;
                c00Var.s.a();
                c00Var.n.invalidate();
                c00Var.I.g0(true);
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((org.telegram.ui.Components.hz) obj).f;
                if (!org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).q()) {
                    ArrayList T0 = filtersSetupActivity.getMessagesController().T0();
                    int i12 = 0;
                    while (true) {
                        if (i12 < T0.size()) {
                            if (!((org.telegram.messenger.so) T0.get(i12)).e() || i12 == 0) {
                                i12++;
                            } else {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.b.e;
                                ArrayList arrayList = filtersSetupActivity2.getMessagesController().Q0;
                                if (i12 < 0 || i12 >= arrayList.size()) {
                                    i7 = 1;
                                } else {
                                    arrayList.add(0, (org.telegram.messenger.so) arrayList.remove(i12));
                                    for (int i13 = 0; i13 <= i12; i13++) {
                                        ((org.telegram.messenger.so) arrayList.get(i13)).f = i13;
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
                                org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(filtersSetupActivity);
                                Object[] objArr = new Object[i7];
                                objArr[0] = org.telegram.messenger.hd.M0(2131750807, null);
                                a02.J(R.raw.filter_reorder, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("LimitReachedReorderFolder", null, 2131748944, objArr)), org.telegram.messenger.hd.M0(2131747033, null), 5000, false, new a00(filtersSetupActivity, i11)).j();
                            }
                        }
                    }
                }
                filtersSetupActivity.f0(null);
                break;
            case 5:
                c40 c40Var = ((o10) obj).b;
                c40Var.i4 = null;
                c40Var.R1(c40Var.E3, true);
                break;
            case 6:
                ((i30) obj).requestLayout();
                break;
            case 7:
                l30 l30Var = (l30) obj;
                c40 c40Var2 = l30Var.f;
                a20 a20Var = c40Var2.m1;
                org.telegram.messenger.gc gcVar = l30Var.d;
                if (gcVar != null) {
                    a20Var.L0 = gcVar;
                    a20Var.r1 = null;
                    a20Var.s1 = null;
                    l30Var.d = null;
                }
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(c40Var2.o1.a).M0(Long.valueOf(-l30Var.e));
                org.telegram.messenger.gc a10 = org.telegram.messenger.gc.a(0, M0);
                org.telegram.messenger.gc a11 = org.telegram.messenger.gc.a(1, M0);
                if (org.telegram.messenger.gc.e(l30Var.b) == null) {
                    a11 = org.telegram.messenger.gc.e(l30Var.c);
                }
                a20Var.setCreateThumbFromParent(false);
                a20Var.H(null, a10, a11, true);
                l30Var.c = null;
                l30Var.b = null;
                org.telegram.messenger.g0.a4(c40Var2.L1);
                l30Var.a(1.0f);
                break;
            case 8:
                rv rvVar = (rv) ((g.b) obj).i;
                if (rvVar != null) {
                    rvVar.invalidate();
                    break;
                }
                break;
            case 9:
                c50 c50Var = (c50) obj;
                c50Var.E = null;
                c50Var.F = null;
                c50Var.G = null;
                c50Var.H = null;
                c50Var.J = null;
                c50Var.I = null;
                c50Var.K = 0.0d;
                c50Var.e0(false, true);
                c50Var.d.j(null, null, c50Var.r, null);
                c50Var.f.setAnimation(c50Var.S);
                c50Var.S.M(0);
                break;
            case 10:
                org.telegram.messenger.k5.n(null, 2131749378, org.telegram.ui.Components.cc.a0(((f50) obj).c), R.raw.done, 36);
                break;
            case 11:
                t50 t50Var = (t50) obj;
                s50 s50Var2 = t50Var.J;
                int i14 = org.telegram.ui.ActionBar.j6.d6;
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, i14, false);
                int i15 = s50.E;
                s50Var2.a(R.drawable.intro_powerful_mask, 17, x02, true);
                t50Var.J.c();
                s50 s50Var3 = t50Var.J;
                s50Var3.b(s50Var3.w, 23, true);
                t50Var.J.d();
                Intro.a(org.telegram.ui.ActionBar.j6.x0(null, i14, false));
                break;
            case 12:
                r50 r50Var = (r50) obj;
                r50Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                t50 t50Var2 = (t50) r50Var.b;
                Intro.setPage(t50Var2.I);
                Intro.setDate((currentTimeMillis - t50Var2.K) / 1000.0f);
                Intro.onDrawFrame(0);
                s50 s50Var4 = t50Var2.J;
                if (s50Var4 != null && s50Var4.isAlive() && (eGLDisplay = (s50Var = t50Var2.J).c) != null && (eGLSurface = s50Var.f) != null) {
                    try {
                        s50Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 13:
                t50 t50Var3 = (t50) ((org.telegram.messenger.ms) obj).c;
                t50Var3.presentFragment(new ce0(), true);
                t50Var3.N = true;
                break;
            case 14:
                ((s50) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 15:
                x50 x50Var = (x50) obj;
                x50Var.f.e.smoothScrollTo(0, x50Var.getHeight());
                break;
            case 16:
                ((vf.b) obj).b();
                break;
            case 17:
                ((k80) obj).a.B0.setVisibility(8);
                break;
            case 18:
                v80 v80Var = (v80) obj;
                LaunchActivity launchActivity = v80Var.c;
                launchActivity.O0 = false;
                boolean z10 = launchActivity.N0;
                launchActivity.E();
                if (z10 != launchActivity.N0) {
                    v80Var.requestLayout();
                    break;
                }
                break;
            case 19:
                o90 o90Var = (o90) obj;
                ci.z0 z0Var = o90Var.d;
                if (z0Var != null) {
                    o90Var.i0(z0Var.getCurrentLink());
                    break;
                }
                break;
            case 20:
                try {
                    org.telegram.ui.Components.uj0 currentListView = ((pa0) ((oa0) obj).j0).M0.getCurrentListView();
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
                    org.telegram.messenger.g0.J3(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 22:
                wb0 wb0Var = (wb0) obj;
                org.telegram.ui.Components.fh0 fh0Var = wb0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = wb0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    ce0.b1(wb0Var.E, editTextBoldCursor2);
                    fh0Var.getAnimatedDrawable().N(0, false, false);
                    fh0Var.d();
                    break;
                }
                break;
            case 23:
                ((org.telegram.ui.Components.fh0) obj).d();
                break;
            case 24:
                ((dc0) ((ah.i) obj).N1).getClass();
                break;
            case 25:
                double currentTimeMillis2 = System.currentTimeMillis();
                dc0 dc0Var = (dc0) ((h6.r) obj).b;
                double d = dc0Var.R;
                cd0 cd0Var = dc0Var.w;
                dc0Var.R = currentTimeMillis2;
                int i16 = (int) (dc0Var.Q - (currentTimeMillis2 - d));
                dc0Var.Q = i16;
                if (i16 >= 1000) {
                    int i17 = i16 / 1000;
                    int i18 = i17 / 60;
                    int i19 = i17 - (i18 * 60);
                    cd0Var.setTextSize(1, 13.0f);
                    int i20 = dc0Var.F;
                    if (i20 != 4 && i20 != 3 && i20 != 11) {
                        if (i20 == 2) {
                            cd0Var.setText(org.telegram.messenger.hd.a0(null, null, 2131745296, Integer.valueOf(i18), Integer.valueOf(i19)));
                            break;
                        }
                    } else {
                        cd0Var.setText(org.telegram.messenger.hd.a0(null, null, 2131752629, Integer.valueOf(i18), Integer.valueOf(i19)));
                        break;
                    }
                } else {
                    dc0Var.q();
                    int i21 = dc0Var.F;
                    if (i21 == 3 || i21 == 4 || i21 == 2 || i21 == 11) {
                        cd0Var.setTextSize(1, 15.0f);
                        int i22 = dc0Var.F;
                        if (i22 == 4) {
                            cd0Var.setText(org.telegram.messenger.hd.M0(2131746177, null));
                        } else if (i22 == 15) {
                            cd0Var.setText(org.telegram.messenger.hd.M0(2131751447, null));
                        } else if (i22 == 11 || i22 == 3) {
                            cd0Var.setText(org.telegram.messenger.hd.M0(2131746176, null));
                        } else {
                            cd0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.hd.M0(2131746178, null), true, 0.0f, 0.0f));
                        }
                        int i23 = org.telegram.ui.ActionBar.j6.P9;
                        org.telegram.ui.ActionBar.q6.U(cd0Var, i23, null);
                        cd0Var.setTag(R.id.color_key_tag, Integer.valueOf(i23));
                        break;
                    }
                }
                break;
            case 26:
                double currentTimeMillis3 = System.currentTimeMillis();
                ed0 ed0Var = ((dd0) obj).b;
                double d2 = currentTimeMillis3 - ed0Var.e0;
                ed0Var.e0 = currentTimeMillis3;
                int i24 = (int) (ed0Var.c0 - d2);
                ed0Var.c0 = i24;
                if (i24 <= 1000) {
                    ed0Var.setProblemTextVisible(true);
                    ed0Var.w.setVisibility(8);
                    cd0 cd0Var2 = ed0Var.y;
                    if (cd0Var2 != null) {
                        cd0Var2.setVisibility(0);
                    }
                    ed0Var.t();
                    break;
                }
                break;
            case 27:
                double currentTimeMillis4 = System.currentTimeMillis();
                ed0 ed0Var2 = ((dd0) obj).b;
                double d10 = ed0Var2.d0;
                cd0 cd0Var3 = ed0Var2.w;
                ed0Var2.d0 = currentTimeMillis4;
                int i25 = (int) (ed0Var2.b0 - (currentTimeMillis4 - d10));
                ed0Var2.b0 = i25;
                if (i25 >= 1000) {
                    int i26 = i25 / 1000;
                    int i27 = i26 / 60;
                    int i28 = i26 - (i27 * 60);
                    int i29 = ed0Var2.j0;
                    if (i29 != 4 && i29 != 3 && i29 != 11) {
                        if (ed0Var2.i0 != 2 || (i29 != 2 && i29 != 17 && i29 != 16)) {
                            if (i29 == 2 || i29 == 17 || i29 == 16) {
                                cd0Var3.setText(org.telegram.messenger.hd.a0("SmsAvailableIn", null, 2131745297, Integer.valueOf(i27), Integer.valueOf(i28)));
                                break;
                            }
                        } else {
                            cd0Var3.setText(org.telegram.messenger.hd.a0("ResendSmsAvailableIn", null, 2131746119, Integer.valueOf(i27), Integer.valueOf(i28)));
                            break;
                        }
                    } else {
                        cd0Var3.setText(org.telegram.messenger.hd.a0("CallAvailableIn", null, 2131752630, Integer.valueOf(i27), Integer.valueOf(i28)));
                        break;
                    }
                } else {
                    ed0Var2.u();
                    int i30 = ed0Var2.j0;
                    if (i30 == 3 || i30 == 4 || i30 == 2 || i30 == 17 || i30 == 16 || i30 == 11) {
                        if (i30 == 4) {
                            cd0Var3.setText(org.telegram.messenger.hd.M0(2131746177, "RequestCallButton"));
                        } else if (i30 == 11 || i30 == 3) {
                            cd0Var3.setText(org.telegram.messenger.hd.M0(2131746176, null));
                        } else {
                            cd0Var3.setText(org.telegram.messenger.hd.M0(2131746175, "RequestSmsButton"));
                        }
                        int i31 = org.telegram.ui.ActionBar.j6.P9;
                        org.telegram.ui.ActionBar.q6.U(cd0Var3, i31, null);
                        cd0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i31));
                        break;
                    }
                }
            case 28:
                ((org.telegram.ui.Components.ma0) obj).run();
                break;
            default:
                ((le0) obj).setSkipDrawSelector(false);
                break;
        }
    }
}
