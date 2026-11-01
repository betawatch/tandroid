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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m4(Object obj, int i10) {
        this.a = i10;
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
        org.telegram.ui.Components.voip.k O0;
        org.telegram.ui.Components.voip.r renderer;
        org.telegram.ui.Components.voip.n nVar;
        TLRPC.User Z1;
        int i10;
        switch (this.a) {
            case 0:
                UsersSelectActivity usersSelectActivity = new UsersSelectActivity(null);
                usersSelectActivity.N = new a0.h();
                usersSelectActivity.O = new ArrayList();
                usersSelectActivity.y = 1;
                usersSelectActivity.G = false;
                p4 p4Var = (p4) this.b;
                usersSelectActivity.R = p4Var.Z();
                usersSelectActivity.n = new y0(this, 2);
                p4Var.presentFragment(usersSelectActivity);
                break;
            case 1:
                BubbleActivity bubbleActivity = (BubbleActivity) this.b;
                if (bubbleActivity.Y == this) {
                    if (org.telegram.messenger.i0.p2(true)) {
                        if (org.telegram.messenger.v2.a) {
                            org.telegram.messenger.f8.b("lock app");
                        }
                        bubbleActivity.y();
                    } else if (org.telegram.messenger.v2.a) {
                        org.telegram.messenger.f8.b("didn't pass lock check");
                    }
                    bubbleActivity.Y = null;
                    break;
                }
                break;
            case 2:
                u9 u9Var = (u9) this.b;
                CameraView cameraView = u9Var.d;
                if (cameraView != null && !u9Var.N && cameraView.getCameraSession() != null) {
                    u9Var.f.post(new qr0(this, 17));
                    break;
                }
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.b.Z();
                contactsActivity.f0 = false;
                break;
            case 4:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                if (externalActionActivity.x == this) {
                    if (org.telegram.messenger.i0.p2(true)) {
                        if (org.telegram.messenger.v2.a) {
                            org.telegram.messenger.f8.b("lock app");
                        }
                        externalActionActivity.i();
                    } else if (org.telegram.messenger.v2.a) {
                        org.telegram.messenger.f8.b("didn't pass lock check");
                    }
                    externalActionActivity.x = null;
                    break;
                }
                break;
            case 5:
                y00 y00Var = (y00) this.b;
                if (y00Var.M) {
                    y00Var.f.clear();
                    y00Var.n.clear();
                    y00Var.r.clear();
                    org.telegram.ui.Components.tk0 tk0Var = y00Var.d;
                    if (tk0Var != null) {
                        tk0Var.f();
                        break;
                    }
                }
                break;
            case 6:
                a50 a50Var = ((n20) this.b).b;
                a50Var.t1.setAnimation(a50Var.A2);
                a50Var.C2 = false;
                break;
            case 7:
                try {
                    a50 a50Var2 = (a50) this.b;
                    x20 x20Var = a50Var2.R3;
                    if (x20Var != null && !x20Var.b && (O0 = a50.O0(a50Var2)) != null && O0.isAttachedToWindow() && (renderer = O0.getRenderer()) != null && (nVar = renderer.a) != null) {
                        a50.y5.postRunnable(new org.telegram.ui.Components.voip.u(24, this, nVar));
                        break;
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
                break;
            case 8:
                r60 r60Var = (r60) this.b;
                try {
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false);
                    q60 q60Var = r60Var.I;
                    if (q60Var != null && r60Var.fragmentView != null && r60Var.O != x02) {
                        r60Var.O = x02;
                        q60Var.postRunnable(new org.telegram.ui.Components.qq(q60Var, x02, 11));
                        break;
                    }
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
                break;
            case 9:
                if (((q60) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    q60 q60Var2 = (q60) this.b;
                    if (q60Var2.e.equals(q60Var2.b.eglGetCurrentContext())) {
                        q60 q60Var3 = (q60) this.b;
                        break;
                    }
                    q60 q60Var4 = (q60) this.b;
                    EGL10 egl10 = q60Var4.b;
                    EGLDisplay eGLDisplay = q60Var4.c;
                    EGLSurface eGLSurface = q60Var4.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, q60Var4.e)) {
                        if (org.telegram.messenger.v2.a) {
                            org.telegram.messenger.a30.t(((q60) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((q60) this.b).s, 16L);
                    Intro.setPage(((q60) this.b).y.H);
                    Intro.setDate((currentTimeMillis - r3.J) / 1000.0f);
                    Intro.onDrawFrame(min);
                    q60 q60Var5 = (q60) this.b;
                    q60Var5.b.eglSwapBuffers(q60Var5.c, q60Var5.f);
                    q60 q60Var6 = (q60) this.b;
                    q60Var6.s = currentTimeMillis;
                    float f7 = 0.0f;
                    if (q60Var6.r == 0.0f) {
                        for (float f10 : ((WindowManager) org.telegram.messenger.w0.b.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f10 > f7) {
                                f7 = f10;
                            }
                        }
                        ((q60) this.b).r = f7;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    q60 q60Var7 = (q60) this.b;
                    q60Var7.postRunnable(q60Var7.x, Math.max(((long) (1000.0f / q60Var7.r)) - currentTimeMillis2, 0L));
                    break;
                }
                break;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                if (launchActivity.a1 == this) {
                    if (org.telegram.messenger.i0.p2(true)) {
                        if (org.telegram.messenger.v2.a) {
                            org.telegram.messenger.f8.b("lock app");
                        }
                        launchActivity.K0(true, false, -1, -1, null);
                        try {
                            org.telegram.messenger.pt.t(org.telegram.messenger.e20.s0).Y();
                        } catch (Exception e10) {
                            org.telegram.messenger.f8.g(e10, true);
                        }
                    } else if (org.telegram.messenger.v2.a) {
                        org.telegram.messenger.f8.b("didn't pass lock check");
                    }
                    launchActivity.a1 = null;
                    break;
                }
                break;
            case 11:
                wd0 wd0Var = (wd0) this.b;
                if (wd0Var.h == this) {
                    wd0Var.n();
                    org.telegram.messenger.i0.h3(wd0Var.h, 1000L);
                    break;
                }
                break;
            case 12:
                ((qh0) this.b).T.animate().alpha(1.0f).setDuration(230L);
                break;
            case 13:
                uh0 uh0Var = (uh0) this.b;
                String str = uh0Var.b2;
                if (str != null) {
                    if (uh0Var.e2 >= 0) {
                        ConnectionsManager.getInstance(uh0Var.a).cancelRequest(uh0Var.e2, true);
                        uh0Var.e2 = -1;
                    }
                    Boolean bool = uh0Var.j2;
                    boolean z10 = bool != null && bool.booleanValue();
                    org.telegram.ui.Components.vg vgVar = new org.telegram.ui.Components.vg(21, uh0Var, str);
                    int i11 = org.telegram.messenger.e20.s0;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = org.telegram.messenger.i5.r(i11).e0;
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        org.telegram.messenger.i5.r(i11).A(0L, false);
                    }
                    org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i11);
                    String lowerCase = str.toLowerCase();
                    String N3 = org.telegram.messenger.i0.N3(lowerCase);
                    if (arrayList2 != null) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i12);
                            if (tL_contact != null && (Z1 = r12.Z1(Long.valueOf(tL_contact.user_id))) != null && ((z10 || !Z1.bot) && !org.telegram.messenger.i20.A(Z1.id) && !org.telegram.messenger.i20.B(Z1))) {
                                String lowerCase2 = org.telegram.messenger.i20.p(Z1).toLowerCase();
                                String N32 = org.telegram.messenger.i0.N3(lowerCase2);
                                if (lowerCase2.startsWith(lowerCase) || sc.e.y(" ", lowerCase, lowerCase2) || N32.startsWith(N3) || N32.contains(" ".concat(N3))) {
                                    arrayList.add(Z1);
                                } else if (Z1.usernames != null) {
                                    for (int i13 = 0; i13 < Z1.usernames.size(); i13++) {
                                        TLRPC.TL_username tL_username = Z1.usernames.get(i13);
                                        if (tL_username != null && tL_username.active) {
                                            String lowerCase3 = tL_username.username.toLowerCase();
                                            if (lowerCase3.startsWith(lowerCase) || sc.e.y("_", lowerCase, lowerCase3) || lowerCase3.startsWith(N3) || lowerCase3.contains(" ".concat(N3))) {
                                                arrayList.add(Z1);
                                            }
                                        }
                                    }
                                } else {
                                    String str2 = Z1.username;
                                    if (str2 != null) {
                                        String lowerCase4 = str2.toLowerCase();
                                        if (lowerCase4.startsWith(lowerCase) || sc.e.y("_", lowerCase, lowerCase4) || lowerCase4.startsWith(N3) || lowerCase4.contains(" ".concat(N3))) {
                                            arrayList.add(Z1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    vgVar.a(arrayList);
                    break;
                }
                break;
            case 14:
                zs0 zs0Var = (zs0) this.b;
                m4 m4Var = zs0Var.y0;
                org.telegram.ui.Cells.e6 e6Var = zs0Var.b0;
                if (e6Var != null) {
                    EditTextBoldCursor editField = e6Var.getEditField();
                    if (!zs0Var.U && editField != null && zs0Var.T && !zs0Var.Y && !org.telegram.messenger.i0.D && !org.telegram.messenger.i0.E && org.telegram.messenger.i0.Q1()) {
                        editField.requestFocus();
                        org.telegram.messenger.i0.J3(editField);
                        org.telegram.messenger.i0.r(m4Var);
                        org.telegram.messenger.i0.h3(m4Var, 100L);
                        break;
                    }
                }
                break;
            case 15:
                ((s61) this.b).a0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 16:
                ca1 ca1Var = (ca1) this.b;
                ca1Var.F.setVisibility(0);
                ca1Var.F.setAlpha(0.0f);
                ca1Var.F.animate().alpha(1.0f).start();
                break;
            default:
                ue1 ue1Var = (ue1) this.b;
                org.telegram.messenger.kj kjVar = ue1Var.n;
                if (kjVar != null && ue1Var.getParentActivity() != null && ue1Var.s != null) {
                    i10 = ((org.telegram.ui.ActionBar.k2) ue1Var).currentAccount;
                    org.telegram.messenger.wp.r1(i10).z4(6, 0, org.telegram.messenger.kj.B0(kjVar.k), 0L, null);
                    org.telegram.messenger.i0.h3(ue1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
