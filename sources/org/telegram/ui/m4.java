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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                usersSelectActivity.R = p4Var.Y();
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
                        bubbleActivity.z();
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
                    u9Var.f.post(new rr0(this, 17));
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
                z00 z00Var = (z00) this.b;
                if (z00Var.M) {
                    z00Var.f.clear();
                    z00Var.n.clear();
                    z00Var.r.clear();
                    org.telegram.ui.Components.sk0 sk0Var = z00Var.d;
                    if (sk0Var != null) {
                        sk0Var.f();
                        break;
                    }
                }
                break;
            case 6:
                b50 b50Var = ((o20) this.b).b;
                b50Var.t1.setAnimation(b50Var.A2);
                b50Var.C2 = false;
                break;
            case 7:
                try {
                    b50 b50Var2 = (b50) this.b;
                    y20 y20Var = b50Var2.R3;
                    if (y20Var != null && !y20Var.b && (O0 = b50.O0(b50Var2)) != null && O0.isAttachedToWindow() && (renderer = O0.getRenderer()) != null && (nVar = renderer.a) != null) {
                        b50.y5.postRunnable(new xs(23, this, nVar));
                        break;
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
                break;
            case 8:
                s60 s60Var = (s60) this.b;
                try {
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false);
                    r60 r60Var = s60Var.I;
                    if (r60Var != null && s60Var.fragmentView != null && s60Var.O != x02) {
                        s60Var.O = x02;
                        r60Var.postRunnable(new org.telegram.ui.Components.qq(r60Var, x02, 11));
                        break;
                    }
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
                break;
            case 9:
                if (((r60) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    r60 r60Var2 = (r60) this.b;
                    if (r60Var2.e.equals(r60Var2.b.eglGetCurrentContext())) {
                        r60 r60Var3 = (r60) this.b;
                        break;
                    }
                    r60 r60Var4 = (r60) this.b;
                    EGL10 egl10 = r60Var4.b;
                    EGLDisplay eGLDisplay = r60Var4.c;
                    EGLSurface eGLSurface = r60Var4.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, r60Var4.e)) {
                        if (org.telegram.messenger.v2.a) {
                            org.telegram.messenger.z20.t(((r60) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((r60) this.b).s, 16L);
                    Intro.setPage(((r60) this.b).y.H);
                    Intro.setDate((currentTimeMillis - r3.J) / 1000.0f);
                    Intro.onDrawFrame(min);
                    r60 r60Var5 = (r60) this.b;
                    r60Var5.b.eglSwapBuffers(r60Var5.c, r60Var5.f);
                    r60 r60Var6 = (r60) this.b;
                    r60Var6.s = currentTimeMillis;
                    float f7 = 0.0f;
                    if (r60Var6.r == 0.0f) {
                        for (float f10 : ((WindowManager) org.telegram.messenger.w0.b.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f10 > f7) {
                                f7 = f10;
                            }
                        }
                        ((r60) this.b).r = f7;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    r60 r60Var7 = (r60) this.b;
                    r60Var7.postRunnable(r60Var7.x, Math.max(((long) (1000.0f / r60Var7.r)) - currentTimeMillis2, 0L));
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
                            org.telegram.messenger.ot.t(org.telegram.messenger.d20.s0).Y();
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
                xd0 xd0Var = (xd0) this.b;
                if (xd0Var.h == this) {
                    xd0Var.n();
                    org.telegram.messenger.i0.h3(xd0Var.h, 1000L);
                    break;
                }
                break;
            case 12:
                ((sh0) this.b).T.animate().alpha(1.0f).setDuration(230L);
                break;
            case 13:
                wh0 wh0Var = (wh0) this.b;
                String str = wh0Var.b2;
                if (str != null) {
                    if (wh0Var.e2 >= 0) {
                        ConnectionsManager.getInstance(wh0Var.a).cancelRequest(wh0Var.e2, true);
                        wh0Var.e2 = -1;
                    }
                    Boolean bool = wh0Var.j2;
                    boolean z10 = bool != null && bool.booleanValue();
                    org.telegram.ui.Components.vg vgVar = new org.telegram.ui.Components.vg(20, wh0Var, str);
                    int i11 = org.telegram.messenger.d20.s0;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = org.telegram.messenger.i5.r(i11).e0;
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        org.telegram.messenger.i5.r(i11).A(0L, false);
                    }
                    org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i11);
                    String lowerCase = str.toLowerCase();
                    String N3 = org.telegram.messenger.i0.N3(lowerCase);
                    if (arrayList2 != null) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList2.get(i12);
                            if (tL_contact != null && (Z1 = r12.Z1(Long.valueOf(tL_contact.user_id))) != null && ((z10 || !Z1.bot) && !org.telegram.messenger.h20.A(Z1.id) && !org.telegram.messenger.h20.B(Z1))) {
                                String lowerCase2 = org.telegram.messenger.h20.p(Z1).toLowerCase();
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
                at0 at0Var = (at0) this.b;
                m4 m4Var = at0Var.y0;
                org.telegram.ui.Cells.e6 e6Var = at0Var.b0;
                if (e6Var != null) {
                    EditTextBoldCursor editField = e6Var.getEditField();
                    if (!at0Var.U && editField != null && at0Var.T && !at0Var.Y && !org.telegram.messenger.i0.D && !org.telegram.messenger.i0.E && org.telegram.messenger.i0.Q1()) {
                        editField.requestFocus();
                        org.telegram.messenger.i0.J3(editField);
                        org.telegram.messenger.i0.r(m4Var);
                        org.telegram.messenger.i0.h3(m4Var, 100L);
                        break;
                    }
                }
                break;
            case 15:
                ((u61) this.b).a0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 16:
                ea1 ea1Var = (ea1) this.b;
                ea1Var.F.setVisibility(0);
                ea1Var.F.setAlpha(0.0f);
                ea1Var.F.animate().alpha(1.0f).start();
                break;
            default:
                we1 we1Var = (we1) this.b;
                org.telegram.messenger.jj jjVar = we1Var.n;
                if (jjVar != null && we1Var.getParentActivity() != null && we1Var.s != null) {
                    i10 = ((org.telegram.ui.ActionBar.k2) we1Var).currentAccount;
                    org.telegram.messenger.vp.r1(i10).z4(6, 0, org.telegram.messenger.jj.B0(jjVar.k), 0L, null);
                    org.telegram.messenger.i0.h3(we1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
