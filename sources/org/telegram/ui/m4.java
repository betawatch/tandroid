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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        org.telegram.ui.Components.voip.y renderer;
        org.telegram.ui.Components.voip.u uVar;
        TLRPC.User a22;
        int i7;
        switch (this.a) {
            case 0:
                UsersSelectActivity usersSelectActivity = new UsersSelectActivity(null);
                usersSelectActivity.O = new a0.h();
                usersSelectActivity.P = new ArrayList();
                usersSelectActivity.y = 1;
                usersSelectActivity.G = false;
                p4 p4Var = (p4) this.b;
                usersSelectActivity.S = p4Var.Z();
                usersSelectActivity.n = new w0(this, 2);
                p4Var.presentFragment(usersSelectActivity);
                break;
            case 1:
                BubbleActivity bubbleActivity = (BubbleActivity) this.b;
                if (bubbleActivity.Y == this) {
                    if (org.telegram.messenger.g0.p2(true)) {
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.messenger.a8.b("lock app");
                        }
                        bubbleActivity.z();
                    } else if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.b("didn't pass lock check");
                    }
                    bubbleActivity.Y = null;
                    break;
                }
                break;
            case 2:
                s9 s9Var = (s9) this.b;
                CameraView cameraView = s9Var.d;
                if (cameraView != null && !s9Var.N && cameraView.getCameraSession() != null) {
                    s9Var.f.post(new fq0(this, 17));
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
                yz yzVar = (yz) this.b;
                if (yzVar.M) {
                    yzVar.f.clear();
                    yzVar.n.clear();
                    yzVar.r.clear();
                    org.telegram.ui.Components.oj0 oj0Var = yzVar.d;
                    if (oj0Var != null) {
                        oj0Var.f();
                        break;
                    }
                }
                break;
            case 6:
                c40 c40Var = ((o10) this.b).b;
                c40Var.t1.setAnimation(c40Var.A2);
                c40Var.C2 = false;
                break;
            case 7:
                try {
                    c40 c40Var2 = (c40) this.b;
                    z10 z10Var = c40Var2.R3;
                    if (z10Var != null && !z10Var.b && (g12 = c40Var2.g1()) != null && g12.isAttachedToWindow() && (renderer = g12.getRenderer()) != null && (uVar = renderer.a) != null) {
                        c40.y5.postRunnable(new q10(0, this, uVar));
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 8:
                u50 u50Var = (u50) this.b;
                try {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
                    t50 t50Var = u50Var.I;
                    if (t50Var != null && u50Var.fragmentView != null && u50Var.O != x02) {
                        u50Var.O = x02;
                        t50Var.postRunnable(new org.telegram.ui.Components.r2(t50Var, x02, 16));
                        break;
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
                break;
            case 9:
                if (((t50) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    t50 t50Var2 = (t50) this.b;
                    if (t50Var2.e.equals(t50Var2.b.eglGetCurrentContext())) {
                        t50 t50Var3 = (t50) this.b;
                        break;
                    }
                    t50 t50Var4 = (t50) this.b;
                    EGL10 egl10 = t50Var4.b;
                    EGLDisplay eGLDisplay = t50Var4.c;
                    EGLSurface eGLSurface = t50Var4.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, t50Var4.e)) {
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.messenger.camera.q.t(((t50) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((t50) this.b).s, 16L);
                    Intro.setPage(((t50) this.b).y.H);
                    Intro.setDate((currentTimeMillis - r3.J) / 1000.0f);
                    Intro.onDrawFrame(min);
                    t50 t50Var5 = (t50) this.b;
                    t50Var5.b.eglSwapBuffers(t50Var5.c, t50Var5.f);
                    t50 t50Var6 = (t50) this.b;
                    t50Var6.s = currentTimeMillis;
                    float f10 = 0.0f;
                    if (t50Var6.r == 0.0f) {
                        for (float f11 : ((WindowManager) org.telegram.messenger.t0.b.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f11 > f10) {
                                f10 = f11;
                            }
                        }
                        ((t50) this.b).r = f10;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    t50 t50Var7 = (t50) this.b;
                    t50Var7.postRunnable(t50Var7.x, Math.max(((long) (1000.0f / t50Var7.r)) - currentTimeMillis2, 0L));
                    break;
                }
                break;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                if (launchActivity.Y0 == this) {
                    if (org.telegram.messenger.g0.p2(true)) {
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.messenger.a8.b("lock app");
                        }
                        launchActivity.K0(true, false, -1, -1, null);
                        try {
                            org.telegram.messenger.dt.t(org.telegram.messenger.p10.s0).Y();
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                        }
                    } else if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.b("didn't pass lock check");
                    }
                    launchActivity.Y0 = null;
                    break;
                }
                break;
            case 11:
                qc0 qc0Var = (qc0) this.b;
                if (qc0Var.h == this) {
                    qc0Var.n();
                    org.telegram.messenger.g0.i3(qc0Var.h, 1000L);
                    break;
                }
                break;
            case 12:
                ((jg0) this.b).T.animate().alpha(1.0f).setDuration(230L);
                break;
            case 13:
                qg0 qg0Var = (qg0) this.b;
                String str = qg0Var.b2;
                if (str != null) {
                    if (qg0Var.e2 >= 0) {
                        ConnectionsManager.getInstance(qg0Var.a).cancelRequest(qg0Var.e2, true);
                        qg0Var.e2 = -1;
                    }
                    Boolean bool = qg0Var.j2;
                    boolean z9 = bool != null && bool.booleanValue();
                    org.telegram.ui.Components.ex exVar = new org.telegram.ui.Components.ex(14, qg0Var, str);
                    int i10 = org.telegram.messenger.p10.s0;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = org.telegram.messenger.g5.r(i10).e0;
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        org.telegram.messenger.g5.r(i10).A(0L, false);
                    }
                    org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i10);
                    String lowerCase = str.toLowerCase();
                    String O3 = org.telegram.messenger.g0.O3(lowerCase);
                    if (arrayList2 != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i11);
                            if (tL_contact != null && (a22 = s12.a2(Long.valueOf(tL_contact.user_id))) != null && ((z9 || !a22.bot) && !org.telegram.messenger.t10.A(a22.id) && !org.telegram.messenger.t10.B(a22))) {
                                String lowerCase2 = org.telegram.messenger.t10.p(a22).toLowerCase();
                                String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                if (lowerCase2.startsWith(lowerCase) || jg.g.A(" ", lowerCase, lowerCase2) || O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                                    arrayList.add(a22);
                                } else if (a22.usernames != null) {
                                    for (int i12 = 0; i12 < a22.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = a22.usernames.get(i12);
                                        if (tL_username != null && tL_username.active) {
                                            String lowerCase3 = tL_username.username.toLowerCase();
                                            if (lowerCase3.startsWith(lowerCase) || jg.g.A("_", lowerCase, lowerCase3) || lowerCase3.startsWith(O3) || lowerCase3.contains(" ".concat(O3))) {
                                                arrayList.add(a22);
                                            }
                                        }
                                    }
                                } else {
                                    String str2 = a22.username;
                                    if (str2 != null) {
                                        String lowerCase4 = str2.toLowerCase();
                                        if (lowerCase4.startsWith(lowerCase) || jg.g.A("_", lowerCase, lowerCase4) || lowerCase4.startsWith(O3) || lowerCase4.contains(" ".concat(O3))) {
                                            arrayList.add(a22);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    exVar.a(arrayList);
                    break;
                }
                break;
            case 14:
                or0 or0Var = (or0) this.b;
                m4 m4Var = or0Var.y0;
                org.telegram.ui.Cells.a6 a6Var = or0Var.b0;
                if (a6Var != null) {
                    EditTextBoldCursor editField = a6Var.getEditField();
                    if (!or0Var.U && editField != null && or0Var.T && !or0Var.Y && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                        editField.requestFocus();
                        org.telegram.messenger.g0.K3(editField);
                        org.telegram.messenger.g0.r(m4Var);
                        org.telegram.messenger.g0.i3(m4Var, 100L);
                        break;
                    }
                }
                break;
            case 15:
                ((c51) this.b).a0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 16:
                m81 m81Var = (m81) this.b;
                m81Var.F.setVisibility(0);
                m81Var.F.setAlpha(0.0f);
                m81Var.F.animate().alpha(1.0f).start();
                break;
            default:
                yc1 yc1Var = (yc1) this.b;
                org.telegram.messenger.ij ijVar = yc1Var.n;
                if (ijVar != null && yc1Var.getParentActivity() != null && yc1Var.s != null) {
                    i7 = ((org.telegram.ui.ActionBar.f2) yc1Var).currentAccount;
                    org.telegram.messenger.qp.s1(i7).C4(6, 0, org.telegram.messenger.ij.B0(ijVar.k), 0L, null);
                    org.telegram.messenger.g0.i3(yc1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
