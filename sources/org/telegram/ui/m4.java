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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                    s9Var.f.post(new jq0(this, 17));
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
                b00 b00Var = (b00) this.b;
                if (b00Var.M) {
                    b00Var.f.clear();
                    b00Var.n.clear();
                    b00Var.r.clear();
                    org.telegram.ui.Components.oj0 oj0Var = b00Var.d;
                    if (oj0Var != null) {
                        oj0Var.f();
                        break;
                    }
                }
                break;
            case 6:
                f40 f40Var = ((s10) this.b).b;
                f40Var.w1.setAnimation(f40Var.D2);
                f40Var.F2 = false;
                break;
            case 7:
                try {
                    f40 f40Var2 = (f40) this.b;
                    c20 c20Var = f40Var2.U3;
                    if (c20Var != null && !c20Var.b && (g12 = f40Var2.g1()) != null && g12.isAttachedToWindow() && (renderer = g12.getRenderer()) != null && (uVar = renderer.a) != null) {
                        f40.B5.postRunnable(new f10(1, this, uVar));
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 8:
                x50 x50Var = (x50) this.b;
                try {
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false);
                    w50 w50Var = x50Var.I;
                    if (w50Var != null && x50Var.fragmentView != null && x50Var.O != x02) {
                        x50Var.O = x02;
                        w50Var.postRunnable(new org.telegram.ui.Components.q2(w50Var, x02, 16));
                        break;
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
                break;
            case 9:
                if (((w50) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    w50 w50Var2 = (w50) this.b;
                    if (w50Var2.e.equals(w50Var2.b.eglGetCurrentContext())) {
                        w50 w50Var3 = (w50) this.b;
                        break;
                    }
                    w50 w50Var4 = (w50) this.b;
                    EGL10 egl10 = w50Var4.b;
                    EGLDisplay eGLDisplay = w50Var4.c;
                    EGLSurface eGLSurface = w50Var4.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, w50Var4.e)) {
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.messenger.camera.q.t(((w50) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((w50) this.b).s, 16L);
                    Intro.setPage(((w50) this.b).y.H);
                    Intro.setDate((currentTimeMillis - r3.J) / 1000.0f);
                    Intro.onDrawFrame(min);
                    w50 w50Var5 = (w50) this.b;
                    w50Var5.b.eglSwapBuffers(w50Var5.c, w50Var5.f);
                    w50 w50Var6 = (w50) this.b;
                    w50Var6.s = currentTimeMillis;
                    float f10 = 0.0f;
                    if (w50Var6.r == 0.0f) {
                        for (float f11 : ((WindowManager) org.telegram.messenger.t0.b.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f11 > f10) {
                                f10 = f11;
                            }
                        }
                        ((w50) this.b).r = f10;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    w50 w50Var7 = (w50) this.b;
                    w50Var7.postRunnable(w50Var7.x, Math.max(((long) (1000.0f / w50Var7.r)) - currentTimeMillis2, 0L));
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
                uc0 uc0Var = (uc0) this.b;
                if (uc0Var.h == this) {
                    uc0Var.n();
                    org.telegram.messenger.g0.i3(uc0Var.h, 1000L);
                    break;
                }
                break;
            case 12:
                ((mg0) this.b).T.animate().alpha(1.0f).setDuration(230L);
                break;
            case 13:
                tg0 tg0Var = (tg0) this.b;
                String str = tg0Var.e2;
                if (str != null) {
                    if (tg0Var.h2 >= 0) {
                        ConnectionsManager.getInstance(tg0Var.a).cancelRequest(tg0Var.h2, true);
                        tg0Var.h2 = -1;
                    }
                    Boolean bool = tg0Var.m2;
                    boolean z9 = bool != null && bool.booleanValue();
                    org.telegram.ui.Components.ex exVar = new org.telegram.ui.Components.ex(14, tg0Var, str);
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
                sr0 sr0Var = (sr0) this.b;
                m4 m4Var = sr0Var.y0;
                org.telegram.ui.Cells.a6 a6Var = sr0Var.b0;
                if (a6Var != null) {
                    EditTextBoldCursor editField = a6Var.getEditField();
                    if (!sr0Var.U && editField != null && sr0Var.T && !sr0Var.Y && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                        editField.requestFocus();
                        org.telegram.messenger.g0.K3(editField);
                        org.telegram.messenger.g0.r(m4Var);
                        org.telegram.messenger.g0.i3(m4Var, 100L);
                        break;
                    }
                }
                break;
            case 15:
                ((e51) this.b).a0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 16:
                p81 p81Var = (p81) this.b;
                p81Var.F.setVisibility(0);
                p81Var.F.setAlpha(0.0f);
                p81Var.F.animate().alpha(1.0f).start();
                break;
            default:
                dd1 dd1Var = (dd1) this.b;
                org.telegram.messenger.ij ijVar = dd1Var.n;
                if (ijVar != null && dd1Var.getParentActivity() != null && dd1Var.s != null) {
                    i7 = ((org.telegram.ui.ActionBar.f2) dd1Var).currentAccount;
                    org.telegram.messenger.qp.s1(i7).C4(6, 0, org.telegram.messenger.ij.B0(ijVar.k), 0L, null);
                    org.telegram.messenger.g0.i3(dd1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
