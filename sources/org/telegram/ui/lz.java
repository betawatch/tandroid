package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lz(Object obj, int i7) {
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
                c00 c00Var = (c00) obj;
                org.telegram.messenger.g0.r(c00Var.o0);
                c00Var.a.a(false, true);
                break;
            case 1:
                c00 c00Var2 = ((rz) obj).a;
                c00Var2.h(c00Var2.F, c00Var2.G, c00Var2.I, c00Var2.H, c00Var2.E, c00Var2.K, c00Var2.x, false);
                break;
            case 2:
                ((FiltersSetupActivity) ((et) obj).g3).getMessagesController().p3();
                break;
            case 3:
                f00 f00Var = (f00) obj;
                f00Var.s.a();
                f00Var.n.invalidate();
                f00Var.I.g0(true);
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((org.telegram.ui.Components.qz) obj).f;
                if (!org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).q()) {
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
                                org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(filtersSetupActivity);
                                Object[] objArr = new Object[i7];
                                objArr[0] = org.telegram.messenger.gd.N0(2131750795, null);
                                b02.J(R.raw.filter_reorder, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("LimitReachedReorderFolder", null, 2131748751, objArr)), org.telegram.messenger.gd.N0(2131746839, null), 5000, false, new d00(filtersSetupActivity, i11)).j();
                            }
                        }
                    }
                }
                filtersSetupActivity.f0(null);
                break;
            case 5:
                f40 f40Var = ((r10) obj).b;
                f40Var.i4 = null;
                f40Var.S1(f40Var.E3, true);
                break;
            case 6:
                ((l30) obj).requestLayout();
                break;
            case 7:
                o30 o30Var = (o30) obj;
                f40 f40Var2 = o30Var.f;
                d20 d20Var = f40Var2.m1;
                org.telegram.messenger.fc fcVar = o30Var.d;
                if (fcVar != null) {
                    d20Var.L0 = fcVar;
                    d20Var.r1 = null;
                    d20Var.s1 = null;
                    o30Var.d = null;
                }
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(f40Var2.o1.a).O0(Long.valueOf(-o30Var.e));
                org.telegram.messenger.fc a10 = org.telegram.messenger.fc.a(0, O0);
                org.telegram.messenger.fc a11 = org.telegram.messenger.fc.a(1, O0);
                if (org.telegram.messenger.fc.e(o30Var.b) == null) {
                    a11 = org.telegram.messenger.fc.e(o30Var.c);
                }
                d20Var.setCreateThumbFromParent(false);
                d20Var.H(null, a10, a11, true);
                o30Var.c = null;
                o30Var.b = null;
                org.telegram.messenger.g0.Z3(f40Var2.L1);
                o30Var.a(1.0f);
                break;
            case 8:
                uv uvVar = (uv) ((g.b) obj).i;
                if (uvVar != null) {
                    uvVar.invalidate();
                    break;
                }
                break;
            case 9:
                f50 f50Var = (f50) obj;
                f50Var.E = null;
                f50Var.F = null;
                f50Var.G = null;
                f50Var.H = null;
                f50Var.J = null;
                f50Var.I = null;
                f50Var.K = 0.0d;
                f50Var.e0(false, true);
                f50Var.d.j(null, null, f50Var.r, null);
                f50Var.f.setAnimation(f50Var.S);
                f50Var.S.M(0);
                break;
            case 10:
                org.telegram.messenger.f3.n(null, 2131749185, org.telegram.ui.Components.lc.b0(((i50) obj).c), R.raw.done, 36);
                break;
            case 11:
                v50 v50Var = (v50) obj;
                u50 u50Var2 = v50Var.J;
                int i14 = org.telegram.ui.ActionBar.m6.d6;
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, i14, false);
                int i15 = u50.E;
                u50Var2.a(R.drawable.intro_powerful_mask, 17, x02, true);
                v50Var.J.c();
                u50 u50Var3 = v50Var.J;
                u50Var3.b(u50Var3.w, 23, true);
                v50Var.J.d();
                Intro.a(org.telegram.ui.ActionBar.m6.x0(null, i14, false));
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
                ((n80) obj).a.B0.setVisibility(8);
                break;
            case 18:
                y80 y80Var = (y80) obj;
                LaunchActivity launchActivity = y80Var.c;
                launchActivity.O0 = false;
                boolean z10 = launchActivity.N0;
                launchActivity.E();
                if (z10 != launchActivity.N0) {
                    y80Var.requestLayout();
                    break;
                }
                break;
            case 19:
                q90 q90Var = (q90) obj;
                ci.z0 z0Var = q90Var.d;
                if (z0Var != null) {
                    q90Var.i0(z0Var.getCurrentLink());
                    break;
                }
                break;
            case 20:
                try {
                    org.telegram.ui.Components.ek0 currentListView = ((qa0) ((pa0) obj).j0).R0.getCurrentListView();
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
                    org.telegram.messenger.g0.I3(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 22:
                xb0 xb0Var = (xb0) obj;
                org.telegram.ui.Components.rh0 rh0Var = xb0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = xb0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    de0.b1(xb0Var.E, editTextBoldCursor2);
                    rh0Var.getAnimatedDrawable().N(0, false, false);
                    rh0Var.d();
                    break;
                }
                break;
            case 23:
                ((org.telegram.ui.Components.rh0) obj).d();
                break;
            case 24:
                ((ec0) ((ah.i) obj).N1).getClass();
                break;
            case 25:
                double currentTimeMillis2 = System.currentTimeMillis();
                ec0 ec0Var = (ec0) ((h6.r) obj).b;
                double d = ec0Var.R;
                ed0 ed0Var = ec0Var.w;
                ec0Var.R = currentTimeMillis2;
                int i16 = (int) (ec0Var.Q - (currentTimeMillis2 - d));
                ec0Var.Q = i16;
                if (i16 >= 1000) {
                    int i17 = i16 / 1000;
                    int i18 = i17 / 60;
                    int i19 = i17 - (i18 * 60);
                    ed0Var.setTextSize(1, 13.0f);
                    int i20 = ec0Var.F;
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
                    ec0Var.q();
                    int i21 = ec0Var.F;
                    if (i21 == 3 || i21 == 4 || i21 == 2 || i21 == 11) {
                        ed0Var.setTextSize(1, 15.0f);
                        int i22 = ec0Var.F;
                        if (i22 == 4) {
                            ed0Var.setText(org.telegram.messenger.gd.N0(2131745981, null));
                        } else if (i22 == 15) {
                            ed0Var.setText(org.telegram.messenger.gd.N0(2131751435, null));
                        } else if (i22 == 11 || i22 == 3) {
                            ed0Var.setText(org.telegram.messenger.gd.N0(2131745980, null));
                        } else {
                            ed0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.gd.N0(2131745982, null), true, 0.0f, 0.0f));
                        }
                        int i23 = org.telegram.ui.ActionBar.m6.P9;
                        org.telegram.ui.ActionBar.t6.U(ed0Var, i23, null);
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
                        int i31 = org.telegram.ui.ActionBar.m6.P9;
                        org.telegram.ui.ActionBar.t6.U(ed0Var3, i31, null);
                        ed0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i31));
                        break;
                    }
                }
            case 28:
                ((org.telegram.ui.Components.q20) obj).run();
                break;
            default:
                ((oe0) obj).setSkipDrawSelector(false);
                break;
        }
    }
}
