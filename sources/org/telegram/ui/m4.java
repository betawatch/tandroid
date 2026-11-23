package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x0270, code lost:
    
        if (r2.f.equals(r2.b.eglGetCurrentSurface(12377)) == false) goto L142;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.Components.voip.s h12;
        org.telegram.ui.Components.voip.z renderer;
        org.telegram.ui.Components.voip.v vVar;
        TLRPC.User c22;
        int i7;
        switch (this.a) {
            case 0:
                UsersSelectActivity usersSelectActivity = new UsersSelectActivity(null);
                usersSelectActivity.P = new a0.h();
                usersSelectActivity.Q = new ArrayList();
                usersSelectActivity.y = 1;
                usersSelectActivity.H = false;
                p4 p4Var = (p4) this.b;
                usersSelectActivity.T = p4Var.Z();
                usersSelectActivity.n = new w0(this, 2);
                p4Var.presentFragment(usersSelectActivity);
                break;
            case 1:
                BubbleActivity bubbleActivity = (BubbleActivity) this.b;
                if (bubbleActivity.Z == this) {
                    if (org.telegram.messenger.g0.p2(true)) {
                        if (org.telegram.messenger.s2.a) {
                            org.telegram.messenger.a8.b("lock app");
                        }
                        bubbleActivity.y();
                    } else if (org.telegram.messenger.s2.a) {
                        org.telegram.messenger.a8.b("didn't pass lock check");
                    }
                    bubbleActivity.Z = null;
                    break;
                }
                break;
            case 2:
                t9 t9Var = (t9) this.b;
                CameraView cameraView = t9Var.d;
                if (cameraView != null && !t9Var.O && cameraView.getCameraSession() != null) {
                    t9Var.f.post(new hq0(this, 17));
                    break;
                }
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.b.Z();
                contactsActivity.g0 = false;
                break;
            case 4:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                if (externalActionActivity.x == this) {
                    if (org.telegram.messenger.g0.p2(true)) {
                        if (org.telegram.messenger.s2.a) {
                            org.telegram.messenger.a8.b("lock app");
                        }
                        externalActionActivity.i();
                    } else if (org.telegram.messenger.s2.a) {
                        org.telegram.messenger.a8.b("didn't pass lock check");
                    }
                    externalActionActivity.x = null;
                    break;
                }
                break;
            case 5:
                b00 b00Var = (b00) this.b;
                if (b00Var.N) {
                    b00Var.f.clear();
                    b00Var.n.clear();
                    b00Var.r.clear();
                    org.telegram.ui.Components.dk0 dk0Var = b00Var.d;
                    if (dk0Var != null) {
                        dk0Var.f();
                        break;
                    }
                }
                break;
            case 6:
                e40 e40Var = ((q10) this.b).b;
                e40Var.x1.setAnimation(e40Var.E2);
                e40Var.G2 = false;
                break;
            case 7:
                try {
                    e40 e40Var2 = (e40) this.b;
                    a20 a20Var = e40Var2.Z3;
                    if (a20Var != null && !a20Var.b && (h12 = e40Var2.h1()) != null && h12.isAttachedToWindow() && (renderer = h12.getRenderer()) != null && (vVar = renderer.a) != null) {
                        e40.G5.postRunnable(new org.telegram.ui.Components.voip.o(27, this, vVar));
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 8:
                v50 v50Var = (v50) this.b;
                try {
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false);
                    u50 u50Var = v50Var.J;
                    if (u50Var != null && v50Var.fragmentView != null && v50Var.P != x02) {
                        v50Var.P = x02;
                        u50Var.postRunnable(new ii(u50Var, x02, 24));
                        break;
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
                break;
            case 9:
                if (((u50) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    u50 u50Var2 = (u50) this.b;
                    if (u50Var2.e.equals(u50Var2.b.eglGetCurrentContext())) {
                        u50 u50Var3 = (u50) this.b;
                        break;
                    }
                    u50 u50Var4 = (u50) this.b;
                    EGL10 egl10 = u50Var4.b;
                    EGLDisplay eGLDisplay = u50Var4.c;
                    EGLSurface eGLSurface = u50Var4.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, u50Var4.e)) {
                        if (org.telegram.messenger.s2.a) {
                            org.telegram.messenger.m10.v(((u50) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((u50) this.b).s, 16L);
                    Intro.setPage(((u50) this.b).y.I);
                    Intro.setDate((currentTimeMillis - r3.K) / 1000.0f);
                    Intro.onDrawFrame(min);
                    u50 u50Var5 = (u50) this.b;
                    u50Var5.b.eglSwapBuffers(u50Var5.c, u50Var5.f);
                    u50 u50Var6 = (u50) this.b;
                    u50Var6.s = currentTimeMillis;
                    float f10 = 0.0f;
                    if (u50Var6.r == 0.0f) {
                        for (float f11 : ((WindowManager) org.telegram.messenger.t0.b.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f11 > f10) {
                                f10 = f11;
                            }
                        }
                        ((u50) this.b).r = f10;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    u50 u50Var7 = (u50) this.b;
                    u50Var7.postRunnable(u50Var7.x, Math.max(((long) (1000.0f / u50Var7.r)) - currentTimeMillis2, 0L));
                    break;
                }
                break;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                if (launchActivity.Z0 == this) {
                    if (org.telegram.messenger.g0.p2(true)) {
                        if (org.telegram.messenger.s2.a) {
                            org.telegram.messenger.a8.b("lock app");
                        }
                        launchActivity.K0(true, false, -1, -1, null);
                        try {
                            org.telegram.messenger.xs.t(org.telegram.messenger.i10.t0).Y();
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                        }
                    } else if (org.telegram.messenger.s2.a) {
                        org.telegram.messenger.a8.b("didn't pass lock check");
                    }
                    launchActivity.Z0 = null;
                    break;
                }
                break;
            case 11:
                pc0 pc0Var = (pc0) this.b;
                if (pc0Var.h == this) {
                    pc0Var.n();
                    org.telegram.messenger.g0.h3(pc0Var.h, 1000L);
                    break;
                }
                break;
            case 12:
                ((mg0) this.b).U.animate().alpha(1.0f).setDuration(230L);
                break;
            case 13:
                tg0 tg0Var = (tg0) this.b;
                String str = tg0Var.f2;
                if (str != null) {
                    if (tg0Var.i2 >= 0) {
                        ConnectionsManager.getInstance(tg0Var.a).cancelRequest(tg0Var.i2, true);
                        tg0Var.i2 = -1;
                    }
                    Boolean bool = tg0Var.n2;
                    boolean z10 = bool != null && bool.booleanValue();
                    org.telegram.ui.Components.ph phVar = new org.telegram.ui.Components.ph(19, tg0Var, str);
                    int i10 = org.telegram.messenger.i10.t0;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = org.telegram.messenger.i5.r(i10).f0;
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        org.telegram.messenger.i5.r(i10).A(0L, false);
                    }
                    org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i10);
                    String lowerCase = str.toLowerCase();
                    String M3 = org.telegram.messenger.g0.M3(lowerCase);
                    if (arrayList2 != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i11);
                            if (tL_contact != null && (c22 = u12.c2(Long.valueOf(tL_contact.user_id))) != null && ((z10 || !c22.bot) && !org.telegram.messenger.n10.B(c22.id) && !org.telegram.messenger.n10.C(c22))) {
                                String lowerCase2 = org.telegram.messenger.n10.q(c22).toLowerCase();
                                String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                if (lowerCase2.startsWith(lowerCase) || i5.c.B(" ", lowerCase, lowerCase2) || M32.startsWith(M3) || M32.contains(" ".concat(M3))) {
                                    arrayList.add(c22);
                                } else if (c22.usernames != null) {
                                    for (int i12 = 0; i12 < c22.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = c22.usernames.get(i12);
                                        if (tL_username != null && tL_username.active) {
                                            String lowerCase3 = tL_username.username.toLowerCase();
                                            if (lowerCase3.startsWith(lowerCase) || i5.c.B("_", lowerCase, lowerCase3) || lowerCase3.startsWith(M3) || lowerCase3.contains(" ".concat(M3))) {
                                                arrayList.add(c22);
                                            }
                                        }
                                    }
                                } else {
                                    String str2 = c22.username;
                                    if (str2 != null) {
                                        String lowerCase4 = str2.toLowerCase();
                                        if (lowerCase4.startsWith(lowerCase) || i5.c.B("_", lowerCase, lowerCase4) || lowerCase4.startsWith(M3) || lowerCase4.contains(" ".concat(M3))) {
                                            arrayList.add(c22);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    phVar.a(arrayList);
                    break;
                }
                break;
            case 14:
                pr0 pr0Var = (pr0) this.b;
                m4 m4Var = pr0Var.z0;
                org.telegram.ui.Cells.a6 a6Var = pr0Var.c0;
                if (a6Var != null) {
                    EditTextBoldCursor editField = a6Var.getEditField();
                    if (!pr0Var.V && editField != null && pr0Var.U && !pr0Var.Z && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                        editField.requestFocus();
                        org.telegram.messenger.g0.I3(editField);
                        org.telegram.messenger.g0.r(m4Var);
                        org.telegram.messenger.g0.h3(m4Var, 100L);
                        break;
                    }
                }
                break;
            case 15:
                ((b51) this.b).b0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 16:
                n81 n81Var = (n81) this.b;
                n81Var.G.setVisibility(0);
                n81Var.G.setAlpha(0.0f);
                n81Var.G.animate().alpha(1.0f).start();
                break;
            default:
                ad1 ad1Var = (ad1) this.b;
                org.telegram.messenger.fj fjVar = ad1Var.n;
                if (fjVar != null && ad1Var.getParentActivity() != null && ad1Var.s != null) {
                    i7 = ((org.telegram.ui.ActionBar.g2) ad1Var).currentAccount;
                    org.telegram.messenger.mp.u1(i7).N4(6, 0, org.telegram.messenger.fj.B0(fjVar.k), 0L, null);
                    org.telegram.messenger.g0.h3(ad1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
