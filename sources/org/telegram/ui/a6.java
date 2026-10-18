package org.telegram.ui;

import android.view.WindowManager;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Intro;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0147, code lost:
    
        if (r2.f.equals(r2.b.eglGetCurrentSurface(12377)) == false) goto L69;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.Components.voip.l J0;
        org.telegram.ui.Components.voip.t renderer;
        org.telegram.ui.Components.voip.o oVar;
        int i10;
        switch (this.a) {
            case 0:
                BubbleActivity bubbleActivity = (BubbleActivity) this.b;
                if (bubbleActivity.Y == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        bubbleActivity.z();
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    bubbleActivity.Y = null;
                    break;
                }
                break;
            case 1:
                y9 y9Var = (y9) this.b;
                CameraView cameraView = y9Var.d;
                if (cameraView != null && !y9Var.O && cameraView.getCameraSession() != null) {
                    y9Var.f.post(new ut0(this, 17));
                    break;
                }
                break;
            case 2:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.d.Z();
                contactsActivity.l0 = false;
                break;
            case 3:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
                if (externalActionActivity.w == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        externalActionActivity.i();
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    externalActionActivity.w = null;
                    break;
                }
                break;
            case 4:
                g10 g10Var = (g10) this.b;
                if (g10Var.M) {
                    g10Var.f.clear();
                    g10Var.n.clear();
                    g10Var.r.clear();
                    org.telegram.ui.Components.hm0 hm0Var = g10Var.d;
                    if (hm0Var != null) {
                        hm0Var.l();
                        break;
                    }
                }
                break;
            case 5:
                s50 s50Var = ((z20) this.b).b;
                s50Var.x.setAnimation(s50Var.J0);
                s50Var.L0 = false;
                break;
            case 6:
                try {
                    s50 s50Var2 = (s50) this.b;
                    j30 j30Var = s50Var2.a2;
                    if (j30Var != null && !j30Var.b && (J0 = s50.J0(s50Var2)) != null && J0.isAttachedToWindow() && (renderer = J0.getRenderer()) != null && (oVar = renderer.a) != null) {
                        s50.H3.postRunnable(new nt(22, this, oVar));
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 7:
                if (((j70) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    j70 j70Var = (j70) this.b;
                    if (j70Var.e.equals(j70Var.b.eglGetCurrentContext())) {
                        j70 j70Var2 = (j70) this.b;
                        break;
                    }
                    j70 j70Var3 = (j70) this.b;
                    EGL10 egl10 = j70Var3.b;
                    EGLDisplay eGLDisplay = j70Var3.c;
                    EGLSurface eGLSurface = j70Var3.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, j70Var3.e)) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.kk.v(((j70) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((j70) this.b).s, 16L);
                    Intro.setPage(((j70) this.b).x.H);
                    Intro.setDate((currentTimeMillis - r3.J) / 1000.0f);
                    Intro.onDrawFrame(min);
                    j70 j70Var4 = (j70) this.b;
                    j70Var4.b.eglSwapBuffers(j70Var4.c, j70Var4.f);
                    j70 j70Var5 = (j70) this.b;
                    j70Var5.s = currentTimeMillis;
                    float f7 = 0.0f;
                    if (j70Var5.r == 0.0f) {
                        for (float f10 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f10 > f7) {
                                f7 = f10;
                            }
                        }
                        ((j70) this.b).r = f7;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    j70 j70Var6 = (j70) this.b;
                    j70Var6.postRunnable(j70Var6.w, Math.max(((long) (1000.0f / j70Var6.r)) - currentTimeMillis2, 0L));
                    break;
                }
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                if (launchActivity.Z0 == this) {
                    if (AndroidUtilities.needShowPasscode(true)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("lock app");
                        }
                        launchActivity.K0(true, false, -1, -1, null);
                        try {
                            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    } else if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("didn't pass lock check");
                    }
                    launchActivity.Z0 = null;
                    break;
                }
                break;
            case 9:
                qe0 qe0Var = (qe0) this.b;
                if (qe0Var.h == this) {
                    qe0Var.o();
                    AndroidUtilities.runOnUIThread(qe0Var.h, 1000L);
                    break;
                }
                break;
            case 10:
                ((wi0) this.b).T.animate().alpha(1.0f).setDuration(230L);
                break;
            case 11:
                dj0 dj0Var = (dj0) this.b;
                String str = dj0Var.j0;
                if (str != null) {
                    dj0.R(dj0Var, str);
                    break;
                }
                break;
            case 12:
                hv0 hv0Var = (hv0) this.b;
                a6 a6Var = hv0Var.y0;
                org.telegram.ui.Cells.c6 c6Var = hv0Var.b0;
                if (c6Var != null) {
                    EditTextBoldCursor editField = c6Var.getEditField();
                    if (!hv0Var.U && editField != null && hv0Var.T && !hv0Var.Y && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(a6Var);
                        AndroidUtilities.runOnUIThread(a6Var, 100L);
                        break;
                    }
                }
                break;
            case 13:
                ((r91) this.b).b0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 14:
                id1 id1Var = (id1) this.b;
                id1Var.F.setVisibility(0);
                id1Var.F.setAlpha(0.0f);
                id1Var.F.animate().alpha(1.0f).start();
                break;
            default:
                ei1 ei1Var = (ei1) this.b;
                MessageObject messageObject = ei1Var.n;
                if (messageObject != null && ei1Var.getParentActivity() != null && ei1Var.s != null) {
                    i10 = ((org.telegram.ui.ActionBar.n2) ei1Var).currentAccount;
                    MessagesController.getInstance(i10).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(ei1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
