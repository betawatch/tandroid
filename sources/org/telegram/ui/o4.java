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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o4(Object obj, int i3) {
        this.a = i3;
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
        TLRPC.User a22;
        int i3;
        switch (this.a) {
            case 0:
                UsersSelectActivity usersSelectActivity = new UsersSelectActivity(null);
                usersSelectActivity.P = new a0.h();
                usersSelectActivity.Q = new ArrayList();
                usersSelectActivity.y = 1;
                usersSelectActivity.H = false;
                r4 r4Var = (r4) this.b;
                usersSelectActivity.T = r4Var.Z();
                usersSelectActivity.n = new x0(this, 2);
                r4Var.presentFragment(usersSelectActivity);
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
                s9 s9Var = (s9) this.b;
                CameraView cameraView = s9Var.d;
                if (cameraView != null && !s9Var.O && cameraView.getCameraSession() != null) {
                    s9Var.f.post(new xp0(this, 17));
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
                wz wzVar = (wz) this.b;
                if (wzVar.N) {
                    wzVar.f.clear();
                    wzVar.n.clear();
                    wzVar.r.clear();
                    org.telegram.ui.Components.sj0 sj0Var = wzVar.d;
                    if (sj0Var != null) {
                        sj0Var.f();
                        break;
                    }
                }
                break;
            case 6:
                x30 x30Var = ((k10) this.b).b;
                x30Var.u1.setAnimation(x30Var.B2);
                x30Var.D2 = false;
                break;
            case 7:
                try {
                    x30 x30Var2 = (x30) this.b;
                    u10 u10Var = x30Var2.S3;
                    if (u10Var != null && !u10Var.b && (O0 = x30.O0(x30Var2)) != null && O0.isAttachedToWindow() && (renderer = O0.getRenderer()) != null && (nVar = renderer.a) != null) {
                        x30.z5.postRunnable(new ly(5, this, nVar));
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 8:
                o50 o50Var = (o50) this.b;
                try {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
                    n50 n50Var = o50Var.J;
                    if (n50Var != null && o50Var.fragmentView != null && o50Var.P != x02) {
                        o50Var.P = x02;
                        n50Var.postRunnable(new org.telegram.ui.Components.o2(n50Var, x02, 16));
                        break;
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
                break;
            case 9:
                if (((n50) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    n50 n50Var2 = (n50) this.b;
                    if (n50Var2.e.equals(n50Var2.b.eglGetCurrentContext())) {
                        n50 n50Var3 = (n50) this.b;
                        break;
                    }
                    n50 n50Var4 = (n50) this.b;
                    EGL10 egl10 = n50Var4.b;
                    EGLDisplay eGLDisplay = n50Var4.c;
                    EGLSurface eGLSurface = n50Var4.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, n50Var4.e)) {
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.messenger.camera.q.t(((n50) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((n50) this.b).s, 16L);
                    Intro.setPage(((n50) this.b).y.I);
                    Intro.setDate((currentTimeMillis - r3.K) / 1000.0f);
                    Intro.onDrawFrame(min);
                    n50 n50Var5 = (n50) this.b;
                    n50Var5.b.eglSwapBuffers(n50Var5.c, n50Var5.f);
                    n50 n50Var6 = (n50) this.b;
                    n50Var6.s = currentTimeMillis;
                    float f10 = 0.0f;
                    if (n50Var6.r == 0.0f) {
                        for (float f11 : ((WindowManager) org.telegram.messenger.t0.b.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f11 > f10) {
                                f10 = f11;
                            }
                        }
                        ((n50) this.b).r = f10;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    n50 n50Var7 = (n50) this.b;
                    n50Var7.postRunnable(n50Var7.x, Math.max(((long) (1000.0f / n50Var7.r)) - currentTimeMillis2, 0L));
                    break;
                }
                break;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                if (launchActivity.b1 == this) {
                    if (org.telegram.messenger.g0.p2(true)) {
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.messenger.a8.b("lock app");
                        }
                        launchActivity.K0(true, false, -1, -1, null);
                        try {
                            org.telegram.messenger.us.t(org.telegram.messenger.h10.t0).Y();
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                        }
                    } else if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.b("didn't pass lock check");
                    }
                    launchActivity.b1 = null;
                    break;
                }
                break;
            case 11:
                oc0 oc0Var = (oc0) this.b;
                if (oc0Var.h == this) {
                    oc0Var.n();
                    org.telegram.messenger.g0.i3(oc0Var.h, 1000L);
                    break;
                }
                break;
            case 12:
                ((dg0) this.b).U.animate().alpha(1.0f).setDuration(230L);
                break;
            case 13:
                kg0 kg0Var = (kg0) this.b;
                String str = kg0Var.c2;
                if (str != null) {
                    if (kg0Var.f2 >= 0) {
                        ConnectionsManager.getInstance(kg0Var.a).cancelRequest(kg0Var.f2, true);
                        kg0Var.f2 = -1;
                    }
                    Boolean bool = kg0Var.k2;
                    boolean z10 = bool != null && bool.booleanValue();
                    org.telegram.ui.Components.ei eiVar = new org.telegram.ui.Components.ei(17, kg0Var, str);
                    int i10 = org.telegram.messenger.h10.t0;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = org.telegram.messenger.g5.r(i10).f0;
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        org.telegram.messenger.g5.r(i10).A(0L, false);
                    }
                    org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i10);
                    String lowerCase = str.toLowerCase();
                    String O3 = org.telegram.messenger.g0.O3(lowerCase);
                    if (arrayList2 != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i11);
                            if (tL_contact != null && (a22 = s12.a2(Long.valueOf(tL_contact.user_id))) != null && ((z10 || !a22.bot) && !org.telegram.messenger.l10.A(a22.id) && !org.telegram.messenger.l10.B(a22))) {
                                String lowerCase2 = org.telegram.messenger.l10.p(a22).toLowerCase();
                                String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                if (lowerCase2.startsWith(lowerCase) || k2.p1.z(" ", lowerCase, lowerCase2) || O32.startsWith(O3) || O32.contains(" ".concat(O3))) {
                                    arrayList.add(a22);
                                } else if (a22.usernames != null) {
                                    for (int i12 = 0; i12 < a22.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = a22.usernames.get(i12);
                                        if (tL_username != null && tL_username.active) {
                                            String lowerCase3 = tL_username.username.toLowerCase();
                                            if (lowerCase3.startsWith(lowerCase) || k2.p1.z("_", lowerCase, lowerCase3) || lowerCase3.startsWith(O3) || lowerCase3.contains(" ".concat(O3))) {
                                                arrayList.add(a22);
                                            }
                                        }
                                    }
                                } else {
                                    String str2 = a22.username;
                                    if (str2 != null) {
                                        String lowerCase4 = str2.toLowerCase();
                                        if (lowerCase4.startsWith(lowerCase) || k2.p1.z("_", lowerCase, lowerCase4) || lowerCase4.startsWith(O3) || lowerCase4.contains(" ".concat(O3))) {
                                            arrayList.add(a22);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    eiVar.a(arrayList);
                    break;
                }
                break;
            case 14:
                fr0 fr0Var = (fr0) this.b;
                o4 o4Var = fr0Var.z0;
                org.telegram.ui.Cells.z5 z5Var = fr0Var.c0;
                if (z5Var != null) {
                    EditTextBoldCursor editField = z5Var.getEditField();
                    if (!fr0Var.V && editField != null && fr0Var.U && !fr0Var.Z && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E && org.telegram.messenger.g0.Q1()) {
                        editField.requestFocus();
                        org.telegram.messenger.g0.K3(editField);
                        org.telegram.messenger.g0.r(o4Var);
                        org.telegram.messenger.g0.i3(o4Var, 100L);
                        break;
                    }
                }
                break;
            case 15:
                ((r41) this.b).b0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 16:
                d81 d81Var = (d81) this.b;
                d81Var.G.setVisibility(0);
                d81Var.G.setAlpha(0.0f);
                d81Var.G.animate().alpha(1.0f).start();
                break;
            default:
                uc1 uc1Var = (uc1) this.b;
                org.telegram.messenger.zi ziVar = uc1Var.n;
                if (ziVar != null && uc1Var.getParentActivity() != null && uc1Var.s != null) {
                    i3 = ((org.telegram.ui.ActionBar.d2) uc1Var).currentAccount;
                    org.telegram.messenger.hp.s1(i3).C4(6, 0, org.telegram.messenger.zi.B0(ziVar.k), 0L, null);
                    org.telegram.messenger.g0.i3(uc1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
