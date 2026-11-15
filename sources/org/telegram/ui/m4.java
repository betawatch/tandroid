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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        org.telegram.ui.Components.voip.r g12;
        org.telegram.ui.Components.voip.z renderer;
        org.telegram.ui.Components.voip.v vVar;
        TLRPC.User a22;
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
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.messenger.a8.b("lock app");
                        }
                        bubbleActivity.z();
                    } else if (org.telegram.messenger.r2.a) {
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
                    t9Var.f.post(new fq0(this, 17));
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
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.messenger.a8.b("lock app");
                        }
                        externalActionActivity.i();
                    } else if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.b("didn't pass lock check");
                    }
                    externalActionActivity.x = null;
                    break;
                }
                break;
            case 5:
                zz zzVar = (zz) this.b;
                if (zzVar.N) {
                    zzVar.f.clear();
                    zzVar.n.clear();
                    zzVar.r.clear();
                    org.telegram.ui.Components.tj0 tj0Var = zzVar.d;
                    if (tj0Var != null) {
                        tj0Var.f();
                        break;
                    }
                }
                break;
            case 6:
                c40 c40Var = ((o10) this.b).b;
                c40Var.x1.setAnimation(c40Var.E2);
                c40Var.G2 = false;
                break;
            case 7:
                try {
                    c40 c40Var2 = (c40) this.b;
                    y10 y10Var = c40Var2.Z3;
                    if (y10Var != null && !y10Var.b && (g12 = c40Var2.g1()) != null && g12.isAttachedToWindow() && (renderer = g12.getRenderer()) != null && (vVar = renderer.a) != null) {
                        c40.G5.postRunnable(new org.telegram.ui.Components.voip.u(26, this, vVar));
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 8:
                t50 t50Var = (t50) this.b;
                try {
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false);
                    s50 s50Var = t50Var.J;
                    if (s50Var != null && t50Var.fragmentView != null && t50Var.P != x02) {
                        t50Var.P = x02;
                        s50Var.postRunnable(new org.telegram.ui.Components.a2(s50Var, x02, 19));
                        break;
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
                break;
            case 9:
                if (((s50) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    s50 s50Var2 = (s50) this.b;
                    if (s50Var2.e.equals(s50Var2.b.eglGetCurrentContext())) {
                        s50 s50Var3 = (s50) this.b;
                        break;
                    }
                    s50 s50Var4 = (s50) this.b;
                    EGL10 egl10 = s50Var4.b;
                    EGLDisplay eGLDisplay = s50Var4.c;
                    EGLSurface eGLSurface = s50Var4.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, s50Var4.e)) {
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.messenger.i20.u(((s50) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((s50) this.b).s, 16L);
                    Intro.setPage(((s50) this.b).y.I);
                    Intro.setDate((currentTimeMillis - r3.K) / 1000.0f);
                    Intro.onDrawFrame(min);
                    s50 s50Var5 = (s50) this.b;
                    s50Var5.b.eglSwapBuffers(s50Var5.c, s50Var5.f);
                    s50 s50Var6 = (s50) this.b;
                    s50Var6.s = currentTimeMillis;
                    float f10 = 0.0f;
                    if (s50Var6.r == 0.0f) {
                        for (float f11 : ((WindowManager) org.telegram.messenger.t0.b.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f11 > f10) {
                                f10 = f11;
                            }
                        }
                        ((s50) this.b).r = f10;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    s50 s50Var7 = (s50) this.b;
                    s50Var7.postRunnable(s50Var7.x, Math.max(((long) (1000.0f / s50Var7.r)) - currentTimeMillis2, 0L));
                    break;
                }
                break;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                if (launchActivity.Z0 == this) {
                    if (org.telegram.messenger.g0.p2(true)) {
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.messenger.a8.b("lock app");
                        }
                        launchActivity.K0(true, false, -1, -1, null);
                        try {
                            org.telegram.messenger.at.t(org.telegram.messenger.m10.t0).Y();
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                        }
                    } else if (org.telegram.messenger.r2.a) {
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
                    org.telegram.messenger.g0.i3(pc0Var.h, 1000L);
                    break;
                }
                break;
            case 12:
                ((jg0) this.b).U.animate().alpha(1.0f).setDuration(230L);
                break;
            case 13:
                qg0 qg0Var = (qg0) this.b;
                String str = qg0Var.f2;
                if (str != null) {
                    if (qg0Var.i2 >= 0) {
                        ConnectionsManager.getInstance(qg0Var.a).cancelRequest(qg0Var.i2, true);
                        qg0Var.i2 = -1;
                    }
                    Boolean bool = qg0Var.n2;
                    boolean z10 = bool != null && bool.booleanValue();
                    org.telegram.ui.Components.gh ghVar = new org.telegram.ui.Components.gh(19, qg0Var, str);
                    int i10 = org.telegram.messenger.m10.t0;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = org.telegram.messenger.g5.r(i10).f0;
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        org.telegram.messenger.g5.r(i10).A(0L, false);
                    }
                    org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i10);
                    String lowerCase = str.toLowerCase();
                    String N3 = org.telegram.messenger.g0.N3(lowerCase);
                    if (arrayList2 != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i11);
                            if (tL_contact != null && (a22 = s12.a2(Long.valueOf(tL_contact.user_id))) != null && ((z10 || !a22.bot) && !org.telegram.messenger.q10.A(a22.id) && !org.telegram.messenger.q10.B(a22))) {
                                String lowerCase2 = org.telegram.messenger.q10.p(a22).toLowerCase();
                                String N32 = org.telegram.messenger.g0.N3(lowerCase2);
                                if (lowerCase2.startsWith(lowerCase) || i5.c.A(" ", lowerCase, lowerCase2) || N32.startsWith(N3) || N32.contains(" ".concat(N3))) {
                                    arrayList.add(a22);
                                } else if (a22.usernames != null) {
                                    for (int i12 = 0; i12 < a22.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = a22.usernames.get(i12);
                                        if (tL_username != null && tL_username.active) {
                                            String lowerCase3 = tL_username.username.toLowerCase();
                                            if (lowerCase3.startsWith(lowerCase) || i5.c.A("_", lowerCase, lowerCase3) || lowerCase3.startsWith(N3) || lowerCase3.contains(" ".concat(N3))) {
                                                arrayList.add(a22);
                                            }
                                        }
                                    }
                                } else {
                                    String str2 = a22.username;
                                    if (str2 != null) {
                                        String lowerCase4 = str2.toLowerCase();
                                        if (lowerCase4.startsWith(lowerCase) || i5.c.A("_", lowerCase, lowerCase4) || lowerCase4.startsWith(N3) || lowerCase4.contains(" ".concat(N3))) {
                                            arrayList.add(a22);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ghVar.a(arrayList);
                    break;
                }
                break;
            case 14:
                nr0 nr0Var = (nr0) this.b;
                m4 m4Var = nr0Var.z0;
                org.telegram.ui.Cells.z5 z5Var = nr0Var.c0;
                if (z5Var != null) {
                    EditTextBoldCursor editField = z5Var.getEditField();
                    if (!nr0Var.V && editField != null && nr0Var.U && !nr0Var.Z && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                        editField.requestFocus();
                        org.telegram.messenger.g0.J3(editField);
                        org.telegram.messenger.g0.r(m4Var);
                        org.telegram.messenger.g0.i3(m4Var, 100L);
                        break;
                    }
                }
                break;
            case 15:
                ((z41) this.b).b0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 16:
                l81 l81Var = (l81) this.b;
                l81Var.G.setVisibility(0);
                l81Var.G.setAlpha(0.0f);
                l81Var.G.animate().alpha(1.0f).start();
                break;
            default:
                zc1 zc1Var = (zc1) this.b;
                org.telegram.messenger.gj gjVar = zc1Var.n;
                if (gjVar != null && zc1Var.getParentActivity() != null && zc1Var.s != null) {
                    i7 = ((org.telegram.ui.ActionBar.e2) zc1Var).currentAccount;
                    org.telegram.messenger.np.s1(i7).D4(6, 0, org.telegram.messenger.gj.B0(gjVar.k), 0L, null);
                    org.telegram.messenger.g0.i3(zc1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
