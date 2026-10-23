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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                w9 w9Var = (w9) this.b;
                CameraView cameraView = w9Var.d;
                if (cameraView != null && !w9Var.N && cameraView.getCameraSession() != null) {
                    w9Var.f.post(new st0(this, 17));
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
                e10 e10Var = (e10) this.b;
                if (e10Var.M) {
                    e10Var.f.clear();
                    e10Var.n.clear();
                    e10Var.r.clear();
                    org.telegram.ui.Components.im0 im0Var = e10Var.d;
                    if (im0Var != null) {
                        im0Var.l();
                        break;
                    }
                }
                break;
            case 5:
                q50 q50Var = ((x20) this.b).b;
                q50Var.x.setAnimation(q50Var.J0);
                q50Var.L0 = false;
                break;
            case 6:
                try {
                    q50 q50Var2 = (q50) this.b;
                    h30 h30Var = q50Var2.a2;
                    if (h30Var != null && !h30Var.b && (J0 = q50.J0(q50Var2)) != null && J0.isAttachedToWindow() && (renderer = J0.getRenderer()) != null && (oVar = renderer.a) != null) {
                        q50.H3.postRunnable(new lt(22, this, oVar));
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 7:
                if (((h70) this.b).h) {
                    long currentTimeMillis = System.currentTimeMillis();
                    h70 h70Var = (h70) this.b;
                    if (h70Var.e.equals(h70Var.b.eglGetCurrentContext())) {
                        h70 h70Var2 = (h70) this.b;
                        break;
                    }
                    h70 h70Var3 = (h70) this.b;
                    EGL10 egl10 = h70Var3.b;
                    EGLDisplay eGLDisplay = h70Var3.c;
                    EGLSurface eGLSurface = h70Var3.f;
                    if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, h70Var3.e)) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.nk.v(((h70) this.b).b, new StringBuilder("eglMakeCurrent failed "));
                            break;
                        }
                    }
                    int min = (int) Math.min(currentTimeMillis - ((h70) this.b).s, 16L);
                    Intro.setPage(((h70) this.b).x.H);
                    Intro.setDate((currentTimeMillis - r3.J) / 1000.0f);
                    Intro.onDrawFrame(min);
                    h70 h70Var4 = (h70) this.b;
                    h70Var4.b.eglSwapBuffers(h70Var4.c, h70Var4.f);
                    h70 h70Var5 = (h70) this.b;
                    h70Var5.s = currentTimeMillis;
                    float f7 = 0.0f;
                    if (h70Var5.r == 0.0f) {
                        for (float f10 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                            if (f10 > f7) {
                                f7 = f10;
                            }
                        }
                        ((h70) this.b).r = f7;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    h70 h70Var6 = (h70) this.b;
                    h70Var6.postRunnable(h70Var6.w, Math.max(((long) (1000.0f / h70Var6.r)) - currentTimeMillis2, 0L));
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
                oe0 oe0Var = (oe0) this.b;
                if (oe0Var.h == this) {
                    oe0Var.o();
                    AndroidUtilities.runOnUIThread(oe0Var.h, 1000L);
                    break;
                }
                break;
            case 10:
                ((ui0) this.b).T.animate().alpha(1.0f).setDuration(230L);
                break;
            case 11:
                bj0 bj0Var = (bj0) this.b;
                String str = bj0Var.j0;
                if (str != null) {
                    bj0.R(bj0Var, str);
                    break;
                }
                break;
            case 12:
                fv0 fv0Var = (fv0) this.b;
                a6 a6Var = fv0Var.y0;
                org.telegram.ui.Cells.c6 c6Var = fv0Var.b0;
                if (c6Var != null) {
                    EditTextBoldCursor editField = c6Var.getEditField();
                    if (!fv0Var.U && editField != null && fv0Var.T && !fv0Var.Y && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow && AndroidUtilities.isTablet()) {
                        editField.requestFocus();
                        AndroidUtilities.showKeyboard(editField);
                        AndroidUtilities.cancelRunOnUIThread(a6Var);
                        AndroidUtilities.runOnUIThread(a6Var, 100L);
                        break;
                    }
                }
                break;
            case 13:
                ((p91) this.b).b0.animate().alpha(1.0f).setDuration(230L);
                break;
            case 14:
                gd1 gd1Var = (gd1) this.b;
                gd1Var.F.setVisibility(0);
                gd1Var.F.setAlpha(0.0f);
                gd1Var.F.animate().alpha(1.0f).start();
                break;
            default:
                ci1 ci1Var = (ci1) this.b;
                MessageObject messageObject = ci1Var.n;
                if (messageObject != null && ci1Var.getParentActivity() != null && ci1Var.s != null) {
                    i10 = ((org.telegram.ui.ActionBar.n2) ci1Var).currentAccount;
                    MessagesController.getInstance(i10).sendTyping(messageObject.getDialogId(), 0L, 6, 0);
                    AndroidUtilities.runOnUIThread(ci1Var.s, 25000L);
                    break;
                }
                break;
        }
    }
}
